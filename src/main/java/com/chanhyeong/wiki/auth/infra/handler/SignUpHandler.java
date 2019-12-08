package com.chanhyeong.wiki.auth.infra.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

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
