# Shell Sort

Shell sort it's very similar to insertion sort, calculate a gap related to the lenght of the array, with the purpose of realize a insertion array but comparing further elements, it'll start with a gap lower than the lenght of the array and reduce the gap with each iteration until reach one, and each iteration will be performing a insertion sort but with the gap value

## To calculate the gap you have to use Knuth Sequence

* Gap is calculated using (3k - 1) / 2
* We set k based on the length of the array
* We want the gap to be as close as possible to the length of the array we want to sort, without being greater than the length

If you have a array length of 7, you want to start with a gap of 2, for example. 

If we pick the 3, the gap will be (3*3*3 - 1) / 2 = 13; this is higher than the length we have

But, if we pick 2 for the gap, it will be (3*3 - 1) / 2 = 4 and will allow us to compare and shift with further elements

https://en.wikipedia.org/wiki/Shellsort

## Conclusion

* in-place algorithm
* Difficult to nail down the time complexity because it will depend on the gap. Worst case: O(n2), but it can perform much better than that.
* Doesn't require as much shifting as insertion sort, so it usually performs better
* Unstable algorithm

