# Vector

Is an structure that exist from java version 1.0, A concrete class and implement a growable array of objects and extend AbstractList, since versión 1.2 belong to 
package java util concurrent and also has all the method to interact with it as ArrayList, the only difference is that it's a synchronize structure (thread safe); which mean it's an slower implementation than ArrayList  because it has to synchronize their values and its iterator has a fail-safe behavior; Which mean that if you modify it while you're iterating it, it would throw a ConcurrentException. 

And if you try to catch this exception, it would be wrong because this exception should be only use to catch bugs in the code; because you wouldn't be able to continue the iterator if modify the structure in the mean time.

The size of a vector can grow or shrink as needed to accomodate adding and removing items after the Vector has been crearted

Each vector tries to optimize storage management by maintaining a capacity and capacityIncrement. The capacity is always at least as large as the vector size; it is usually larger because as components are added to the vector, the vector's storage increases in chinks the size of capacityIncrement.

If you increase the size of the Vector before add a new group of elements; it would faster than let the vector automatically grow.