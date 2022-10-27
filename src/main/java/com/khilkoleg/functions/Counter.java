package com.khilkoleg.functions;

public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
      var counter = 0;

  for (var i = 0; i < arrayOfSheeps.length; i++) {
    if (arrayOfSheeps[i] == true) counter++;
  }

  return counter;
  }
}