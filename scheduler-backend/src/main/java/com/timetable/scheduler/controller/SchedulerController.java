package com.timetable.scheduler.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timetable.scheduler.model.Newclass;
import com.timetable.scheduler.model.Teacher;
import com.timetable.scheduler.repository.ClassRepository;
import com.timetable.scheduler.repository.TeacherRepository;

@RestController
@RequestMapping("/api")
public class SchedulerController {
	
	 @Autowired
	 private ClassRepository classRepository;
	 
	 @Autowired
	 private TeacherRepository teacherRepository;
	 
	 Newclass newclass = new Newclass();
	
	 
	@GetMapping("/class")
	public List<com.timetable.scheduler.model.Newclass> getClasses() {
		return classRepository.findAll();
	}
	@PostMapping("/class")
	public com.timetable.scheduler.model.Newclass saveClass(@RequestBody com.timetable.scheduler.model.Newclass classBody) {
		newclass= classBody;
		return classRepository.save(classBody);
	}
	@GetMapping("/class/{id}")
	public Optional<Newclass> getClassById(@PathVariable int id) {
		return classRepository.findById(id);
	}
	@DeleteMapping("/class/{id}")
	public void deleteClassById(@PathVariable int id) {
		classRepository.deleteById(id);
	}
	@GetMapping("/teacher")
	public List<Teacher> getTeachers() {
		List<Teacher> listofTeachers = new ArrayList<Teacher>();
		listofTeachers= teacherRepository.findAll();
		/*for(Teacher teacher : listofTeachers) {
			String subject=teacher.getSubject();
			String idString="";
			List<Newclass> listOfClass= classRepository.findClassIds(subject);
			for(Newclass classs : listOfClass) {
				int id= classs.getClassid();
				idString=id+","+idString;
			}
			teacher.setId(idString.substring(0, idString.length()-1));				
		} */
		return listofTeachers;
	}
	
	@PostMapping("/teacher")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherRepository.save(teacher);
	}
	@GetMapping("/teacher/{id}")
	public Optional<Teacher> getTeacherById(@PathVariable int id) {
		return teacherRepository.findById(id);
		/*String subject=teacher.getSubject();
		List<Newclass> listOfClass= classRepository.findClassIds(subject);
		for(Newclass classs : listOfClass) {
			int classId= classs.getClassid();
			String idString=classId+" ";
			teacher.setId(idString);				
		}*/		
	}
	
	/*@PostMapping("/excel")
	public void checkIfWorking(@RequestBody Newclass newclass) {
		ExcelGenerator excel= new ExcelGenerator();
		excel.createExcel(newclass);
	}*/
	
}
