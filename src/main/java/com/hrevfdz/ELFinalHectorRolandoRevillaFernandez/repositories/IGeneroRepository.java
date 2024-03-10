package com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.repositories;

import com.hrevfdz.ELFinalHectorRolandoRevillaFernandez.models.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGeneroRepository extends JpaRepository<Genero, Long> {
}
