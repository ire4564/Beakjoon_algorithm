//comment: 쉽게 풀었음
function solution(k, m, score) {
  var answer = 0;

  const sortScore = score.sort((a, b) => b - a);

  for (let i = 0; i < score.length; i += m) {
    if (sortScore.slice(i, i + m).length >= m) {
      answer += Math.min(...sortScore.slice(i, i + m)) * m;
    }
  }

  return answer;
}
