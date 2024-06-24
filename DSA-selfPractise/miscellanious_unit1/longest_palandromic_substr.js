// You are provided a stringS.

// Write a program that returns length of the longest palindromic substring of that string.

// example--   thisracecarisgood  --sub-string is-  racecar--length is 7

function fun(s){
    let max=-Infinity;
    for(let i=0;i<s.length;i++){
        let str="";
        
        for(let j=i;j<s.length;j++){
            str=str+s[j];
            if(palindrome(str) && str.length>max){
                max=str.length;
            }


        }
    }return max;

}

function palindrome(str){
    let l=0;
    let r=str.length-1;
    let flag=true;
    while(l<r){
        if(str[l]==str[r]){
            l++;
            r--;
        }else{
            flag=false;
            break;
        }
        
    }return flag
}

console.log(fun("thisracecarisgood"));


