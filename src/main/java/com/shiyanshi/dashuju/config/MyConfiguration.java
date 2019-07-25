package com.shiyanshi.dashuju.config;//package com.successspringboot.demo1.config;
//
//import com.successspringboot.demo1.component.LoginHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//
//@Configuration
//public class MyConfiguration  {
//
//    //所有的webMvcConfigurerAdapter组件会一起起作用
//    @Bean //注册到容器去
//    public WebMvcConfigurerAdapter webMvcConfigurerAdapter(){
//        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {
////            视图映射
////            @Override
////            public void addViewControllers(ViewControllerRegistry registry) {
////                registry.addViewController("/").setViewName("login");
////                registry.addViewController("/index.html").setViewName("login");
////                registry.addViewController("/main.html").setViewName("Dashboard");
////            }
//            //注册拦截器
////            @Override
////            public void addInterceptors(InterceptorRegistry registry) {
////                //静态资源 css js img 已经做好了静态资源映射
////                registry.addInterceptor(new LoginHandler()).addPathPatterns("/**").
////                        excludePathPatterns("/Login.html","/","/Login");
////            }
//        };
//        return adapter;
//    }
//
//}
