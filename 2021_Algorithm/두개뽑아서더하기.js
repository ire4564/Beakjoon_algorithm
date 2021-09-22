function solution(numbers) {
    var answer = [];
    
    for(var i=0; i<numbers.length; i++) {
        for(var j=i+1; j<numbers.length; j++) {
            answer.push(numbers[i] + numbers[j]);
        }
    }
    //중복 제거
    const set = Array.from(new Set(answer));
    answer = set;
    answer.sort(function(a,b){
        return a - b;
    });
    
    return answer;
}