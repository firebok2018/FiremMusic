package model;

public class Usuarios {
	private int ID;
	private String name;
	private String last_name;
	private String nick;
	private String email;
	private String fecha_Registro;
	private String password;
	
	public Usuarios(int iD, String name, String last_name, String nick, String email, String fecha_Registro,
			String password) {
		super();
		ID = iD;
		this.name = name;
		this.last_name = last_name;
		this.nick = nick;
		this.email = email;
		this.fecha_Registro = fecha_Registro;
		this.password = password;
	}
	
	public Usuarios() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getNick() {
		return nick;
	}
	public String setNick(String nick) {
		return this.nick = nick;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFecha_Registro() {
		return fecha_Registro;
	}
	public void setFecha_Registro(String fecha_Registro) {
		this.fecha_Registro = fecha_Registro;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
