package com.chanhyeong.auth.model.user;

import lombok.*;
import org.springframework.data.annotation.*;
import org.springframework.data.relational.core.mapping.*;

import java.time.*;

import static com.chanhyeong.auth.config.infra.helper.AssertUtils.notBlank;
import static org.springframework.util.Assert.notNull;

@Table("user")
@Getter
public class User {
	@Id
	private Long id;

	private String password;

	private String email;
	private int gender;
	private LocalDate birthday;

	private User(Long id, String password, String email, int gender, LocalDate birthday) {
		this.id = id;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
	}

	public static User newUser(Long id, String password, String email, int gender, LocalDate birthday) {
		notNull(id, "[User] id is null");
		notBlank(password, "[User] password is null or blank");

		return new User(id, password, email, gender, birthday);
	}
}