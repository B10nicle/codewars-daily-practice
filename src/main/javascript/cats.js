function solution(start, finish) {
  let distance = finish - start;
  let counter = 0;
  let result = 0;

  result = Math.floor(distance / 3);
  counter = result;
  let newResult = result * 3;

  while (newResult != distance) {
    newResult++;
    counter++;
  }
  return counter;
}


solution(12, 25);
