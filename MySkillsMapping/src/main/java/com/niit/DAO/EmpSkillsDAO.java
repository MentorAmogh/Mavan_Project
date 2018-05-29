package com.niit.DAO;

import java.util.List;

import com.niit.Model.EmpSkills;

public interface EmpSkillsDAO {
	boolean addEmpSkills(EmpSkills empskills);

	boolean updateEmpSkills(EmpSkills empskills);

	boolean deleteEmpSkills(int Id);

	List<EmpSkills> getEmpSkills();

	EmpSkills getEmpSkillsById(int Id);

	EmpSkills getEmpSkillsByName(String skillsname);

}
