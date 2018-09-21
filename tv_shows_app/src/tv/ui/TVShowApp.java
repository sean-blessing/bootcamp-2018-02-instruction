package tv.ui;

import java.awt.DisplayMode;
import java.util.List;

import tv.business.Show;
import tv.business.ShowDB;
import tv.util.Console;

public class TVShowApp {
	private static ShowDB showDB = new ShowDB();

	public static void main(String[] args) {
		System.out.println("Welcome to the TV Show DB App/n");

		String command = "";
		while (!command.equalsIgnoreCase("3")) {
			displayMenu();
			command = Console.getString("Enter command: ");
			if (command.equals("1")) {
				List<Show> shows = showDB.getAll();
				printReportHeaders();
				for (Show s : shows) {
					printReportDetail(s);
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
		sb.append("COMMAND MENU\n");
		sb.append("1 - List TV Shows\n");
		sb.append("3 - Exit\n");
		System.out.println(sb);
	}
	
	private static void printReportHeaders() {
		StringBuilder sb = new StringBuilder();
		sb.append(padReportDetail("Name",ShowDB.NAME_LENGTH));
		sb.append("  ");
		sb.append(padReportDetail("Rating",ShowDB.RATING_LENGTH));
		sb.append("  ");
		sb.append(padReportDetail("Length",ShowDB.LENGTH_LENGTH));
		sb.append("  ");
		sb.append(padReportDetail("Genre",ShowDB.GENRE_LENGTH));
		sb.append("  ");
		sb.append(padReportDetail("Network",ShowDB.NETWORK_LENGTH));
		sb.append("\n");
		sb.append(padReportDetail("",ShowDB.NAME_LENGTH, "="));
		sb.append("  ");
		sb.append(padReportDetail("",ShowDB.RATING_LENGTH, "="));
		sb.append("  ");
		sb.append(padReportDetail("",ShowDB.LENGTH_LENGTH, "="));
		sb.append("  ");
		sb.append(padReportDetail("",ShowDB.GENRE_LENGTH, "="));
		sb.append("  ");
		sb.append(padReportDetail("",ShowDB.NETWORK_LENGTH, "="));
		sb.append("\n");
		System.out.println(sb.toString());
	}
	
	private static void printReportDetail(Show s) {
		// use string builder and add 2 spaces between
		StringBuilder sb = new StringBuilder(padReportDetail(s.getName(),ShowDB.NAME_LENGTH) + " ");
		sb.append(padReportDetail(s.getRating(), ShowDB.RATING_LENGTH) + " ");
		sb.append(padReportDetail(Integer.toString(s.getLength()), ShowDB.LENGTH_LENGTH) + " ");
		sb.append(padReportDetail(s.getGenre(), ShowDB.GENRE_LENGTH) + " ");
		sb.append(padReportDetail(s.getNetwork(), ShowDB.NETWORK_LENGTH));
		System.out.println(sb.toString());
	}
	
	private static String getReportHeaders() {
		StringBuilder sb = new StringBuilder("Name");
		return sb.toString();
		
	}

	private static String padReportDetail(String val, int length) {
		return padReportDetail(val,length," ");
	}

	private static String padReportDetail(String val, int length, String padChar) {
		StringBuilder sb = new StringBuilder(val);
		while (sb.length()<length) {
			sb.append(padChar);
		}
		sb.append("  ");
		return sb.toString();
	}
}
