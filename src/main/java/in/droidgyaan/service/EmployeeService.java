package in.droidgyaan.service;

import java.util.List;
import in.droidgyaan.entity.*;

public interface EmployeeService {
	public List<Employee> findAll();

	public Employee findOne(String id);

	public Employee create(Employee emp);

	public Employee update(String id, Employee emp);

	public void delete(String empId);
}
