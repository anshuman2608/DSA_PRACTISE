//Print all first_Negative number in every subarray of size k from a given array.
// Brute force approach


// let arr1=[2,-3,5,-1,4,7,-9,8,6,-1,]

// function fun(arr,n,k){
//     for(let i=0;i<=n-k;i++){
        
//         for(let j=i;j<i+k;j++){
//             if(arr[j]<0){
//                 console.log(arr[j]);
//                 break;

//             }
//         }
//     }
// }
// fun(arr1,10,3);



// Optimised Solution:--

function first_negative(arr, n, k){

    for(let i = 0; i <= n - k; i++){
        if(arr[i] < 0){
            console.log(arr[i])
        }
    }
}

first_negative([2,-3,5,-1,4,7,-9,8,6,-1], 10, 4)
