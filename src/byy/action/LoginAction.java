package byy.action;

import byy.bean.Admin;
import byy.dao.DAOException;
import byy.dao.DAOFactory;
import byy.dao.ILoginDAO;

public class LoginAction {
	
	// input
	private String adminCode;
	private String password;
	
	// output
	private String errorMsg;
	
	public String getAdminCode() {
		return adminCode;
	}

	public void setAdminCode(String adminCode) {
		this.adminCode = adminCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		
		ILoginDAO dao = DAOFactory.getLoginDAO();
		Admin admin = null;
		try {
			admin = dao.findByCode(adminCode);
		} catch (DAOException e) {
			e.printStackTrace();
			errorMsg = "查询用户信息失败";
			return "fail";
		}
		
		if(admin == null) {
			errorMsg = "登录信息不能为空.";
			return "fail";
		} else if (!admin.getPassword().equals(password)) {
			errorMsg = "用户名或密码错误.";
			return "fail";
		} else {
			return "ok";
		}
		
	}

}
