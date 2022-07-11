package ru.vlapin.training.springibsproject.annotations.hell;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target({ANNOTATION_TYPE})
public @interface MyAnnotation {
}
