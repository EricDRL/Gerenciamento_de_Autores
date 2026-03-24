package controller;

import entity.Autor;
import services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService service;

    @GetMapping
    public List<Autor> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Autor salvar(@RequestBody Autor autor) {
        return service.salvar(autor);
    }

    @GetMapping("/{id}")
    public Autor buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}