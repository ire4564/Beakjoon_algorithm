function makeTrees(str) {
    //배열 구조로 만들어서 한 눈에 비교하는 방법이 더 쉬울 것 같다!
    //b-> 1, w-> 0으로 표현, root 노드 제외
    let Tree = [];
    let index = 1;
    
    if(str.length === 1) {
        if(str === 'b') {
            for(var i=0; i<16; i++) {
                Tree.push(1);
            }
        } else if(str === 'w') {
            for(var i=0; i<16; i++) {
                Tree.push(0);
            }
        }
        return Tree;
    }

    for(var i=1; i<16; i++) {
        if(str[index] === 'p') {
            for(var j=0; j<4; j++) {
                Tree.push(str[i+j+1] === 'w' ? 0 : 1);
            }
            index += 5;
        } else if(str[index] === 'w') {
            for(var j=0; j<4; j++) {
                Tree.push(0);
            }
            index += 1;
        } else if(str[index] === 'b') {
            for(var j=0; j<4; j++) {
                Tree.push(1);
            }
            index += 1;
        }
        i += 4;
    }
    //배열을 이용하여 트리를 세팅하려고 했으나 시간 관계상 못헀습니다. ;)
    return Tree;
} 

function solution(s1, s2) {
    /*
    *  1. 우선 주어진 문자열에 맞게 트리를 만든다.
    *  2. 문자열을 순서대로 읽으며, w와 b일 경우는 노드를 만들고
    *  3. p일 경우에는 노드를 만들고, 배열 4짜리의 자식 노드를 만든다.
    *  4. 이렇게 해서 트리를 완성하고 나서, 각각의 완성된 트리를 비교한다.
    *  5. 한 쪽이 b라면 나머지 영역도 b로 만든다.
    *  6. 한 쪽 노드 안의 자식 노드가 둘 다 p라면 안의 노드까지 들어가서 비교한다.
    *  7. 각각의 노드에 대해 한 노드 당 64를 곱해주어 검은색 노드의 총 합을 구하여 답을 구한다.
    *  +) 트리를 배열 구조로 만들면 
    *     두 개의 배열을 합해서 바로 결과를 낼 수 있지 않을까? (다른 방법)
    */
    var answer = 0;
    var Tree1 = makeTrees(s1);
    
    //원래 들어가야 하는 코드 내용 (최종)
    /*
    makeTrees 함수를 이용하여 s1, s2 각각의 트리 배열을 만들고,
    이 배열을 각각 or을 취하여 (b:1, w:0) 그 결과 값들을 모아 *64를 해주면 답이 나옵니다.
    */
    
    return answer;
}