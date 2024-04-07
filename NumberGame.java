package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    static int count = 0;
    public static void numGame(){  
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int randomNum = random.nextInt(100);
        
        int inputNum = -1;
        
        System.out.println("you have 10 attemps to guess the number");
        
        for(int i = 1;i<=10;i++){
            if(inputNum==randomNum){
                System.out.println("you guessed the correct number!");
                count = count+1;
                break;
            }
            else{
                System.out.println("attemps : "+(11-i));
                System.out.println("Enter a number : ");       
                inputNum = sc.nextInt();
            }
        }
        System.out.println("Score : " + count);
    }

    public static void main(String[] args) {
        boolean finish = false;
        Scanner sc = new Scanner(System.in);
        
        numGame(); 

        
        while (true) {
            System.out.println("Do you want to play more? (y/n) : ");
            char bool = sc.next().charAt(0);
            switch (bool) {
                case 'y', 'Y' -> numGame();
                case 'n', 'N' -> {finish = true;
                break;}                   
                default -> System.out.println("Wrong input");
            }
            
            if(finish)
                break;
        }
        }

        
    }
    
