package com.emysilva.Service;

import com.emysilva.Dao.StudentDao;
import com.emysilva.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public Collection<Student> getStudents() {
		return this.studentDao.getStudents();
	}

	public void createStudent(Student student) {
		this.studentDao.createStudent(student);
	}

	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public void updateStudent(Student student) {
		this.studentDao.updateStudent(student);
	}

	public void deleteStudentById(int id) {
		this.studentDao.deleteStudentById(id);
	}
}
