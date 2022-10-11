// You are given a strings, you have to find thecountof all such substrings which start and ends with the same character.
// examole
// abcab   --  7

function fun(s){
    
    let count=0;
    for(let i=0;i<s.length;i++){
        let str="";
        for(let j=i;j<s.length;j++){
            str+=s[j];
            console.log(str);
            if(str[0]==str[str.length-1]){
                count++;

            }
            
        }
    }return count;
}
console.log(fun("abcab"));