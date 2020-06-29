package com.study.lang;

import java.util.Map;

public class Employee implements Cloneable {
    private int id;
    private String name;
    private Map<String, String> details;

    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public Employee setDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        /**Employee employee = (Employee) o;
        Map<String, String> stringMap = new HashMap<>();
        this.getDetails().forEach((key, value) -> stringMap.put(key, value));
        employee.setDetails(stringMap);**/
        return o;
    }
}
