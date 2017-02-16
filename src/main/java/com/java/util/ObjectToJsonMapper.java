package com.java.util;

import com.google.gson.Gson;

public class ObjectToJsonMapper {

	public static String getJson(Object o) {
		Gson gson = new Gson();
		return gson.toJson(o);
	}
}
