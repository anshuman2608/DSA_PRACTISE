// Electricity consumption is measured via slab rates for a particular wattage capacity, which is as follows
// 0-50  --  3/unit
// 51-150  --  5/unit
// 150 above -- 10/unit



// Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill.

// You are given total amount of bill, N , you need to find total unit consumed.

function fun(N){
    let unit=0;
    if(N<=230){
        unit=(N-80)/3

    }if(N<=730 && N>230){
        unit = (N-230)/5 + 50;
    }if(N>730){
        unit = (N-730)/10 + 150;
    }
    return unit;
}
console.log(fun(82));