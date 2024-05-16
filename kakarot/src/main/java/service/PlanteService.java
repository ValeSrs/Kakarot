<<<<<<<< HEAD:kakarot/src/main/java/com/potager/kakarot/service/PlanteService.java
package com.potager.kakarot.service;
========
package service;
>>>>>>>> testWebInf:kakarot/src/main/java/service/PlanteService.java

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
<<<<<<<< HEAD:kakarot/src/main/java/com/potager/kakarot/service/PlanteService.java
import com.potager.kakarot.entities.Plantes;
import java.util.List;
========
import com.potager.kakarot.entities.Plante;
>>>>>>>> testWebInf:kakarot/src/main/java/service/PlanteService.java
import com.potager.kakarot.repository.PlanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanteService {
    @Autowired
    private final PlanteRepository planteRepository;

    public PlanteService(PlanteRepository planteRepository) {
        this.planteRepository = planteRepository;
    }

<<<<<<<< HEAD:kakarot/src/main/java/com/potager/kakarot/service/PlanteService.java
    public List<Plantes> findAll() {
        return (List<Plantes>) planteRepository.findAll();
========
    public Plante findPlanteByName(String name) {
        return planteRepository.findByName(name);
>>>>>>>> testWebInf:kakarot/src/main/java/service/PlanteService.java
    }

    public Plantes findByNom(String nom) {
        return planteRepository.findByNom(nom);
    }
}
