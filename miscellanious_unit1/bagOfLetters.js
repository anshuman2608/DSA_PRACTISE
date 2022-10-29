// Alice is playing a game with his little brother Adam. Alice gives Adam, a stringA, and along with it a bag which contains characters made up of clay are kept.

// Adam has to make the stringA, given to him by Alice, with the help of these characters in the bag. Find out if he can make the string or not.

// Note: The stringAand the bag, both contain only small case characters
// The first line of the input containsN, the number of characters in the bag.

// The next line containsNcharacters, indicating the characters present in the bag.

// The next line containsMcharacters indicating the length of the stringA.

// The next line contains the string itself.
// Sample Input 1       Answer
// 5                                
// aabbc                Yes
// 3
// abc
// Sample input 2
// 5
// aabbc                No
// 4
// abcd

function fun(N,bag,M,A){
    let count=0;
    for(let i=0;i<M;i++){
        for(let j=0;j<N;j++){
            if(A[i]==bag[j]){
                count++;
                bag[j]=0;
                
                break;
            }
        }
    }if(count==M){
        console.log("Yes");
    }else{
        console.log("No");
    }console.log(bag);
    
}
let bag= ["a","b","c","d","e","f"]
let str= "abbc"

fun(5,bag,4,str)