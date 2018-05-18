package com.gen.dao.config;

import com.gen.conf.Config;

/**
 * @Author: LiYuan
 * @Description:
 * @Date: 17:20 2018/5/17
 */
public class MyBatisConfigurationGenerator {
    public String generate() {
        StringBuffer data = new StringBuffer();
        data.append("package " + Config.basePackage + ".config;\r\n\r\n")

                .append("import com.zaxxer.hikari.HikariDataSource;\r\n")
                .append("import org.mybatis.spring.SqlSessionFactoryBean;\r\n")
                .append("import org.mybatis.spring.annotation.MapperScan;\r\n")
                .append("import org.springframework.beans.factory.annotation.Qualifier;\r\n")
                .append("import org.springframework.beans.factory.annotation.Value;\r\n")
                .append("import org.springframework.context.annotation.Bean;\r\n")
                .append("import org.springframework.context.annotation.Configuration;\r\n")
                .append("import org.springframework.context.annotation.Primary;\r\n")
                .append("import org.springframework.jdbc.datasource.DataSourceTransactionManager;\r\n")
                .append("import org.springframework.transaction.annotation.EnableTransactionManagement;\r\n")
                .append("import javax.sql.DataSource;\r\n\n")
                .append("@Configuration\n" +
                        "@MapperScan(basePackages = {\""+Config.mapperJavaPackage+"\"})\n" +
                        "@EnableTransactionManagement\n" +
                        "public class MyBatisConfiguration {\n" +
                        "    @Value(\"${jdbc.driver}\")\n" +
                        "    private String driverClassName;\n" +
                        "    @Value(\"${jdbc.url}\")\n" +
                        "    private String url;\n" +
                        "    @Value(\"${jdbc.username}\")\n" +
                        "    private String username;\n" +
                        "    @Value(\"${jdbc.password}\")\n" +
                        "    private String password;\n" +
                        "\n" +
                        "\n" +
                        "    //配置数据源\n" +
                        "    @Bean(destroyMethod = \"close\", name = \"dataSource\")\n" +
                        "    @Primary\n" +
                        "    public HikariDataSource createDataSource() {\n" +
                        "        HikariDataSource hikariDataSource = new HikariDataSource();\n" +
                        "        hikariDataSource.setPoolName(\"demoPool\");\n" +
                        "        hikariDataSource.setDriverClassName(driverClassName);\n" +
                        "        hikariDataSource.setJdbcUrl(url);\n" +
                        "        hikariDataSource.setUsername(username);\n" +
                        "        hikariDataSource.setPassword(password);\n" +
                        "        return hikariDataSource;\n" +
                        "    }\n" +
                        "\n" +
                        "    //配置事务管理\n" +
                        "    @Bean(name = \"makeDataSourceTransactionManager\")\n" +
                        "    @Primary\n" +
                        "    public DataSourceTransactionManager makeDataSourceTransactionManager(@Qualifier(\"dataSource\") DataSource dataSource) {\n" +
                        "        DataSourceTransactionManager manager = new DataSourceTransactionManager();\n" +
                        "        manager.setDataSource(dataSource);\n" +
                        "        return manager;\n" +
                        "    }\n" +
                        "\n" +
                        "    //配置sqpSessionFactory\n" +
                        "    @Bean(name = \"sqlSessionFactory\")\n" +
                        "    @Primary\n" +
                        "    public SqlSessionFactoryBean makeSqlSessionFactoryBean(@Qualifier(\"dataSource\") DataSource dataSource) throws Exception {\n" +
                        "        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();\n" +
                        "        sessionFactory.setDataSource(dataSource);\n" +
                        "        sessionFactory.setTypeAliasesPackage(\""+Config.basePackage+".domain"+"\");\n" +
                        "        return sessionFactory;\n" +
                        "    }\n" +
                        "}\n");

        return data.toString();
    }
}
