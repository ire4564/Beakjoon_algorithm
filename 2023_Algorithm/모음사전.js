/*
 * 규칙
 * 1. 5개 자리의 숫자
 * 2. A E I O U 순서
 * 3. 모두 만들고 나서 indexOf 해도 되지 않나?
 */

function pwc(items, k, list, result) {
  if (items.length === k) {
    result.push(items);
    return;
  }

  for (let i = 0; i < list.length; i++) {
    pwc([...items, list[i]], k, list, result);
  }
}

function ascending(a, b) {
  var a = a.toString().toLowerCase();
  var b = b.toString().toLowerCase();
  return a < b ? -1 : a == b ? 0 : 1;
}

function solution(word) {
  const letters = ["A", "E", "I", "O", "U"];
  const dictionary = [];
  let result = [];

  for (let i = 0; i <= letters.length; i++) {
    pwc([], i, letters, result);
  }

  result = result.filter((val) => val.length !== 0);

  result.forEach((val) => {
    dictionary.push(val.join(""));
  });

  dictionary.sort(ascending);
  return dictionary.indexOf(word) + 1;
}
