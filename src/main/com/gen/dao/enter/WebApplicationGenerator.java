package com.gen.dao.enter;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class WebApplicationGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("package " + Config.basePackage + ";\r\n\r\n")

                .append("import org.springframework.boot.SpringApplication;\r\n")
                .append("import org.springframework.boot.autoconfigure.SpringBootApplication;\r\n")
                .append("import org.springframework.boot.builder.SpringApplicationBuilder;\r\n")
                .append("import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;\r\n")
                .append("import org.springframework.context.annotation.ComponentScan;\r\n")
                .append("import springfox.documentation.swagger2.annotations.EnableSwagger2;\r\n\n")

                .append("@SpringBootApplication\n" +
                        "@EnableSwagger2\n" +
                        "@ComponentScan(value = {\""+Config.basePackage+"\"})\n" +
                        "public class "+Config.webApplicationName+" extends SpringBootServletInitializer {\n" +
                        "\n" +
                        "\tpublic static void main(String[] args) {\n" +
                        "\t\tSpringApplication.run("+Config.webApplicationName+".class, args);\n" +
                        "\t}\n" +
                        "\n" +
                        "\t@Override\n" +
                        "\tprotected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {\n" +
                        "\t\treturn builder.sources("+Config.webApplicationName+".class);\n" +
                        "\t}\n" +
                        "}");

        return data.toString();
    }
}
