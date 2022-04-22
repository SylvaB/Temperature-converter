package com.kenzie.app;

public class Main {
    //------------------------------------------------------------------------------------------------------------------
    //EXERCISE ONE
   //------------------------------------------------------------------------------------------------------------------

    public static void LifeTimeSupply(){
        // Exercise One - Computing a lifetime supply of your favorite snack!
        //
        // You just won a lifetime supply of your favorite snack.
        //
        // You are going to write a piece of code which will determine how much you
        // will actually need to last the rest of your life.
        //
        // Step one:
        // Prompt the user for three things.
        // * The name of their favorite snack
        // * The number of items of that snack they would eat in a day
        // * Their current age.
        //
        // Store each of these things in descriptively named variables.
        //
        // Step Two:
        // Calculate how many they would need to last them until they are 100!
        //
        // Hint: There are 365 days in a year.  Multiply that by the number of years until they are 100 years old.
        // (100 minus their current age) That will give you the total number of days.
        // Then multiply that by how many they would eat in a day.
        //
        // Store that number in a variable.  That is how many they will eat in their lifetime.
        //
        // Step Three:
        // Print a message to the console informing the user what they have won.
        //
        // Your sentence should describe how many of their snack they will eat.  Something like this:
        //
        // "Congratulations, you have won a lifetime supply of Snickers!"
        // "You will receive 2 Snickers per day, for a grand total of 51100 Snickers."
        //
        // Concatenate together strings with your variables to form the message dynamically.
        //
        // Then test out your program with different numbers and snack!

        System.out.println("Congratulations!  You have won a lifetime supply of your favorite snack!");

        // Write your code here


    }

    //------------------------------------------------------------------------------------------------------------------
    // EXERCISE TWO
    //------------------------------------------------------------------------------------------------------------------

    public static void FutureAge(){
        // Exercise Two - Calculating your future age.
        //
        // You want to know how old you will be in any given year.  Create a piece of code that will compute
        // your age given your birth year and a year in the future.
        //
        // Step One:
        // prompt for the year the user was born.  Then prompt them for a year in the future.
        // Store both of these in descriptively named variables.
        //
        // Step Two:
        // Calculate the two possible ages for that year based on their inputs.
        //
        // For example, if you were born in 1988, then in 2026 you'll be either 37 or 38, depending on what month it is in 2026.
        //
        // Store the two possible ages in two different variables.
        //
        // Step Three:
        // Create a variable called message which describes the result.
        // "You will be either NN or NN in YYYY", substituting the values.
        //
        // Step Four:
        // Print your message to the console

        System.out.println("Welcome to the Future Age Calculator!");

        // Write your code here
    }

    //------------------------------------------------------------------------------------------------------------------
    // EXERCISE THREE
    //------------------------------------------------------------------------------------------------------------------

    public static void TemperatureConversion(){
        // Exercise Three - Temperature Converter
        //
        // Build some code which can convert from Fahrenheit to Celsius, and also from Celsius to Fahrenheit.
        // Based upon the method described here: https://www.mathsisfun.com/temperature-conversion.html
        //
        // Step One:
        // First, ask the user what unit they would like to convert to.  f or c
        // Store their answer in a variable.
        //
        // "What would you like to convert to, Celsius or Fahrenheit? Enter c or f..."
        //
        // Then, ask the user what temperature value they would like to convert.
        // Store the answer in another variable. The user may enter decimal values so the data type should be double.
        //
        // Step Two:
        // Now, one of two things need to happen.
        // If they entered c, then you need to convert from fahrenheit to celsius.
        // otherwise, if they entered f then you need to convert from celsius to fahrenheit.
        //
        // Create an if statement to check if they entered c or f.
        //
        // Hint: Remember that they could enter a capital or lowercase letter!
        // Check for both.  if the unit is equal to c or the unit is equal to C
        //
        // Hint 2: You don't have to do two if statements, you could just do an if and an else.
        // If they chose c, then do the celsius conversion.
        // else, they must have chosen f.
        //
        //
        // Step Three:
        // Now, for both celsius to fahrenheit and for fahrenheit to celsius, do the conversion!
        // Celsius to Fahrenheit:  Multiply 9, then divide by 5, then add 32
        // Fahrenheit to Celsius:  Subtract 32, then multiply by 5, then divide by 9
        // in both the if and the else blocks, create a variable called result and assign the answer to it.
        //
        // Remember that in order to divide a number accurately, you must use a double!  If you use an int
        // then you will get no numbers after the decimal place...
        //
        // Step Four:
        // Now print your answer to the browser window using System.out.println()
        //
        // "22°C converted to Fahrenheit is 71.6°F"
        // or
        // "71.6°F converted to Celsius is 21.999999999999996°C"
        //
        // Hint: Copy and paste the ° from here to put into your string.
        //
        // Note that some of your numbers may have many decimal places!
        // Like 76.266666666667, that's perfectly fine!  You can leave those as is.
        //
        // Write your code here


        System.out.println("Welcome to the Temperature Converter!");

        // Write your code here

    }

    public static void main(String [] args){
        //To run your code uncomment the code for each exercise as you write them and want to test them
        //and see the output.

        LifeTimeSupply();
        //FutureAge();
        //TemperatureConversion();
    }
}
