package com.markus.compress.test;

import com.markus.compress.domain.User;
import com.markus.compress.service.UserService;
import com.markus.compress.utils.GzipUtils;
import com.markus.compress.utils.Lz4Utils;
import com.markus.compress.utils.ProtostuffUtils;
import com.markus.compress.utils.SnappyUtils;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @author: markus
 * @date: 2022/5/22 5:08 下午
 * @Description: 压缩工具的性能测试
 * @Blog: http://markuszhang.com/
 */
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class PerformanceTest {
    /**
     * 用来序列化的用户对象
     */
    @State(Scope.Benchmark)
    public static class CommonState {
        User user;
        byte[] originBytes;
        byte[] lz4CompressBytes;
        byte[] snappyCompressBytes;
        byte[] gzipCompressBytes;

        @Setup(Level.Trial)
        public void prepare() {
            UserService userService = new UserService();
            user = userService.get();
            originBytes = ProtostuffUtils.serialize(user);
            lz4CompressBytes = Lz4Utils.compress(originBytes);
            snappyCompressBytes = SnappyUtils.compress(originBytes);
            gzipCompressBytes = GzipUtils.compress(originBytes);
        }
    }

    /**
     * Lz4压缩
     *
     * @param commonState
     * @return
     */
    @Benchmark
    public byte[] lz4Compress(CommonState commonState) {
        return Lz4Utils.compress(commonState.originBytes);
    }

    /**
     * lz4解压缩
     *
     * @param commonState
     */
    @Benchmark
    public byte[] lz4Uncompress(CommonState commonState) {
        return Lz4Utils.uncompress(commonState.lz4CompressBytes);
    }

    /**
     * snappy压缩
     *
     * @param commonState
     * @return
     */
    @Benchmark
    public byte[] snappyCompress(CommonState commonState) {
        return SnappyUtils.compress(commonState.originBytes);
    }

    /**
     * snappy解压缩
     *
     * @param commonState
     * @return
     */
    @Benchmark
    public byte[] snappyUncompress(CommonState commonState) {
        return SnappyUtils.uncompress(commonState.snappyCompressBytes);
    }


    /**
     * Gzip压缩
     *
     * @param commonState
     * @return
     */
    @Benchmark
    public byte[] gzipCompress(CommonState commonState) {
        return GzipUtils.compress(commonState.originBytes);
    }

    /**
     * Gzip解压缩
     *
     * @param commonState
     * @return
     */
    @Benchmark
    public byte[] gzipUncompress(CommonState commonState) {
        return GzipUtils.uncompress(commonState.gzipCompressBytes);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(PerformanceTest.class.getSimpleName())
                .forks(1)
                .threads(1)
                .warmupIterations(10)
                .measurementIterations(10)
                .result("PerformanceTest-v2.json")
                .resultFormat(ResultFormatType.JSON).build();
        new Runner(opt).run();
    }
}
