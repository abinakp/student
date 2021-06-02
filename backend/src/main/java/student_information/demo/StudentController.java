package student_information.demo;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;



@RestController

public class StudentController {

    @Autowired
    public StudentRepository studentRepository;

    @GetMapping(value = "/all")
    @CrossOrigin
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    @PostMapping(value = "/create")
    @CrossOrigin
    public String createStudent(@RequestBody Student student) {
        Student insertStudent = studentRepository.insert(student);
        return "Student Created. "+ insertStudent.getName();
    }
    
    
}