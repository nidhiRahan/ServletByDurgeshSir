package ServletPackage;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class SecondServlet extends GenericServlet {
@Override
public void service(ServletRequest req,ServletResponse resp)throws IOException,ServletException{
	System.out.println("service");
	PrintWriter out=resp.getWriter();
	out.println("this is a servlet by using GenericServlet in which we need to override ony service method");
	System.out.println("this is a servlet by using GenericServlet in which we need to override ony service method");

}
}
