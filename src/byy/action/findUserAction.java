package byy.action;

import java.util.List;

import byy.bean.User;
import byy.dao.DAOException;
import byy.dao.DAOFactory;
import byy.dao.IUserDao;

public class findUserAction {

	List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public String execute() {

		IUserDao dao = DAOFactory.getDao();
		try {
			System.out.println("查询页面数据");
			// 查询当前页的数据
			users = dao.findAll();

		} catch (DAOException e) {
			e.printStackTrace();
			// 如果发生异常，转向错误页面
			return "error";
		}
		// 正常执行结束，转向查询页面
		return "ok";
	}

}
