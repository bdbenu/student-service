package com.contact.repositary;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.model.Student;

public interface StudentRespositary extends JpaRepository<Student, Serializable>{

}
