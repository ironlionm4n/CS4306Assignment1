// Name: Mikail Miller
// Class: CS 4306/03
// Term: Fall 2023
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: JetBrains IntelliJ
//*****************************
/*Algorithm Design Block
        Algorithm title: ...
        Logical steps:
        ...
        Algorithm pseudocode syntax:
        ...
        *****************************
        Page 3*/
// Code Section
// Working code goes here


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner menuScanner = new Scanner(System.in);
    static List<Integer> inputListOne = new ArrayList<Integer>();
    static List<Integer> inputListTwo = new ArrayList<Integer>();

    public static void main(String[] args) {
        boolean shouldExitProgram = false;
        while(!shouldExitProgram)
        {
            PromptMenu();
            if(menuScanner.hasNextInt()){
                int nextInput = menuScanner.nextInt();
                if(CheckInput(nextInput))
                {
                    switch (nextInput) {
                        case 1 -> {
                            HandleFirstOption();
                        }
                        case 2 -> {
                            System.out.println(HandleSecondOption());
                        }
                        case 3 -> {
                            shouldExitProgram = true;
                        }
                        default -> {
                            System.out.println("Default case hit in PromptMenu");
                            shouldExitProgram = true;
                        }
                    }
                }
            }

        }
    }

    private static void HandleFirstOption() {
        inputListTwo.clear();
        inputListTwo.clear();
        System.out.println("You will enter values for the first list one at a time. Enter anything except an integer to quit entering");
        boolean isDone = false;
        do
        {
            System.out.println("Input integer for the list, then press Enter:");
            if(menuScanner.hasNextInt()){
                var inputValue = menuScanner.nextInt();
                inputListOne.add(inputValue);
                System.out.println(inputValue);
            } else {
                menuScanner.next();
                isDone = true;
            }
        } while(!isDone);

        System.out.println("You will enter values for the second list one at a time. Enter anything except an integer to quit entering");
        isDone = false;
        do
        {
            System.out.println("Input integer for the list, then press Enter:");
            if(menuScanner.hasNextInt()){
                var inputValue = menuScanner.nextInt();
                inputListTwo.add(inputValue);
                System.out.println(inputValue);
            } else {
                menuScanner.next();
                isDone = true;
            }
        } while(!isDone);
        Collections.sort(inputListOne);
        Collections.sort(inputListTwo);
        System.out.print("List 1: ");
        for(int i = 0; i < inputListOne.toArray().length; i++)
        {
            System.out.print(" "+ inputListOne.get(i));
        }
        System.out.println();
        System.out.print("List 2: ");
        for(int i = 0; i < inputListTwo.toArray().length; i++)
        {
            System.out.print(" "+ inputListTwo.get(i));
        }

        System.out.println();
    }

    private static List<Integer> HandleSecondOption()
    {
        List<Integer> commonValuesList = new ArrayList<>();
        int indexListOne = 0, indexListTwo = 0;
        while(indexListOne < inputListOne.size() && indexListTwo < inputListTwo.size())
        {
            if(inputListOne.get(indexListOne) == inputListTwo.get(indexListTwo))
            {
                commonValuesList.add(inputListOne.get(indexListOne));
                indexListOne++;
                indexListTwo++;
            } else if(inputListOne.get(indexListOne) > inputListTwo.get(indexListTwo))
            {
                indexListTwo++;
            } else {
                indexListOne++;
            }
        }

        return commonValuesList;
    }
    private static boolean CheckInput(int nextInput) {
        return nextInput >= 1 && nextInput <= 3;
    }

    private static void PromptMenu()
    {
        System.out.println("-----------------MAIN MENU--------------\n" +
                "1. Read input lists (integer values)\n" +
                "2. Run algorithm and display output\n" +
                "3. Exit program\n" +
                " Enter option number:");
    }
}