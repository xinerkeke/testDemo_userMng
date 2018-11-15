package byy.action;

import byy.dao.DAOException;
import byy.dao.DAOFactory;
import byy.dao.IUserDao;

public class delUserAction {

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public String execute() {

		IUserDao dao = DAOFactory.getDao();
		try {
			dao.deleteUser(id);
		} catch (DAOException e) {
			e.printStackTrace();
			return "error";
		}
		return "success";
	}

}
