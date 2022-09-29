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
let arr1=[3,2,5,4,1,6,2,9,1,8,6];
function fun(arr,n,k){
    let max_sum=0;
    for(let i=0;i<k;i++){
        max_sum+=arr[i];
    }
    let current_sum=max_sum;
    for(let i=k;i<n;i++){
        current_sum=current_sum+arr[i]-arr[i-k];
        if(current_sum>max_sum){
            max_sum=current_sum;
        }
    }return max_sum;
    
}
console.log(fun(arr1,11,3));



