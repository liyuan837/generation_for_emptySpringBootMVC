package com.gen.conf;

/**
 * @Author: LiYuan
 * @Description:配置项目常量
 * @Date: 17:58 2018/5/9
 */
public interface Config {

    /**
     * 项目名称
     */
    String projectName = "hello-api";

    /**
     * 数据库名称
     */
    String dbName = "king_glory_db";

    /**
     * groupId:
     */
    String groupId = "com.qianmi";

    /**
     * parentVersion:
     */
    String parentVersion = "1.0-SNAPSHOT";

    /**
     * moduleVersion:
     */
    String moduleVersion = "1.0-SNAPSHOT";

    /**
     * 项目路径：项目所在磁盘路径
     */
    String projectPath = "D:/workspace_idea/hello-api/";

    /**
     * 项目基本包名:groupId + 项目名
     */
    String basePackage = "com.bm.hello";

    /**
     * 异常类名:项目名 + Exception
     */
    String exceptionName = "HelloException";

    /**
     * 生成的接口根uri：所有Controller的访问前缀，不设置或者设成项目名
     */
    //String parentUri = "/king";
    String parentUri = "";

    /**
     * 所有子模块的名称前缀：一般设成项目名
     */
    String baseModuleName = "hello";

    /**
     * common模块名称
     */
    String commonModuleName = baseModuleName + "-base";

    /**
     * dao模块名称
     */
    String daoModuleName = baseModuleName + "-mapper";

    /**
     * domain模块名称
     */
    String domainModuleName = baseModuleName + "-domain";

    /**
     * service模块名称
     */
    String serviceModuleName = baseModuleName + "-service";

    /**
     * web模块名称
     */
    String webModuleName = baseModuleName + "-web";

    /**
     * 入口类类名
     */
    String webApplicationName = "HelloWebApplication";

    /**
     * 代码路径
     */
    String javaPath = "/src/main/java/";

    /**
     * 资源路径
     */
    String resourcePath = "/src/main/resources/";

    /**
     * 项目主配置文件路径
     */
    String applicationPropertiesPath = projectPath + webModuleName + resourcePath;

    /**
     * BaseXXX.java所在包
     */
    String baseXXXPackage = basePackage + ".base.base";

    /**
     * 异常类所在包
     */
    String exceptionPackage = basePackage + ".base.exception";

    /**
     * ResponseEntity.java所在包
     */
    String responsePackage = basePackage + ".base.response";

    /**
     * common util.java所在包
     */
    String commonUtilPackage = basePackage + ".base.util";

    /**
     * Po包名
     */
    String poPackage = basePackage + ".domain.po";

    /**
     * Condition包名
     */
    String conditionPackage = basePackage + ".domain.condition";

    /**
     * Form包名
     */
    String formPackage = basePackage + ".form";


    /**
     * Mapper.java包名
     */
    String mapperJavaPackage = basePackage + ".mapper";

    /**
     * Service.java包名
     */
    String servicePackage = basePackage + ".service";

    /**
     * ServiceImp.java包名
     */
    String serviceImplPackage = servicePackage + ".impl";

    /**
     * Vo包名
     */
    String voPackage = basePackage + ".vo";

    /**
     * Controller包名
     */
    String controllerPackage = basePackage + ".controller";

    /**
     * BaseXXX.java路径
     */
    String baseXXXPath = projectPath + commonModuleName + javaPath + baseXXXPackage.replaceAll("\\.","/") + "/";

    /**
     * 自定义异常类路径
     */

    String customExceptionPath = projectPath + commonModuleName + javaPath + exceptionPackage.replaceAll("\\.","/") + "/";

    /**
     * response类路径
     */
    String responsePath = projectPath + commonModuleName + javaPath + responsePackage.replaceAll("\\.","/") + "/";

    /**
     * common 下util 类路径
     */
    String commonUtilPath = projectPath + commonModuleName + javaPath + commonUtilPackage.replaceAll("\\.","/") + "/";

    /**
     * Mapper.xml路径
     */
    String mapperXMLPath = projectPath + daoModuleName + resourcePath + mapperJavaPackage.replaceAll("\\.", "/") + "/";

    /**
     * Mapper.java文件路径
     */
    String mapperJavaPath = projectPath + daoModuleName + javaPath + mapperJavaPackage.replaceAll("\\.", "/") + "/";

    /**
     * Service.java文件路径
     */
    String servicePath = projectPath + serviceModuleName + javaPath + servicePackage.replaceAll("\\.", "/") + "/";


    /**
     * ServiceImp.java文件路径
     */
    String serviceImplPath = servicePath + "impl/";


    /**
     * Controller.java文件路径
     */
    String controllerPath = projectPath + webModuleName + javaPath + controllerPackage.replaceAll("\\.", "/") + "/";

    /**
     * pom文件路径
     */
    String commonPomPath = projectPath + commonModuleName + "/";
    String domainPomPath = projectPath + domainModuleName + "/";
    String daoPomPath = projectPath + daoModuleName + "/";
    String servicePomPath = projectPath + serviceModuleName + "/";
    String webPomPath = projectPath + webModuleName + "/";
    String mainPomPath = projectPath + "/";
    /**
     * 基本包名路径
     */
    String basePackagePath = projectPath + webModuleName + javaPath + basePackage.replaceAll("\\.","/") + "/";

}
