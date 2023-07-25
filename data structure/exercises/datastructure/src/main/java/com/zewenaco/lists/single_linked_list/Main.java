package com.zewenaco.lists.single_linked_list;

import com.zewenaco.lists.common.Employee;

public class Main {

    public static void main(String[] args) {
        var employeeJane = new Employee("Jane", "Jones", 123);
        var employeeJohn = new Employee("John", "Doe", 4567);
        var employeeMary = new Employee("Mary", "Smith", 22);
        var employeeMike = new Employee("Mike", "Wilson", 3245);
        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addToFront(employeeJane);
        linkedList.addToFront(employeeJohn);
        linkedList.addToFront(employeeMary);
        linkedList.addToFront(employeeMike);
        linkedList.printToString();
        linkedList.removeById(22);
        linkedList.printToString();
        linkedList.removeById(123);
        linkedList.printToString();
        linkedList.removeById(3245);
        linkedList.printToString();
        linkedList.removeById(4567);
        linkedList.printToString();
        linkedList.removeById(4567);
        linkedList.printToString();
        linkedList.addToFront(employeeMike);
        linkedList.printToString();
    }
}
