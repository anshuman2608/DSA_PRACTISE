'''Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

Example 1:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given 
array is 7.'''

# trying to solve it in o(nlogn) tc and o(1) sc:

def KthSmallestElement(arr,l,r,k):
    arr.sort()
    return arr[k-1]

print(KthSmallestElement([7, 10, 4, 3, 20, 15],0,5,3))    