function solution(s) {
    /*
    *  1. 이중 for를 사용하여 배열을 원하는대로 slice 한다.
    *  2. indexOf를 이용하여 같은 문자열이 있는지 확인한다.
    *  3. 있으면 pass 없으면 계속 비교해서 끝까지 중복이 없으면 +1
    *  +) 더 효율적인 알고리즘이 있을 것 같지만 input 데이터가 크지 않아서 
    *     이 방법을 택했습니다!
    */
    var answer = 0;
    let isExist = []; //문자가 있었는지 없었는지 확인용도
    let isOverlap = false;
    
    for(var i=0; i<s.length; i++) {
        for(var j=i; j<s.length; j++) {
            let sliceString = s.slice(i, j+1);
            sliceSet.push(sliceString);
        }
    }
    
    sliceSet.map((val) => {
        isOverlap = false;
        //단일 문자열이면 중복 확인 후 push
        if(val.length === 1) {
            if(isExist.indexOf(val) === -1) {
                answer++;
                isExist.push(val);   
            }
        } else {
            //문자열에 중복이 있는지 없는지 확인
            for(var i=0; i<val.length; i++) {
                let check = val.slice(i+1, val.length);
                if(check.indexOf(val[i]) !== -1) {
                    isOverlap = true;
                }
            }
            //문자열에 중복이 없고, 결과 배열에 없었던 문자열이라면 push
            if(isOverlap === false && isExist.indexOf(val) === -1) {
                answer++;
                isExist.push(val);   
            }   
        }
    }); 
    
    return answer;
}