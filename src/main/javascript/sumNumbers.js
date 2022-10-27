function sum(numbers) {
  let result = 0;
  numbers.forEach(element => result += element);

  return result;
}

console.log(sum([1, 5.2, 4, 0, -1]));
