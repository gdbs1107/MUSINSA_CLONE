package com.example.musinsa_clone.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI MUSINSA_CLONE_API(){
        Info info=new Info()
                .title("무신사 클론 코딩")
                .description("무신사 클론코딩 프로젝트 입니다 <br>" +
                        "무신사의 앱 페이지를 참고하여 웹 페이지에 필요한 API를 구현합니다 <br>")
                .version("1.0");

        String jwtSchemeName="JWTToken";

        SecurityRequirement securityRequirement=new SecurityRequirement().addList(jwtSchemeName);

        Components components=new Components()
                .addSecuritySchemes(jwtSchemeName,new SecurityScheme()
                        .name(jwtSchemeName)
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT"));

        return new OpenAPI()
                .addServersItem(new Server().url("/"))
                .info(info)
                .addSecurityItem(securityRequirement)
                .components(components);

    }

}
