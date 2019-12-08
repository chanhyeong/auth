package com.chanhyeong.auth.infra.database;

import com.chanhyeong.auth.model.oauth.*;
import org.springframework.context.annotation.*;
import org.springframework.data.jdbc.core.convert.*;
import org.springframework.data.jdbc.repository.config.*;

import java.util.*;

@Configuration
public class AttributeConverterConfiguration extends AbstractJdbcConfiguration {

	@Override
	public JdbcCustomConversions jdbcCustomConversions() {
		return new JdbcCustomConversions(List.of(OAuthReadingConverter.INSTANCE, OAuthWritingConverter.INSTANCE));
	}
}