//моя реализация
function my_function(n) {
  if (n <= 1) return 1;
  return my_function(n - 1) + " " + n;
}

console.log(my_function(8));
console.log(my_function(9));
console.log(my_function(20));
console.log(my_function(1));
console.log(my_function(0));

//на проверку1
/* function my_function(n) {
  if (n > 0) {
    my_function2(n - 1);
    process.stdout.write(n + " ");
  } else if (n === 0) {
  }
  return "";
}

console.log(my_function(8));
console.log(my_function(9));
console.log(my_function(20));
console.log(my_function(1));
console.log(my_function(0)); */

//на проверку2
/* var num = 0;
function my_function(n) {
    if (n < 1) return "";
    else return ++num + " " + my_function(n - 1);
}

console.log(my_function(8));
console.log(my_function(9));
console.log(my_function(20));
console.log(my_function(1));
console.log(my_function(0)); */

//на проверку3
/* b = ""
function my_function(n) {
    b = n + " " + b;
    if(n <= 1) return b;
    return my_function(n-1) + " "
}

console.log(my_function(8));
console.log(my_function(9));
console.log(my_function(20));
console.log(my_function(1));
console.log(my_function(0)); */
