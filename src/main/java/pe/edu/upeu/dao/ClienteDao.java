package pe.edu.upeu.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.entity.Cliente;

public interface ClienteDao {
	Cliente create(Cliente p);
	Cliente update(Cliente p);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}
