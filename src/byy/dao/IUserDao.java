package byy.dao;

import java.util.List;

import byy.bean.User;

public interface IUserDao {
	
	/**
	 * 查询用户记录
	 * @return
	 * @throws DAOException
	 */
	List<User> findAll() throws DAOException;
	
	/**
	 * 新增用户
	 * @param user
	 * @throws DAOException
	 */
	void addUser(User user) throws DAOException;
	
	
	/**
	 * 删除
	 * @param id
	 * @throws DAOException
	 */
	void deleteUser(int id) throws DAOException;
}
