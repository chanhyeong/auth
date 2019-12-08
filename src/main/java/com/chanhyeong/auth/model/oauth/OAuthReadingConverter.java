package com.chanhyeong.auth.model.oauth;

import org.springframework.core.convert.converter.*;
import org.springframework.data.convert.*;

@ReadingConverter
public enum OAuthReadingConverter implements Converter<OAuthProvider, Integer> {
	INSTANCE;

	@Override
	public Integer convert(OAuthProvider source) {
		return source.getId();
	}
}
