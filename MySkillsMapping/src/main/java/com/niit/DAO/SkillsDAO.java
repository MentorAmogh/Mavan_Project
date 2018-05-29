package com.niit.DAO;

import java.util.List;

import com.niit.Model.Skills;

public interface SkillsDAO {
	boolean addSkills(Skills skills);

	boolean updateSkills(Skills skills);

	boolean deleteSkills(int Id);

	List<Skills> getSkills();

	Skills getSkillsById(int Id);

	Skills getSkills(String name);

}
