package com.markus.compress.utils;

import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @author: markus
 * @date: 2022/5/22 8:58 下午
 * @Description: Bzip压缩工具
 * @Blog: http://markuszhang.com/
 */
public class Bzip2Utils {

    public static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            BZip2CompressorOutputStream bZip2CompressorOutputStream = new BZip2CompressorOutputStream(outputStream);
            bZip2CompressorOutputStream.write(bytes);
            bZip2CompressorOutputStream.close();
            return outputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
            BZip2CompressorInputStream bZip2CompressorInputStream = new BZip2CompressorInputStream(inputStream);

            int len;
            byte[] buffer = new byte[4096];
            while ((len = bZip2CompressorInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            return outputStream.toByteArray();
        } catch (Exception e) {
            System.err.println("bzip2解压缩失败");
        }
        return null;
    }
}
