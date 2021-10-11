function solution(arr, n) {
    var answer = false;
    
    arr.sort(function(a,b) { return b-a; });
    arr.map((target) => {
        var isExist;
        if(!(target > n)) {
            isExist = Math.abs(n-target);   
        }
        if(arr.indexOf(isExist) !== -1) {
            answer = true;
            return answer;
        }
    });
    
    return answer;
}