package com.chanhyeong.wiki.config.infra.database;

import com.zaxxer.hikari.*;
import org.springframework.boot.context.properties.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jdbc.repository.config.*;
import org.springframework.jdbc.core.namedparam.*;

import javax.sql.*;

@Configuration
@EnableJdbcRepositories(basePackages = {"com.chanhyeong.wiki"})
public class DataSourceConfig {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}

	@Bean
	public DataSource dataSource() {
		return new HikariDataSource(hikariConfig());
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}
}
