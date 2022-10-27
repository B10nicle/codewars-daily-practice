/**
 *
 * @param {number[]} numbers
 */

function squareSum(numbers) {
  return numbers
    .map((x) => Math.pow(x, 2))
    .reduce((sum, current) => sum + current, 0);
}

console.log(squareSum([1, 2, 3]));
