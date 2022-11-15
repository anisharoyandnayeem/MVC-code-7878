package in.ashokit.controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Student;
import in.ashokit.repositories.StudentRepository;
import in.ashokit.service.StudentService;



@Controller

public class MyController {
	@Autowired
	private StudentService studentser;

//	@GetMapping("/students")
//	public String getAllstudents(ModelMap modelMap) {
//		
//		modelMap.put("students",studentser.findAll());
//		//System.out.println(list);
//		return "index";
//	}
	
	
	@GetMapping("/students/{id}")    
    public String getStudentById(@PathVariable Integer id, Model model){    
       Optional<Student> s=studentser.findById(id);
       System.out.println(s);
       System.out.println(s.get().getStudentName());
        model.addAttribute("StudentId",s.get().getStudentId());  
        model.addAttribute("StudentName",s.get().getStudentName());
        model.addAttribute("StudentEmail",s.get().getStudentEmail());
        model.addAttribute("StudentAge",s.get().getStudentAge());
        return "index";    
    }    
}
