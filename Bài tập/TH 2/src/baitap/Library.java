package baitap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private static int MAX = 100;

    public static void main(String[] args) {
        String[] title_name = new String[MAX];

        // Some example
        title_name = new String[]{"Book_name1", "Booke_name2", "Book_name3"};

        Scanner sc = new Scanner(System.in);

        int select;
        do {
            System.out.println("\n========Main Menu========\n"
                    + "1. Show library information\n"
                    + "2. Add new book\n"
                    + "3. Find book\n"
                    + "4. Exit\n"
                    + "=========================");
            System.out.print("Enter menu ID (1-4):");
            select = sc.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Library Information");
                    showLI(title_name);
                    break;
                case 2:
                    System.out.print("Enter new bookname: ");
                    String bookName = sc.next();
                    if (findBook(title_name, bookName))
                        System.out.println("Book have exits, enter other bookname");
                    else if (addNewBook(title_name, bookName) == null)
                        System.out.println("Add newbook failed, exceeded quantity!");
                    else
                        title_name = addNewBook(title_name, bookName);
                    break;
                case 3:
                    System.out.print("Enter your String you want find: ");
                    String scanStr = sc.next();
                    scanBook(title_name, scanStr);

                    break;
                case 4:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Try again!");
            }

        } while (select != 4);

        System.exit(0);
    }

    public static void showLI(String[] title_name) {
        for (int i = 0; i < title_name.length; i++) {
            System.out.println(i + 1 + ". " + title_name[i]);
        }
    }

    public static String[] addNewBook(String[] title_name, String bookName) {
        if (title_name.length >= MAX)
            return null;
        else {
            ArrayList<String> myList = new ArrayList<>(Arrays.asList(title_name));
            myList.add(bookName);
            title_name = myList.toArray(title_name);
        }
        return title_name;
    }

    public static boolean findBook(String[] title_name, String bookName) {
        for (int i = 0; i < title_name.length; i++) {
            if (title_name[i].equalsIgnoreCase(bookName))
                return true;
        }
        return false;
    }

    public static void scanBook(String[] title_name, String scanStr) {
        int check = 0;
        for (int i = 0; i < title_name.length; i++) {
            if (title_name[i].contains(scanStr)) {
                System.out.println(title_name[i]);
                check = 1;
            }
        }
        if (check == 0) {
            System.out.println("Do not exits");
        }
    }
}
