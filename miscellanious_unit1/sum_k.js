// You are given an arrayAofNintegers along with a target integerK.

// Your task is to find out the number of pairs of integers present in the array, whose sum is equal to the target valueK.
// 5 9
// 3 0 6 2 7     answer- 2

//Approach 1 brute-forse method

// function fun(arr,k){
//     let count=0;
//     for(let i=0;i<arr.length-1;i++){
//         for(let j=i+1;j<arr.length;j++){
//             if(arr[i]+arr[j]==k){
//                 count++;
//             }
//         }
//     }return count;

// }
// console.log(fun([2,3,4,5,8,1],9));

// by two pointer method
 function fun(arr,k){
    
    arr.sort(function(a,b){
    return a-b;
    });
    let count=0;
    let l=0;
    let r=arr.length-1;
    while(l<r){
        if(arr[l]+arr[r]>k){
            r--;
        }if(arr[l]+arr[r]<k){
            l++;
        }if(arr[l]+arr[r]==k){
            count++;
            l++;
            r--;
        }
        
    }return count;
 }
 let arr=[2,3,4,5,8,1];
console.log(fun(arr,9));

