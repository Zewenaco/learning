package com.zewenaco.lists.vector;

import com.zewenaco.lists.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        /**
         * Vector add method is synchronize
         *  public synchronized boolean add(E e) {
         *         modCount++;
         *         add(e, elementData, elementCount);
         *         return true;
         * }
         */
    }
}
