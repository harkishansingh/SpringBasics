package com.xebia.dependencyInjectionWithCustomQualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Qualifier;

@Target({ ElementType.FIELD, ElementType.PARAMETER,ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface DBQualifier {

	String value();
}