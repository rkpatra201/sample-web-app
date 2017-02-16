package com.java.exception;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

public class AppExceptionHandler {

	public static void handler(HttpServletResponse response, Exception e) throws IOException {
		if (IAppExceptionMgr.class.isAssignableFrom(e.getClass())) {

			response.setStatus(Integer.valueOf(e.getMessage().split(",")[0]), e.getMessage());

		} else {
			response.setStatus(500, "Internal Server Error. Please contact helpline:1800 11 ****");
		}
	}

}
