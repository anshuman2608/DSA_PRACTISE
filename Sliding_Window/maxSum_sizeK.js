//problem 1

// Given an input Array, Find the maximum Sum of all sub-array of size K. 

//Brute force approach. By Anshuman 

//let arr1=[3,2,5,4,1,6,2,9,1,8,6];

// function fun(arr,n,k){
//     let max=-Infinity;
//     for(let i=0;i<=n-k;i++){
//         let sum=0;
//         for(let j=i;j<=i+k-1;j++){
//             sum+=arr[j];

//         }
//         if(sum>max){
//             max=sum;
//         }
//     }return max;
// }
// console.log(fun(arr1,11,3));


//Sliding Window approach. By Anshuman
// let arr1 = [3, 2, 5, 4, 1, 6, 2, 9, 1, 8, 6];
// function fun(arr, n, k) {
//     let max_sum = 0;
//     for (let i = 0; i < k; i++) {
//         max_sum += arr[i];
//     }
//     let current_sum = max_sum;
//     for (let i = k; i < n; i++) {
//         current_sum = current_sum + arr[i] - arr[i - k];
//         if (current_sum > max_sum) {
//             max_sum = current_sum;
//         }
//     } return max_sum;

// }
// console.log(fun(arr1, 11, 11));






// Solve this Problem :--- (Utkarsh) --> (you can search for anagram on google : this is just a rearrangement of word)

// Question :--
// Count occurrence of Anagram
// Problem statement - Given a string and a pattern string. your task is to find all the occurrence of anagram (Pattern) in a string. The anagram must be in continuous characters in string (no other character in between is allowed otherwise the size of both will differ)

// 👉 Now we all know to implement brute force approach over sliding window so from now we will not discuss brute force approach because we hope that you can easily implement.

// Example
// First input contains a string and send line of input contains second string which is a anagram (pattern) whose anagram you need to count in first string.

// Sample Input - 1

// string = "forxxorfxdofr" pattern = "for"

// Sample Output - 1

// 3

// Explanation-1

// Anagrams of the word for that occur in string is -> for, orf, ofr AND hence the count is 3.
// Sample Input - 2

// aabaabaa

// aaba

// Sample Output-2

// 4

// Explanation - 2

// Anagrams of the word aaba -> aaba, abaa each appear twice in the text and hence the count is 4.



