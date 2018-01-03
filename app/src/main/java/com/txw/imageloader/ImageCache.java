package com.txw.imageloader;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * 处理图片缓存
 * Created by txw on 2018/1/3.
 */
public class ImageCache {
    //图片LRU缓存
    LruCache<String, Bitmap> mImageCache;


    public ImageCache() {
        initImageCache();
    }

    //初始化图片缓存
    private void initImageCache() {
        //计算可以用的最大内存
        final int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        //取四分之一的可用内存作为缓存
        final int cacheSize = maxMemory / 4;
        mImageCache = new LruCache<String, Bitmap>(cacheSize) {
            @Override
            protected int sizeOf(String key, Bitmap value) {
                return value.getRowBytes() * value.getHeight();
            }
        };
    }

    public void put(String url, Bitmap bitmap) {
        mImageCache.put(url, bitmap);
    }

    public Bitmap get(String url) {
        return mImageCache.get(url);
    }

}
