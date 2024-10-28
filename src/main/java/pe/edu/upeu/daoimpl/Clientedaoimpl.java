package pe.edu.upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.entity.Cliente;
import pe.edu.upeu.repository.Clienterepository;
@Component
public class Clientedaoimpl implements ClienteDao{

	@Autowired
	private Clienterepository clienterepository; 
	@Override
	public Cliente create(Cliente p) {
		// TODO Auto-generated method stub
		return clienterepository.save(p);
	}

	@Override
	public Cliente update(Cliente p) {
		// TODO Auto-generated method stub
		return clienterepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienterepository.deleteById(id);;
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienterepository.findById(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienterepository.findAll();
	}

}
