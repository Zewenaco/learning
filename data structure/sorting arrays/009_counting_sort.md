# Counting Sort

## Description

This algorithm asume a possitive array of a possible length not too large, and will count the ocurrences of a number into a new array

For example, array of [1,4,1,3]
It would be a counting array of [2,0,1,1], which mean two occurrences of number one, zero ocurrences of number 2, one ocurrence of number three and one ocurrences of number four; And then it would iterate the counting array and assign the numbers, for this example it would be a result of [1,1,3,4]

## Facts

* Makes assumptions about the data
* Doesn't use comparisons
* Counts the number of occurrences of each value
* Only works with non-negative discrete values (can't work with floats, strings)
* Values must be within a specific range

## Example of going through the algorithm

Array: [2, 5, 9, 8, 2, 8, 7, 10, 4, 3] <br/>
1. Assume we have values between 1 and 10 inclusive
2. We have 10 possible values, so we create a counting array of length 10
3. Traverse the input array from left to right
4. Use the counting array to track how many of each value are in the input array
5. Using the counts in the counting array, write the values in sorted order to the input array

## Conclusion
* NOT an in-place algorithm
* O(n) can achieve this because we're making assumptions about the data we're sorting
* If we want the sort to be s table, we have todo some extra steps