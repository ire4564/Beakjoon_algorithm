function solution(log) {
    /*
    * 1. 배열이 끝날 때까지, 끝 - 시작시간 반복
    * 2. 시간은 60*시간+분으로 환산하여 계산
    * 3. 계산 후 5분 미만인지 & 105분이 넘지 않는지 체크
    * 4. 조건에 부합하면 총 시간으로 get
    * 5. 조건에 부합하지 않는다면 각 처리 실행
    *    5분 미만 (무시), 105분 이상 -> 105분으로 환산
    * 6. 총 값을 다시 60으로 나누어 시간 : 분 세팅 후 반환
    */
    var answer = '';
    var study = 0;
    
    for(var i=0; i<log.length; i++) {
        var start = log[i].split(":");
        var end = log[i+1].split(":");
        var thisTime = (end[0]*60+end[1]*1) - (start[0]*60+start[1]*1);
        
        if(thisTime >= 5) {
            if(thisTime > 105) {
                thisTime = 105;
            }
            study += thisTime;
        }
        i++;
    }

    var hour = Math.floor(study/60);
    var min = study%60;

    hour = (hour < 10) ? "0"+hour : hour;
    min = (min < 10) ? "0"+min : min;
    
    answer = `${hour}:${min}` 
    return answer;
}