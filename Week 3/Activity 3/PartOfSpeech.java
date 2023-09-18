/**
 * Name: Ross Hamey
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/17/2023
 * This program used object-oriented
 * programming to allow a user to count
 * and / or generate words from input
 * files, as well as select a random word
 * from said files.
**/

// no recording for this assignment - out of town
// this weekend & it was more of a follow-along
// assignment to review oop principles

// our imports
import java.io.*;
import java.util.*;

public class PartOfSpeech {

    // our instance methods - we will need a filename,
    // a string array of words, and a random object created
    // by calling the Random class
    private String filename;
    private String[] words;
    private Random random = new Random();

    /**
     * our constructor - takes in a filename as a String and
     * and assigns it to our filename instance var. we also
     * create a count var and call getCount() to get a count
     * of words (lines) in the file
     * @param filename - a String value representing the filename
     * @return none (constructor)
     */
    public PartOfSpeech(String filename) {
        this.filename = filename;
        int count = getCount();

        // displayed prompt to user to show count, declaring the
        // size of our words instance var by initializing words to
        // a new String array with length count, then calling
        // readWordsIntoArray()
        System.out.println("Count of items in the file is " + count);
        this.words = new String[count];
        readWordsIntoArray();
    }

    /**
     * our getCount method, which returns an int value represnting the
     * count of words (or more appropriately, lines) in our filename
     * instance variable
     * @return count, an int value representing the count of words / lines
     */
    private int getCount() {
        // initializing vars to use
        int count = 0;
        Scanner fileIn = null;

        // try to open file with filename instance var, otherwise throw
        // IOException error and return 0
        try {
            fileIn = new Scanner(new FileInputStream(this.filename));
        } catch (IOException error) {
            System.out.println(error.getMessage());
            return 0;
        }

        // while the file still has another line, increment the count
        // and go to the next line
        while (fileIn.hasNextLine()) {
            count += 1;
            fileIn.nextLine();
        }

        // close our file and return the count
        fileIn.close();
        return count;
    }

    /**
     * our readWordsIntoArray method, which reads the words from our filename
     * instance variable and assigns them into the according index within
     * our words instance variable / array
     * @return none (void)
     */
    private void readWordsIntoArray () {
        // initializing vars
        int i = 0;
        Scanner fileIn = null;
        
        // trying to open file with filename instance var, otherwise, throw
        // IOException error and exit
        try {
            fileIn = new Scanner(new FileInputStream(this.filename));
        } catch (IOException error) {
            System.out.println(error.getMessage());
            System.exit(0);  
        }
        
        // while the file still has another line, assign the value of the
        // line to our words instance var at the index of i & increment i
        while (fileIn.hasNextLine()) {
            this.words[i++] = fileIn.nextLine();
        }
        
        // closing our file
        fileIn.close();
    }

    /**
     * our show method, which prints out the words in our words instance
     * variable / array
     * @return none (void)
     */
    public void show () {
        // simple for loop - iterate through the words array and print the
        // value at each index
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
    
    /**
     * our getRandomWord method, which returns a random word from our words
     * instance variable / array using the random instance variable / object
     * constructed from the Random class
     * @return this.words[index], a random word from our words array at the
     * given index
     */
    public String getRandomWord() {
        int index = this.random.nextInt(this.words.length);
        return this.words[index];
    }

    // our main method
    public static void main(String[] args) {

        // creating an object for each list in our directory using our PartOfSpeech
        // class / constructor
        PartOfSpeech nouns = new PartOfSpeech("nouns.txt");
        PartOfSpeech verbs = new PartOfSpeech("verbs.txt");
        PartOfSpeech adjectives = new PartOfSpeech("adjectives.txt");

        // normally our show() calls are here - but since they result in the program
        // printing all of the words (1000+ lines) from the files above, i left them
        // commented out
        // nouns.show();
        // verbs.show();
        // adjectives.show(); 
        
        // our for loops below - we iterate in a range from 0 through 9, each time
        // calling our getRandomWord method on our nouns, verbs, and adjectives objects
        // respectively, and printing out an appropriate message
        for (int i = 0; i < 10; i++) {
            System.out.println("Random noun is " + nouns.getRandomWord());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Random verb is " + verbs.getRandomWord());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Random adjective is " + adjectives.getRandomWord());
        }
    }

}

// sample output when the program is run as is (meaning .show() method calls
// are still commented out):

// Count of items in the file is 247
// Count of items in the file is 687
// Count of items in the file is 382
// Random noun is tourist
// Random noun is cyst
// Random noun is apple
// Random noun is artist
// Random noun is buttercup
// Random noun is wrist
// Random noun is undertaker
// Random noun is seagull
// Random noun is fire
// Random noun is mother
// Random verb is teach
// Random verb is looks
// Random verb is run
// Random verb is go
// Random verb is marches
// Random verb is yells
// Random verb is swims
// Random verb is dab
// Random verb is rousing
// Random verb is wringing
// Random adjective is shaggy
// Random adjective is gentle
// Random adjective is moaning
// Random adjective is blue
// Random adjective is difficult
// Random adjective is super
// Random adjective is wonderful
// Random adjective is prickly
// Random adjective is lonely
// Random adjective is scrawny