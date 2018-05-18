package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class DaoPomGenerator {
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
                "    <artifactId>"+ Config.daoModuleName+"</artifactId>\n" +
                "    <name>"+Config.daoModuleName+"</name>\n" +
                "\n" +
                "    <parent>\n" +
                "        <artifactId>"+Config.baseModuleName+"</artifactId>\n" +
                "        <groupId>"+Config.groupId+"</groupId>\n" +
                "        <version>"+ Config.parentVersion+"</version>\n" +
                "    </parent>\n" +
                "\n" +
                "    <dependencies>\n" +
                "        <dependency>\n" +
                "            <groupId>"+Config.groupId+"</groupId>\n" +
                "            <artifactId>"+Config.domainModuleName+"</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <dependency>\n" +
                "            <groupId>org.springframework.boot</groupId>\n" +
                "            <artifactId>spring-boot-starter-jdbc</artifactId>\n" +
                "            <exclusions>\n" +
                "                <exclusion>\n" +
                "                    <groupId>org.apache.tomcat</groupId>\n" +
                "                    <artifactId>tomcat-jdbc</artifactId>\n" +
                "                </exclusion>\n" +
                "            </exclusions>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!--mybatis-->\n" +
                "        <dependency>\n" +
                "            <groupId>org.mybatis</groupId>\n" +
                "            <artifactId>mybatis-spring</artifactId>\n" +
                "        </dependency>\n" +
                "        <dependency>\n" +
                "            <groupId>org.mybatis</groupId>\n" +
                "            <artifactId>mybatis</artifactId>\n" +
                "            <version>3.2.3</version>\n" +
                "        </dependency>\n" +
                "\n" +
                "\n" +
                "        <!--数据库连接池-->\n" +
                "        <dependency>\n" +
                "            <groupId>com.zaxxer</groupId>\n" +
                "            <artifactId>HikariCP</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <dependency>\n" +
                "            <groupId>mysql</groupId>\n" +
                "            <artifactId>mysql-connector-java</artifactId>\n" +
                "            <scope>test</scope>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <dependency>\n" +
                "            <groupId>junit</groupId>\n" +
                "            <artifactId>junit</artifactId>\n" +
                "            <version>4.12</version>\n" +
                "            <scope>test</scope>\n" +
                "        </dependency>\n" +
                "    </dependencies>\n" +
                "</project>");

        return data.toString();
    }
}
