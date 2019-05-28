package model;

public class Song {
	private int SongId;
	private byte[] caratula;
	private String SongName;
	private int ArtistName;
	private byte[] song;
	private int SongYear;
	
	public Song(int songId, byte[] caratula, String songName, int artistName, byte[] song, int songYear) {
		super();
		SongId = songId;
		this.caratula = caratula;
		SongName = songName;
		ArtistName = artistName;
		this.song = song;
		SongYear = songYear;
	}
	
	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getSongId() {
		return SongId;
	}
	public void setSongId(int songId) {
		SongId = songId;
	}
	public byte[] getCaratula() {
		return caratula;
	}
	public void setCaratula(byte[] caratula) {
		this.caratula = caratula;
	}
	public String getSongName() {
		return SongName;
	}
	public void setSongName(String songName) {
		SongName = songName;
	}
	public int getArtistName() {
		return ArtistName;
	}
	public void setArtistName(int artistName) {
		ArtistName = artistName;
	}
	public byte[] getSong() {
		return song;
	}
	public void setSong(byte[] song) {
		this.song = song;
	}
	public int getSongYear() {
		return SongYear;
	}
	public void setSongYear(int songYear) {
		SongYear = songYear;
	}
	
	
}
