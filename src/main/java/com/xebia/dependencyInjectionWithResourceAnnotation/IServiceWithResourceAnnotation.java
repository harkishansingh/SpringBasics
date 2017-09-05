package com.xebia.dependencyInjectionWithResourceAnnotation;
import org.springframework.beans.factory.BeanNameAware;

public interface IServiceWithResourceAnnotation extends BeanNameAware {
	public void saveData(String data);

	public String getName();
}
