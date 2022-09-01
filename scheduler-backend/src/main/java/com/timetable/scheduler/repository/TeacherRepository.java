package com.timetable.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.timetable.scheduler.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer>{
	
}
