
package com.karpenko;

/**
 * @author Nestea
 *
 */

import java.io.*;
import java.util.Scanner; 

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		//создание цепи потоков с потоком вывода объекта в конце
		Scanner scan = new Scanner(System.in);
		System.out.println("Vvedite CPU: ");
		double cpu = scan.nextDouble();
		System.out.println("Vvedite Memory: ");
		double memory = scan.nextDouble();
		System.out.println("Vvedite Video Card: ");
		double videoCard = scan.nextDouble();
		scan.close();
		
		Comp compik = new Comp(cpu, memory, videoCard);
		//создание цепи потоков с потоком вывода объекта в конце
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file1.txt"));
	    out.writeObject(compik);
		out.flush();
		out.close();
		
		ObjectInputStream in =  new ObjectInputStream (new FileInputStream("file1.txt"));
		Comp computer = (Comp)in.readObject();
		System.out.println(computer.toString());
		in.close();


    }

}
