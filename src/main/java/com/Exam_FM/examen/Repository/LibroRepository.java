/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Exam_FM.examen.Repository;

import com.Exam_FM.examen.Entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Long> {
    
}
