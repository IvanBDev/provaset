package it.prova.provaset.test;

import java.util.HashSet;
import it.prova.provaset.model.ProvaSet;

public class TestProvaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<ProvaSet> pointsSet = new HashSet<ProvaSet>();
		ProvaSet p1 = new ProvaSet(1, 2);
		pointsSet.add(p1);
		pointsSet.add(p1);
		System.out.println("Prova, aggiungo elemento in Set duplicato:");
		for (ProvaSet point : pointsSet) {
			System.out.println(point.getX() + "-" + point.getY());
		}
		ProvaSet p2 = new ProvaSet(1, 3);
		pointsSet.add(p2);
		System.out.println("Prova, aggiungo elemento in Set distinto:");
		for (ProvaSet point : pointsSet) {
			System.out.println(point.getX() + "-" + point.getY());
		}
	}

}
