package starter;

	import java.io.IOException;
	import java.io.PrintWriter;

	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;


	@WebServlet("/fetch")

public class frtchdemo extends HttpServlet {
	 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			Set the content type
			response.setContentType("text/html");
			
//			Get the PrintWriter reference
			PrintWriter out = response.getWriter();
			
//			Fetch the parameter value from request
			String userName = request.getParameter("userName");
			String userCountry = request.getParameter("userCountry");
			
			
			out.println("Welcome " + userName);	
			out.println(userCountry + " is such a lovely country...");		
			
			
			
			
			
//			out.println("Fetch Params Servlet executing...");
		}

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
		}

	}



