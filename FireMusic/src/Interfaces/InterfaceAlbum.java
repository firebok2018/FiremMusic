package Interfaces;

import java.util.List;

import model.Album;

public interface InterfaceAlbum {
	public List<Album> listarAlbum(); 
	public void AddAlbum(Album x);
	public void UpdateAlbum(Album y);
	public void DeleteAlbum(Album z);
}
