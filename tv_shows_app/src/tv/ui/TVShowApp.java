package tv.ui;

import java.awt.DisplayMode;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TVShowApp {
	private static ShowDB showDB = new ShowDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the TV Show DB App");

		String command = "";
		while (!command.equalsIgnoreCase("3")) {
			displayMenu();
			command = Console.getString("Enter command: ");
			if (command.equals("1")) {
				List<Show> shows = showDB.getAll();
				for (Show s : shows) {
					System.out.println(s);
				}
			}
			else if (!command.equals("3")) {
				System.out.println("Invalid command. Try again.");
			}
		}

		System.out.println("bye");

	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder();
		sb.append("COMMAND MENU");
		sb.append("1 - List TV Shows");
		sb.append("3 - Exit");
		System.out.println(sb);
	}
}
