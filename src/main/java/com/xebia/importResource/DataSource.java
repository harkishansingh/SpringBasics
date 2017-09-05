package com.xebia.importResource;

public class DataSource {
	private String url;
	private String username;
	private String password;

	public DataSource(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "DataSource [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

}
