function solution(time, plans) {
    /*
    * 1. 남은 시간과 소요 시간을 비교한다.
    * 2. 소요 시간은 (금요일 퇴근 - 출발) + (도착 - 출근)
    * 3. 만약 도착 시간이 AM이면 +0
    * 4. 만약 (퇴근-출발)이 음수면 +0
    */
    var answer = '';
    
    plans.map((val) => {
        var start = 0;
        var fin = 0;
        
        start = val[1].replace("PM", "");
        start = ((6 - start*1) < 0) ? 0 : (6 - start*1); //퇴근 시간 6시
        
        if(val[2].indexOf("AM") !== -1) {
            fin = 0;
        } else {
            fin = val[2].replace("PM", "");
            fin = ((fin*1 - 1) < 0) ? 0 : (fin*1 - 1); //출근 시간 1시
        }
        
        var result = start + fin;
        if(time >= result){
            answer = val[0];
        }
        
    });
    
    return answer;
}