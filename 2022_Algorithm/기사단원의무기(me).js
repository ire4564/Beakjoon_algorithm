//comment: 시간초과 수정 후 완료
function solution(number, limit, power) {
  let powerArray = [];

  for (let cur = 1; cur <= number; cur++) {
    let count = 0;
    for (let i = 1; i <= cur / 2; i++) {
      if (cur % i === 0) {
        count += 1;
      }
    }
    powerArray.push(count + 1);
  }

  const answer = powerArray
    .map((powerValue) => {
      return powerValue > limit ? power : powerValue;
    })
    .reduce((a, b) => a + b);

  return answer;
}
