package com.example.hw15.controller;

import com.example.hw15.model.Employee;
import com.example.hw15.service.DepartmentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/depatments")
public class DepartmentsController {
    private final DepartmentService departmentService;

    public DepartmentsController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/min-salary")
    public Employee getMin(@RequestParam("departmentId") int department){
        return departmentService.getEmployWithMinSalary(department);
    }
    @GetMapping("/max-salary")
    public Employee getMax(@RequestParam("departmentId") int department){
        return departmentService.getEmployWithMaxSalary(department);
    }
    @GetMapping(value = "/all", params = "departmentId")
private List <Employee> getAll(@RequestParam("departmentId") int department){
        return departmentService.getEmployeeByDepartment(department);
    }
    @GetMapping(value = "/all")
    private Map <Integer, List <Employee>> getAll(){
        return departmentService.getEmployeeGrouped();
    }
}
