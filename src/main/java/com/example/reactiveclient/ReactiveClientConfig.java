package com.example.reactiveclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.reactive.config.EnableWebReactive;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan({ "com.example.reactive.controller"}) 
@EnableWebReactive
public class ReactiveClientConfig extends WebMvcConfigurerAdapter {
    @Override
	public
    void configureContentNegotiation(final ContentNegotiationConfigurer configurer) {
        // Turn off suffix-based content negotiation
        configurer.favorPathExtension(false);
    }

	
//	@Bean(name = "dmConfig")
//	public DataMigrationConfig appConfig() {
//	    return SCMFactory.getSCM().getConfiguration(DataMigrationConfig.class, ConfigType.SIMPLE);
//	}

}
