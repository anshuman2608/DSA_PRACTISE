// You are given three numbers stored in the variables with the following names,a,b,c

// You have to find the second largest number out ofa,b,c

// For example, consider the value stored ina = 3, b = 7, c = 5, then the required output will bec = 5

function fun(a,b,c){
    let max=-Infinity;
    if(a>max){
        max=a;
    }if(b>max){
        max=b;
    }if(c>max){
        max=c;
    }

    let second_max=-Infinity;
    if(a!=max && a>second_max){
        second_max=a;
    }if(b!=max && b>second_max){
        second_max=b;
    }if(c!=max && c>second_max){
        second_max=c;
    }
    return second_max;
}

console.log(fun(5,7,7));