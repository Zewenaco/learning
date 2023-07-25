package com.zewenaco.lists.single_linked_list;

import com.zewenaco.lists.common.Employee;
import com.zewenaco.lists.common.EmployeeNode;

public class EmployeeLinkedList {

    private EmployeeNode head;
    private int size = 0;

    public void addToFront(Employee employee) {
        this.head = new EmployeeNode(employee, head);
        this.size++;
    }

    public int size() {
        return size;
    }

    public void printToString() {
        var current = head;
        while(current != null && current.getEmployee() != null) {
            System.out.print(current + " => ");
            current = current.getNextNode();
        }
        System.out.println(" null ");
        System.out.println("========");
    }

    public boolean removeById(int id) {
        if (isEmpty()) {
            return false;
        }
        var current = head;
        if (head.getEmployee() != null && head.getEmployee().getId() == id) {
            head = head.getNextNode();
            current.setNextNode(null);
            size--;
            return true;
        } else {
            var next = current.getNextNode();
            while (next != null && next.getEmployee() != null) {
                if (next.getEmployee().getId() == id) {
                    current.setNextNode(next.getNextNode());
                    next.setNextNode(null);
                    size--;
                    return true;
                }
                current = next;
                next = next.getNextNode();
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
