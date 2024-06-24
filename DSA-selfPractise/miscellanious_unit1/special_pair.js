// You are given an array A of N integers.

// Write a program to find the sum of the absolute difference between all such pairs (A[i], A[j]) such that i < j and ( j-i ) is prime.

// 1 2 3 5 7 12 --answer is 45.


function prime(a){
    let count=0;
    for(let i=1;i<=a;i++){
        if(a%i==0){
            count++;
        }
    }if(count==2){
        return true;
    }else{
        return false;
    }
}

function fun(arr){
    let sum=0;
    for(let i=0;i<arr.length-1;i++){
        for(let j=i+1;j<arr.length;j++){
            let c=j-i;
            if(prime(c)){
                sum+=Math.abs(arr[i]-arr[j]);
            }

        }
    } return sum;
}
console.log(fun([1, 2 ,3 ,5, 7, 12]));