
package br.com._denao4de.GostosurasDaKarla.controller;

import br.com._denao4de.GostosurasDaKarla.repository.UsuarioRepository;
import br.com._denao4de.GostosurasDaKarla.model.Usuario;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Usuario> listar() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario criar(@RequestBody @Valid Usuario usuario) {
        return repository.save(usuario);
    }
}
