package com.study.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        EmployeeWrap employeeWrap = new EmployeeWrap();
        employeeWrap.setId(10);
        employeeWrap.setName("John");
        Map<String, String> detailsMap = new HashMap<>();
        detailsMap.put("salary", "10000");
        detailsMap.put("city", "UK");
        employeeWrap.setDetails(detailsMap);

        EmployeeWrap cloneEmployee = (EmployeeWrap) employeeWrap.clone();

        System.out.println(employeeWrap == cloneEmployee);
        System.out.println(employeeWrap.getDetails() == cloneEmployee.getDetails());

        System.out.println("---------------------");

        detailsMap.put("title", "Senior Developer");
        employeeWrap.setName("Tim");

        System.out.println(employeeWrap.getName());
        System.out.println(employeeWrap.getDetails());

        System.out.println("---------------------");

        System.out.println(cloneEmployee.getName());
        System.out.println(cloneEmployee.getDetails());
    }
}
