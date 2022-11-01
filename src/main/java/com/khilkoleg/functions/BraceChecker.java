package com.khilkoleg.functions;

import java.util.Stack;

/**
 * @author Oleg Khilko
 */

public class BraceChecker {
    public static boolean isValid(String braces) {
        var chars = braces.toCharArray();
        var stack = new Stack<>();
        boolean validParentheses = false;

        for (char brace : chars) {
            if (stack.isEmpty()
                    && (brace == (']') | brace == (')') | brace == ('}')))
                return false;

            stack.push(brace);

            if (!stack.isEmpty() && stack.contains('[') & brace == (']')) {
                stack.pop();
                stack.pop();
            }

            if (!stack.isEmpty() && stack.contains('(') & brace == (')')) {
                stack.pop();
                stack.pop();
            }

            if (!stack.isEmpty() && stack.contains('{') & brace == ('}')) {
                stack.pop();
                stack.pop();
            }
        }

        if (stack.isEmpty())
            validParentheses = true;

        return validParentheses;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("([{}])"));
        System.out.println(isValid("(}"));
        System.out.println(isValid("[(])"));
        System.out.println(isValid("[({})](]"));
        System.out.println(isValid("(})"));
    }
}