package com.Exam_FM.examen.Service;

import com.Exam_FM.examen.Entity.Editorial;
import java.util.List;


public interface EditorialService {
     public List<Editorial> findAll();

    public Editorial findById(Long id);

    public Editorial save(Editorial editorial);

    public void delete(Editorial editorial);

    public void deleteById(Long id);
}
