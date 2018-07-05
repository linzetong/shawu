package com.czxy.yycg.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

public class WebInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		//1 初始化spring容器
		AnnotationConfigWebApplicationContext applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(MyBatisConfiguration.class);
		applicationContext.register(SpringConfiguration.class);
		applicationContext.register(MVCConfiguration.class);
		applicationContext.setServletContext(servletContext);
		
		//2 处理post乱码
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("characterEncodingFilter", new CharacterEncodingFilter("UTF-8"));
		encodingFilter.addMappingForUrlPatterns(null, true, "/*");
		

		//3 前端控制器
		ServletRegistration.Dynamic dispatcherServlet = servletContext.addServlet("dispatcherServlet", new DispatcherServlet(applicationContext));
		dispatcherServlet.addMapping("*.action");
		dispatcherServlet.setLoadOnStartup(2);
		
	}

}
