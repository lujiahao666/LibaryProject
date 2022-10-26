/*
package com.lu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MailCorsConfiguration {
    //网关映射，精准匹配放前面，模糊匹配放后面，path映射在host前面
    //nginx，通过一个域名和映射 访问这个域名时候，将我们的请求代理给网关，网关再精准匹配接口
    // api开头转交给对应的服务，如果是满足域名host映射，转交给对应的服务
    //在转发消息的时候，nginx会丢失hostname 所以需要在nginx配置文件中加上hostname
    @Configuration
    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
    public class AppConfig implements WebMvcConfigurer {

        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")  // 拦截所有的请求
                    .allowedOrigins("*")  // 可跨域的域名，可以为 *
                    .allowCredentials(true)
                    .allowedMethods("*")   // 允许跨域的方法，可以单独配置
                    .allowedHeaders("*");  // 允许跨域的请求头，可以单独配置
        }
    }

}
*/
