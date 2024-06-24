function fun(a,n){
    //  let count=1
    //  console.log(count);
    //  count++;
    //  if(count>n){
    //     return;
    //  }
    // for(let i=a;i<=n;i++)
    if(a<0){
        return;
    }else{
       
       console.log(a);
       a++;
       fun(a,n)
    }

    }

fun(1,10);