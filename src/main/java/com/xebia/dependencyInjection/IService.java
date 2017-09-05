package com.xebia.dependencyInjection;
import org.springframework.beans.factory.BeanNameAware;

public interface IService extends BeanNameAware {
	public void saveData(String data);

	public String getName();
}
