package pe.edu.upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.dao.ClienteDao;
import pe.edu.upeu.entity.Cliente;
import pe.edu.upeu.service.Clienteservice;
@Service
public class Clienteserviceimpl implements Clienteservice{

	@Autowired
	private ClienteDao clienteDao;
	@Override
	public Cliente create(Cliente p) {
		// TODO Auto-generated method stub
		return clienteDao.create(p);
	}

	@Override
	public Cliente update(Cliente p) {
		// TODO Auto-generated method stub
		return clienteDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.delete(id);
	}

	@Override
	public Optional<Cliente> read(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteDao.readAll();
	}

}
