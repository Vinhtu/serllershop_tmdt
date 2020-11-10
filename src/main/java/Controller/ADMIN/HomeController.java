package Controller.ADMIN;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns={"/admin"})


public class HomeController extends HttpServlet{	
	private static final long serialVersionUID = -6710199796582851427L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("view/AdminHomeView.jsp");
		dispatcher.forward(request,response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException 
	{
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("view/AdminHomeView.jsp");
		dispatcher.forward(request,response);
	}
}
