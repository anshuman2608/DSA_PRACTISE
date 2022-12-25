// Find Largest subarray of sum k 
// Problem Statement ~ Given an array of N integers and an integer K. your task is to find the length of longest subarray the sums equal to K.

// 🎯This is completely different problem statement then first one because there you have a fixed size subarray and there you are asked to find maximum sum but here sum is fixed and you have to find the length of subarray that can be of any length.

// Example
// Sample Input-1

// N = 7

// arr = 4 1 1 1 2 3 5

// K = 5

// Sample Output -1

// 4

// Explanation

// Subarray with sum equal to 5 are -

// 4, 1
// 1 1 1 2
// 2 3
// 5
// Hence, the longest subarray that sums equal to 5 is [1,1,1,2] of size 4 so return 4







let arr = [4, 1, 1, 1, 2, 3, 5];
let s = 13;

// Below solution is of n^2 time complexity.

// function longest_sub_in_n_square(arr, s) {

//     let max_l = 0;

//     for (let i = 0; i < arr.length; i++) {
//         let temp_s = 0;
//         for (let j = i; j < arr.length; j++) {
//             temp_s += arr[j];
//             if (temp_s == s) {
//                 if (j - i + 1 > max_l) {
//                     max_l = j - i + 1;
//                 }
//             }

//         }
//     }
//     return max_l

// }
// console.log(longest_sub_in_n_square(arr, s))\


// :--- Below Solution is of n time complexity.



// function longest_sub(arr, s) {
//     let max_l = 0;
//     let pre = 0;
//     let forward = 0;
//     let t_sum = 0;
//     while (forward <= arr.length) {
//         if (t_sum == s) {
//             t_sum += arr[forward];

//             let len = forward - pre;
//             if (len > max_l) {
//                 max_l = len
//             }
//             forward++;
//         } else if (t_sum > s) {
//             t_sum -= arr[pre];
//             pre++
//         } else {
//             t_sum += arr[forward];
//             forward++
//         }

//     }
//     return max_l
// }

// console.log(longest_sub(arr, s))