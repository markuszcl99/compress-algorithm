package com.markus.compress.utils;

import org.xerial.snappy.Snappy;

import java.io.IOException;

/**
 * @author: markus
 * @date: 2022/5/22 4:21 下午
 * @Description: Snappy压缩工具
 * @Blog: http://markuszhang.com/
 */
public class SnappyUtils {
    public static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            return Snappy.compress(bytes);
        } catch (IOException e) {
            System.err.println("压缩失败");
        }
        return null;
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            return Snappy.uncompress(bytes);
        } catch (IOException e) {
            System.err.println("解压缩失败");
        }
        return null;
    }
}
