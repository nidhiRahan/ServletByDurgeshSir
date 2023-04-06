package ServletPackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class FirstServlet implements Servlet {
//override all method
	ServletConfig conf;
	
	public void init(ServletConfig conf) {
		this.conf=conf;
		System.out.println(conf);
	}
	public void service(ServletRequest req,ServletResponse resp)throws IOException,ServletException {
		System.out.println("service");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("hello guys this is servlet by using servlet interface");
	}
	public void destroy() {
		System.out.println("destroy");
	}
	public ServletConfig getServletConfig() {
		return conf;
	}
	public String getServletInfo() {
		return "this is a servlet made by me";
	}
}
