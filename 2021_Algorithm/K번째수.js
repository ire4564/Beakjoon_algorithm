function solution(array, commands) {
    var answer = [];
    
    for(var i=0; i<commands.length; i++) {
        var sliceArr = array.slice(commands[i][0]-1, commands[i][1]);
        sliceArr.sort(function(a, b) {
            return a - b;
        });
        answer.push(sliceArr[commands[i][2]-1]);
    }
    
    return answer;
}