package ru.vlapin.training.springibsproject.common;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import static ru.vlapin.training.springibsproject.common.Loggable.LogLevel.*;

@Target(TYPE)
@Loggable(INFO)
@Retention(RUNTIME)
public @interface Log {
}
