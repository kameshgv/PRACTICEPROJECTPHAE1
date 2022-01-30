package starter;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	@WebServlet(name = "OurFirstServlet", urlPatterns = {"/first", "/other"})
	public class fistd extends HttpServlet {
		
		@Override
		public void init() {
			System.out.println("Servlet Initialized...");
		}
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			System.out.println("Inside doGet()...");
			
//			Set the content type of response
			response.setContentType("text/html");
			
//			Get a reference to PrintWriter
			PrintWriter out = response.getWriter();
			
//			Lets write something 
			out.println("<html>");
			out.println("<body>");
			out.println("We are running servlets now on the server");
			out.println("<h3>Servlet running at : " + request.getContextPath() + "</h3>");
			out.println("<h4>" + request.getServletPath() + "</h4>");
			out.println("</body>");
			out.println("</html>");
			
	}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
			doGet(req, resp);
		}
	}
		
		
	
