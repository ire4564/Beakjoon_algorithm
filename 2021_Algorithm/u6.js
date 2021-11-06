function check(array) {
    for(var i=0; i<array.length; i++) {
        if(array[i].indexOf(0) !== -1) {
            return false;
        }
    }
    return true;
}

function fillArray(array, row, col, current, caution) { 
    if(row === array.length) row = 0;
    if(col === array[0].length) col = 0;
    if(array[row][col] !== 0) { 
        var valArr = JSON.parse(JSON.stringify(array));
        caution.push(valArr); 
    } //history 저장

    if(check(array)) return array; //종료 조건 1: 모두 0이 되었을 때
    if(caution.length > 5) return caution[0];
    //종료 조건 2: 계속 같은 곳을 돌고 있을 때

    if(current%2 === 0) {
        array[row][col] = current;
        return fillArray(array, row+1, col, current+1, caution);
    } else {
        array[row][col] = current;
        return fillArray(array, row, col+1, current+1, caution);
    }
}

function solution(rows, columns) {
    var answer = [[]];
    var current = 1;
    var arr = Array.from(Array(rows), () => new Array(columns).fill(0));
    answer = fillArray(arr, 0, 0, current, []);
    
    return answer;
}