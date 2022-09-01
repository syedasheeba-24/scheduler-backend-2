package com.timetable.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timetable.scheduler.model.Newclass;

@Repository
public interface ClassRepository extends JpaRepository<Newclass, Integer>, ClassInterface{

}
