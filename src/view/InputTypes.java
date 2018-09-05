package view;

import java.util.Scanner;

public class InputTypes {
	public static int readInt(String msg, Scanner scanner) {
		int valor = 0;
		while(true) {
		try {
			System.out.println(msg);
			valor = scanner.nextInt();	
			break;
			}
		
	 catch(java.util.InputMismatchException e) {
		System.out.println("debe ingresar valores numericos!");
		scanner.nextLine();
	}

}return valor;
}
	public static double readDouble(String msg, Scanner scanner) {
		double valor = 0;
		while(true) {
		try {
			System.out.println(msg);
			valor = scanner.nextDouble();	
			break;
			}
		
	 catch(java.util.InputMismatchException e) {
		System.out.println("debe ingresar valores numericos!");
		scanner.nextLine();
	}
}return valor;
	}
	public static String readString(String msg, Scanner scanner) {
		System.out.println(msg);
		String valor = scanner.next();
		scanner.nextLine();
		return valor;
	}
}
