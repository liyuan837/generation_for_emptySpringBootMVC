package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class DomainPomGenerator {
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
                "    <artifactId>"+Config.domainModuleName+"</artifactId>\n" +
                "    <name>"+Config.domainModuleName+"</name>\n" +
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
                "            <artifactId>"+Config.commonModuleName+"</artifactId>\n" +
                "        </dependency>\n" +
                "\n" +
                "        <!--lombok依赖：自动生成getter、setter代码-->\n" +
                "        <dependency>\n" +
                "            <groupId>org.projectlombok</groupId>\n" +
                "            <artifactId>lombok</artifactId>\n" +
                "        </dependency>\n" +
                "    </dependencies>\n" +
                "</project>");

        return data.toString();
    }
}
