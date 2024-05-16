/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.potager.kakarot.repository;

<<<<<<< HEAD
import com.potager.kakarot.entities.Plantes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
=======
import com.potager.kakarot.entities.Plante;
>>>>>>> testWebInf

import org.springframework.data.repository.CrudRepository;

public interface PlanteRepository extends JpaRepository<Plantes, Integer> {

<<<<<<< HEAD
    Plantes findByNom(String nom);

    //List<Plantes> findAll();
=======
public interface PlanteRepository extends CrudRepository<Plante, Long> {

    Plante findByName(String name);
>>>>>>> testWebInf

}
