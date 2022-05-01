package main;

import java.util.Scanner;

import model.LinkList;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static LinkList list = new LinkList();
	
	public static void main(String[] args) {
		System.out.println("Selecciona la opcion:\n");
		System.out.println("1. Dar turno\n");
		System.out.println("2. Mostrar turno\n");
		System.out.println("3. Pasar turno\n");
		System.out.println("4. Eliminar turno actual\n");
		int op = -1;
		while(op!=0) {
			op=showMenu();
			selection(op);
		}
	}

	private static void selection(int num) {
		switch(num) {
			case 1:
				give();
				break;
			case 2:
				show();
				break;
			case 3:
				pass();
				break;
			case 4:
				delete();
				break;
		}
		
	}

	private static void give() {
		list.add();
		System.out.println("El turno se ha asignado\n");
	}

	private static void show() {
		System.out.println("El turno siguiente es \n");
		list.print();
		
	}

	private static void pass() {
		System.out.println("El turno se ha pasado a la cola \n");
		list.pass();
	}

	private static void delete() {
		boolean del = list.delete();
		
		if(del) {
			System.out.println("Se borro exitosamente\n");
		}else {
			System.out.println("No se ha podido borrar\n");
		}
		
	}

	private static int showMenu() {
		int out = sc.nextInt();
		sc.nextLine();
		while(out>4||out<1) {
			System.out.println("Opcion no valida, digita una opcion valida");
			out=sc.nextInt();
			sc.nextLine();
		}
		return out;
	}

}
