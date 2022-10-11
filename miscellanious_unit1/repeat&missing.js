// Given an array of size n. Array elements are in the range from 1 to n. In the given array, one number from set {1, 2, …n} is missing and one number occurs twice in the array. Find these two numbers.

// Print the missing one first and then the repeated one with a space character in between them.

// example --   1 2 3 3 4   repeat  and missing (5,3)


function fun(arr){
    let obj={};
    for(let i=0;i<arr.length;i++){
        obj[i+1]=0; 
    }
    //console.log(obj);
    for(let j=0;j<arr.length;j++){
        obj[arr[j]]++;
    }
    //console.log(obj);
    let repeat;
    let missing;
    for(let key in obj){
        if(obj[key]==0){
            missing=key;
        }if(obj[key]==2){
            repeat=key;
        }

    }
    console.log(repeat, missing) ;

}
(fun([1,2,3,3,4]));