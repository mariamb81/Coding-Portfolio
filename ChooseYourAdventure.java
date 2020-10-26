import hsa_ufa.Console;
import java.util.Scanner;
import java.awt.Color;


public class ChooseYourAdventure {
	//open a console
	static Console c = new Console();
	
	public static void main(String[] args) {
		//INTRODUCTION
		c.println("You are a suspect/detective in a murder mystery game taking place in a grocery store.");
		c.println("The store will remain in lock down until the mystery is solved, so your role as a detective is to "
				+ "deduce who is the perpetrator before it's too late!");
		c.println("If you are the murderer, avoid looking suspicious. Once the characters make the correct accusation, you lose!");
		c.println(); 
		
		//variable declarations
		
		//user input
		String name;
		int random;
		int investigate = 0;
		int suspect;
		String original_word;
		String original_word1;
		String original_word2;
		
		//story information
		boolean innocence = true;  
		int choice = 0;
		int sus_score = 0;
		int j = 0;
		
		Scanner in = new Scanner(System.in);
		
		//Stores name 
		c.println("** Enter your name **");
		name = c.readLine();
		
		//Choice 1: Two options. End result is murderer or detective
		//Prompts user for int between 1 & 10 and randomizes outcome based on parity of input (even/odd)
		//Outputs result in console 
		
		c.print("Enter a number between 1 and 10 ");
		random = c.readInt();
		
		if (random > 0 && random < 11) //int between 1 & 10
		{
			switch (random % 2)
			{
			case 0: //Even number detective
				innocence = true;
				c.setColor(Color.BLUE);
				c.println("Hello, " + name + ", you are a dectective! Find the murderer");
				break;
				
			case 1: //Odd number murderer
				innocence = false;
				c.setColor(Color.RED);
				c.println("Hello, " + name + ", you are the murderer!");
				break;
	
			default:
				//redundant
				System.out.println("ATTENTION: this pathway does not exist");
			}
			//test logic
			System.out.println("Name: " + name);
			System.out.println("Innocent? " + innocence);
		}
		else //Number outside of range (1 - 10)
		{
			c.clear();
			c.setColor(Color.RED);
			c.println("!! ERROR: the number " + random + " is outside the accepted range (1 - 10) !!");
			System.out.println("Please restart program.");
		}
		c.println("");
		
		//New condition to avoid high levels of nesting
		if (innocence == true)
			//Pathway 1: Player is innocent
		{

			c.println("You enter the store wearing your name tag proudly as you enter the store."
					+ "You look around and upon seeing a seemingly empty store you turn to leave."
					+ " Just as you're about to leave an announcement blares on the speakers:"
					+ "Attention players, as you probably know you're competing to win up to 10 000$ worth of groceries on us! Grab whatever you can!"
					+ " Without further ado, the game begins now! Good Luck!");
			c.println("");
			
			c.setColor(Color.BLACK);
			c.println("Remember " + name + ", It's your job to investigate and find the murderer!");
			c.println("Choose an area to investigate: ");
			c.println("1. The produce section");
			c.println("2. The Bakery");
			c.println("3. The frozen foods section");
			c.println("4. Checkout");
			c.setColor(Color.BLUE);
			
			choice = c.readInt();
			
			//To iterate through this selection structure I created a for loop 
			//using the Java syntax of this tutorial: https://www.w3schools.com/java/java_for_loop.asp
			//This was used to prevent excessive copy/pasting code
			
			//The player gets 3 chances to find clues
			for (int i = 0; i < 3; i++) {
			switch (choice)
			{
			case 1:
				c.println("When you enter the produce section you see a person selecting fruits calmly. She doesn’t seem to be in a rush while she inspects" 
				        + " each apple before placing it in her bag");
                c.println("Do you?");
                c.println("1. Investigate: ask the suspect a question");
                c.println("2. Try another area of the store");
                investigate = c.readInt();
                
                if(investigate == 1)
                {
                	c.println();
                	c.setColor(Color.BLUE);
                	c.println("What are you up to?, you ask politely");
                    c.setColor(Color.PINK);    
                    c.println("Dr Rose: ");
                    c.print("Hi! I'm Dr. Rose. To answer your question, I'm grabbing some fruits and vegetables to share with my family and patients! "
                    		+ " I haven't seen anything suspicious yet.");
                    break;
                }
                else if(investigate == 2)
                {
        			break;
                }
			case 2:
					c.setColor(Color.BLUE);
					c.println("You enter the bakery and you see a young man frantically grabbing everything from cookies to loaves of bread."
					+ " He looks startled as he sees you approach him");
					c.println("Do you?");
					c.println("1. Investigate: ask the suspect a question");
					c.println("2. Try another area of the store");
					investigate = c.readInt(); 
					if(investigate == 1)
					{
						c.println();
						
						c.setColor(Color.BLUE);
						c.println("I'm not here to kill you. What are you up to?, you ask");
						c.println();
						c.setColor(new Color(186, 184, 35)); //Color Yellow   
						c.println("Fletcher Gold: ");
						c.print("I'm stocking up on as much bread as I can! It's so expensive these days!!"
								+ " Don't get me wrong, I'm NOT the killer."
						+ " If you ask me, a person I passed by on my way here named Junior seems very suspicious,"
						+ " last time I saw him he was in the produce section.");
						c.setColor(Color.BLUE);
						break;
					}
					else if(investigate == 2)
					{

						break;
					}
			case 3:
					c.println("You enter the frozen foods section and you see a pair of people loading frozen foods in their carts."
							+ " Without even taking a look at the products, they clear the products off of the shelf in"
							+ " a quick swoop");
					c.println("Do you?");
					c.println("1. Investigate: ask the suspects a question");
					c.println("2. Try another area of the store");
					investigate = c.readInt();
					if(investigate == 1)
					{
						c.println();
						
						c.setColor(Color.BLUE);
						c.println("What are you up to?, you ask");
						
						c.println();
						
						c.setColor(Color.MAGENTA);    
						c.println("Lynn Lilac: ");
						c.print("I need the frozen stuff because it will never go bad. Thank goodness Cora told me to come over here first.");
						c.setColor(Color.GREEN);
						c.println("");
						c.println("Cora Fern: ");
						c.print("No problem Lynn, we're going to split the loot once we win!");
						c.setColor(Color.BLUE);
						break;
					}
					else if(investigate == 2)
					{
						break;
					}

			case 4:
					c.println("You reach checkout and you see that a person named Junior has been killed (eliminated). ");
					c.println("Do you?");
					c.println("1. Investigate: ask the suspect a question");
					c.println("2. Try another area of the store");
					investigate = c.readInt();
					if(investigate == 1)
					{
						c.println();
						c.setColor(Color.BLUE);
						c.println("What were you up to before you died?, you ask");
						c.println();
						c.setColor(Color.GRAY);    
						c.println("Junior Gray: ");
						c.print("I'm not allowed to tell you, I'm supposed to be dead.");
						c.setColor(Color.BLUE);
						break;
					}
					else if(investigate == 2)
					{
						break;
					}
			default:
				c.println("Type a number from 1-4 to continue: ");
			}
			c.setColor(Color.BLACK);
			c.println();
			c.println();
			c.println("--------------------------------------------------");
			c.println("*****Choose an area to investigate******: ");
			c.println("1. The produce section");
			c.println("2. The Bakery");
			c.println("3. The frozen foods section");
			c.println("4. Checkout");
			c.setColor(Color.BLUE);
			choice = c.readInt();
			}
			c.println("___________________________________________________________________");
			c.println();

			c.println("Now that you've investigated, it's time to choose a suspect to accuse.");
			c.println("Here are your suspects: ");
			
			c.setColor(Color.MAGENTA); 
			c.println("1. Lynn Lilac");
			c.setColor(new Color(186, 184, 35));
			c.println("2. Fletcher Gold");
			c.setColor(Color.PINK);
			c.println("3. Dr. Rose");
			c.setColor(Color.GRAY);
			c.println("4. Junior Gray");
			c.setColor(Color.GREEN);
			c.println("5. Cora Fern");
			
			c.println();
			
			c.setColor(Color.BLACK);
			c.print("Enter your answer here: ");
			suspect = c.readInt();
			//Conclusion: user inputs the suspect they want to accuse and the story ends
			switch(suspect)
			{
			case 1: case 2: case 3: case 4:
				c.setColor(Color.RED);
				c.println("Sorry, " + name + "! You were INCORRECT.");
				c.println("The murderer was Cora Fern. She was clever and formed a truce with Lynn."
						+ " As the pair were looting, she snuck away and killed Junior "
						+ "as he was collecting valuable lottery tickets from the checkout. "
						+ "After collecting bountiful loot from her victims and eliminating you, she turned on her alliance"
						+ " and eliminated her partner in crime, Lynn.");
				c.println("THE END");
				break;
			case 5:
				c.setColor(Color.GREEN);
				c.println("Great Job, " + name + "! You were CORRECT.");
				c.println("The murderer was Cora Fern. She was clever and formed a truce with Lynn."
						+ " As the pair were looting, she snuck away and killed Junior "
						+ "as he was collecting valuable lottery tickets from the checkout. "
						+ "Once you used your detective skills to determine Cora was the murderer,"
						+ " you voted her out of thMAre game and won a share of the bountiful loot collected"
						+ " by the team! Well done!");
				c.println("THE END");
				break;
     			default: 
				c.println("THE END");
			} 
		}
			if (innocence == false)
			{
				//Pathway 2: You are the murderer
				c.setColor(Color.RED);
				c.println("Remember " + name + ", It's your job to avoid suspicion and win!");
				c.println("Remember the last word that a character says and relay the word back correctly to avoid "
						+ "looking suspicious. Type your answer in the system console");
				switch (j)
				{
				case 0:
					c.setColor(Color.GRAY);    
					c.println("Junior Gray: ");
					c.print("So I was walking through the snack aisle and I saw Dr. Rose dart past ....");
					original_word = in.nextLine();
					if (original_word.equals("past"))
					{
						c.setColor(Color.RED);
						c.println("Well done!");
					}
					else
					{
						c.println(" Hey! That's not what I saw! Are you lying?");
						sus_score++;
					}
					j++;
					c.setColor(Color.RED);
					c.println("Next...");
				case 1: 
					c.setColor(Color.MAGENTA);    
					c.println("Lynn Lilac: ");
					c.print("I think we should vote Fletcher. He seems too nervous and jittery....");
					original_word1 = in.nextLine();
					if (original_word1.equals("jittery"))
					{
						c.setColor(Color.RED);
						c.println("Well done!");
					}
					else
					{
						c.println(" Hey! That's not what I said!");
						sus_score++;
					}
					c.setColor(Color.RED);
					c.println("Next...");
				case 2:
					c.setColor(Color.GREEN);    
					c.println("Cora Fern: ");
					c.print("Did anyone see Lynn lurking around the same area for no reason?!");
					original_word2 = in.nextLine();
					if (original_word2.equals("reason"))
					{
						c.setColor(Color.RED);
						c.println("Well done!");
					}
					else
					{
						c.println(" You didn't see her? That's impossible! Hmm Unless...");
						sus_score++;
					}
					c.setColor(Color.RED);
					c.println("Next...");
				}
				//Conclusion if the player gets 3 out of 3 wrong their story will end badly
				c.setColor(Color.RED);
				if (sus_score == 3)
				{
					c.println("Due to your suspicious behaviour and lack of corrobating evidence of your innocence,"
							+ " you have been voted out");
					c.println("THE END");
				}
				else
				{
					c.println();
					c.println("The other players trust your recollection of events and decide to not vote you off");
					c.println("THE END.");
				}
				
			}
	}
}

