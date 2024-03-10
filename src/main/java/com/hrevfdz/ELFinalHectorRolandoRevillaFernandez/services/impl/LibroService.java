package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.services.impl;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Libro;
import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.repositories.ILibroRepository;
import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.services.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService {
    @Autowired
    private ILibroRepository repository;

    @Override
    public Libro create(Libro libro) {
        return repository.save(libro);
    }

    @Override
    public Libro update(Libro libro) {
        return repository.findById(libro.getId())
                .map(l -> repository.save(libro))
                .orElseGet(() -> null);
    }

    @Override
    public List<Libro> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Libro> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Libro> findByNombreAndGenero(String nombre, Long idGenero) {
        return repository.findByNombreAndGenero(nombre, idGenero);
    }
}
