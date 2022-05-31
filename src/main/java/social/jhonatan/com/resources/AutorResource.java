package social.jhonatan.com.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import social.jhonatan.com.models.Autor;
import social.jhonatan.com.repository.AutorRepository;

@RestController
@RequestMapping(value = "/api")
public class AutorResource {

	@Autowired
	AutorRepository autorRepository;

	@GetMapping("/autores")
	public List<Autor> listarAutores() {
		return autorRepository.findAll();
	}

	@PostMapping("/autores")
	public Autor salvarAutor(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}

	@DeleteMapping("/autores")
	public void deletarProduto(@RequestBody Autor autor) {
		autorRepository.delete(autor);
	}

	@PutMapping("/autores")
	public Autor alterarAutor(@RequestBody Autor autor) {
		return autorRepository.save(autor);
	}
}
