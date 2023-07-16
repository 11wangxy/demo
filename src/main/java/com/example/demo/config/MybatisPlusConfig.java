package com.example.demo.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Configuration
public class MybatisPlusConfig {

    /**
     * mp插件
     */
//    @Bean
//    public MybatisPlusInterceptor optimisticLockerInnerInterceptor(){
//        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        //向Mybatis过滤器链中添加分页拦截器
//        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.SQL_SERVER));
//        return interceptor;
//    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

}

