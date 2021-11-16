package com.oracle.springboot.ssm.config;

import com.oracle.springboot.ssm.cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashSet;

/**
 * @Description:
 * @Author: Tu Xu
 * @CreateDate: 2021/8/16 14:21
 * @Version: 1.0
 **/
@Configuration
@EnableCaching
public class CacheConfig {
    @Autowired
    private RedisTemplate redisTemplate;

    @Bean("simpleCacheManager")
    public SimpleCacheManager simpleCacheManager(){
        SimpleCacheManager simpleCacheManager=new SimpleCacheManager();
        HashSet<Cache> set=new HashSet();
        RedisCache redisCache=new RedisCache();
        redisCache.setName("redisCache");
        redisCache.setRedisTemplate(redisTemplate);
        set.add(redisCache);
        simpleCacheManager.setCaches(set);
        return simpleCacheManager;
    }
}
