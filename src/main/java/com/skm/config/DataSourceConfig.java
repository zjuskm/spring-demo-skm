//package com.ximalaya.config;
//
//import org.apache.commons.dbcp2.BasicDataSourceFactory;
//import org.apache.log4j.Logger;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
///**
// * Created by zjuskm
// * 2019-09-23
// */
//@Configuration
//public class DataSourceConfig {
//    private static Logger log = Logger.getLogger(AppConfig.class);
//
//    @Bean(name = "dataSource", destroyMethod = "")
////    @Conditional(DatabaseConditional.class)
//    public DataSource getDataSource() {
//        Properties props = new Properties();
//        props.setProperty("driver","com.mysql.jdbc.Driver");
//        props.setProperty("url","jdbc:mysql://192.168.3.220:3306/recsys?useUnicode=true&characterEncoding=UTF-8&allowMultiQueries=true");
//        props.setProperty("username","root");
//        props.setProperty("password","7654321");
//        DataSource dataSource = null;
//        try {
//            dataSource = BasicDataSourceFactory.createDataSource(props);
//        } catch (Exception e) {
//            log.error("Error to connect to mysql",e);
//        }
//        return dataSource;
//    }
//}
