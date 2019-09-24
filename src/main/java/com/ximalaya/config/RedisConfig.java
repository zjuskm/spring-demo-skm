//package com.ximalaya.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
//import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
//import redis.clients.jedis.JedisPoolConfig;
//
///**
// * Created by zjuskm
// * 2019-09-24
// */
//@Configuration
//public class RedisConfig {
//    private RedisConnectionFactory connectionFactory = null;
//    @Bean(name = "RedisConnectionFactory")
//    public RedisConnectionFactory initRedisConnectionFactory() {
//        if (this.connectionFactory != null) {
//            return this.connectionFactory;
//        }
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxIdle(1);
//        jedisPoolConfig.setMaxTotal(1);
//        jedisPoolConfig.setMaxWaitMillis(12000);
//
//        // 创建jedis连接工厂
//        JedisConnectionFactory connectionFactory = new JedisConnectionFactory(jedisPoolConfig);
//        // 获取单机的redis配置
//        RedisStandaloneConfiguration rcCfg = connectionFactory.getStandaloneConfiguration();
//        connectionFactory.setHostName("192.168.1.175");
//        connectionFactory.setPort(6379);
//        connectionFactory.setPassword("jredis123456");
//        this.connectionFactory = connectionFactory;
//        return connectionFactory;
//
//    }
//
//}
