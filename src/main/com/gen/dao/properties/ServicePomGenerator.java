package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class ServicePomGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\n" +
                "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "    <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "    <groupId>"+Config.groupId+"</groupId>\n" +
                "    <packaging>jar</packaging>\n" +
                "    <artifactId>"+Config.serviceModuleName+"</artifactId>\n" +
                "    <name>"+ Config.serviceModuleName+"</name>\n" +
                "\n" +
                "    <parent>\n" +
                "        <artifactId>"+Config.baseModuleName+"</artifactId>\n" +
                "        <groupId>"+Config.groupId+"</groupId>\n" +
                "        <version>"+Config.parentVersion+"</version>\n" +
                "    </parent>\n" +
                "\n" +
                "    <dependencies>\n" +
                "        <dependency>\n" +
                "            <groupId>"+Config.groupId+"</groupId>\n" +
                "            <artifactId>"+ Config.daoModuleName+"</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!--redis缓存数据库依赖-->\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-data-redis</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "    </dependencies>\n" +
                "</project>");

        return data.toString();
    }
}
