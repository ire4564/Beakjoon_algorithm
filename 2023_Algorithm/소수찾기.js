function solution(numbers) {
  const number = numbers.split("");
  let result = [];
  let count = 0;

  function permutation(arr, num) {
    const res = [];
    if (num === 1) return arr.map((v) => [v]);

    arr.forEach((v, idx, arr) => {
      const rest = [...arr.slice(0, idx), ...arr.slice(idx + 1)];
      const permutations = permutation(rest, num - 1);
      const attach = permutations.map((permutation) => [v, ...permutation]);
      res.push(...attach);
    });
    return res;
  }

  function isPrime(num) {
    if (num === 0 || num === 1) return false;
    if (num === 2) return true;

    for (let i = 2; i <= num / 2; i++) {
      if (num % i === 0) {
        return false;
      }
    }
    return true;
  }

  for (let i = 1; i <= number.length; i++) {
    result.push(...permutation(number, i).map((x) => Number(x.join(""))));
  }

  const set = new Set(result);
  result = [...set];

  result = result.filter((val) => isPrime(val));

  return result.length;
}
