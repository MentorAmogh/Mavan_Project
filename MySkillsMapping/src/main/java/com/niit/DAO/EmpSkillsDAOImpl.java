package com.niit.DAO;

import java.util.List;

import com.niit.Model.EmpSkills;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.EmployeeRegistration;


@Repository("EmployeeSkillsDAO")
@Transactional

public class EmpSkillsDAOImpl implements EmpSkillsDAO {

	public boolean addEmpSkills(EmpSkills empskills) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateEmpSkills(EmpSkills empskills) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteEmpSkills(int Id) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<EmpSkills> getEmpSkills() {
		// TODO Auto-generated method stub
		return null;
	}

	public EmpSkills getEmpSkillsById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public EmpSkills getEmpSkillsByName(String skillsname) {
		// TODO Auto-generated method stub
		return null;
	}

}
