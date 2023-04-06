package ServletPackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ThirdServlet extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
	System.out.println("this is get Method");
	//for dynamic response
	PrintWriter out=resp.getWriter();
	out.println("<h1> this is a get method of my servlet</h1>");
	out.println(new Date(0, 0, 0).toString());
}
}
