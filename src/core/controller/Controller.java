package core.controller;

import java.util.InputMismatchException;

import core.controller.model.shape.*;
import core.view.Lecture;
import core.view.Lire;

public class Controller {
	private Lire reader;
	
	public Controller() {
		reader = new Lire();
	}
	
	public void lancer() {
		int choice;
		try {
			Lecture.menu();
			choice = reader.lireInt();
			switch(choice) {
				case 1 :{
					Lecture.viewer("Veuillez entrer l'expression");
					String exp = reader.lireExpression();
					Expression.expressionIn.setValues(exp);
					try {
						Lecture.viewer(Expression.expressionIn.getValues()+ " = "+Expression.expressionIn.correctResul());
					}
					catch(NumberFormatException e) {
						Lecture.viewer("Veuillez entrer une expression valide");
					}
				}break;
				
				case 2:{
					polygon();
				}break;
				
				default:{
					Lecture.viewer("Mauvais choix");
				}
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Mauvais saisi");
			reader.nextLine();
		}
		
		
		
		try {
			Lecture.viewer("Presser 1 pour continuer");
			choice = reader.lireInt();
			if(choice == 1) {
				lancer();
			}
			else {
				Lecture.viewer("programme terminer...");
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Programme terminer");
		}
		
	}
	
	public void polygon() {
		int choice;
		try {
			Lecture.displayPolygon();
			choice = reader.lireInt();
			switch(choice) {
				case 1 :{
					ControRectangle();
				}break;
				
				case 2:{
					carre();
				}break;
				
				case 3:{
					triangle();
				}break;
				
				default:{
					Lecture.viewer("Mauvais choix");
				}break;
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Mauvais saisi");
			reader.nextLine();
		}
	}
	
	public void ControRectangle() {
		int choice;
		try {
			Lecture.displayOperator();
			choice = reader.lireInt();
			switch(choice) {
				case 1 :{
					Lecture.viewer("Entrer la longueur");
					double L = reader.lireDouble();
					Lecture.viewer("Entrer la largeur");
					double l = reader.lireDouble();
					Lecture.viewer("Le perimetre du rectangle est : "+Rectangle.perimeter(L,l));
				}break;
				
				case 2:{ 
					Lecture.viewer("Entrer la longueur");
					double L = reader.lireDouble();
					Lecture.viewer("Entrer la largeur");
					double l = reader.lireDouble();
					Lecture.viewer("La surface du rectangle est : "+Rectangle.surface(L,l));
				}break;
				
				default:{
					Lecture.viewer("Mauvais choix");
				}
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Mauvais saisi");
			reader.nextLine();
		}
		
	}
	
	public void carre() {
		int choice;
		try {
			Lecture.displayOperator();
			choice = reader.lireInt();
			switch(choice) {
				case 1 :{
					Lecture.viewer("Entrer le cote du carre");
					double c = reader.lireDouble();
					Lecture.viewer("Le perimetre du carre est : "+Square.perimeter(c));
				}break;
				
				case 2:{ 
					Lecture.viewer("Entrer le cote du carrer");
					double c = reader.lireDouble();
					Lecture.viewer("La surface du carre est : "+Square.surface(c));
				}break;
				
				default:{
					Lecture.viewer("Mauvais choix");
				}
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Mauvais saisi");
			reader.nextLine();
		}
	}
	
	public void triangle() {
		int choice;
		try {
			Lecture.displayOperator();
			choice = reader.lireInt();
			switch(choice) {
				case 1 :{
					Lecture.viewer("Entrer le cote 1");
					double c1 = reader.lireDouble();
					Lecture.viewer("Entrer le cote 2");
					double c2 = reader.lireDouble();
					Lecture.viewer("Entrer le cote 3");
					double c3 = reader.lireDouble();
					Lecture.viewer("Le perimetre du triangle est : "+Triangle.perimeter(c1,c2,c3));
				}break;
				
				case 2:{ 
					Lecture.viewer("Entrer la hauteur");
					double h = reader.lireDouble();
					Lecture.viewer("Entrer la base");
					double b = reader.lireDouble();
					Lecture.viewer("La surface du triangle est : "+Triangle.surface(h,b));
				}break;
				
				default:{
					Lecture.viewer("Mauvais choix");
				}
			}
		}
		catch(InputMismatchException e) {
			Lecture.viewer("Mauvais saisi");
			reader.nextLine();
		}
	}
}