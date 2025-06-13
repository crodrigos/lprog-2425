package org.lprog.ui.utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Objects;

/**
 * @author Rodrigo Santos
 */
public class ConsoleUtils {

    public static final int EXIT_OPTION = -1;
    public static String DEFAULT_MENU_SEPARATOR = "=======================";
    public static String DEFAULT_SELECTION_PROMPT = "Type your option: ";

    public static List<String> CONFIRM_OPTIONS =     Arrays.asList("s", "sim", "y", "yes");
    public static List<String> NON_CONFIRM_OPTIONS = Arrays.asList("n", "nao", "no");

    static public String readLineFromConsole(String prompt) {
        try
        {
            System.out.println("\n" + prompt);
            InputStreamReader converter = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(converter);
            return in.readLine();
        } catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    static public int readIntegerFromConsole(String prompt) {
        do
        {
            try
            {
                String input = readLineFromConsole(prompt);
                int value = Integer.parseInt(input);
                return value;
            } catch (NumberFormatException ex)
            {
                System.out.println("Not a valid number");
            }
        } while (true);
    }

    static public double readDoubleFromConsole(String prompt) {
        do
        {
            try
            {
                String input = readLineFromConsole(prompt);

                double value = Double.parseDouble(input);

                return value;
            } catch (NumberFormatException ex)
            {
                printError("Not a valid number");
            }
        } while (true);
    }

    static public Date readDateFromConsole(String prompt) {
        do {
            try
            {
                String strDate = readLineFromConsole(prompt);

                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");

                Date date = df.parse(strDate);

                return date;
            } catch (ParseException ex)
            {
                printError("Not a valid date format");
            }
        } while (true);
    }

    public static void printMessage(String message) {
        System.out.println(
                ColorText(message, ConsoleColors.GREEN)
        );
    }

    public static void printMessageWithColor(String message,String color) {
        System.out.println(ColorText(message, color));
    }

    public static void printError(String message) {
        System.out.println(
                ColorText("ERROR: ", ConsoleColors.RED_BOLD) +
                        ColorText(message, ConsoleColors.RED)
        );
    }

    static public boolean confirm(String message) {
        String input;
        boolean cont = true;
        do {
            input = ConsoleUtils.readLineFromConsole("\n" + message + " (Y/N)");
            input = input.toLowerCase();
            try {
                if (CONFIRM_OPTIONS.contains(Objects.requireNonNull(input)) || NON_CONFIRM_OPTIONS.contains(Objects.requireNonNull(input))) {
                    cont = false;
                }
                else {
                    cont = true;
                    System.out.println("Not an valid option");
                }
            } catch (NullPointerException e) {
                printError("Not a valid option");
            }

        } while (cont);

        if (CONFIRM_OPTIONS.contains(Objects.requireNonNull(input))) {
            return true;
        }
        else {
            return false;
        }
    }

    static public Object showAndSelectOne(List list, String header) {
        showList(list,header);
        return selectsObject(list, DEFAULT_SELECTION_PROMPT);
    }
    static public Object showAndSelectOne(List list, String header, String selectionPrompt) {
        showList(list,header);
        return selectsObject(list,selectionPrompt);
    }

    /**
     *
     *
     * @param list List of objects,
     * @param header Prompt that will appear before the list
     * @return a integer, -1 if it is the exit option
     */
    static public int showAndSelectIndex(List list, String header) {
        showList(list,header);
        return selectsIndex(list, DEFAULT_SELECTION_PROMPT);
    }

    static public int showAndSelectIndex(List list, String header, String selectionPrompt) {
        showList(list,header);
        return selectsIndex(list, selectionPrompt);
    }

    static public void showList(List list, String header) {
        System.out.println(ConsoleColors.GREEN_BOLD  + header + ConsoleColors.RESET);
        int index = 0;
        for (Object o : list)
        {
            index++;
            System.out.println(ConsoleColors.GREEN_BOLD + index + ConsoleColors.RESET + " - " + o.toString());
        }
        System.out.println(ConsoleColors.GREEN_BOLD + "0" + ConsoleColors.RESET + " - Exit");
    }

    public static String ColorText(String message, String color)  {
        return color + message + ConsoleColors.RESET;
    }

    static public Object selectsObject(List list, String selectionPrompt) {
        String input;
        Integer value;
        do
        {
            input = ConsoleUtils.readLineFromConsole(selectionPrompt);
            value =  Integer.valueOf(input);
        } while (value < 0 || value > list.size());

        if (value == 0)
        {
            return null;
        } else
        {
            return list.get(value - 1);
        }
    }

    static public int selectsIndex(List list, String selectionPrompt) {
        String input;
        Integer value;
        do
        {
            Scanner sc = new Scanner(System.in);
            System.out.printf("\nType your option: ");
            input = sc.nextLine().trim();
            if (input.matches("[a-z A-Z]+")) {
                input = "-1";
            }
            try {
                value =  Integer.valueOf(input);
            }
            catch (NumberFormatException e) {
                value = -1;
            }
            if (value < 0 || value > list.size()) {
                System.out.println("Not a valid option");
            }
        } while (value < 0 || value > list.size());

        return value-1;
    }

    public static void showAndSelectMenu(List<MenuOption> menuOptions, String menuTitle) {
        showAndSelectMenu(menuOptions, menuTitle, DEFAULT_MENU_SEPARATOR);
    }

    public static void showAndSelectMenu(List<MenuOption> menuOptions, String menuTitle, String menuSeparator) {
        int choice = -2;
        while (choice!=-1) {
            System.out.println(ColorText("\n" + menuSeparator, ConsoleColors.GREEN_BOLD));
            choice = ConsoleUtils.showAndSelectIndex(menuOptions.stream().map(mo -> {
                return mo.getHeader();
            }).toList(), menuTitle);
            if (choice!=-1) {
                menuOptions.get(choice).getRunnable().run();
            }
        }
    }
}