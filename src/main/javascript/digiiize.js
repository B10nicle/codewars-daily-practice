function digitize(n) {
  let result = [];
  let counter = 0;

  let digits = n.toString().split('');

  for (let i = digits.length - 1; i >= 0; i--) {
    result[counter]= Number(digits[i]);
    counter++;
  }

  return result;
}

digitize(12345);
