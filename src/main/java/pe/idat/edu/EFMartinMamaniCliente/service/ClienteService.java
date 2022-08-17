package pe.idat.edu.EFMartinMamaniCliente.service;

import java.util.List;

import pe.idat.edu.EFMartinMamaniCliente.model.Cliente;

public interface ClienteService {
	
	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);


}
