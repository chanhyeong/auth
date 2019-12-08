package com.chanhyeong.wiki.config.infra.helper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.NonNull;
import org.springframework.util.Assert;

public class AssertUtils extends Assert {
	public static void notBlank(String string, @NonNull String message) {
		if (StringUtils.isBlank(string)) {
			throw new IllegalArgumentException(message);
		}
	}
}
