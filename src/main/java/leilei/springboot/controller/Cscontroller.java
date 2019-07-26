package leilei.springboot.controller;

import leilei.springboot.StudentProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

@Controller
//@SpringBootApplication
@RequestMapping("/leilei")
public class Cscontroller {
    @Autowired
    private StudentProperties studentProperties;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }

}
