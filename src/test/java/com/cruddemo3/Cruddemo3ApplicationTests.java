package com.cruddemo3;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cruddemo3.entities.Student3;
import com.cruddemo3.repository.StudentRepository;

@SpringBootTest
class Cruddemo3ApplicationTests {
	@Autowired
	private StudentRepository studentRepo;
	@Test
	void saveOneStudent() {
		Student3 s = new Student3();
		s.setName("Rutuja");
		s.setCourse("testing");
		s.setFee(11000);
		studentRepo.save(s);	
	}
	@Test
	void deleteOneStudent() {
		studentRepo.deleteById(5L);	
	}
	@Test
	void readOneStudent() {
		Optional<Student3> findById = studentRepo.findById(2L);
		Student3 student3 = findById.get();
		System.out.println(student3.getId());
		System.out.println(student3.getName());
		System.out.println(student3.getCourse());
		System.out.println(student3.getFee());

	}
	@Test
	void updateOneStudent() {
		Optional<Student3> findById = studentRepo.findById(6L);
		Student3 student3 = findById.get();
		student3.setName("Bharat");
		studentRepo.save(student3);

	}

}
