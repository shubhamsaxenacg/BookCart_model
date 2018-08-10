package in.capgemini.shop.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import in.capgemini.shop.model.BookShopService;
import in.capgemini.shop.model.BookShopServiceImpl;

/**
 * Servlet implementation class BookShopController
 */
@WebServlet("*.app")
public class BookShopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		BookShopService bookShopService= new BookShopServiceImpl();
		HttpSession session = request.getSession();
		String action = request.getServletPath();
		
		switch(action) {
			case "/books.app":
				session.setAttribute("books",bookShopService.allBooks());
				session.setAttribute("cart", bookShopService.viewBookCart());
				response.sendRedirect("books.jsp");
				break;
				
			case "/add.app":
				int id = Integer.parseInt(request.getParameter("bookId"));
				System.out.println(id);
				int cartcount=bookShopService.addBookCart(id);
				session.setAttribute("cartC", cartcount);
				System.out.println(bookShopService.viewBookCart());
				response.sendRedirect("books.jsp");
				break;
				
			case "/view.app": 
				System.out.println(bookShopService.viewBookCart());
				session.setAttribute("cart",bookShopService.viewBookCart());
				response.sendRedirect("cart.jsp");
				break;

			case "/remove.app":
				int id1 = Integer.parseInt(request.getParameter("bookId"));
				System.out.println(id1);
				bookShopService.removeBookFromCart(id1);
//				session.setAttribute("cartC", cartcount);
				session.setAttribute("cart",bookShopService.viewBookCart());
				response.sendRedirect("cart.jsp");
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
