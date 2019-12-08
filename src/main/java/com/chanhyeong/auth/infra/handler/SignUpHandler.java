package com.chanhyeong.auth.infra.handler;

import org.springframework.stereotype.*;
import org.springframework.web.reactive.function.server.*;
import reactor.core.publisher.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.web.reactive.function.BodyInserters.fromObject;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class SignUpHandler {
	public Mono<ServerResponse> get(ServerRequest request) {
		return ok().contentType(APPLICATION_JSON_UTF8)
			.body(fromObject("Hello, World!"));
	}

	public Mono<ServerResponse> signUp(ServerRequest request) {
		return ok().contentType(APPLICATION_JSON_UTF8)
			.body(fromObject("Hello, World!"));
	}
}
