# Quick Sort

## Own Interpretation

The quick sort, consist in pick a pivot value in the array, and all the lower elements go to the left side, and the higher elements go to the right side, and you have to repeat this process until has array elements of one length

## Process


* Divide and conquer algorithm
* Recursive algorithm
* Uses a pivot element to partition the array into two parts
* Elements < pivot to its left, elements > pivot to its right
* Pivot will then be in its correct sorted position
---
* Process is now repeated for the left array and right array
* Eventually, every element has been the pivot, so every element will be in its correct sorted position
* As with merge sort, we'll end up partitioning the array into a series of 1-element arrays
* Does this in-place (unlike merge sort)

## Conclusion

* in-place algorithm
* O(nlogn) - base 2. We're repeatedly partitioning the array into two halves
* Unstable algorithm