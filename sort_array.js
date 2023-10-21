const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter a list of numbers separated by spaces: ', function(input) {
  const numbers = input.split(' ').map(Number); // Convert input to an array of numbers

  if (numbers.some(isNaN)) {
    console.log('Invalid input. Please enter a list of numbers separated by spaces.');
  } else {
    // Sort the array in descending order using a compare function
    numbers.sort(function(a, b) {
      return b - a;
    });

    console.log('Sorted in descending order: ' + numbers);
  }

  rl.close(); // Close the input interface
});
