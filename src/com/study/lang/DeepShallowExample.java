package com.study.lang;

import java.util.HashMap;
import java.util.Map;

public class DeepShallowExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee = new Employee();
        employee.setId(10);
        employee.setName("John");
        Map<String, String> detailsMap = new HashMap<>();
        detailsMap.put("salary", "10000");
        detailsMap.put("city", "UK");
        employee.setDetails(detailsMap);

        Employee cloneEmployee = (Employee) employee.clone();

        System.out.println(employee == cloneEmployee);
        System.out.println(employee.getDetails() == cloneEmployee.getDetails());

        System.out.println("---------------------");

        detailsMap.put("title", "Senior Developer");
        employee.setName("Tim");

        System.out.println(employee.getName());
        System.out.println(employee.getDetails());

        System.out.println("---------------------");

        System.out.println(cloneEmployee.getName());
        System.out.println(cloneEmployee.getDetails());
    }
}
