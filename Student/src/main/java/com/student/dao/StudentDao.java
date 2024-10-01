package com.student.dao;

import java.util.List;

import com.student.models.Students;

public interface StudentDao {
	int save(Students student);
	List<Students> getAll();
	Students getById(int id);
	int remove(int id);
}
