package com.xebia.dependencyInjectionWithMultipleType;
import org.springframework.beans.factory.BeanNameAware;

public interface IServiceWithMultipleType extends BeanNameAware {
	public void saveData(String data);

	public String getName();
}
