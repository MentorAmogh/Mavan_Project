package com.niit.DAO;

import java.util.List;

import com.niit.Model.Skills;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.EmployeeRegistration;


@Repository("SkillsDAO")
@Transactional

public class SkillsDAOImpl implements SkillsDAO {

	public boolean addSkills(Skills skills) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateSkills(Skills skills) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteSkills(int Id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Skills> getSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	public Skills getSkillsById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Skills getSkills(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
