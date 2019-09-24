package com.skm.app;

import com.skm.aop.HelloService;
import com.skm.aop.HelloServiceImpl;
import com.skm.aop.MyInterceptor;
import com.skm.aop.ProxyBean;
import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.PlatformTransactionManager;

import javax.annotation.PostConstruct;

/**
 * Created by zjuskm
 * 2019-09-21
 */
@SpringBootApplication
// 定义Spring boot扫描包路径
@ComponentScan(basePackages = "com.skm.*")
// 定义JPA接口扫描包路径
//@EnableJpaRepositories(basePackages = "com.ximalaya.dao")
// 定义实体Bean扫描包路径
@EntityScan(basePackages = "com.ximalaya.model")
// 定义mybatis的扫描
@MapperScan(basePackages = "com.ximalaya.dao")
public class WebApplication {
    private static Logger log = Logger.getLogger(WebApplication.class);

//    @Autowired
//    private SqlSessionFactory sqlSessionFactory = null;
//
//    @Bean
//    public MapperFactoryBean<MyBatisUserDao> initMyBatisUserDao() {
//        MapperFactoryBean<MyBatisUserDao> bean = new MapperFactoryBean<>();
//        bean.setMapperInterface(MyBatisUserDao.class);
//        bean.setSqlSessionFactory(sqlSessionFactory);
//        return bean;
//    }

//    /**
//     * 配置mybatis接口扫描
//     * @return 返回扫描器
//     */
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfig() {
//        // 定义扫描器实例
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        // 加载SqlSessionFactory，Spring boot会自动生成SqlSessionFactory实例
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        // 定义扫描的包
//        mapperScannerConfigurer.setBasePackage("com.ximalaya.dao");
//        // 限定被标注@Repository的接口才被扫描
//        mapperScannerConfigurer.setAnnotationClass(Repository.class);
//        return mapperScannerConfigurer;
//    }


    @Autowired
    private PlatformTransactionManager transactionManager = null;

    @PostConstruct
    public void viewTransactionManager() {
        System.out.println(transactionManager.getClass().getName());
    }

    public static void testProxy() {
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("shan kemeng");
        System.out.println("\n#######name is null!! #######\n");
        proxy.sayHello(null);
    }
    public static void main(String args[]) {
        SpringApplication.run(WebApplication.class,args);
//        testProxy();
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        ScopeBean scopeBean1 = ctx.getBean(ScopeBean.class);
//        ScopeBean scopeBean2 = ctx.getBean(ScopeBean.class);
//        System.out.println(scopeBean1 == scopeBean2);


    }
}
