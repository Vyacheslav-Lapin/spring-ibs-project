package ru.vlapin.training.springibsproject.config;

import ru.vlapin.training.springibsproject.model.JavaConfigBasedSetterPropertiesPlaceholderExample;
import ru.vlapin.training.springibsproject.model.JavaConfigBasedSetterPropertiesPlaceholderExampleImpl;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConfigurationPropertiesScan("ru.vlapin.training.springibsproject")
public class PropertyPlaceholder {

  @Bean
  @ConfigurationProperties("my-properties2")
  JavaConfigBasedSetterPropertiesPlaceholderExample mySetterProperties2() {
    return new JavaConfigBasedSetterPropertiesPlaceholderExampleImpl();
  }
}
