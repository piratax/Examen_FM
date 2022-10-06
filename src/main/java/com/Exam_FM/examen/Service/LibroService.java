
package com.Exam_FM.examen.Service;

import com.Exam_FM.examen.Entity.Libro;
import java.util.List;


public interface LibroService {
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro save(Libro libro);

    public void delete(Libro libro);

    public void deleteById(Long id);
}
