package com.chao.cloud.common.config.web;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.chao.cloud.common.convert.ConvertInterceptor;

/**
 * aop 配置
 * @功能：
 * @author： 薛超
 * @时间： 2019年5月27日
 * @version 1.0.0
 */
@Configuration
public class AopConfig {

    /**
     * bean -拦截器
     * 
     * @return
     */
    @Bean(name = "convert")
    public ConvertInterceptor convertInterceptor() {
        return new ConvertInterceptor();
    }

    /**
     * 全局controller拦截
     * 
     * @return
     */
    @Bean
    public BeanNameAutoProxyCreator beanNameAutoProxyCreator() {
        BeanNameAutoProxyCreator creator = new BeanNameAutoProxyCreator();
        creator.setProxyTargetClass(true);
        creator.setBeanNames("*Controller");
        creator.setInterceptorNames("convert");
        return creator;
    }

}