//순열 구하기 -> 그 순서대로 다 해보기 -> 가능한 경우만 + 1 -> 그만큼의 배열만 -> 그중 최대값 찾기

const getPermutation = (arr, n) => {
  if (n === 1) return arr.map((el) => [el]);
  const result = [];

  arr.forEach((fixed, idx, origin) => {
    const rest = [...origin.slice(0, idx), ...origin.slice(idx + 1)];
    const perms = getPermutation(rest, n - 1);
    const attached = perms.map((perm) => [fixed, ...perm]);
    result.push(...attached);
  });

  return result;
};

function solution(k, dungeons) {
  let dungenIndex = [];
  let permuArr = [];
  let resultArr = [];

  for (let k = 0; k < dungeons.length; k++) {
    dungenIndex.push(k);
  }

  permuArr = getPermutation(dungenIndex, dungenIndex.length);

  permuArr.forEach((val) => {
    let hp = k;
    let done = 0;

    val.forEach((idx) => {
      if (dungeons[idx][0] <= hp) {
        hp -= dungeons[idx][1];
        done += 1;
      }
    });
    resultArr.push(done);
  });

  return Math.max.apply(null, resultArr);
}
