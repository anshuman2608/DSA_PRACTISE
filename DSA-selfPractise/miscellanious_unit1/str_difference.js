// You are given two strings S1 and S2. You have to find the difference when S2 is subtracted from S1 (S1-S2)

// (Sx-Sy) results in character which are extra in Sx (in the same order it is present in Sx and not in Sy)
// ABCX
// ABCD    diff is - X


function fun(x1,x2){
    let str="";

    for(let i=0;i<x1.length;i++){
        let flag=false;
        for(let j=0;j<x2.length;j++){
            if(x1[i]==x2[j]){
                flag=true;
                x2[j]=0;
                //here we need to make x2=0 because it has already cancelled one x of x1.
                //if we will not make that zero it will cancel all the elements of x2 zero.
                //if there is one x in x1 and three x in x2 the answer should be two x,but 
                //if we do not make that zero the answer returned will be zero.  
                
            }
        }
        if(flag){
            str=str

        }else{
            str+=x1[i];

        }
    }return str;
}
let a=["a","b","c","x","x","x"]
let b=["a","b","c","d","x"];
console.log(fun(a,b));
