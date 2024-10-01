package com.studentmvc.service;

import java.util.List;

import com.studentmvc.model.Student;

public interface StudentService {
int save(Student student);
List<Student>getAll();
Student getId(int id);
int remove(int id);
int update(int id);
}
