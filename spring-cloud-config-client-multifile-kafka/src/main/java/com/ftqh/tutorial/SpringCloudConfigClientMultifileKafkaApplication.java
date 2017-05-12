package com.ftqh.tutorial;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringCloudConfigClientMultifileKafkaApplication {

	@Value("${config-client2-welcome}")
	private String welcome;
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientMultifileKafkaApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return welcome;
	}
}
