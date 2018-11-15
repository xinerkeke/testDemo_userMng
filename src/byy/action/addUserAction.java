package byy.action;

import byy.bean.User;
import byy.dao.DAOException;
import byy.dao.DAOFactory;
import byy.dao.IUserDao;

public class addUserAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		IUserDao dao = DAOFactory.getDao();
		try {
			dao.addUser(user);
		} catch (DAOException e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

}
