package com.git.testing;

public class StringReverse {
public static void main(String[] args) {
	String givenString = "abcdefgh";
	StringBuffer buffer = new StringBuffer(givenString);
	System.out.println(buffer.reverse());
}
}
