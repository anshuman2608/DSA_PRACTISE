//Given a array let say [4,2,1,3,5,7]. We have to find the an array which contains the index of
// all the previous greater element of respetive element.

function fun(arr) {
  let ans_arr = [];
  for (let i = 0; i < arr.length; i++) {
    let flag = false;
    for (let j = i - 1; j >= 0; j--) {
      if (arr[j] > arr[i]) {
        flag = true;
        ans_arr.push(j);
        break;
      }
    }
    if (flag == false) {
      ans_arr.push(-1);
    }
  }
  return ans_arr;
}

console.log(fun([4, 2, 1, 3, 5, 7, 6, 1]));
