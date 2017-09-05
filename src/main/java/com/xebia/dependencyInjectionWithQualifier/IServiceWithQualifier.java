package com.xebia.dependencyInjectionWithQualifier;
import org.springframework.beans.factory.BeanNameAware;

public interface IServiceWithQualifier extends BeanNameAware {
	public void saveData(String data);

	public String getName();
}
