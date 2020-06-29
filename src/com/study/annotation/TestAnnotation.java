package com.study.annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD,ElementType.METHOD})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface TestAnnotation {
    String date() default "31-12-2018";
}
