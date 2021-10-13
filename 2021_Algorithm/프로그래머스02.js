function solution(numbers, hand) {
    var answer = '';
    var leftHand = "*", rightHand = "#";
    const pos = {
        1: [0, 0], 2: [0, 1], 3: [0, 2],
        4: [1, 0], 5: [1, 1], 6: [1, 2],
        7: [2, 0], 8: [2, 1], 9: [2, 2],
        '*': [3, 0], 0: [3, 1], '#': [3, 2]
    };
    
    function dis(num, leftHand, rightHand, pos, hand) {
        const leftDistance = Math.abs(pos[leftHand][0] - pos[num][0]) 
                            + Math.abs(pos[leftHand][1] - pos[num][1]);
        const rightDistance = Math.abs(pos[rightHand][0] - pos[num][0]) 
                            + Math.abs(pos[rightHand][1] - pos[num][1]);
        
        if(leftDistance === rightDistance) return hand === 'left' ? 'L' : 'R';
        return leftDistance < rightDistance ? 'L' : 'R';
    }
    
    numbers.map((num) => {
        if(num % 3 === 1) {
            answer += "L";
            leftHand = num;
        } 
        else if(num % 3 === 0 && num !== 0) {
            answer += "R";
            rightHand = num;
        }
        else {
            answer += dis(num, leftHand, rightHand, pos, hand);
            answer[answer.length - 1] === "L" ? leftHand = num : rightHand = num;
        }
    });
    
    return answer;
}