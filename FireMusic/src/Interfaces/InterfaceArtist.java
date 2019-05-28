package Interfaces;

import java.util.List;

import model.Artist;

public interface InterfaceArtist {
	public List<Artist> listarArtist();
	public void addArtist(Artist x);
	public void updateArtist(Artist y);
	public void deleteArtist(Artist z);
	
}
