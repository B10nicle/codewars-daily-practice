function howMuchILoveYou(nbPetals) {
  let phrases = [
    "I love you",
    "a little",
    "a lot",
    "passionately",
    "madly",
    "not at all",
  ];

  if (nbPetals % 6 === 1) return phrases[0];
  if (nbPetals % 6 === 2) return phrases[1];
  if (nbPetals % 6 === 3) return phrases[2];
  if (nbPetals % 6 === 4) return phrases[3];
  if (nbPetals % 6 === 5) return phrases[4];
  if (nbPetals % 6 === 0) return phrases[5];
}

console.log(howMuchILoveYou(1));
console.log(howMuchILoveYou(2));
console.log(howMuchILoveYou(3));
console.log(howMuchILoveYou(4));
console.log(howMuchILoveYou(5));
console.log(howMuchILoveYou(6));

console.log(howMuchILoveYou(7));
console.log(howMuchILoveYou(8));
console.log(howMuchILoveYou(9));
console.log(howMuchILoveYou(10));
console.log(howMuchILoveYou(11));
console.log(howMuchILoveYou(12));
