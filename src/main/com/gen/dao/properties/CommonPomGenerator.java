package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class CommonPomGenerator {
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
                "    <artifactId>"+Config.commonModuleName+"</artifactId>\n" +
                "    <name>"+Config.commonModuleName+"</name>\n" +
                "\n" +
                "    <parent>\n" +
                "        <artifactId>"+Config.baseModuleName+"</artifactId>\n" +
                "        <groupId>"+Config.groupId+"</groupId>\n" +
                "        <version>"+ Config.parentVersion+"</version>\n" +
                "    </parent>\n" +
                "\n" +
                "    <dependencies>\n" +
                "        <!-- BaseCondition依赖 -->\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.data</groupId>\n" +
                "            <artifactId>spring-data-commons</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!-- BaseMapper依赖 -->\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework</groupId>\n" +
                "            <artifactId>spring-context-support</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!-- BaseServiceImpl依赖 -->\n" +
                "        <dependency>\n" +
                "            <groupId>com.github.pagehelper</groupId>\n" +
                "            <artifactId>pagehelper-spring-boot-starter</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!--swagger2-->\n" +
                "        <dependency>\n" +
                "            <groupId>io.springfox</groupId>\n" +
                "            <artifactId>springfox-swagger2</artifactId>\n" +
                "        </dependency>\n" +
                "        <dependency>\n" +
                "            <groupId>io.springfox</groupId>\n" +
                "            <artifactId>springfox-swagger-ui</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-web</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!-- https://mvnrepository.com/artifact/org.apache.commons/commons-lang3 -->\n" +
                "        <dependency>\n" +
                "            <groupId>org.apache.commons</groupId>\n" +
                "            <artifactId>commons-lang3</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!-- json解析依赖 -->\n" +
                "        <dependency>\n" +
                "            <groupId>net.sf.json-lib</groupId>\n" +
                "            <artifactId>json-lib</artifactId>\n" +
                "            <classifier>jdk15</classifier>\n" +
                "        </dependency>\n" +
                "\n" +
                "    </dependencies>\n" +
                "</project>");

        return data.toString();
    }
}
