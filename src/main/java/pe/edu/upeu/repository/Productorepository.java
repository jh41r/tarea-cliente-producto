package pe.edu.upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.entity.Producto;
@Repository
public interface Productorepository extends JpaRepository<Producto, Long>{

}
