
// Question :--

// Maximum of all subarray of size k
// Problem statement - Given an array of N integers and an integer K (window size). Your task is to find the maximum element of each subarray of size K in an array.

// Example
// First line denotes the length of array.
// second line contains array elements
// third line contains an integer K denoting size of window.
// Sample Input - 1

// Test Cases -> 1

// N -> 8

// arr -> [1,3,-1,-3,5,3,6,7]

// K = 3

// Sample Output -1

// [3, 3, 5, 5, 6, 7]

// EXPLANATION

// The all subarray of size K and there maximum are -

// [1, 3, -1] = 3
// [3, -1, -3] = 3
// [-1, -3, 5] = 5
// [-3, 5, 3] = 5
// [5, 3, 6] = 6
// [3, 6, 7] = 7
// SAMPLE INPUT - 2

// T -> 1

// N = 9

// arr = [1, 2, 3, 1, 4, 5, 2, 3, 6]

// K = 3

// Sample Output - 2

// [3, 3, 4, 5, 5, 5, 6]


// Optimised Solution : --

function max_in_window(arr, n, k) {

    let l = 0;
    let r = k - 1
    let res = []
    while (r < n) {
        res.push(max(l, r, arr))
        l++
        r++
    }

    function max(p1, p2, arr) {
        let m = -Infinity
        for (let i = p1; i <= p2; i++) {
            if (arr[i] > m) {
                m = arr[i]
            }
        }
        return m
    }

    return res
}

console.log(max_in_window([1, 2, 3, 1, 4, 5, 2, 3, 6], 9, 3))