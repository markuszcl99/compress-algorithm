package com.markus.compress.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author: markus
 * @date: 2022/5/22 3:22 下午
 * @Description: Gzip压缩工具
 * @Blog: http://markuszhang.com/
 */
public class GzipUtils {

    public static byte[] compress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }

        ByteArrayOutputStream bos = null;
        GZIPOutputStream gzipos = null;
        try {
            bos = new ByteArrayOutputStream();
            gzipos = new GZIPOutputStream(bos);
            gzipos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            closeStream(gzipos);
            closeStream(bos);
        }
        return bos.toByteArray();
    }

    public static byte[] uncompress(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return null;
        }

        ByteArrayOutputStream byteArrayOut = null;
        ByteArrayInputStream byteArrayIn = null;
        GZIPInputStream gzipIn = null;
        try {
            byteArrayIn = new ByteArrayInputStream(bytes);
            gzipIn = new GZIPInputStream(byteArrayIn);
            byteArrayOut = new ByteArrayOutputStream();
            byte[] b = new byte[4096];
            int temp = -1;
            while ((temp = gzipIn.read(b)) > 0) {
                byteArrayOut.write(b, 0, temp);
            }
            return byteArrayOut.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeStream(byteArrayOut);
            closeStream(gzipIn);
            closeStream(byteArrayIn);
        }
        return null;
    }

    private static void closeStream(Closeable stream) {
        if (null != stream) {
            try {
                stream.close();
            } catch (IOException e) {
                // 赋值为null，等待垃圾回收
                stream = null;
                e.printStackTrace();
            }
        }
    }

}
