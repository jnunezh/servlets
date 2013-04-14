

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/eq")
public class CuadraticEquation extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        if(request.getParameter("a") != null && request.getParameter("b") != null && request.getParameter("c") != null)
        {
    	   
    	   Integer a = Integer.parseInt(request.getParameter("a"));
    	   Integer b = Integer.parseInt(request.getParameter("b"));
    	   Integer c = Integer.parseInt(request.getParameter("c"));
    	   Integer temp = (b * b) - (4 * a * c);
    	   if(temp < 0)
    		out.println("<h1>la ecuacion no tiene soluciones reales!</h1>");
    	   else if(temp > 0)
    		out.println("<h1>soluciones:</h1><p>x1:"+((-b+Math.sqrt(temp))/ (2 * a))+",x2:"+((-b - Math.sqrt(temp))/ (2 * a))+"</p>");
    	   else
    		out.println("<h1>solucion unica:</h1><p>x1:"+(-b / (2 * a))+"</p>");
        }
       else
    	 out.println("<h1>algun parametro faltaba!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
