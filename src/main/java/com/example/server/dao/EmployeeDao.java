package com.example.server.dao;

import com.example.server.entity.Employee;
import java.util.List;

public interface EmployeeDao {

    public List<Employee> getAllEmployee();

    public Employee getEmployee(int id);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(int id);
}
