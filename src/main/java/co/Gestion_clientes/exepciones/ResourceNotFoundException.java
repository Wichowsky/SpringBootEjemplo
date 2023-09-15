package co.Gestion_clientes.exepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	private static final long serialversionUID=1l;
	
	public ResourceNotFoundException(String msg) {
		super (msg);
	}
}
