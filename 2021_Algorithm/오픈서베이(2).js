function solution(estimates, k) {
    const reducer = (acc, curr) => acc + curr;
    var compare = [];
    var answer = 0;
 
    for(var i=0; i<=estimates.length-k; i++) {
        var slice = estimates.slice(i,i+k);
        var sum = slice.reduce(reducer);
        if(answer < sum) {
            answer = sum;
        }
    }
    return answer;
}