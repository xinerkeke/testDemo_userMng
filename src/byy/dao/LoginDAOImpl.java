package byy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import byy.bean.Admin;
import byy.util.DBUtil;


public class LoginDAOImpl implements ILoginDAO {

	public Admin findByCode(String adminCode) 
		throws DAOException {
		if(adminCode == null 
				|| adminCode.length() == 0) {
			return null;
		}
		
		String sql = "select * from t_admin where adminCode = ?";
		
		Connection con = DBUtil.getConnection();
		Admin a = null;
		try {
			PreparedStatement ps = 
				con.prepareStatement(sql);
			ps.setString(1, adminCode);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				a = createAdmin(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DAOException(
					"查询用户信息异常",e);
		} finally {
			DBUtil.closeConnection();
		}
		return a;
	}

	private Admin createAdmin(ResultSet rs) throws SQLException {
		Admin a = new Admin();
		a.setAdminCode(rs.getString("adminCode"));
		a.setPassword(rs.getString("passwd"));
		return a;
	}
	
	
}
