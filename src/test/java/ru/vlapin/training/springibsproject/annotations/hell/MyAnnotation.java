package ru.vlapin.training.springibsproject.annotations.hell;

import static java.lang.annotation.RetentionPolicy.*;

import java.lang.annotation.Retention;
import org.springframework.core.annotation.AliasFor;

@Retention(RUNTIME)
@MyDeepAnnotation(
    withdraw = "Lorem ipsum dolor sit amet")
public @interface MyAnnotation {

  @AliasFor(
      annotation = MyDeepAnnotation.class,
      attribute = "overdraft")
  String value() default "";
}
