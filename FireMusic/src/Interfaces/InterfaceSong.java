package Interfaces;

import java.util.List;
import model.Song;

public interface InterfaceSong {
	public List<Song> listarSong();
	public void addSong(Song x);
	public void updateSong(Song y);
	public void deleteSong(Song z);
	
}
