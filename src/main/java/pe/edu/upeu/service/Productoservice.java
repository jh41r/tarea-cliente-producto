package pe.edu.upeu.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.entity.Producto;

public interface Productoservice {

	Producto create(Producto p);
	Producto update(Producto p);
	void delete(Long id);
	Optional<Producto> read(Long id);
	List<Producto> readAll();
}
