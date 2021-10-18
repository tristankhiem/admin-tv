package tranvivan.phanlop.quanlysinhvien.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.header.Header;
import org.springframework.web.bind.annotation.*;
import tranvivan.phanlop.quanlysinhvien.helper.UUIDHelper;
import tranvivan.phanlop.quanlysinhvien.model.Student;
import tranvivan.phanlop.quanlysinhvien.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get-students")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudent());
    }

    @GetMapping("/get-student/{id}")
    public ResponseEntity<?> GetAStudent(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudent(id));
    }

    @PostMapping("/create")
    public ResponseEntity<?> Create(@RequestBody Student student) {
        student.setId(UUIDHelper.generateType4UUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.create(student));
    }

    @PutMapping("/update")
    public ResponseEntity<?> Update(@RequestBody Student student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.update(student));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable String id) {
        studentService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Student is deleted");
    }
}
