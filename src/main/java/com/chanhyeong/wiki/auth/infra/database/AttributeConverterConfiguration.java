package com.chanhyeong.wiki.auth.infra.database;

import com.chanhyeong.wiki.auth.model.oauth.*;
import org.springframework.context.annotation.*;
import org.springframework.core.convert.converter.*;
import org.springframework.data.convert.*;
import org.springframework.data.jdbc.core.convert.*;
import org.springframework.data.jdbc.repository.config.*;

import java.util.*;

@Configuration
public class AttributeConverterConfiguration extends AbstractJdbcConfiguration {

	@Override
	public JdbcCustomConversions jdbcCustomConversions() {
		return new JdbcCustomConversions(List.of(OAuthProviderToInteger.INSTANCE, IntegerToOAuthProvider.INSTANCE));
	}

	@ReadingConverter
	enum OAuthProviderToInteger implements Converter<OAuthProvider, Integer> {
		INSTANCE;

		@Override
		public Integer convert(OAuthProvider source) {
			return source.getId();
		}
	}

	@WritingConverter
	enum IntegerToOAuthProvider implements Converter<Integer, OAuthProvider> {
		INSTANCE;

		@Override
		public OAuthProvider convert(Integer source) {
			return OAuthProvider.getTypeById(source).orElse(null);
		}
	}
}
