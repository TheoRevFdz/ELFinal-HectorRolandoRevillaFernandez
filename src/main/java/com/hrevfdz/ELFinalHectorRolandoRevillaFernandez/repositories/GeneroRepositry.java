package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.repositories;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepositry extends JpaRepository<Genero, Long> {
}
