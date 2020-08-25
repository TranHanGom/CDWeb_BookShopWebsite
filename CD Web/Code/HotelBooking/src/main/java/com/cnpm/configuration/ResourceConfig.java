package com.cnpm.configuration;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class ResourceConfig 
	implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        	registry.addResourceHandler("/img/**").addResourceLocations("/resources/static/img/bg-img");

        }
    }

