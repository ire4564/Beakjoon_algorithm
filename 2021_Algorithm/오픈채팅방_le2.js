function solution(record) {
    var answer = [];
    //입력 배열을 나눔 0-> 입출력 1->id 2->닉네임
    var lists = record.map(str=>str.split(" "));
    
    var nickName = {};
    for(var i=0; i<lists.length; i++) {
        //leave인 경우에 2개 undefined 방지
        if(lists[i].length === 3) {
            //id-Name 짝지어주기
            nickName[lists[i][1]] = lists[i][2];
        }
    }
    
    //출력
    for(var i=0; i<lists.length; i++) {
        if(lists[i][0] === 'Enter') {
            answer.push(nickName[lists[i][1]] + "님이 들어왔습니다.");
        }
        else if(lists[i][0] === 'Leave') {
            answer.push(nickName[lists[i][1]] + "님이 나갔습니다.");
        }
    }
    
    return answer;
}