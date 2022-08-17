package pe.idat.edu.EFMartinMamaniCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.edu.EFMartinMamaniCliente.model.Cliente;
import pe.idat.edu.EFMartinMamaniCliente.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(cliente);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(cliente);

	}

}
