// Import the 'readline' module to read user input from the command line
const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWordsInSentence(sentence) {
    // Split the sentence into words using a space as the delimiter
    const words = sentence.split(" ");

    // Reverse each word and store them in an array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into an array of characters, reverse it, and join it back into a word
    return word.split("").reverse().join("");
}

// Read user input
rl.question("Enter a sentence: ", function(sentence) {
    const reversedSentence = reverseWordsInSentence(sentence);

    console.log("Reversed sentence: " + reversedSentence);

    rl.close(); // Close the input interface
});
