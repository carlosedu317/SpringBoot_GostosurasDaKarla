package br.com._denao4de.GostosurasDaKarla.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com._denao4de.GostosurasDaKarla.model.Produto;
import br.com._denao4de.GostosurasDaKarla.repository.ProdutoRepository;
import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {
    
    private final ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @GetMapping 
    public List<Produto> listar() {
        return repository.findAll();
    }

    @PostMapping 
    @ResponseStatus (HttpStatus.CREATED)
    public Produto criar (@RequestBody @Valid Produto produto){
        return repository.save(produto);
    }
}
