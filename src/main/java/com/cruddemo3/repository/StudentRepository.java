package com.cruddemo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cruddemo3.entities.Student3;

public interface StudentRepository extends JpaRepository<Student3, Long> {

}
