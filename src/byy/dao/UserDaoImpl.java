package byy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import byy.bean.User;
import byy.util.DBUtil;

public class UserDaoImpl implements IUserDao {
	@Override
	public List<User> findAll() throws DAOException {
		List<User> users = new ArrayList<User>();
		String sql = "select * from t_user";
		Connection con = DBUtil.getConnection();
		PreparedStatement ps;
		try {
			ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				User user = createUser(rs);
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("查询用户数据失败！", e);
		} finally {
			DBUtil.closeConnection();
		}

		return users;
	}

	/**
	 * 将1条记录转换为User对象
	 * 
	 * @param rs
	 * @return
	 * @throws SQLException
	 */
	private User createUser(ResultSet rs) throws SQLException {
		User user = new User();

		user.setId(rs.getString("u_id"));
		user.setName(rs.getString("u_name"));
		user.setSex(rs.getString("u_sex"));
		user.setTel(rs.getString("u_tel"));
		user.setAddr(rs.getString("u_addr"));

		return user;
	}

	@Override
	public void addUser(User user) throws DAOException {
		if (user == null)
			return;
		String sql = "insert into t_user values(?,?,?,?,?)";
		Connection con = DBUtil.getConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user.getId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getSex());
			ps.setString(4, user.getTel());
			ps.setString(5, user.getAddr());
			ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("新增用户数据失败！", e);
		} finally {
			DBUtil.closeConnection();
		}
	}

	@Override
	public void deleteUser(int id) throws DAOException {
		String sql = "delete from t_user where u_id=?";
		Connection con = DBUtil.getConnection();
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			con.commit();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException("删除用户数据失败！", e);
		} finally {
			DBUtil.closeConnection();
		}

	}

}
