package com.digytal.myapidoc.infra.springdoc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SpringDocConfigurations {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("digytal.myapidoc api")
                        .description("API Rest com doc")
                        .contact(new Contact()
                                .name("Time backend")
                                .email("http://digytal.myapidoc/email")
                        )
                        .license(new License()
                                .name("Apache 2.0")
                                .url("http://digytal.myapidoc/licenca")
                        )

                )
                .servers(List.of(new Server()
                        .url("http://localhost:8080")
                ))
                .tags(List.of(new Tag()
                        .name("springdoc")
                        .description("api rest web")

                ));
    }
}
