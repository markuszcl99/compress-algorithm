package com.markus.compress.demo;

import com.alibaba.fastjson.JSONObject;
import com.markus.compress.domain.User;
import com.markus.compress.service.UserService;
import com.markus.compress.utils.*;

import java.nio.charset.StandardCharsets;

/**
 * @author: markus
 * @date: 2022/5/22 3:52 下午
 * @Description: 压缩字节示例
 * @Blog: http://markuszhang.com/
 */
public class CompressDemo {
    public static void main(String[] args) {
        User user = new UserService().get();
        // json序列化
        byte[] origin_json = JSONObject.toJSONBytes(user);
        System.out.println("原始json字节数: " + origin_json.length);
        // pb序列化
        byte[] origin = ProtostuffUtils.serialize(user);
        System.out.println("原始pb字节数: " + origin.length);

//        testGzip(origin, user);
//        testSnappy(origin, user);
        testLz4(origin, user);
//        testBzip2(origin, user);
//        testDeflate(origin, user);
        System.out.println("--------------------");
        String str = getString();
        byte[] source = str.getBytes(StandardCharsets.UTF_8);
        byte[] compress = Lz4Utils.compress(source);
        // 将compress转为字符串
        System.out.println(translateString(compress));
        System.out.println();
        System.out.println("--------------------");
        String str2 = getString2();
        byte[] source2 = str2.getBytes(StandardCharsets.UTF_8);
        byte[] compress2 = Lz4Utils.compress(source2);
        byte[] uncompress = Lz4Utils.uncompress(compress2);
        System.out.println();
    }

    private static String translateString(byte[] bytes) {
        char[] chars = new char[bytes.length];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) bytes[i];
        }
        String str = new String(chars);
        return str;
    }

    private static String getString() {
        return "fghabcde_bcdefgh_abcdefghxxxxxxx";
    }

    private static String getString2() {
        return "abcde_fghabcde_ghxxahcde";
    }


    private static void testGzip(byte[] origin, User user) {
        System.out.println("---------------GZIP压缩---------------");
        // Gzip压缩
        byte[] gzipCompress = GzipUtils.compress(origin);
        System.out.println("Gzip压缩: " + gzipCompress.length);
        byte[] gzipUncompress = GzipUtils.uncompress(gzipCompress);
        System.out.println("Gzip解压缩: " + gzipUncompress.length);
        User deUser = ProtostuffUtils.deserialize(gzipUncompress, User.class);
        System.out.println("对象是否相等: " + user.equals(deUser));
    }

    private static void testSnappy(byte[] origin, User user) {
        System.out.println("---------------Snappy压缩---------------");
        // Snappy压缩
        byte[] snappyCompress = SnappyUtils.compress(origin);
        System.out.println("Snappy压缩: " + snappyCompress.length);
        byte[] snappyUncompress = SnappyUtils.uncompress(snappyCompress);
        System.out.println("Snappy解压缩: " + snappyUncompress.length);
        User deUser = ProtostuffUtils.deserialize(snappyUncompress, User.class);
        System.out.println("对象是否相等: " + user.equals(deUser));
    }

    private static void testLz4(byte[] origin, User user) {
        System.out.println("---------------Lz4压缩---------------");
        // Lz4压缩
        byte[] Lz4Compress = Lz4Utils.compress(origin);
        System.out.println("Lz4压缩: " + Lz4Compress.length);
        byte[] Lz4Uncompress = Lz4Utils.uncompress(Lz4Compress);
        System.out.println("Lz4解压缩: " + Lz4Uncompress.length);
        User deUser = ProtostuffUtils.deserialize(Lz4Uncompress, User.class);
        System.out.println("对象是否相等: " + user.equals(deUser));
    }

    private static void testBzip2(byte[] origin, User user) {
        System.out.println("---------------bzip2压缩---------------");
        // bzip2压缩
        byte[] bzip2Compress = Bzip2Utils.compress(origin);
        System.out.println("bzip2压缩: " + bzip2Compress.length);
        byte[] bzip2Uncompress = Bzip2Utils.uncompress(bzip2Compress);
        System.out.println("bzip2解压缩: " + bzip2Uncompress.length);
        User deUser = ProtostuffUtils.deserialize(bzip2Uncompress, User.class);
        System.out.println("对象是否相等: " + user.equals(deUser));
    }

    private static void testDeflate(byte[] origin, User user) {
        System.out.println("---------------Deflate压缩---------------");
        // Deflate压缩
        byte[] deflateCompress = DeflateUtils.compress(origin);
        System.out.println("Deflate压缩: " + deflateCompress.length);
        byte[] deflateUncompress = DeflateUtils.uncompress(deflateCompress);
        System.out.println("Deflate解压缩: " + deflateUncompress.length);
        User deUser = ProtostuffUtils.deserialize(deflateUncompress, User.class);
        System.out.println("对象是否相等: " + user.equals(deUser));
    }
}
