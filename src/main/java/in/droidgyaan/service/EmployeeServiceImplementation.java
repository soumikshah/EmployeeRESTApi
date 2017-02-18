package in.droidgyaan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.droidgyaan.entity.Employee;
import in.droidgyaan.exception.EmployeeAlreadyExistException;
import in.droidgyaan.exception.EmployeeNotFoundException;
import in.droidgyaan.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository Emprepository;

	@Override
	public List<Employee> findAll() {
		return Emprepository.findAll();
	}

	@Override
	public Employee findOne(String id) {
		Employee existing = Emprepository.findOne(id);
		if (existing == null) {
			throw new EmployeeNotFoundException("Employee with id: " + id + " not found.");
		}
		return existing;
	}

	@Override
	public Employee create(Employee emp) {
		Employee existing = Emprepository.findByEmail(emp.getEmail());
		if (existing != null) {
			throw new EmployeeAlreadyExistException("User with email address " + emp.getEmail() + " already exists.");
		}

		return Emprepository.create(emp);
	}

	@Override
	public Employee update(String id, Employee emp) {
		Employee existing = Emprepository.findOne(id);
		if (existing == null) {
			throw new EmployeeNotFoundException("Employee with id: " + id + " not found.");
		}
		if (id != emp.getId()) {
			throw new EmployeeNotFoundException("Employee with id: " + id + " not found.");
		}
		return Emprepository.update(emp);
	}

	@Override
	public void delete(String id) {
		Employee existing = Emprepository.findOne(id);
		if (existing == null) {
			throw new EmployeeNotFoundException("Employee with id: " + id + " not found.");
		}
		Emprepository.delete(existing);
	}

}
