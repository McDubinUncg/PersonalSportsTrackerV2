
package com.csc340sp23.PST;


import java.util.ArrayList;
import java.util.Scanner;

public class FavoriteTeams {
    private ArrayList<String> teams = new ArrayList<String>();

    public void addTeam(String team) {
        teams.add(team);
    }

    public void removeTeam(String team) {
        teams.remove(team);
    }

    public ArrayList<String> searchTeams(String query) {
        ArrayList<String> result = new ArrayList<String>();
        for (String team : teams) {
            if (team.toLowerCase().contains(query.toLowerCase())) {
                result.add(team);
            }
        }
        return result;
    }

    public void displayTeams() {
        System.out.println("My Favorite Teams:");
        for (String team : teams) {
            System.out.println("- " + team);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FavoriteTeams myTeams = new FavoriteTeams();

        while (true) {
            System.out.println("Enter a command (add, remove, search, display, or quit):");
            String command = scanner.nextLine();
            if (command.equals("add")) {
                System.out.println("Enter the name of the team to add:");
                String team = scanner.nextLine();
                myTeams.addTeam(team);
            } else if (command.equals("remove")) {
                System.out.println("Enter the name of the team to remove:");
                String team = scanner.nextLine();
                myTeams.removeTeam(team);
            } else if (command.equals("search")) {
                System.out.println("Enter a search query:");
                String query = scanner.nextLine();
                ArrayList<String> result = myTeams.searchTeams(query);
                System.out.println("Search results:");
                for (String team : result) {
                    System.out.println("- " + team);
                }
            } else if (command.equals("display")) {
                myTeams.displayTeams();
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }
        scanner.close();
    }
}

