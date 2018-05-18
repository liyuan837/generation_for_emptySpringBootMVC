package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class WebPomGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "\txsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "\t<modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "\t<groupId>"+ Config.groupId+"</groupId>\n" +
                "\t<artifactId>"+Config.webModuleName+"</artifactId>\n" +
                "\t<packaging>war</packaging>\n" +
                "\t<name>"+Config.webModuleName+"</name>\n" +
                "\n" +
                "\t<parent>\n" +
                "\t\t<artifactId>"+ Config.baseModuleName+"</artifactId>\n" +
                "\t\t<groupId>"+ Config.groupId+"</groupId>\n" +
                "\t\t<version>"+ Config.parentVersion+"</version>\n" +
                "\t</parent>\n" +
                "\n" +
                "\t<dependencies>\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>"+Config.groupId+"</groupId>\n" +
                "\t\t\t<artifactId>"+Config.serviceModuleName+"</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
                "\t\t\t<artifactId>spring-boot-starter-web</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>org.springframework.boot</groupId>\n" +
                "\t\t\t<artifactId>spring-boot-starter-tomcat</artifactId>\n" +
                "\t\t\t<scope>provided</scope>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<!--mybatis和spring整合的依赖-->\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>org.mybatis.spring.boot</groupId>\n" +
                "\t\t\t<artifactId>mybatis-spring-boot-starter</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<!--swagger2-->\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>io.springfox</groupId>\n" +
                "\t\t\t<artifactId>springfox-swagger2</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>io.springfox</groupId>\n" +
                "\t\t\t<artifactId>springfox-swagger-ui</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<!--lombok-->\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>org.projectlombok</groupId>\n" +
                "\t\t\t<artifactId>lombok</artifactId>\n" +
                "\t\t\t<scope>compile</scope>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>mysql</groupId>\n" +
                "\t\t\t<artifactId>mysql-connector-java</artifactId>\n" +
                "\t\t\t<scope>runtime</scope>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>commons-beanutils</groupId>\n" +
                "\t\t\t<artifactId>commons-beanutils</artifactId>\n" +
                "\t\t\t<version>1.6</version>\n" +
                "\t\t</dependency>\n" +
                "\n" +
                "\t\t<!--jwt-->\n" +
                "\t\t<dependency>\n" +
                "\t\t\t<groupId>io.jsonwebtoken</groupId>\n" +
                "\t\t\t<artifactId>jjwt</artifactId>\n" +
                "\t\t</dependency>\n" +
                "\t</dependencies>\n" +
                "\n" +
                "\n" +
                "</project>\n");

        return data.toString();
    }
}
