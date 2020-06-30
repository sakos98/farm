package com.company;

import java.util.Scanner;

public class Main  extends  Player{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Welcome " + name);

        Player player = new Player();
        player.name();
        System.out.println("For start " + name + "you get " + money + "gems");
        System.out.println("Your game start 1 january 2020");
    }
}
