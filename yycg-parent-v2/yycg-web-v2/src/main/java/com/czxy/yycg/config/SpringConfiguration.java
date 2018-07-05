package com.czxy.yycg.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;


@PropertySource("classpath:jdbc.properties")
@ComponentScan(basePackages="com.czxy.yycg")
@EnableTransactionManagement
public class SpringConfiguration {
	/**
	 * 修复spring4.2 bug
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer Configurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	/**
	 * 注入数据
	 */
	@Value("${jdbc.driver}")
	private String driverClass;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	/**
	 * 配置数据源
	 * @return
	 */
	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(driverClass);
		dataSource.setUrl(jdbcUrl);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
	
	/**
	 * 配置事务管理器
	 * @param dataSource
	 * @return
	 */
	@Bean
	public DataSourceTransactionManager txManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}

}
