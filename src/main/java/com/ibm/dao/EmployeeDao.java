package com.ibm.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.ibm.model.Employee;
@Component
public class EmployeeDao {
    
    public void createEmployee(Employee employee)
    {
        System.out.println("Method createEmployee is called");
    }
    
    public void deleteEmployee(int empid)
    {
        System.out.println("Method deleteEmployee is called");
    }
    
    public void udpateEmployee(Employee employee)
    {
        System.out.println("Method updateEmployee is called");
    }
    
    public Employee getEmployeeById(int employeeId)
    {
        System.out.println("Method getEmployeeById is called");
        return new Employee();
    }
    
    public List<Employee> getAllEmployees()
    {
        System.out.println("Method getAll employees Called");
        return new ArrayList<Employee>();
    }
        
}
