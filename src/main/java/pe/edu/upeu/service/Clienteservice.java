package pe.edu.upeu.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.entity.Cliente;

public interface Clienteservice {
	Cliente create(Cliente p);
	Cliente update(Cliente p);
	void delete(Long id);
	Optional<Cliente> read(Long id);
	List<Cliente> readAll();
}
