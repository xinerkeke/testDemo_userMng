package byy.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	private static String user;
	private static String password;
	private static String url;
	private static String driverName;
	private static ThreadLocal<Connection> tl 
			= new ThreadLocal<Connection>();
	
	static {
		Properties p = new Properties();
		try {
			p.load(DBUtil.class.getClassLoader().getResourceAsStream("db.properties"));
			user = p.getProperty("user");
			password = p.getProperty("password");
			url = p.getProperty("url");
			driverName = p.getProperty("driver");
			Class.forName(driverName);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("获取参数异常！");
		}
	}
	
	public static Connection getConnection() {
		Connection con = tl.get();
		if(con == null) {
			try {
				con = DriverManager.getConnection(
						url, user, password);
				tl.set(con);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("连接数据库异常");
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		Connection con = tl.get();
		if(con != null) {
			try {
				con.close();
				tl.set(null);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("关闭数据库异常");
			}
		}
	}
	
	public static void main(String[] args)
		throws Exception {
		Connection con = DBUtil.getConnection();
		System.out.println(con);
	}

}
