package co.Gestion_clientes.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.Gestion_clientes.modelo.Cliente;
import co.Gestion_clientes.repositorio.ClienteRepositorio;

@RestController
@RequestMapping("/api/v1")

//Futuro cross origin react


public class ClienteControlador {
	@Autowired
	private ClienteRepositorio repositorio;
	
	@GetMapping("/Clientes")//http://localhost:3308/api/v1/clientes
	public List<Cliente> listarTodosLosClientes() {
		return repositorio.findAll();
	}
}
