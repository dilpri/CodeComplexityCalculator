/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.CodeComplexityCalculator;

/**
 *
 * @author DELL
 */
public class CheckInsideBracketsCS {
    private String string;

    public CheckInsideBracketsCS(String input) {
        this.string = input;
    }

    public String getRound() {

        StackCS stack1 = new StackCS(string.length());
        StackCS stack2 = new StackCS(string.length());

        String output = " ";
        char get = ' ';

        char[] toChar = string.toCharArray();

        for (int i = 0; i < string.length(); ++i) {
            if (toChar[i] == '(') {
                stack1.push(toChar[i]);
            } else if (toChar[i] == ')') {
                get = stack1.pop();
            }

            if (!stack1.isEmpty()) {
                stack2.push(toChar[i]);
            }
            if (stack1.isEmpty() && get == '(') {
                break;
            }
        }

        while (!stack2.isEmpty()) {
            output = output + stack2.pop();
        }

        output = new StringBuilder(output).reverse().toString();
        return output;
    }

    public String getCurly() {

        StackCS stack1 = new StackCS(string.length());
        StackCS stack2 = new StackCS(string.length());

        String output = " ";
        char get = ' ';

        char[] toChar = string.toCharArray();

        for (int i = 0; i < string.length(); ++i) {
            if (toChar[i] == '{') {
                stack1.push(toChar[i]);
            } else if (toChar[i] == '}') {
                get = stack1.pop();
            }

            if (!stack1.isEmpty()) {
                stack2.push(toChar[i]);
            }
            if (stack1.isEmpty() && get == '{') {
                break;
            }
        }

        while (!stack2.isEmpty()) {
            output = output + stack2.pop();
        }

        output = new StringBuilder(output).reverse().toString();

        return output;
    }
}
