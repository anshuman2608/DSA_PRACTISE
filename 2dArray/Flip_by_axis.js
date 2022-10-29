// Flip a given matrix by Y-Axis or X-Axis.
//       1  2  3  4                                4  3  2  1
//       5  6  7  8    after flip along y-axis     8  7  6  5   
//      9 10 11 12                                12 11 10  9
//      13 14 15 16                               16 15 14 13


// flipping around the y-Axis
function flip(arr){
    let n=arr.length;
    let l=0;
    let r=n-1;
    while(l<r){
        for(let i=0;i<n;i++){
            let temp=arr[i][l];
            arr[i][l]=arr[i][r];
            arr[i][r]=temp;
        }l++;
        r--;
    }console.log(arr);

}
flip([[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]);


//Similarly we can also for fliping around the X-axis

function fun(arr){
    let n=arr.length;
    let l=0;
    let r=n-1;
    while(l<r){
        for(let i=0;i<n;i++){
            let temp=arr[l][i];
            arr[l][i]=arr[r][i];
            arr[r][i]=temp;
        }
        l++;
        r--;
    }console.log(arr);
}
let arr=[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]
fun(arr);