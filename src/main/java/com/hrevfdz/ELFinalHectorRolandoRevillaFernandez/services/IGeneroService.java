package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.services;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Genero;

import java.util.List;
import java.util.Optional;

public interface IGeneroService {
    Genero create(Genero genero);
    Genero update(Genero genero);

    List<Genero> findAll();

    Optional<Genero> gindById(Long id);
}
