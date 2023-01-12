function numberOfItems(arr, item) {
  const flatArr = arr.flat(Infinity);

  const result = flatArr.filter((val) => val === item);

  return result.length;
}

var arr = [25, "apple", ["banana", "strawberry", "apple", 25]];
console.log(numberOfItems(arr, 25));
console.log(numberOfItems(arr, "apple"));
