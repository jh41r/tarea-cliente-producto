package pe.edu.upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.entity.Cliente;
@Repository
public interface Clienterepository extends JpaRepository<Cliente, Long>{

}
