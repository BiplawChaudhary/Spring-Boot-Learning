package com.stdmanagement.stdmanagesys.controller;


import com.stdmanagement.stdmanagesys.entity.Student;
import com.stdmanagement.stdmanagesys.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    //Handler method to handel the list students and return model and view
    @GetMapping("/students")
    public String listAllStudents(Model model){
//        Creating the model
        model.addAttribute("students", studentService.getAllStudents());
//        Returning the view
        return "students";

    }

//    Handle's the addd student request
    @GetMapping("/students/new")
    public String createStudentForm(Model model){
//        Create a student object to hold form data
        Student student = new Student();
//        Add the new empty student object
        model.addAttribute("student", student);
//        then jsut return the view
        return "create_student";
    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student std){
        studentService.saveStudent(std);
        return "redirect:/students";
    }

    //handling updae
    @GetMapping("/students/edit/{id}")
    public String editStudentsForm(@PathVariable Long id, Model model){
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id, @ModelAttribute Student std, Model model){
        //Get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(std.getId());
        existingStudent.setFirstName(std.getFirstName());
        existingStudent.setLastName(std.getLastName());
        existingStudent.setEmail(std.getEmail());

//        Save updated student

        studentService.editStudent(existingStudent);
        return "redirect:/students";
    }

    //Delete
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id ){
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }



}
