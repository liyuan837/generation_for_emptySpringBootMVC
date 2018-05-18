package com.gen.dao.properties;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class MainPomGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<project xmlns=\"http://maven.apache.org/POM/4.0.0\"\n" +
                "         xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
                "         xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\">\n" +
                "    <modelVersion>4.0.0</modelVersion>\n" +
                "\n" +
                "    <groupId>"+ Config.groupId+"</groupId>\n" +
                "    <artifactId>"+Config.baseModuleName+"</artifactId>\n" +
                "    <packaging>pom</packaging>\n" +
                "    <version>"+Config.parentVersion+"</version>\n" +
                "    <name>"+Config.baseModuleName+"</name>\n" +
                "\n" +
                "    <parent>\n" +
                "        <groupId>org.springframework.boot</groupId>\n" +
                "        <artifactId>spring-boot-starter-parent</artifactId>\n" +
                "        <version>2.0.1.RELEASE</version>\n" +
                "        <relativePath/> <!-- lookup parent from repository -->\n" +
                "    </parent>\n" +
                "\n" +
                "    <modules>\n" +
                "        <module>"+ Config.domainModuleName+"</module>\n" +
                "        <module>"+Config.daoModuleName+"</module>\n" +
                "        <module>"+Config.serviceModuleName+"</module>\n" +
                "        <module>"+Config.webModuleName+"</module>\n" +
                "        <module>"+ Config.commonModuleName+"</module>\n" +
                "    </modules>\n" +
                "\n" +
                "    <properties>\n" +
                "        <project.version>"+ Config.moduleVersion+"</project.version>\n" +
                "        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>\n" +
                "        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>\n" +
                "        <java.version>1.8</java.version>\n" +
                "    </properties>\n" +
                "\n" +
                "    <!-- 版本说明：这里统一管理依赖的版本号 -->\n" +
                "    <dependencyManagement>\n" +
                "        <dependencies>\n" +
                "            <dependency>\n" +
                "                <groupId>"+Config.groupId+"</groupId>\n" +
                "                <artifactId>"+Config.webModuleName+"</artifactId>\n" +
                "                <version>${project.version}</version>\n" +
                "            </dependency>\n" +
                "            <dependency>\n" +
                "                <groupId>"+Config.groupId+"</groupId>\n" +
                "                <artifactId>"+Config.serviceModuleName+"</artifactId>\n" +
                "                <version>${project.version}</version>\n" +
                "            </dependency>\n" +
                "            <dependency>\n" +
                "                <groupId>"+Config.groupId+"</groupId>\n" +
                "                <artifactId>"+Config.daoModuleName+"</artifactId>\n" +
                "                <version>${project.version}</version>\n" +
                "            </dependency>\n" +
                "            <dependency>\n" +
                "                <groupId>"+Config.groupId+"</groupId>\n" +
                "                <artifactId>"+Config.domainModuleName+"</artifactId>\n" +
                "                <version>${project.version}</version>\n" +
                "            </dependency>\n" +
                "            <dependency>\n" +
                "                <groupId>"+Config.groupId+"</groupId>\n" +
                "                <artifactId>"+Config.commonModuleName+"</artifactId>\n" +
                "                <version>${project.version}</version>\n" +
                "            </dependency>\n" +
                "            <!--mybatis-->\n" +
                "            <dependency>\n" +
                "                <groupId>org.mybatis</groupId>\n" +
                "                <artifactId>mybatis-spring</artifactId>\n" +
                "                <version>1.3.0</version>\n" +
                "            </dependency>\n" +
                "            <dependency>\n" +
                "                <groupId>org.mybatis</groupId>\n" +
                "                <artifactId>mybatis</artifactId>\n" +
                "                <version>3.4.0</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--mybatis和spring整合的依赖-->\n" +
                "            <dependency>\n" +
                "                <groupId>org.mybatis.spring.boot</groupId>\n" +
                "                <artifactId>mybatis-spring-boot-starter</artifactId>\n" +
                "                <version>1.3.1</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--mysql-->\n" +
                "            <dependency>\n" +
                "                <groupId>mysql</groupId>\n" +
                "                <artifactId>mysql-connector-java</artifactId>\n" +
                "                <version>5.1.21</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--数据库连接池-->\n" +
                "            <dependency>\n" +
                "                <groupId>com.zaxxer</groupId>\n" +
                "                <artifactId>HikariCP</artifactId>\n" +
                "                <version>2.4.0</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--swagger-->\n" +
                "            <dependency>\n" +
                "                <groupId>io.springfox</groupId>\n" +
                "                <artifactId>springfox-swagger2</artifactId>\n" +
                "                <version>2.5.0</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <dependency>\n" +
                "                <groupId>io.springfox</groupId>\n" +
                "                <artifactId>springfox-swagger-ui</artifactId>\n" +
                "                <version>2.5.0</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--分页插件-->\n" +
                "            <dependency>\n" +
                "                <groupId>com.github.pagehelper</groupId>\n" +
                "                <artifactId>pagehelper-spring-boot-starter</artifactId>\n" +
                "                <version>1.2.3</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <dependency>\n" +
                "                <groupId>org.springframework.data</groupId>\n" +
                "                <artifactId>spring-data-commons</artifactId>\n" +
                "                <version>2.0.6.RELEASE</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <dependency>\n" +
                "                <groupId>commons-beanutils</groupId>\n" +
                "                <artifactId>commons-beanutils</artifactId>\n" +
                "                <version>1.6</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <dependency>\n" +
                "                <groupId>org.apache.commons</groupId>\n" +
                "                <artifactId>commons-lang3</artifactId>\n" +
                "                <version>3.0.1</version>\n" +
                "            </dependency>\n" +
                "\n" +
                "\n" +
                "            <dependency>\n" +
                "                <groupId>net.sf.json-lib</groupId>\n" +
                "                <artifactId>json-lib</artifactId>\n" +
                "                <version>2.4</version>\n" +
                "                <classifier>jdk15</classifier>\n" +
                "            </dependency>\n" +
                "\n" +
                "            <!--jwt-->\n" +
                "            <dependency>\n" +
                "                <groupId>io.jsonwebtoken</groupId>\n" +
                "                <artifactId>jjwt</artifactId>\n" +
                "                <version>0.5.1</version>\n" +
                "            </dependency>\n" +
                "        </dependencies>\n" +
                "    </dependencyManagement>\n" +
                "\n" +
                "    <build>\n" +
                "        <plugins>\n" +
                "            <plugin>\n" +
                "                <artifactId>maven-compiler-plugin</artifactId>\n" +
                "                <version>3.7.0</version>\n" +
                "                <configuration>\n" +
                "                    <source>1.8</source>\n" +
                "                    <target>1.8</target>\n" +
                "                </configuration>\n" +
                "            </plugin>\n" +
                "            <plugin>\n" +
                "                <groupId>org.springframework.boot</groupId>\n" +
                "                <artifactId>spring-boot-maven-plugin</artifactId>\n" +
                "                <version>1.3.0.RELEASE</version>\n" +
                "                <configuration><!-- 指定该Main Class为全局的唯一入口 -->\n" +
                "                    <mainClass>com.liyuan.kingglory.DemoWebApplication</mainClass>\n" +
                "                    <layout>ZIP</layout>\n" +
                "                </configuration>\n" +
                "                <executions>\n" +
                "                    <execution>\n" +
                "                        <goals>\n" +
                "                            <goal>repackage</goal><!--可以把依赖的包都打包到生成的Jar包中-->\n" +
                "                        </goals>\n" +
                "                        <!--可以生成不含依赖包的不可执行Jar包-->\n" +
                "                        <!-- configuration>\n" +
                "                          <classifier>exec</classifier>\n" +
                "                        </configuration> -->\n" +
                "                    </execution>\n" +
                "                </executions>\n" +
                "            </plugin>\n" +
                "        </plugins>\n" +
                "    </build>\n" +
                "</project>");

        return data.toString();
    }
}
