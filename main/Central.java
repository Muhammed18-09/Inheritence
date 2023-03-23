package main;

public abstract class Central {
	
	private String name;
	private String Soyisim;
	private String mail;
	private int passwod;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSoyisim() {
		return Soyisim;
	}
	public void setSoyisim(String soyisim) {
		Soyisim = soyisim;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getPasswod() {
		return passwod;
	}
	public void setPasswod(int passwod) {
		this.passwod = passwod;
	}
	
	

}
