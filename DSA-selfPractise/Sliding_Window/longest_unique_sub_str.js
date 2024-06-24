
//  Question :--

// Longest Substring without repeating Characters
// This is one interesting problem statement and now we will increase out level and solve different interesting problems in variable size sliding window.

// Problem statement - Given a string of N characters. your task is to find the longest substring with no repeating characters. In simple words find a substring where each character occur exactly one time because this only means non-repeating which means all unique characters.

// 👉 The problem statement is very similar to one that we have solved in coding problems on string and problem named is longest substring with K unique characters. If you have not gone through that problem then you can find it here and do read it. The difference between both the problem is there we have to find longest substring with K unique character and the character can repeat any number of time but here we want longest substring of all unique characters.

// Example
// Sample Input-1

// string = "pwwkew"

// Sample Output - 1

// 3

// Explanation

// wke or kew is the longest substring with all unique characters.

// Sample Input-2

// string = "ABDEFGABEF"

// Sample Output - 2

// 6

// Explanation

// The longest substring are “BDEFGA” and “DEFGAB”, with length 6.


// Below solution is of n time complexity and n space complexity:--

let str = "abmpppppppqrstu";

function longest_u_sub(str){

    let start = 0;
    let end = 0;

    let u_key = {};
    let ans = 0;

    while(end < str.length){

        if(u_key[str[end]]){

            delete(u_key[str[start]])
            start++

        }else{
            u_key[str[end]] = 1;
            let k = Object["keys"](u_key).join("");
            if(k.length > ans){
                ans = k.length
            }
            end++
        }
    }
    return ans

}

console.log(longest_u_sub(str))