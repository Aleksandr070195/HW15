package com.example.hw15.service;

import com.example.hw15.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class EmployeeService {
  private final Collection <Employee> employees = new ArrayList<>(SIZE_LIMIT);
  private static final int SIZE_LIMIT= 5;
    public Employee add(Employee employee){
       employees.add(employee);
       return employee;
    }
    public Employee find(String firstName, String lastName){
        for (Employee employee : employees) {
            if (employee.getFirstName(). equals(firstName) && employee.getLasteName().equals(lastName)) {
                return employee;
            } 
        }
        return null;
    }
    public Employee remove(String firstName, String lastName){
        Employee employee = find(firstName, lastName);
        employees.remove(employee);
        return employee;

    }
}
