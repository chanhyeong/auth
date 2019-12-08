package com.chanhyeong.wiki.auth.model.oauth;

import lombok.Getter;

import java.util.Arrays;
import java.util.Optional;

@Getter
public enum OAuthProvider {
	GOOGLE(1), FACEBOOK(2), INSTARGRAM(3), NAVER(4), KAKAO(5);

	private int id;

	OAuthProvider(int id) {
		this.id = id;
	}

	public static Optional<OAuthProvider> getTypeById(int id) {
		return Arrays.stream(values())
			.filter(oAuthProvider -> oAuthProvider.getId() == id)
			.findFirst();
	}
}
