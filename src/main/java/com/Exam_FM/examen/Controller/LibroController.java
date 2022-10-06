
package com.Exam_FM.examen.Controller;

import com.Exam_FM.examen.Entity.Libro;
import com.Exam_FM.examen.Service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/libro")
@Api(value = "Microservicios de libros", description ="Microservicio de libros")
public class LibroController {
    
    @Autowired
        private LibroService libroService;

 @GetMapping("/all")
    @ApiOperation(value="Lista de libros")
    public List<Libro> findAll() {
        return libroService.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id) {
        Libro libro = libroService.findById(id);
        return ResponseEntity.ok(libro);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        libroService.deleteById(id);
    }

    @PostMapping("/save")
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @PutMapping("/update")
    public Libro update(@RequestBody Libro libro) {
        return libroService.save(libro);
    }
}
