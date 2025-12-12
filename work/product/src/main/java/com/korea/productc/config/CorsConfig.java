package com.korea.productc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration //스프링부트에 설정파일임을 알려주는 어노테이션
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // CORS 처리를 적용할 매핑 패턴을 선택
            .allowedOrigins("http://localhost:*", "http://127.0.0.1:*") // 어떤 도메인을 허가할 것인가,
            .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 메서드 설정
            .allowedHeaders("*"); // 하용할 헤더 설정
    }
}