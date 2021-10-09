function solution(s) {
    var answer = 0;
    var compare = ["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"];
    
    for(var i=0; i<compare.length; i++) {
        if(s.indexOf(compare[i]) !== -1) {
            //All replace (variable)
            var regexAll = new RegExp(compare[i], "gi");
            s = s.replace(regexAll, i);
        }
    }
    
    answer = Number(s);
    return answer;
}