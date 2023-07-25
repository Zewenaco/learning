# ArrayList

ArrayList is an implementation of List and it has a resizable array; this concrete class provide methods to interact with the array, manipulate the size of the array and also allow set null values.

This class is equivalent to *Vector class*, Which the difference between them is that the concrete class Vector is a synchronize class (thread safe); if you require a unshynchronize class you should use an ArrayList.

Even though the interface list is a non-synchronize abstract data type (non-thread safe), It can be become a synchronyze list with
```java
 List list = Collections.synchronizedList(new ArrayList(...));
```
But this means that any modification while is been iterating would throw an ConcurrentModificationException, the list methods would acquirea fail-fast behaviour
