package Interfaces;

import java.util.List;

import model.Usuarios;

public interface InterfacesUsuarios {
	public List<Usuarios> listarUsuarios();
	public void addUsuarios(Usuarios x);
	public void updateUsuarios(Usuarios y);
	public void deleteUsuarios(Usuarios z);

}
