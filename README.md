High or Low

The purpose of the “HighOrLow” Java program is to be a short game for the user to play. The program has a randomly selected number between 1 and 100 and the user is trying to guess that number in the shortest number of attempts possible. When the user guesses a number, the program tells the user if they were right or wrong, and if their guess was too low or too high relative to the correct number. After the correct number has been guessed, the program alerts the user and informs them of how many attempts it took to guess the correct number. 

Lines 1 & 2	
The first part of the code involves adding the “Random” and “Scanner” utility packages since this code. The “Random” package is used to get a random number for the program. And the “Scanner” package is used to get the input from the User. 

lines 14 - 16
The next section of code is within the main and initializes the variables needed in this program. This includes an integer “guess”, integer “guesses”, and Boolean “playing”. The “guess” integer stores the value of the most recent guess by the user to compare against the program’s random number. This variable shouldn’t be initialized between 0 and 100 because we are checking to see if it matches the program’s random number at the start of the while loop. Therefore, it is set to -2 as that number is outside of the range. Additionally, -1 is being utilized elsewhere. Secondly The “guesses” integer keeps track of how many guesses the user has made, to produce to the user at the end of the program. And finally, the “playing” Boolean is enabled by default to show that the game should continue. This is here to give the user the option to play again once they have completed the game. 

lines 18 - 21
Next is the start of the while loop that the game takes place within. The condition for the while loop is the “playing” Boolean as mentioned earlier. 3 things need to be initialized within this loop. First, the “Random” package is put to use and a random number generator is created. Next the “Scanner” package is used to create an input system to get user input. And since the random number generator is now created, an integer simply called “number” is created using said generator. The upper bound is set to 100. This result is what the program uses as it’s random number, and which the user is trying to guess. 

lines 22 - 25
Within the first while loop a second one is set up. This while loop takes care of all the game’s logic. The condition for it is whether the “guess” is equal to the random int, “number”. If it is not equal, the loop continues.  The first thing we do inside the loop is print a quick message to the user, prompting them to enter a guess and informing them that entering “-1” will quit the game. In conjunction with the message, a place to type a response is created. Using scanner, whatever is entered at this point is stored as the “guess”

lines 27 - 44
The next section of the code is a 4 part “if” statement. The first “if” checks to see if the user wants to quit the game by seeing if “guess” is equal to -1. In this case it will break the loop and end the program. The next “else if” checks to see if the guess was too low by seeing if it is less than the random number. If this condition is met than the user is informed that their guess was too low, “guesses” is increased by 1, and the while loop refreshed to get another guess from the user. The next “else if” is similar in that it checks to see if the guess was too high. If so, it informs the user as such, increases “guesses” by 1, and refreshes the loop to get another guess. The final case checks to see if the guess is equal to the random number. In this case the user has successfully guessed the random number. The program informs the user that they have successfully guessed the number and of how many guesses it took. Afterwards it breaks the main game’s while loop and enters the “playing” while loop. 

lines 45 - 53
Once the main game while loop has ended, it again checks to see if the user entered -1 to indicate that they would like to exit. This if statement is simply a continuation on the first if statement to end the program once the user has indicated they want to quit. At this point the game is finished. The program then gives a prompt to the user asking if the user wants to play again. Indicated by “Y” or “N”. If the scanner’s input is a “Y” then the “playing” Boolean remains true. In this case the “guesses” and “guess” variables are reset to their respective initial values and the while loop repeats. If the user had entered anything besides a “Y” or “y”, then the program would exit. 


 



