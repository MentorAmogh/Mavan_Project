package com.niit.DAO;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.Model.EmployeeRegistration;


@Repository("EmployeeDAO")
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean deleteEmp(int Id) {
		sessionFactory.getCurrentSession().delete(getEmpById(Id));
		return true;

	}

	public List<EmployeeRegistration> getEmpDetails() {
		return sessionFactory.getCurrentSession().createQuery("from EmployeeRegistration").list();
	}

	public EmployeeRegistration getEmpById(int Id) {
		return (EmployeeRegistration) sessionFactory.getCurrentSession()
				.createQuery("from EmployeeRegistration where empId=" + Id).uniqueResult();

	}

	public EmployeeRegistration getEmpByName(String name) {
		return (EmployeeRegistration) sessionFactory.getCurrentSession()
				.createQuery("from EmployeeRegistration where empname='" + name + "'").uniqueResult();
	}

	public boolean addEmp(EmployeeRegistration emp) {
		sessionFactory.getCurrentSession().save(emp);
		return true;

	}

	public boolean updateEmp(EmployeeRegistration emp) {
		sessionFactory.getCurrentSession().update(emp);
		return true;

	}

}