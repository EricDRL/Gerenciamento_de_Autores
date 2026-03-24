package services;

import entity.Autor;
import repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository repository;

    public List<Autor> listarTodos() {
        return repository.findAll();
    }

    public Autor salvar(Autor autor) {
        return repository.save(autor);
    }

    public Autor buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}