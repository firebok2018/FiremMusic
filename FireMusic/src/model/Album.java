package model;

public class Album {
	
	private int AlbumId;
	private String AlbumName;
	private int ArtistName;
	private int SongNumber;
	private int AlbumYear;
	
	public Album(int albumId, String albumName, int artistName, int songNumber, int albumYear) {
		super();
		AlbumId = albumId;
		AlbumName = albumName;
		ArtistName = artistName;
		SongNumber = songNumber;
		AlbumYear = albumYear;
	}
	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAlbumId() {
		return AlbumId;
	}
	public void setAlbumId(int albumId) {
		AlbumId = albumId;
	}
	public String getAlbumName() {
		return AlbumName;
	}
	public void setAlbumName(String albumName) {
		AlbumName = albumName;
	}
	public int getArtistName() {
		return ArtistName;
	}
	public void setArtistName(int artistName) {
		ArtistName = artistName;
	}
	public int getSongNumber() {
		return SongNumber;
	}
	public void setSongNumber(int songNumber) {
		SongNumber = songNumber;
	}
	public int getAlbumYear() {
		return AlbumYear;
	}
	public void setAlbumYear(int albumYear) {
		AlbumYear = albumYear;
	}	
	
	
	 
}
