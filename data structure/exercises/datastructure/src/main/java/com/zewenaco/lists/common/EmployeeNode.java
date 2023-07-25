package com.zewenaco.lists.common;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode nextNode;

    public EmployeeNode(Employee employee, EmployeeNode nextNode) {
        this.employee = employee;
        this.nextNode = nextNode;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(EmployeeNode nextNode) {
        this.nextNode = nextNode;
    }

    public String toString() {
        return employee.toString();
    }
}
