package com.example.ApiRest.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.ApiRest.Entities.Persona;
import org.springframework.stereotype.Repository;

/* Esta interface es un patron permite separar la logica del negocio con el repository*/
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{
}
