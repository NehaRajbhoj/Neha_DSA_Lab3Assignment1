package com.greatlearning.app;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackates {

	public static void main(String[] args) {
		String expression;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the expression");
		expression = sc.next();

		if (checkExpression(expression) == true)

			System.out.println("The entered String has Balanced Brackets!!");

		else
			System.out.println("The entered String do not contain Balanced Brackets!!");

		sc.close();
	}

	static boolean checkExpression(String input) {

		Stack<Character> stack = new Stack<>();

		for (char k : input.toCharArray()) {

			if (k == '{' || k == '[' || k == '(') {
				stack.push(k);
				continue;
			}

			if (stack.isEmpty()) {

				return false;

			}

			char z;
			switch (k) {
			case '}':
				z = stack.pop();

				if (z == '[' || z == '(')
					return false;
				break;

			case ']':
				z = stack.pop();
				if (z == '{' || z == '(')
					return false;
				break;

			case ')':
				z = stack.pop();
				if (z == '{' || z == '[')
					return false;
				break;
			}

		}
		return (stack.isEmpty());

	}

}
