package byy.dao;

public class DAOFactory {
	
	private static IUserDao dao = 
								new UserDaoImpl();
	
	private static ILoginDAO loginDao = 
			new LoginDAOImpl();

	public static IUserDao getDao() {
		return dao;
	}

	public static ILoginDAO getLoginDAO() {
		return loginDao;
	}

}
