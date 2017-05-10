package com.aleyha.driver;

import com.aleyha.character.Character;

import java.util.List;

/**
 * Created by huyqp_000 on 5/9/2017.
 */
public class Main {

    private static boolean gameInProgress;
    private static List<Character> team1;
    private static List<Character> team2;

    public static void main(String[] args) {
        while(true) {
            greet();
            while (gameInProgress) {

            }
        }
    }
    public static void greet() {
        gameInProgress = true;
        System.out.println("Welcome to DiscordRPG!");
    }

    public static void checkVictor() {

    }

    public static void formTeams() {

    }

    public static void procStatus(Character character) {

    }

    public static void findNextTurn() {

    }
}
