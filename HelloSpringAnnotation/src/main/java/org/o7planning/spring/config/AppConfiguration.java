package org.o7planning.spring.config;

import org.o7planning.spring.language.Language;
import org.o7planning.spring.language.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"org.o7planning.spring.bean"})
public class AppConfiguration {
	
	@Bean(name="language1")
	public Language getLanguage() {
		return new Vietnamese();
	}
}
