package dev.normanpendzich.hilfe;

import java.util.Scanner;

import dev.normanpendzich.hilfe.business.EntscheidungsManager;
import dev.normanpendzich.hilfe.model.Frage;

public class Start {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		try {
			var mgr = new EntscheidungsManager();
			int index = 0;
			for (Frage f : mgr.getFragen()) {
				System.out.printf("%d. - %s\r\n", index, f.getText());
				index++;
			}
			System.out.println("Was interessiert Dich: ");
			mgr.fragenAuswaehlen(new Scanner(System.in).nextInt());
			System.out.println(mgr.getZufaelligeAntwort());

		} catch (Exception e) {
			System.out.println("Daten nicht geladen....");
			System.out.println(e.getMessage());
		}
	}

}
