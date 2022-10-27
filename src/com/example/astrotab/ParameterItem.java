package com.example.astrotab;

import java.util.HashMap;

public class ParameterItem extends HashMap<String, String> {
	public static final String NAME = "name";
	public static final String VALUE = "value";
	
	public ParameterItem(String name, String value) {
		super();
		this.put(NAME, name);
		this.put(VALUE, value);
	}

}
