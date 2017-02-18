package in.droidgyaan.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import in.droidgyaan.entity.Employee;

@Repository
public class EmployeeRepositoryImplementation implements EmployeeRepository{

	@Override
	public List<Employee> findAll() {
		return null;
	}

	@Override
	public Employee findOne(String id) {
		return null;
	}

	@Override
	public Employee create(Employee emp) {
		return null;
	}

	@Override
	public Employee update(Employee emp) {
		return null;
	}

	@Override
	public void delete(Employee emp) {
		
	}

	@Override
	public Employee findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
