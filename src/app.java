import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class app {

	public static void main(String[] args) {
		boolean prompt=true;
		boolean validPrompt=false;
		String redCar, favoritePet = null;
		int agePet=0;
		int luckyNumber =0;
		int modelCar=0;
		int randomNumber=0;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name");
		String nameUser = userInput.nextLine();
		System.out.println("Hello "+nameUser);
		System.out.println("Do you wish to continue? - Yes/Y to continue");
		String continueOption= userInput.nextLine().toUpperCase();
		if ((continueOption.equals("YES")) || (continueOption.equals("Y"))){
			System.out.println("Continuando");
			while (prompt==true) {	
				
				//RedCar
				while (validPrompt==false) {
					System.out.println("Do you have a red car - Y/N");
					redCar=userInput.nextLine().toUpperCase();
					if ((redCar.equals("Y")) || (redCar.equals("N"))) {
						validPrompt=true;
					}
					else {
						System.out.println("Please insert 'Y' or  'N' ");
					}
				}
				
				//PetName
				validPrompt=false;
				while (validPrompt==false) {
					System.out.println("Insert name of favorite pet");
					favoritePet=userInput.nextLine();
					if (favoritePet.length()>3) {
						validPrompt=true;
					}
					else {
						System.out.println("Please insert a name longer than 3 letters");
					}
				}
				
				//PetAge
				validPrompt=false;
				while (validPrompt==false) {
					try {
						System.out.println("Insert age of favorite pet");
						String stringAgePet=userInput.nextLine();
						agePet=Integer.parseInt(stringAgePet);
						if ((agePet>=1) && (agePet<=100)) {
							validPrompt=true;
						}
						else {
							System.out.println("Please insert number between 1-100 ");
						}
					}catch (java.lang.NumberFormatException error) {
						System.out.println("Please insert a number");
					}	
				}

				
				//LuckyNumber
				validPrompt=false;
				while (validPrompt==false) {
					try {
						System.out.println("Insert lucky number 1-10");
						String stringLuckyNumber=userInput.nextLine();
						luckyNumber=Integer.parseInt(stringLuckyNumber);
						if ((luckyNumber>=1) && (luckyNumber<=10)) {
							validPrompt=true;
						}
						else {
							System.out.println("Please insert number between 1-10 ");
						}
					}catch (java.lang.NumberFormatException error) {
						System.out.println("Please insert a number");
					}	
				}
				
				//QuarterBack
				validPrompt=false;
				while (validPrompt==false) {
					System.out.println("Do you have a favorite Quarterback - Y/N");
					String favQuarterBack=userInput.nextLine().toUpperCase();
					if ((favQuarterBack.equals("Y")) || (favQuarterBack.equals("N"))) {
						validPrompt=true;
						if (favQuarterBack.equals("Y")) {
							System.out.println("Insert jersey number");
							String stringQuarterBackNumber=userInput.nextLine();
							int QuarterBackNumber=Integer.parseInt(stringQuarterBackNumber);
						}
					}
					else {
						System.out.println("Please insert 'Y' or  'N' ");
					}
				}
				
				//CarModel

				validPrompt=false;
				while (validPrompt==false) {
					try {
						System.out.println("Insert 2-Digit model year of your car");
						String stringModelCar=userInput.nextLine();
						modelCar=Integer.parseInt(stringModelCar);
						if ((modelCar>=1) && (modelCar<=99)) {
							validPrompt=true;
						}
						else {
							System.out.println("Please insert number between 1-99 ");
						}
					}catch (java.lang.NumberFormatException error) {
						System.out.println("Please insert a number");
					}	
				}
				
				//ActName
				System.out.println("Insert first name of favorite Actor/Actress");
				String favoriteAct=userInput.nextLine();
				
				//RandomNumber
				validPrompt=false;
				while (validPrompt==false) {
					System.out.println("Insert random number between 1 and 50");
					String stringRandomNumber=userInput.nextLine();
					randomNumber=Integer.parseInt(stringRandomNumber);
					if ((randomNumber>=1) && (randomNumber<=50)) {
						validPrompt=true;
					}
					else {
						System.out.println("Please insert number between 1-50 ");
					}
				}
				
				//Three Random
				Random randy=new Random();
				int intMaximum=5;
				int int_random1=randy.nextInt(intMaximum);
				System.out.println(int_random1);
				int int_random2=randy.nextInt(intMaximum);
				System.out.println(int_random2);
				int int_random3=randy.nextInt(intMaximum);
				System.out.println(int_random3);
				
				//MagicBall
				int magicBall=luckyNumber*int_random1;
				while (magicBall>75) {
					magicBall=magicBall-75;
				}
				if (magicBall==0) {
					magicBall=1;
				}
				
				//Lucky1
				int lucky1=42;
				while (lucky1>65) {
					lucky1=lucky1-65;
				}
				if (lucky1==0) {
					lucky1=1;
				}
				
				//Lucky2
				char lucky2Char=favoritePet.charAt(2);
				int lucky2=(int) lucky2Char;
				while (lucky2>65) {
					lucky2=lucky2-65;
				}
				if (lucky2==0) {
					lucky2=1;
				}
				
				//Lucky3
				int lucky3=randomNumber-int_random2;
				while (lucky3>65) {
					lucky3=lucky3-65;
				}
				if (lucky3==0) {
					lucky3=1;
				}
				
				//Lucky4
				int lucky4=agePet+modelCar;
				while (lucky4>65) {
					lucky4=lucky4-65;
				}
				if (lucky4==0) {
					lucky4=1;
				}
				
				//Lucky5
				int lucky5=modelCar+luckyNumber;
				while (lucky5>65) {
					lucky5=lucky5-65;
				}
				if (lucky5==0) {
					lucky5=1;
				}
				
				List<Integer> listLucky=new ArrayList<Integer>();
				listLucky.add(lucky1);
				listLucky.add(lucky2);
				listLucky.add(lucky3);
				listLucky.add(lucky4);
				listLucky.add(lucky5);
				
				int cont=0;
				Collections.sort(listLucky);
				while (cont<5) {
					System.out.println(listLucky.get(cont));
					cont++;
				}
				
				
				System.out.println("Good afternoon "+nameUser+" your Lottery numbers are: "+listLucky.get(0)+", "+listLucky.get(1)+", "+listLucky.get(2)+", "+listLucky.get(3)+", "+listLucky.get(4)+" Magic Ball: "+magicBall);

				//Once ask if user wants to play again to continue
				System.out.println("Do you wish to continue? - Yes/Y to continue");
				String playAgain= userInput.nextLine().toUpperCase();
				if ((playAgain.equals("YES")) || (playAgain.equals("Y"))){
					
				}else {
					prompt=false;
				}
				
				/*validPrompt=false;
				while (validPrompt==false) {
					System.out.println("Do you have a red car - Y/N");
					String redCar=userInput.nextLine().toUpperCase();
					if ((redCar.equals("Y")) || (redCar.equals("N"))) {
						validPrompt=true;
					}
					else {
						System.out.println("Please insert 'Y' or  'N' ");
					}
				}*/
			}
		}
		else {
			System.out.println("Please return later to complete the survey");
		}
				
	}

	public class AsciiChars{
		public void printNumbers() {
			//TODO: Print Valid numeric input
			
		}
		public void printLowerCase()  {
			// TODO: print valid lowercase alphabetic input  
		}
		public void printUpperCase()  {
			// TODO: print valid uppercase alphabetic input  
		} 
	}
}

