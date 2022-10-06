
package com.Exam_FM.examen.ServiceImpl;

import com.Exam_FM.examen.Entity.Editorial;
import com.Exam_FM.examen.Repository.EditorialRepository;
import com.Exam_FM.examen.Service.EditorialService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EditorialServiceImpl implements EditorialService {
     @Autowired
    private EditorialRepository editorialRepository;
    @Transactional
    @Override
    public List<Editorial> findAll() {
        return (List<Editorial>) editorialRepository.findAll();
    }

    @Override
    public Editorial findById(Long id) {
        return editorialRepository.findById(id).orElse(null);
    }

    @Override
    public Editorial save(Editorial editorial) {
        return editorialRepository.save(editorial);
    }

    @Override
    public void delete(Editorial editorial) {
        editorialRepository.delete(editorial);
    }

    @Override
    public void deleteById(Long id) {
       editorialRepository.deleteById(id);
    }
}
