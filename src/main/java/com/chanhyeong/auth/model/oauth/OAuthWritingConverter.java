package com.chanhyeong.auth.model.oauth;

import org.springframework.core.convert.converter.*;

public enum OAuthWritingConverter implements Converter<Integer, OAuthProvider> {
	INSTANCE;

	@Override
	public OAuthProvider convert(Integer source) {
		return OAuthProvider.getTypeById(source).orElse(null);
	}
}