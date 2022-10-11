// You are given an array A with N elements. You are allowed toremove only one element, which makes thesum of all the remaining elements exactly divisible by 7.

// Your task is to find thefirst index of smallest elementthat can be removed from array. If there is no answer print-1.
// -- here the answer is 1.

function fun(arr){
    let sum=0;
    let min=Infinity;
    let index=-1;
    for(let i=0;i<arr.length;i++){
        sum+=arr[i];
    }
    for(let j=0;j<arr.length;j++){
        if((sum-arr[j])%7==0 && arr[j]<min){
            min=arr[j];
            index=j;
        }
    }return index;
}

console.log(fun([14, 7 ,8, 2 ,4]));

