package com.zewenaco.lists.array_list;

import com.zewenaco.lists.common.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//        printArrayList(employeeList);
//        System.out.println(employeeList.get(1));

        employeeList.set(1, new Employee("John", "Adams", 4568));
//        printArrayList(employeeList);

//        System.out.println(employeeList.size());

        employeeList.add(3, new Employee("John", "Doe", 4567));
//        printArrayList(employeeList);

//        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
//        for (Employee employee: employeeArray) {
//            System.out.println(employee);
//        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        employeeList.remove(2);
//        printArrayList(employeeList);
    }

    private static <T> void printArrayList(List<T> arrayList) {
        arrayList.forEach(System.out::println);
    }
}
