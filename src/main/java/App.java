/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Tyler Snowdon
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the quote? ");
        String quote = reader.nextLine();
        System.out.print("Who said it? ");
        String author = reader.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
