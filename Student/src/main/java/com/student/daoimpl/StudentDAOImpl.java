package com.student.daoimpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.student.dao.StudentDao;
import com.student.models.Students;
import com.student.utils.SqlUtil;

public class StudentDAOImpl implements StudentDao {

	@Override
	public int save(Students student) {
		int result = -1;
		try {
			SqlUtil.connectDb();
			String qry = "INSERT INTO student VALUES('"+student.getId()+"','"+student.getName()+"','"+student.getPhon()+"','"+student.getMarks()+"','"+student.getCity()+"','"+student.getGender()+"')";
			result = SqlUtil.insert(qry);
			SqlUtil.close();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Students> getAll() {
		List<Students> students = new ArrayList<Students>();
		try {
			SqlUtil.connectDb();
			String qry = "SELECT * FROM student";
			ResultSet rs = SqlUtil.fetch(qry);
			if(rs!=null) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String phon = rs.getString("phon");
					String city = rs.getString("city");
					String gender = rs.getString("gender");
					float marks = rs.getFloat("marks");
					Students student =  new Students(id, name, phon, gender, marks, city);
					students.add(student);
				}
			}
			SqlUtil.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return students;
	}

	@Override
	public Students getById(int id) {
		Students student = null;
		try {
			SqlUtil.connectDb();
			String qry = "SELECT * FROM student WHERE id="+id;
			ResultSet rs = SqlUtil.fetch(qry);
			if(rs!=null) {
				if(rs.next()) {
					student = new Students();
					student.setId(rs.getInt("id"));
					student.setName(rs.getString("name"));
					student.setCity(rs.getString("city"));
					student.setMarks(rs.getFloat("marks"));
					student.setPhone(rs.getString("phon"));
					student.setGender(rs.getString("gender"));
				}
			}
			SqlUtil.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return student;
	}

	@Override
	public int remove(int id) {
		int result = -1;
		try {
			SqlUtil.connectDb();
			String qry = "DELETE FROM student WHERE id="+id;
			result = SqlUtil.delete(qry);
			SqlUtil.close();
		} catch (Exception e) {
			System.out.println();
		}
		return result;
	}

}
