package com.timetable.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timetable.scheduler.model.Sample;

@Repository
public interface SampleRepository extends JpaRepository<Sample, Integer>{

}
