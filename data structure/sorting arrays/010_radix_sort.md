# Radix Sort

## Description


## Facts

* Makes assumptions about the data
* Data must have same radix and width
* Because of this, data must be integers or strings
* Sort based on each individual digit or letter position
* Start at the rightmost position
* Must use a stable sort algorithm at each stage

## Example of going through the algorithm

Array: [4725, 4586, 1330, 8792, 1594, 5729] <br/>
1. First we'll sort this array based on the 1's position

  [1330, 8792, 1594, 4725, 4586, 5729]

2. Now we'll sort this array based on the 10's position - must be a stable sort

  [4725, 5729, 1330, 4586, 8792, 1594]

3. Finally we'll sort this array based on the 1000's position - must be a stable sort

  [1330, 1594, 4586, 4725, 5729, 8792]

## Conclusion

* Counting sort is often used as the sort algorithm for radix sort - must be stable counting sort 
* O(n) - can achieve this because we're making assumptions about the data we're sorting
* Even so, it often runs slower than O(nlogn) algorithms because of the overhead involved
* In-place depends on which sort algorithm you use
* Stable algorithm