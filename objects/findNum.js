// Given an array of N integers, you have to find the largest number whose Inverse* is also present in the array, and if no number is found return -1.

// Inverse
// Multiply the given number with -1.
// Ex => Inverse of 5 = 5*(-1) = -5.


//by ut
function largestInv(arr,n){
    let obj={};
    for(let i=0;i<n;i++){
        if(arr[i]>0){
            obj[arr[i]]=0;
        }
    }
    for(let i=0;i<n;i++){
        if(arr[i]<0 ){
            //console.log(arr[i],obj[(-1*arr[i])]);
            if(obj[-1*arr[i]]==0){
                obj[-1*arr[i]]++;
                
            }
        }
    }
    let max=-Infinity;
    for(let key in obj){
        if(obj[key]>0 && Number(key)>max){
            max=Number(key);
        }
    }if(max==-Infinity){
        console.log(-1);
    }else{
        console.log(max)
    }
    
    
    
    //console.log(max);
    
}













//more optimized way by Anshuman
function findNum(arr){
    let obj={};
    for(let i=0;i<arr.length;i++){
       if(obj[arr[i]]==undefined){
           obj[arr[i]]=1;
       }else{
           obj[arr[i]]++;
       }
   }
   
    let max=-1;
    for(let key in obj){
       if(obj[key] && obj[-key] && +key>max){
           max=+key;
       }
    }console.log(max);
}
findNum([19 ,17, -17, 6, -6]);
