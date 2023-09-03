package com.example.university.repo;

import com.example.university.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.w3c.dom.css.CSSRule;

public interface CourseRepo extends  JpaRepository<Course,Integer>{

}
