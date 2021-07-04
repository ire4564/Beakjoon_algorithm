//Naver tets 2
function solution(money, cost) {
    var answer = -1; //정답, 비교해서 더 큰 수로 update
    var index = 0; //시작 지표
    var temp = 0; //값의 합
    var count = 0; //층 수 세기

    while (index < cost.length) {
        for (var i = index; i < cost.length; i++) {
            temp += cost[i];
            if(temp > money) {
                //값 초과이므로 
                if(answer < count) {
                    //count가 더 크면 update
                    answer = count;
                }
                //값 초기화
                count = 0;
                temp = 0;
                //console.log(index)
                break; 
            }
            else {
                count += 1;
            }
        } 
        //for문이 끝났을 떄에도 check
        if(answer < count) {
            //count가 더 크면 update
            answer = count;
        }
        //다음부터 비교하기 위해서 update index
        index += 1;
        count = 0;
        temp = 0;
    }
    
    return answer;
}