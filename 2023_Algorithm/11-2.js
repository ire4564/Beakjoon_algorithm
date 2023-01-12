function sortByPriceAscending(jsonString) {
  let makeArr = jsonString.replaceAll("[", "").replaceAll("]", "");

  //문제 이해를 잘못 해서 시간을 잡아먹었는데, 생각한 풀이 방법은 아래와 같습니다.
  //jsonString을 json으로 변환 시킨 다음에, 각각 price와 name에 따른 정렬을 차례대로 처리하면
  //되는 문제였습니다 ;)

  /*const sortResult = jsonString.sort(function(a, b) {
       a.price - b.price;
   })
   */
}

console.log(
  sortByPriceAscending(
    '[{"name":"eggs","price":1},{"name":"coffee","price":9.99},{"name":"rice","price":4.04}]'
  )
);
