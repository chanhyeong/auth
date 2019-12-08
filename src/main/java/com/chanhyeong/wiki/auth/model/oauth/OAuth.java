package com.chanhyeong.wiki.auth.model.oauth;

import lombok.*;
import org.springframework.data.relational.core.mapping.*;

@Table("oauth")
@Getter
public class OAuth {
	private long id;

	private OAuthProvider oAuthProvider;
}
