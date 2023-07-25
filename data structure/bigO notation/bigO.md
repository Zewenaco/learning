## BigO annotation
 BigO annotation is calculated by the multiplication of the steps that are repeated to <br> achieve the goal considering the worst scenario.

 ### Big-O values
| Big-O   | Description  |
| ---------| -----------  |
| O(1)     | Constant     |
| O(logn)  | Logarithmic  |
| O(n)     | Linear       |
| O(nlogn) | n log-star n |
| O(n2)    | Quadratic    |

## Arrays

An array is a contiguous block in memory, an always each element of the array has the same size of byte

An array of integer (primitive) would be always each element of the array the same size, 4 bytes for the integer

An array of objects (complex) would have in each element a reference of the object,
and this reference would be always the same size

Because of that we can calculate the address memory of a element in the array by the index

</mark>Consider this:</marke> <br>
    "If an array starts at memory address x, and the size of each element in the array is y, we can calculate the memory address of the ith element by using the following expression: `x + i * y` "

if we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the array

| Position   | Array value  |
| ---------- | -----------  |
|   0        |      20      |
|   1        |      35      |
|   2        |      -15     |
|   3        |      7       |
|   4        |      55      |
|   5        |      1       |
|   6        |      -22     |

Start address of array would be = 12, element size = 4 bytes

Address of array[0] = 12 + (0*4) = 12
Address of array[1] = 12 + (1*4) = 16
Address of array[1] = 12 + (2*4) = 20
Address of array[1] = 12 + (3*4) = 24
Address of array[1] = 12 + (4*4) = 28
Address of array[1] = 12 + (5*4) = 32
Address of array[1] = 12 + (6*4) = 36

Arrays are useful when u have:
* Index of the value
* When u need memory efficient

# Array Operations cost
| Operation                                             | Time Complexity       |
| -----------------------                               | -----------           |
| Retrieve with index                                   | O(1) - Constant time  |
| Retrieve without index                                | O(n) - Linear time    |
| Add an element to a full array                        | O(n)                  |
| Add an element to the end of an (array) has space     | O(1)                  |
| Insert or update an element at a specific index       | O(1)                  |
| Delete an element by setting it to null               | O(1)                  |
| Delete an element by shifting elements                | O(n)                  |