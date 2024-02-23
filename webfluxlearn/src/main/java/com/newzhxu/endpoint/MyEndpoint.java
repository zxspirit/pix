package com.newzhxu.endpoint;

import org.springdoc.webflux.core.fn.SpringdocRouteBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

@Component
public class MyEndpoint {
    public RouterFunction<ServerResponse> endpoint() {

        return SpringdocRouteBuilder.route()
                .GET("/hello",
                        request -> ServerResponse.ok().bodyValue("Hello World"),
                        builder -> builder.operationId("hello"))
                .build();
    }
}
