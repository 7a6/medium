package org.willowlms.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Version
 */
@WebServlet("/version")
public class Version extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String version = "0.0";
    private static final String htmlHead = "<html><head><title>Hello World!</title></head>";
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Version() {
        super();
        // TODO Auto-generated constructor stub
    }
    
      
    
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Hello World!</title></head>");
		out.println("<body><h1>Hello World!</h1></body></html>");
		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
