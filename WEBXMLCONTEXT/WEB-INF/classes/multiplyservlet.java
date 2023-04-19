import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class multiplyservlet extends HttpServlet{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        ServletConfig config=getServletConfig();
        ServletContext context=config.getServletContext();
        //ServletContext context=getSetvletConext(); ✅✅
        int a=Integer.parseInt(context.getInitParameter("a"));
        int b=Integer.parseInt(context.getInitParameter("b"));
        int c=a*b;
        out.print("<body bgcolor=green>");
        out.print("<h1 align=center > Multiplication </h1><hr><br>");
        out.print("<h2 align=center> Result is : "+c+"</h2>");
        out.print("</body>");
        out.close();
    }
}