// You are given an integernum.

// You need to print Yes if that integer is a palindrome or else print No.

//brute force method

function fun(a){
    let str=a;
    let str1="";
    for(let i=str.length-1;i>=0;i--){
        str1=str1+str[i];
        
    }
    if(str1==str){
        console.log("YES");
    }else{
        console.log("NO");
    }

}
fun("121121");