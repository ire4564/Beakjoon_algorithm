function solution(s) {
    /*
    * 1. front와 rear(마지막 인덱스로 대체)라는 포인터 역할을 하는 변수 생성
    * 2. front와 rear를 같이 움직이다가, 바뀌는 순간 rear만 움직이기
    * 3. rear == 마지막 인덱스일 경우, 현재 rear문자 == front 문자 확인
    * 4. 같을 경우 숫자를 합치고, 아닐 경우 그대로
    * 5. 마지막 결과 배열 정렬 후 리턴
    */
    var answer = [];
    let frontString = "";
    let front = 0;
    let count = 1;
    
    for(var i=0; i<s.length-1; i++) {
        if(s[i] === s[i+1]) {
            if(frontString === "") { front = i; }
            count++;
        } else {
            if(frontString === "") { 
                frontString = s[i]; 
                front = count; //바로 넣지 않고 보류 (값 저장)
            } else {
                answer.push(count); 
            }
            count = 1;
        }
    }
    
    if(s[s.length-1] === frontString) {
        answer.push(front+count);
    } else {
        answer.push(count);
    }
    
    answer.sort(function(a, b) {
        return a - b;
    })
    
    return answer;
}