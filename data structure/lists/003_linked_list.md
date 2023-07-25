# Data Structure Linked List

A linked list is a data structure that each element, contains a reference to the other element and  the last element has a reference to null

This structure also has a heap reference, which is the first element of the list

This list, don't have a predefine size, and the best use for the LinkedList, is a use when you don't have to perform operation to delete elements, because when you an element in a linkedlist, you have to go through all the list, find the element and modify the reference, and in this way the object that you want to delete won't be referenced anymore

When you add an object to the list, it's an O(1) operation, because always add elements to the front of the list; so this operation would took always the same time, it modify the reference of the head to the new element and then the next element would be the old head.