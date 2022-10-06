
package com.Exam_FM.examen.Repository;

import com.Exam_FM.examen.Entity.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro, Long> {
    
}
