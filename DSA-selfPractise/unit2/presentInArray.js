let arr=[1,2,3,4,5,6,7,8];
function fun(a){
    let flag = false;
    for(let i=0;i<arr.length;i++){
        if(arr[i]==a){
            flag=true;
        }
    }if(flag){
        console.log("YES");
    }else{
        console.log("NO");
    }

}
fun(3);