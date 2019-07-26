package leilei.springboot.controller;

import leilei.springboot.mapper.StudentMapper;
import leilei.springboot.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @Autowired
     private StudentMapper studentMapper;

    @RequestMapping("/list")
    public String listStudent(Model model) {
        List<Student> students = studentMapper.findAll();
        model.addAttribute("students", students);
        return "student";
    }
}
