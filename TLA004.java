

package com.mycompany.tla004;

import java.util.Scanner;
import java.util.Stack;
public class TLA004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> actions = new Stack<>();

        while (true) {
            System.out.print("Enter an action (type 'undo' to undo, 'exit' to stop): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("undo")) {
                if (!actions.isEmpty()) {
                    String undone = actions.pop();
                    System.out.println("You undid \"" + undone + "\" (typed undo)");
                } else {
                    System.out.println("Nothing to undo.");
                }
            } else {
                actions.push(input);
                System.out.println("You " + input + " (typed " + input + ")");
            }
        }
    }
}
