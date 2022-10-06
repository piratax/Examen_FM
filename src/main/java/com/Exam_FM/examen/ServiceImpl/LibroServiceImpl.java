package com.Exam_FM.examen.ServiceImpl;


import com.Exam_FM.examen.Entity.Libro;
import com.Exam_FM.examen.Repository.LibroRepository;
import com.Exam_FM.examen.Service.LibroService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl implements LibroService{
    @Autowired
    private LibroRepository libroRepository;

    @Transactional

    @Override
    public List<Libro> findAll() {
        return (List<Libro>) libroRepository.findAll();
    }
    @Override
    public Libro findById(Long id) {
        return libroRepository.findById(id).orElse(null);
    }
    @Override
    public Libro save(Libro libro) {
        return libroRepository.save(libro);
    }

    @Override
    public void delete(Libro libro) {
        libroRepository.delete(libro);
    }

    @Override
    public void deleteById(Long id) {
        libroRepository.deleteById(id);
    }

}
