package org.springboot.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration // 注册到springboot 容器中
@MapperScan(basePackages = "org.springboot.dao.novel_system", sqlSessionTemplateRef = "test1SqlSessionTemplate")
public class DataSource1Config {

	@Bean(name = "test1DataSource")
	@ConfigurationProperties(prefix = "novel-system.datasource")
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "test1SqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("test1DataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		// 加载其他文件，如mapper.xml
		bean.setMapperLocations(
				new PathMatchingResourcePatternResolver().getResources("classpath:mapper/novel-system/*.xml"));
		return bean.getObject();
	}

	// 事务管理
	@Bean(name = "test1TransactionManager")
	public DataSourceTransactionManager testTransactionManager(@Qualifier("test1DataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "test1SqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("test1SqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
