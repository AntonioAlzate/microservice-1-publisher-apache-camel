package com.sofka.microservice1.app.routers;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;


@Component
public class MyRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        // Broker
        from("file:files")
                .log("start ${body}")
                .to("activemq:my-activemq-queue");
    }
}
