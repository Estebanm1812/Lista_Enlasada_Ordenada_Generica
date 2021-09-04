package ui;
import java.util.Scanner;

import model.Tema;
public class Main {

	static Tema<Integer> first;
	
	static Scanner sc = new Scanner(System.in);	


	public static void main(String[] args) {
	
		int option = 0;		
		
		do {
			option = showMenu();
			executeMenu(option);
			
		}while(option!=3);
		
		
	}
	
	public static int showMenu() {
		
		int option = 0;
		
		System.out.println("Eliga una opcion: \n" + "1)Para agregar un valor a la lista\n" + "2) Para mostrar la lista\n" + "3) Finalizar el programa");
		
		option = sc.nextInt();
		
		sc.nextLine();
		
		return option;
	}
	public static void executeMenu(int option) {
		
		switch(option) {
		
		case 1: 
		System.out.println("Ingrese el valor a agregar");
		int number = sc.nextInt();
		sc.nextLine();
		addTema(number);
		break;
		case 2:
		System.out.println(getNumbers());
		break;
			
		}
		
		
	}
	
	
	
	public static void addTema(int number) {
		
		Tema<Integer> toAdd = new Tema<Integer>(number);
		
		if(first == null) {
			
			first = toAdd;
			
		}else {
			
			if(number<first.getNumber()) {
				
				Tema<Integer> tmp = first;
				first = toAdd;
				first.setNext(tmp);
			}else {
				
				AddTema(toAdd, first);				
			}
			
		}
		
		
	}
	public static void AddTema(Tema<Integer> toAdd, Tema<Integer> current) {
		

		if(current.getNumber()>toAdd.getNumber()) {
				
			Tema<Integer> tmp = current;
			current = toAdd;
			current.setNext(tmp);
			
			
		}else {
			
			if(current.getNext()==null) {
				current.setNext(toAdd);
				
			}else {
			AddTema(toAdd, current.getNext());
			}
		}
		
		
	}
	public static String getNumbers() {
		
		String list = "";
		
		if(first == null) {
			list = "No se han añadido elementos a la lista"; 
		}else {
			
			Tema<Integer> tmp = first.getNext();
			
			list = first.getNumber().toString();
			if(first.getNext()==null) {
			 return list;
			}else {
				System.out.println("Entra 2 con valor de: " + tmp.getNumber());
			
			while(tmp!=null) {
						
			list+= ", " + tmp.getNumber().toString();
			
			Tema<Integer> tmp2 = tmp;
			tmp = tmp2.getNext();
				
			}
			}
		}
		
		
		return list;
	}

}
