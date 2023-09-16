package TechnoHacks;

import java.util.*;

public class RandomPassword {
	public static void main(String[] args) {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String specialchar = "!@#$%^&*";
		String num = "0123456789";
		String combination = upper + lower + specialchar + num;
		int len = 8;
		char[] password = new char[len];
		Random r = new Random();
		for(int i=0;i<len;i++) {
			password[i]=combination.charAt(r.nextInt(combination.length()));
		}
		System.out.println("Generated Password is :-"+ new String(password));
	}

}
