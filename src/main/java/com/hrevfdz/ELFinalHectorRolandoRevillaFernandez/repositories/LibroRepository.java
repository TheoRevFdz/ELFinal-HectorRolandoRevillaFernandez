package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.repositories;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
