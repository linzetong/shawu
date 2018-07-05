package com.czxy.yycg.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import com.github.pagehelper.PageHelper;

import tk.mybatis.spring.mapper.MapperScannerConfigurer;

//@MapperScan("cn.itcast.yycg.*.dao")		//spring默认扫描器，不能使用通过mapper
public class MyBatisConfiguration {
	/**
	 * 配置sql工厂
	 * @param dataSource
	 * @return
	 * @throws Exception
	 */
	@Bean
	public SqlSessionFactory sessionFactory(DataSource dataSource) throws Exception{
		//1 创建factoryBean
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		
		//2.1 设置数据源
		factoryBean.setDataSource(dataSource);
		//2.2 设置驼峰命名
		Configuration configuration = new Configuration();
		configuration.setMapUnderscoreToCamelCase(true);
		factoryBean.setConfiguration(configuration);
		//2.3设置XML映射文件
		//2.4设置分页插件
		PageHelper pageHelper = new PageHelper();
		Properties pageProps = new Properties();
		pageProps.setProperty("dialect", "mysql");
		pageProps.setProperty("rowBoundsWithCount", "true");
		pageHelper.setProperties(pageProps);
		Interceptor[] plugins = {pageHelper};
		factoryBean.setPlugins(plugins);
		
		//3 通过factorybean获得对象
		return factoryBean.getObject();
	}
	
	/**
	 * 配置映射扫描器
	 * @return
	 */
	@Bean
	public MapperScannerConfigurer scannerConfigurer(){
		MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
		//扫描不同模块下所有的dao包
		scannerConfigurer.setBasePackage("com.czxy.yycg.*.dao");
		return scannerConfigurer; 
	}
}
