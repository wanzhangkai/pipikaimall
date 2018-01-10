package com.mmall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

/**
 *
 */
public class TokenCache {

    public static final  String TOKEN_PREFIX = "Token_";

    public static Logger logger = LoggerFactory.getLogger(TokenCache.class);

    //LRU算法
    private static LoadingCache<String, String> localCache = CacheBuilder.newBuilder().initialCapacity(1000).maximumSize(10000).expireAfterAccess(12, TimeUnit.HOURS)
                    .build(new CacheLoader<String, String>() {
                        //匿名实现
                        //默认的数据加载实现，当调用get取值的时候，如果key没有对应的值，就调用这个方法进行加载啊.
                        @Override
                        public String load(String s) throws Exception {
                           //return null; 会报一个空指针，所以写成字符串
                            return "null";
                        }
                    });

    public static void setKey(String key, String value){
        localCache.put(key, value);
    }

    public  static String getKey(String key){
        String value = null;
        try{
            value = localCache.get(key);
            if("null".equals(value)){
                return  null;
            }
            return value;
        }catch (Exception e) {
            logger.error("localCache get error", e);
        }

        return null;
    }

}