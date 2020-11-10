package org.yuqi.web.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yuqi.web.demo.model.Employee;
import org.yuqi.web.demo.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/employee")
    public String list(Model model) {
        List<Employee> employees = employeeService.findAllEmployees();
//        System.out.println(employees);
        model.addAttribute("employees",employees);
        return "/employee/list";
    }

//    @RequestMapping("/employee/add")
//    public String add(){
//
//    }
}
