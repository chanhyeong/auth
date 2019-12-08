package com.chanhyeong.auth.infra.router;

import com.chanhyeong.auth.infra.handler.*;
import org.springframework.context.annotation.*;
import org.springframework.web.reactive.function.server.*;

import static org.springframework.http.MediaType.ALL;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class SignUpRouter {
	@Bean
	public RouterFunction<ServerResponse> signUp(SignUpHandler signUpHandler) {
		return route()
			.path("/users", builder -> builder
				.GET("/", accept(ALL), signUpHandler::get)
				.POST("/", accept(APPLICATION_JSON_UTF8), signUpHandler::signUp))
			.build();
	}

}
