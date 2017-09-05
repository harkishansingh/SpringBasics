package com.xebia.dependencyInjectionWithCustomQualifier;
import org.springframework.beans.factory.BeanNameAware;

public interface IServiceWithCustomQualifier extends BeanNameAware {
	public void saveData(String data);

	public String getName();
}
