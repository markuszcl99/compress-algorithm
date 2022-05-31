package com.markus.compress.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 * @author: markus
 * @date: 2022/5/22 9:10 下午
 * @Description: deflater压缩工具
 * @Blog: http://markuszhang.com/
 */
public class DeflateUtils {

    public static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Deflater compressor = new Deflater(1);
        try {
            compressor.setInput(bytes);
            compressor.finish();
            byte[] buffer = new byte[4096];
            while (!compressor.finished()) {
                int count = compressor.deflate(buffer);
                outputStream.write(buffer, 0, count);
            }
        } finally {
            compressor.end();
        }
        return outputStream.toByteArray();
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Inflater decompressor = new Inflater();
        try {
            decompressor.setInput(bytes);
            byte[] buffer = new byte[4096];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
        } catch (DataFormatException e) {
            e.printStackTrace();
        } finally {
            decompressor.end();
        }
        return outputStream.toByteArray();
    }
}
