# Selection Sort

index i =   0   1   2   3   4   5   6
array   = [ 20, 35, -15, 7, 55, 1, -22]

- lastUnsortedIndex = 6 >> this is the last index of the unsorted partition
- i = 1 >> Index used to traverse the array from left to right
- largest = 0 >> Index of largest element in unsorted partition

## How it works

 - Pick index zero as the higher value, compare with the next elements and swap when a higher value is found until the end, and replace the higher value in the last possible position and the other one in the place of the higher value was, continuosly until order all the array

 ## Conclusion
 - In-place algorithm
 - O(n2) time complexity - quadratic
 - It will take 100 steps to sort 10 items, 10,000 steps to sort 100 items, 1.000.000 steps to sort 1000 items
 - Doesn't require as much swapping as buggle sort
 - Unstable algorithm