package reijojy.harjoitus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Collector;

class Henkilo {
	private String nimi;
	private int eldad;
	private String yrke;
	private String sex;

	public Henkilo(String nimi, int ika, String ammatti, String sukupuoli) {
		this.nimi = nimi; eldad = ika; yrke = ammatti; sex = sukupuoli;
	}
	public String toString() {
		String sp = "Nainen";
		if (this.sex.equals("M")) sp = "Mies";
		return String.format("Nimi: %s\t Ika: %d\t Ammatti: %s\t %s", this.nimi, this.eldad, this.yrke, sp);
	}
	public String getSex() {
		return this.sex;
	}
}

public class Main {


    public static void main(String[] args) {


	    //System.out.println(String.format(template, namn, eldad, yrke));
		HaeData hd = new HaeData();
		List<Henkilo>  vlot = hd.haeData();
		if (vlot == null) {
			System.out.println("Haku ei onnistunut");
			return;
		}

		System.out.println("Kokeillaan ensimmäistä lambda funktiota");
		vlot.forEach( hlo -> {
			System.out.println(hlo.toString());
		});
		// Kokeillaan jotain uutta listilla - listataan naiset
		// Tässä ongelmia saada lambda funktio kääntäjästä läpi
		/*List<Henkilo> naiset = vlot.stream()
				.filter(hlo -> {
					return hlo.getSex().equals("F");
					        // Tämä rivi valittaa kääntäjälle
							//.collect(Collectors.toList());
				}); */

		// Kokeillaanpa map objektia


    }
}
