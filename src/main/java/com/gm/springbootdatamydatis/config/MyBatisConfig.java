package com.gm.springbootdatamydatis.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//自定义Mybatis的配置规则：给容器中添加一个ConfigurationCustomizer
@Configuration //表示这个类是一个配置文件类
public class MyBatisConfig {

//    @Bean //方法的返回值会作为组件注入到容器中
//    public ConfigurationCustomizer configurationCustomizer(){
//        return new ConfigurationCustomizer(){
//            //ctrl+o 查看这个类可重写的方法
//            @Override
//            public void customize(org.apache.ibatis.session.Configuration configuration) {
//                //设置驼峰命名
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }
}
