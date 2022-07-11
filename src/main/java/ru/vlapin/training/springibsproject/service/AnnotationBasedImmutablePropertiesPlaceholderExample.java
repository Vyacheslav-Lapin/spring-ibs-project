package ru.vlapin.training.springibsproject.service;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

public sealed interface AnnotationBasedImmutablePropertiesPlaceholderExample {
    String getAuthMethod();
    String getUsername();
    String getPassword();
}

/**
 * Limitations:
 * - no defaults (!!!)
 */
@Getter
@ConstructorBinding
@ConfigurationProperties("mail.credentials")
final class AnnotationBasedImmutablePropertiesPlaceholderExampleImpl
  implements AnnotationBasedImmutablePropertiesPlaceholderExample {

  /**
   * Auth method
   */
  String authMethod;

  /**
   * login
   */
  String username;

  /**
   * pwd
   */
  String password;

  public AnnotationBasedImmutablePropertiesPlaceholderExampleImpl(String authMethod,
                                                                  @DefaultValue("2") String username,
                                                                  @DefaultValue("3") String password) {
    this.authMethod = authMethod;
    this.username = username;
    this.password = password;
  }
}
