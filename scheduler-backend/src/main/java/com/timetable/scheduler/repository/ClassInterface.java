package com.timetable.scheduler.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.timetable.scheduler.model.Newclass;

public interface ClassInterface  {
	
	List<Newclass> findClassIds(String subject);
}
