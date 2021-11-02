function solution(paper) {
    var answer = 0;
    //내림차순으로 sort -> 상위 접근
    paper.sort(function(a, b) {
        return b - a;
    });
    paper.map((num, index) => {
        let arr = paper.slice(0, index+1);
        //해당 인덱스까지 자르고, 합 구하기
        let compare = arr.reduce(function add(sum, currVal) {
           return sum + currVal;
        });
        //제곱과 비교하기
        if(compare >= (index+1)**2) {
            answer = index+1;
            console.log(compare, " ", answer)
        }
    });

    return answer;
}