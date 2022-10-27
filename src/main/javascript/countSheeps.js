let array = [
  true,
  true,
  true,
  false,
  true,
  true,
  true,
  true,
  true,
  false,
  true,
  false,
  true,
  false,
  false,
  true,
  true,
  true,
  true,
  true,
  false,
  false,
  true,
  true,
];

function countSheeps(arrayOfSheeps) {
  let counter = 0;

  for (let i = 0; i < arrayOfSheeps.length; i++) {
    if (arrayOfSheeps[i] == true) counter++;
  }

  return counter;
}

console.log(countSheeps(array));
