package com.chanhyeong.auth.config.infra.helper;

import org.apache.commons.lang3.StringUtils;
import org.springframework.lang.*;
import org.springframework.util.*;

public class AssertUtils extends Assert {
	public static void notBlank(String string, @NonNull String message) {
		if (StringUtils.isBlank(string)) {
			throw new IllegalArgumentException(message);
		}
	}
}
