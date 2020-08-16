package com.emysilva.Controller;

import com.emysilva.Entity.Student;
import com.emysilva.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getStudents() {
		return this.studentService.getStudents();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void createStudent(@RequestBody Student student) {
		this.studentService.createStudent(student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void updateStudent(@RequestBody Student student) {
		this.studentService.updateStudent(student);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteStudentById(@PathVariable("id") int id) {
		this.studentService.deleteStudentById(id);
	}

}
