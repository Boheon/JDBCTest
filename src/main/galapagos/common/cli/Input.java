package main.galapagos.common.cli;

import java.util.Scanner;

public class Input {
    static Scanner sc = new Scanner(System.in);

    // Facade Pattern
    public static String read(String title) {
        System.out.print(title);
        return sc.nextLine();
    }

    public static String read(String title, String defaultValue){
        String answer = sc.next();
        System.out.printf("%s(%s)", title, defaultValue);

        return answer.isEmpty() ? defaultValue : answer;

    }

    public static int readInt(String title) {
        System.out.print(title);
        int answer = sc.nextInt();
        return answer;
    }

    public static boolean confirm(String title, boolean defaultValue){
        String yn = defaultValue ? "(Y.N)" : "(y/N)";
        System.out.printf("%s (%s) : ", title, yn);

        String answer = sc.nextLine();
        if(answer.isEmpty()) return defaultValue;

        return answer.equalsIgnoreCase("y");

    }

    public static boolean confirm(String title){
        return confirm(title, true);
    }
}
