package model;

public class Artist {
	private int ID;
	private String ArtistName;
	private String informacion;
	private String ciudad;
	private int IdGenre;
	
	public Artist(int iD, String artistName, String informacion, String ciudad, int idGenre) {
		super();
		ID = iD;
		ArtistName = artistName;
		this.informacion = informacion;
		this.ciudad = ciudad;
		IdGenre = idGenre;
	}

	public Artist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getArtistName() {
		return ArtistName;
	}
	public void setArtistName(String artistName) {
		ArtistName = artistName;
	}
	public String getInformacion() {
		return informacion;
	}
	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getIdGenre() {
		return IdGenre;
	}
	public void setIdGenre(int idGenre) {
		IdGenre = idGenre;
	}
	
	
	
}
