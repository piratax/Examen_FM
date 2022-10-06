
package com.Exam_FM.examen.Controller;

import com.Exam_FM.examen.Entity.Editorial;
import com.Exam_FM.examen.Service.EditorialService;
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
@RequestMapping("/editorial")
@Api(value = "Microservicios de gestion de la editorial", description ="Microservicio de la Editorial")

public class EditorialController {

    @Autowired
    private EditorialService editorialService;
    @GetMapping("/all")
    @ApiOperation(value="Lista de Editoriales")
    public List<Editorial> findAll() {
        return editorialService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id) {
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);
    }

    @PostMapping("/save")
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

    @PutMapping("/update")
    public Editorial update(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }
}
