function solution(arr) {
    /*
    * 1. 1, 2, 3 배열을 만든다
    * 2. 각각에 대해 count한다
    * 3. count 값 중에 가장 큰 수를 찾는다
    * 4. 큰 수 - 가지고 있는 수 계산
    */
    var answer = [0, 0, 0];
    
    arr.map((num) => {
        answer[num-1] += 1;
    });
    
    let bigVal = Math.max.apply(null, answer);
  
    answer.map((val, index) => {
        answer[index] = bigVal - val;
    });
    
    return answer;
}