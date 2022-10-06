/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Exam_FM.examen.Service;

import com.Exam_FM.examen.Entity.Editorial;
import java.util.List;
public interface EditorialService {
     public List<Editorial> findAll();

    public Editorial findById(Long id);

    public Editorial save(Editorial categoria);

    public void delete(Editorial categoria);

    public void deleteById(Long id);
}
