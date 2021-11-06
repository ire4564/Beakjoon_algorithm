function solution(ings, menu, sell) {
    /*
    * 1. ing의 정보를 key-value로 만들기
    * 2. 각 menu에 따라 순 이익을 구하기 (순이익: 파는 가격 - 원가)
    * 3. 각 항목 순이익 * 개수 계산 
    * 4. 총 합 구하여 return 
    */
    var answer = 0;
    var list = []; //재료 리스트
    var prizeList = []; //순 이익 리스트
    
    ings.map((info) => {
        var val = info.split(" ");
        list[val[0]] = val[1]; 
    });
    
    menu.map((info) => {
        var prize = info.split(" ");
        var originVal = prize[1];
        var total = 0;
        
        for(var i=0; i<originVal.length; i++) {
            total += list[originVal[i]]*1;
        }
        prizeList[prize[0]] = prize[2]*1 - total;
    });
    
    sell.map((info) => {
        var sellVal = info.split(" ");
        answer += prizeList[sellVal[0]] * (sellVal[1]*1);    
    });
    
    return answer;
}