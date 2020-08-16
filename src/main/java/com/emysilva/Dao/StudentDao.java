package com.emysilva.Dao;

import com.emysilva.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentDao {

	private static Map<Integer, Student> students;

	static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "David", "English"));
				put(2, new Student(2, "Samuel", "Sports"));
				put(3, new Student(3, "Victor", "Music"));
			}
		};
	}

	public Collection<Student> getStudents() {
		return students.values();
	}

	public void createStudent(Student student) {
		students.put(student.getId(), student);
	}

	public Student getStudentById(int id) {
		return students.get(id);
	}

	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setName(student.getName());
		s.setCourse(student.getCourse());
		students.put(student.getId(), student);
	}

	public void deleteStudentById(int id) {
		students.remove(id);
	}
}
