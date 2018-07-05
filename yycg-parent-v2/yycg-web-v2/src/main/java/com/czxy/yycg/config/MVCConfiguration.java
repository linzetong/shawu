package com.czxy.yycg.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@PropertySource("classpath:upload.properties")
//@ComponentScan(basePackages="com.czxy.yycg.*.web.controller")
//@EnableAspectJAutoProxy(proxyTargetClass=true)
public class MVCConfiguration extends WebMvcConfigurerAdapter {
	/**
	 * 配置视图解析器
	 * @return
	 */
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/business/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	/**
	 * 配置静态资源映射（可选），DispatcherServlet配置成/，必须配置
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/images/**").addResourceLocations("/images/");
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/styles/**").addResourceLocations("/styles/");
		registry.addResourceHandler("/test/**").addResourceLocations("/test/");
		registry.addResourceHandler("/template/**").addResourceLocations("/template/");
		registry.addResourceHandler("/menu.json").addResourceLocations("/menu.json");
		registry.addResourceHandler("/favicon.ico").addResourceLocations("/favicon.ico");
	}
	/**
	 * 处理静态资源
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	 */
	
	@Value("${upload.maxUploadSize}")
	private long maxUploadSize;
	
	@Value("${upload.maxInMemorySize}")
	private int maxInMemorySize;
	
	@Value("${upload.defaultEncoding}")
	private String defaultEncoding;
	
	/**
	 * 上传文件解析器
	 * @return
	 */
	@Bean
	public CommonsMultipartResolver multipartResolver(){
		CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
		commonsMultipartResolver.setMaxUploadSize(maxUploadSize);
		commonsMultipartResolver.setMaxInMemorySize(maxInMemorySize);
		commonsMultipartResolver.setDefaultEncoding(defaultEncoding);
		return commonsMultipartResolver;
	}
}
