package com.markus.compress.utils;

import net.jpountz.lz4.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @author: markus
 * @date: 2022/5/22 4:54 下午
 * @Description: Lz4压缩工具
 * @Blog: http://markuszhang.com/
 */
public class Lz4Utils {
    private static final int ARRAY_SIZE = 4096;
    private static LZ4Factory factory = LZ4Factory.fastestInstance();
    private static LZ4Compressor compressor = factory.fastCompressor();
    private static LZ4FastDecompressor decompressor = factory.fastDecompressor();

    public static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            LZ4BlockOutputStream lz4BlockOutputStream = new LZ4BlockOutputStream(outputStream, ARRAY_SIZE, compressor);
            lz4BlockOutputStream.write(bytes);
            lz4BlockOutputStream.finish();
            return outputStream.toByteArray();
        } catch (Exception e) {
            System.err.println("Lz4压缩失败");
        }
        return null;
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(ARRAY_SIZE);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            LZ4BlockInputStream decompressedInputStream = new LZ4BlockInputStream(inputStream, decompressor);
            int count;
            byte[] buffer = new byte[ARRAY_SIZE];
            while ((count = decompressedInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, count);
            }
            return outputStream.toByteArray();
        } catch (Exception e) {
            System.err.println("lz4解压缩失败");
        }
        return null;
    }
}
