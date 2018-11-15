package byy.bean;

import java.io.Serializable;

public class User implements Serializable {
	
	private String id;
	private String name;
	private String sex;
	private String tel;
	private String addr;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String id, String name, String sex, String tel, String addr) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.tel = tel;
		this.addr = addr;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	
	@Override
	public String toString() {
		return "[" + id + "," + name + "," + sex + "," + tel + "," + addr + "]";
	}
}
