/**
 *
 * @param {String} braces
 * @returns
 */

function validBraces(braces) {
  var stack = [];
  let validParentheses = false;

  for (let brace of braces) {
    if (stack.length == 0 && (brace == "]") | (brace == ")") | (brace == "}"))
      return false;

    stack.push(brace);

    if (stack.length != 0 && stack.includes("[") & (brace == "]")) {
      stack.pop();
      stack.pop();
    }

    if (stack.length != 0 && stack.includes("(") & (brace == ")")) {
      stack.pop();
      stack.pop();
    }

    if (stack.length != 0 && stack.includes("{") & (brace == "}")) {
      stack.pop();
      stack.pop();
    }
  }

  if (stack.length == 0) validParentheses = true;

  return validParentheses;
}
