package com.github.chen0040.erp.configs;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * Created by xschen on 16/10/2016.
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {



   @Override
   public void addViewControllers(ViewControllerRegistry registry) {
      registry.addViewController("/home").setViewName("home");
      registry.addViewController("/").setViewName("home");
   }

}
