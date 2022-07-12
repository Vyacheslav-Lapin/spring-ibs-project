package ru.vlapin.training.springibsproject.annotations.hell;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.springframework.core.annotation.AliasFor;

@Retention(RUNTIME)
public @interface MyDeepAnnotation {

  @AliasFor("withdraw")
  String value() default "";

  @AliasFor("value")
  String withdraw() default "";

  String overdraft() default "";
}
