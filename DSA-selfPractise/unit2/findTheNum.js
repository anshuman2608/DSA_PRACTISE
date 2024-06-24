// Given an array of N integers, you have to find the largest number whose Inverse* is also present in the array, and if no number is found return -1.

function fun(arr){
    let obj={};
    for(let i=0;i<arr.length;i++){
        if(obj[arr[i]]==undefined){
            obj[arr[i]]=1;
        }else{
            obj[arr[i]]++;
        }
    }
    for(let i=0;i<arr.length;i++){
        if(obj[-arr[i]]==undefined){
            obj[-arr[i]]=1;
        }else{
            obj[-arr[i]]++;
        }
    }
    let max_ele=-1;
    for(let key in obj){
        if(obj[key]>=2){
            key>max_ele;
            max_ele=key;
        }
    }if(max_ele>0){
        console.log(max_ele);
    }else{
        console.log(-max_ele);
    }
}
fun([1,3,5,4,7,-1,-7,8,8,8])