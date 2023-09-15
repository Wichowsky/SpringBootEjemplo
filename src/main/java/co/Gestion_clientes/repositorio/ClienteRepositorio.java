package co.Gestion_clientes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.Gestion_clientes.modelo.Cliente;

@Repository
public interface ClienteRepositorio extends JpaRepository<Cliente, Long>{

}
