package cn.niit.lms.manage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.niit.lms.jdbc.lms_jdbc;
/**
 * Servlet implementation class BookReturnServlet
 */
@WebServlet("/BookReturnServlet")
public class BookReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookReturnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("!进入BooksReturnServlet.java!");
		response.setCharacterEncoding("GBK");
		String bid = request.getParameter("bid");
		String uid = request.getParameter("uid");
		//连接数据库
		lms_jdbc jdbc = new lms_jdbc();
		jdbc.creatConnection();
		//执行删除语句
		jdbc.Update("delete from borrowed_books where BID="+bid);
		//跳回页面
		response.sendRedirect("BorrowDetail.jsp?uid="+uid);
		System.out.println("!退出BooksReturnServlet.java!");

		//RequestDispatcher dispatcher = request.getRequestDispatcher("BorrowDetail.jsp?uid="+uid);
		//dispatcher .forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
