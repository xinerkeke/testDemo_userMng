package byy.dao;

import byy.bean.Admin;

public interface ILoginDAO {
	
	Admin findByCode(String adminCode) 
		throws DAOException;

}
