function doubleChar(str) {

  let str1 = str.toString();

  let result = [];

  for (let i = 0; i < str1.length; i++) {
    result[i] = str1[i] + str1[i];

  }

  return result.join("");
}

console.log(doubleChar("qwerty"));
