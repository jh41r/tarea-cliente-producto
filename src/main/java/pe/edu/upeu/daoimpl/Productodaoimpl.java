package pe.edu.upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.dao.ProductoDao;
import pe.edu.upeu.entity.Producto;
import pe.edu.upeu.repository.Productorepository;
@Component
public class Productodaoimpl implements ProductoDao{

	@Autowired
	private Productorepository Productorepository;
	@Override
	public Producto create(Producto p) {
		// TODO Auto-generated method stub
		return Productorepository.save(p);
	}

	@Override
	public Producto update(Producto p) {
		// TODO Auto-generated method stub
		return Productorepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		Productorepository.deleteById(id);
	}

	@Override
	public Optional<Producto> read(Long id) {
		// TODO Auto-generated method stub
		return Productorepository.findById(id);
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return Productorepository.findAll();
	}

}
