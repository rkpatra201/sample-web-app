package com.java.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.exception.AppExceptionHandler;
import com.java.repository.EmployeeRepository;
import com.java.util.ObjectToJsonMapper;

/**
 * Servlet implementation class EmployeeEndpointServlet
 */
public class EmployeeEndpointServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	EmployeeRepository repository = null;

	public EmployeeEndpointServlet() {
		super();
		// TODO Auto-generated constructor stub
		repository = new EmployeeRepository();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		try {
			String counter = request.getParameter("counter");
			System.out.println(counter);
			Integer id = Integer.valueOf(counter);
			response.getWriter().println(ObjectToJsonMapper.getJson(repository.getEmployeeName(id)));
		} catch (Exception e) {
			// TODO: handle exception
			AppExceptionHandler.handler(response, e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);

		String name = request.getParameter("name");
		String city = request.getParameter("city");
		int recordId = repository.addEmployee(name, city);
		response.getWriter().println(recordId);
	}

}
