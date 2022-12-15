package Controller.Teacher.Topic;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ITeachersDao;
import Dao.ITopicDao;

import Dao.Impl.TeachersDaoImpl;
import Dao.Impl.TopicDaoImpl;
import Models.TeachersModel;
import Models.TopicModel;

/**
 * Servlet implementation class ManagerTopicController
 */
	@WebServlet("/teacher/topics")
public class ListTopicController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListTopicController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
//		String user = request.getParameter("user");
		String user = "nguyenhuudat2710@gmail.com";
		ITeachersDao iTeachersDao = new TeachersDaoImpl();
		TeachersModel teachersModel = iTeachersDao.getByUser(user);
		ITopicDao iTopicDAO = new TopicDaoImpl();
		
		List<TopicModel> topics = iTopicDAO.getAllByTeacher(teachersModel.getTeacherId());
		
		request.setAttribute("teacher",teachersModel);
		request.setAttribute("topics",topics);
		request.getRequestDispatcher("/views/teacher/list-topics.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
