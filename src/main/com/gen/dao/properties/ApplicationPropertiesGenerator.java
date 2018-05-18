package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class ApplicationPropertiesGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("#数据库配置\n" +
                "jdbc.driver=com.mysql.jdbc.Driver\n" +
                "jdbc.url=jdbc:mysql://localhost:3306/"+Config.dbName+"?useUnicode=true&characterEncoding=utf8&useSSL=false\n" +
                "jdbc.username=root\n" +
                "jdbc.password=123456\n" +
                "\n" +
                "\n" +
                "##redis\n" +
                "spring.redis.host=localhost\n" +
                "spring.redis.port=6379\n" +
                "spring.redis.timeout=2000\n" +
                "spring.redis.jedis.pool.max-active=40\n" +
                "spring.redis.jedis.pool.min-idle=8\n" +
                "\n" +
                "#输出mysql语句\n" +
                "logging.level."+Config.mapperJavaPackage+"=DEBUG");

        return data.toString();
    }
}
