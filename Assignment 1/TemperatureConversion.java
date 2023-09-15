/**
 * Instructor: Dr. Deepak Dawar
 * Partner: None
 * Course: CSE271
 * Date: 9/13/2023
 * This program allows for a user to easily
 convert any temperature from any given
 scale to another scale, whether via manual
 input or from a file.
 *
**/

// inputFile method assumes text file is in same directory and holds a 
// format of double String String or double char char for each line

// one small note; my inputFile method is converting 20.50 R to -439.17 F,
// but the sample program run on Canvas shows the conversion of 20.50 R to
// 480.17 F - google indicates my original conversion is correct but was
// unsure if i missed something there

import java.util.Scanner;
import java.io.*;

// starting code credits below, i specified what method headers were
// created as part of the starting code at the top of the prototypes
// (either by Jill Courte or Laurie Werner - unsure which)
/**
 * TemperatureConversion provides static methods that allow temperatures to be
 * converted between 4 scales: celsius, fahrenheit, kelvin, rankine.
 * 
 * @author Jill Courte
 * @modified Laurie Werner
 * @version 1.1
 *
 */

public class TemperatureConversion {
  // all of our constants
  public final static char FAHRENHEIT = 'F';
  public final static char CELSIUS = 'C';
  public final static char KELVIN = 'K';
  public final static char RANKINE = 'R';

  /**
   * pr, reusable method that takes in a string input and prints it to
   * a single line
   * @param input, a String value to be printed
   * @return none (void)
   */
  public static void pr(String input) {
    System.out.print(input);
  }

  /**
   * prl, a reusable method that takes in a string input and prints
   * it to its own line
   * @param input, a String value to be printed
   * @return none (void)
   */
  public static void prl(String input) {
    System.out.println(input);
  }

  /** **METHOD BELOW WAS PARTIALLY STARTING CODE**
   * Given a double value in fahrenheit and a scale, converts the value to that
   * scale.
   * @param value - the fahrenheit value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   * @return newValue - a double value representing the converted original value
   */
  public double fahrenheitToOther(double value, char scale) {
    // works regardless of case
    char upperCaseScale = Character.toUpperCase(scale);
    double newValue = 0.0;

    // option to convert to 3 other scales, with correct formulas
    if (upperCaseScale == CELSIUS) {
      newValue = (value - 32) * 5 / 9;
    } else if (upperCaseScale == KELVIN) {
      newValue = (value - 32) * 5 / 9 + 273.15;
    } else if (upperCaseScale == RANKINE) {
      newValue = value + 459.67;
    }
    return newValue;
  }

  /** **METHOD BELOW WAS PARTIALLY STARTING CODE**
   * Given a double value in celsius and a scale, converts the value to that
   * scale.
   * @param value - the celsius value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   * @return newValue - a double value representing the converted original value
   */
  public double celsiusToOther(double value, char scale) {
    // works regardless of case
    char upperCaseScale = Character.toUpperCase(scale);
    double newValue = 0.0;

    // option to convert to 3 other scales, with correct formulas
    if (upperCaseScale == FAHRENHEIT) {
      newValue = (value * 1.8) + 32;
    } else if (upperCaseScale == KELVIN) {
      newValue = value + 273.15;
    } else if (upperCaseScale == RANKINE) {
      newValue = (value + 273.15) * 1.8;
    }
    return newValue;
  }

  /** **METHOD BELOW WAS PARTIALLY STARTING CODE**
   * Given a double value in kelvin and a scale, converts the value to that scale.
   * @param value - the kelvin value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   * @return newValue - a double value representing the converted original value
   */
  public double kelvinToOther(double value, char scale) {
    // works regardless of case
    char upperCaseScale = Character.toUpperCase(scale);
    double newValue = 0.0;

    // option to convert to 3 other scales, with correct formulas
    if (upperCaseScale == FAHRENHEIT) {
      newValue = (value - 273.15) * 1.8 + 32;
    } else if (upperCaseScale == CELSIUS) {
      newValue = value - 273.15;
    } else if (upperCaseScale == RANKINE) {
      newValue = value * 1.8;
    }

    return newValue;
  }

  /** **METHOD BELOW WAS PARTIALLY STARTING CODE**
   * Given a double value in rankine and a scale, converts the value to that
   * scale.
   * @param value - the rankine value to be converted
   * @param scale - the target scale - one of 'F', 'C', 'K', 'R'
   * @return newValue - a double value representing the converted original value
   */
  public double rankineToOther(double value, char scale) {
    // works regardless of case
    char upperCaseScale = Character.toUpperCase(scale);
    double newValue = 0.0;

    // option to convert to 3 other scales, with correct formulas
    if (upperCaseScale == FAHRENHEIT) {
      newValue = value - 459.67;
    } else if (upperCaseScale == CELSIUS) {
      newValue = value * 5 / 9 - 273.15;
    } else if (upperCaseScale == KELVIN) {
      newValue = value * 5 / 9;
    }

    return newValue;
  }

  /** **METHOD BELOW WAS PARTIALLY STARTING CODE**
   * Given a double value and its associated scale, and a new scale,
   * converts the given value from the original scale to the new scale.
   * Each scale shoud be one of 'F', 'C', 'K', 'R' (fahrenheit, celsius, kelvin,
   * rankine)
   * @param originalValue - the value to be converted
   * @param originalScale - the scale of the original value
   * @param newScale      - the target scale
   * @return newValue - a double value representing the converted original value
   */
  public double doConversion(double originalValue, char originalScale, char newScale) {
    double newValue = 0.0;

    // determine what conversion scale char our originalScale char corresponds to,
    // then call the correct function and assign the returned value to our newValue
    // double
    if (originalScale == CELSIUS) {
      newValue = celsiusToOther(originalValue, newScale);
    } else if (originalScale == FAHRENHEIT) {
      newValue = fahrenheitToOther(originalValue, newScale);
    } else if (originalScale == KELVIN) {
      newValue = kelvinToOther(originalValue, newScale);
    } else if (originalScale == RANKINE) {
      newValue = rankineToOther(originalValue, newScale);
    }

    // if we provided a valid scale, our function will return the correctly converted
    // value, otherwise it will return 0.0
    return newValue;
  }

  /**
   * method that takes in a TemperatureConversion object, and a Scanner object, and
   * will repeatedly prompt the user for conversion inputs until specified otherwise
   * @param temps, a TemperatureConversion object
   * @param input, an open Scanner object
   * @return none (void)
   */
  public static void inputConversions(TemperatureConversion temps, Scanner input) {
        // initializing our boolean to repeatedly prompt the user until they
        // specify no more conversions
        boolean moreConversions = true;
        
        // loop for conversion inputs
        while (moreConversions) {
          // initializing bools to repeatedly prompt user for valid inputs &
          // other default values that need to be reset each loop
          boolean validInput = false;
          boolean validConversion = false;
          double tempInput = 0.0;
          char scaleChar = "A".charAt(0);
          String conversionsPrompt = "";

          // prompt the user for valid double and valid char, then assign to vars
          prl("Enter the original temperature value and scale (i.e '92.0 F', '32.0 C', '1.0 K', '1.0 R'):");
          tempInput = input.nextDouble();
          scaleChar = Character.toUpperCase(input.next().charAt(0));
          // checking if our scale char is valid by letter and by the val attached
          // to it (for kelvin / rankine)
          if (scaleChar == FAHRENHEIT || scaleChar == CELSIUS) {
            validInput = true;
          } else if (scaleChar == KELVIN || scaleChar == RANKINE) {
            if (tempInput > 0) {
              validInput = true;
            } else if (tempInput == 0) {
              validInput = true;
            } else {
              validInput = false;
            }
          }
          // if our validinput var is still false, we prompt the user for inputs again,
          // then we grab inputs like before and repeat until valid
          while (!validInput) {
            prl("Invalid scale / temperature. Please enter the original temperature value and scale (i.e '92.0 F', '32.0 C', '1.0 K', '1.0 R')." 
                + "Remember that the value of a temperature on the scale of K or R cannot be below 0!:");
            tempInput = input.nextDouble();
            scaleChar = Character.toUpperCase(input.next().charAt(0));
            if (scaleChar == FAHRENHEIT || scaleChar == CELSIUS) {
              validInput = true;
            } else if (scaleChar == KELVIN || scaleChar == RANKINE) {
              if (tempInput > 0) {
                validInput = true;
              } else if (tempInput == 0) {
                validInput = true;
              }
            }
          }
          
          // grabbing conversion char from user, then assigning to var
          prl("Enter the scale to convert to (i.e 'F', 'C', 'K', 'R'). Remember that you cannot convert to the same scale:");
          char conversionInput = Character.toUpperCase(input.next().charAt(0));
          // checking if the char is not equal to our original scale, then
          // if we satisfy that check we check if the char is a valid scale
          // char and if so we have a valid input (validConversion = true)
          if (conversionInput != scaleChar) {
            if (conversionInput == FAHRENHEIT 
                || conversionInput == CELSIUS 
                || conversionInput == KELVIN 
                || conversionInput == RANKINE) {
              validConversion = true;
            }
          }
          // otherwise, if validConversion is still false, we once again
          // prompt the user for an input again, grabbing the inputs and
          // performing same checks until valid
          while (!validConversion) {
            prl("Invalid output scale. Please enter the scale to convert to (i.e 'F', 'C', 'K', 'R'), and keep in mind that you " 
                + "cannot convert to the same scale!");
            conversionInput = Character.toUpperCase(input.next().charAt(0));
            if (conversionInput != scaleChar) {
              if (conversionInput == FAHRENHEIT 
                  || conversionInput == CELSIUS 
                  || conversionInput == KELVIN 
                  || conversionInput == RANKINE) {
                validConversion = true;
              }
            }
          }
          
          // calling our doConversion function and inputting our valid value, valid
          // scale char, and valid conversion char, then printing the formatted result
          double result = temps.doConversion(tempInput, scaleChar, conversionInput);
          System.out.printf("%.2f %c is %.2f %c\n", tempInput, scaleChar, result, conversionInput);
          // last, we ask the user if they have any more conversions and assign a boolean
          // to check if their input is valid
          prl("Do you have any more conversions? Enter 'yes' or 'no'.");
          boolean validYesNo = false;
          while (!validYesNo) {
            // we start by grabbing the input and seeing if it satisfied any of
            // the 10 options specified. if so, and the user specified one of the 5
            // no options, we have a valid response and the method call ends.
            // if the user specified one of 5 yes options, we have a valid response 
            // and we have more conversions to do, so we return to the top of the moreConversions loop
            conversionsPrompt = input.next();
            if (conversionsPrompt.equals("No") 
                || conversionsPrompt.equals("NO") 
                || conversionsPrompt.equals("no") 
                || conversionsPrompt.equals("n") 
                || conversionsPrompt.equals("N")) {
              prl("");
              moreConversions = false;
              validYesNo = true;
            } else if (conversionsPrompt.equals("Yes") 
                || conversionsPrompt.equals("YES") 
                || conversionsPrompt.equals("yes")
                || conversionsPrompt.equals("y")
                || conversionsPrompt.equals("Y")) {
              prl("");
              validYesNo = true;
            } else {
              // otherwise, if the input is invalid, we prompt the user for another response
              // and repeat until valid
              prl("Invalid response. Please try again - response with 'yes' or 'no'.");
            }
          }
        }
    }

  /**
   * helper method to check if a provided scale char is valid or not - could
   * also be used in our manual checks but i only called the method in the
   * file checks (option 2)
   * @param scaleChar, a char value representing the input char to check
   * @return validChar, a boolean representing if scaleChar is a valid char
   * or not
   */
  public static boolean checkIfValidScale(char scaleChar) {
    boolean validChar = false;
    if (scaleChar == FAHRENHEIT 
        || scaleChar == CELSIUS 
        || scaleChar == KELVIN 
        || scaleChar == RANKINE) {
      validChar = true;
    }
    return validChar;
  }

  /**
   * our inputFile method, which takes in a Scanner object and TemperatureConversion
   * object, and iterates through the file and returns the results of doConversion for
   * each line and an error if the inputs in the file are invalid
   * @param testFile, a Scanner object
   * @param temps, a TemperatureConversion object
   * @return none (void)
   */
  public static void inputFile(Scanner testFile, TemperatureConversion temps) {
    // while we still have lines, continue
    while (testFile.hasNextLine()) {
      // data always in the format of [double char char] or more appropriately,
      // [double String String], so we grab the double first, then the next two
      // strings and convert them to characters (always to uppercase so case doesnt
      // matter)
      double val = testFile.nextDouble();
      char originalScale = Character.toUpperCase(testFile.next().charAt(0));
      char newScale = Character.toUpperCase(testFile.next().charAt(0));

      // we call our helper function above and pass in the scales, and return
      // an error if the result is false
      if (!checkIfValidScale(originalScale)) {
        prl("error invalid original scale specified " + originalScale);
      }
      if (!checkIfValidScale(newScale)) {
        prl("error invalid conversion scale specified " + newScale);
      }

      // lastly, we call our doConversion method regardless of if the scale chars
      // are valid, as we want to return 0.00 for those scale values that are invalid,
      // which will always happen as we initialize our returned val to 0.00 in the method
      double result = temps.doConversion(val, originalScale, newScale);
      // format and print the result + original data
      System.out.printf("%.2f %c is %.2f %c\n", val, originalScale, result, newScale);
    }
    
    // remember to close our file and print the appropriate message
    testFile.close();
    prl("End of file processing.");
  }

  /**
   * method which repeatedly prompts the user to select one of three options
   * on a menu until the user selects option 3 (which ends the program)
   * @param temps, a TemperatureConversion object
   * @return none (void)
   */
  public static void getMenuSelection(TemperatureConversion temps) {
    // initializing our repeatMenu boolean to repeatedly prompt, also
    // create an instance of Scanner and initialize it to our input
    // object, which remains open until the end of this method (so other
    // called methods can use the passed in Scanner)
    boolean repeatMenu = true;
    Scanner input = new Scanner(System.in);

    while (repeatMenu) {
      // display menu and get user input
      prl("Enter a number to choose one of the following options:");
      prl("1. Convert temperatures one at a time");
      prl("2. Convert temperature from a list of values in a .txt file");
      prl("3. End the program");
      String selectionNum = input.next();

      // if user input is 1, we display their selection and call our
      // inputConversion method, passing in our temps and input objects
      if (selectionNum.equals("1")) {
        prl("You selected " + selectionNum);
        prl("");
        inputConversions(temps, input);
        prl("");
      // if user input is 2, we display selection and call prompt the user
      // for a file name, grab the input, and create a false boolean to
      // check if the file name is valid
      } else if (selectionNum.equals("2")) {
        prl("You selected " + selectionNum);
        prl("");
        prl("Enter name of inputfile");
        String fileName = input.next();
        boolean validFile = false;
        while (!validFile) {
          // repeatedly try to open the file, and if successful, call our
          // inputFile method and pass in our testFile and temps objects and
          // assign our sentinel boolean to true
          try {
            Scanner testFile = new Scanner(new File(fileName));
            prl("");
            inputFile(testFile, temps);
            validFile = true;
          // otherwise, catch the error, print out our own generic error, and
          // try to grab the file name again - repeat until the filename is valid
          } catch (Exception error) {
            prl("Invalid file name. Please try again:");
            fileName = input.next();
          }
        }
        prl("");
      // if the user inputs 3, we display their selection num and then
      // simply print goodbye and assign our repeatMenu bool to false to end
      // the menu loop
      } else if (selectionNum.equals("3")) {
        prl("You selected " + selectionNum);
        prl("");
        prl("Goodbye!");
        repeatMenu = false;
      // otherwise, display that the selection was invalid and prompt again
      // at the top
      } else {
        prl("Invalid selection.");
        prl("");
      }
    }
    
    // if the while loop ends meaning the user is done doing conversions, we
    // close our input Scanner before the method ends
    input.close();

  }

  // **METHOD BELOW WAS PARTIALLY STARTING CODE**
  public static void main(String[] args) throws IOException {
    // creating instance of our TemperatureConversion class and
    // initializing the object instance to temps
    TemperatureConversion temps = new TemperatureConversion();
    // calling our getMenuSelection and passing in our temps object
    getMenuSelection(temps);
  }
}