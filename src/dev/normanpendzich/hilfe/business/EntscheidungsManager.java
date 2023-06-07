package dev.normanpendzich.hilfe.business;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import dev.normanpendzich.hilfe.model.Frage;

public class EntscheidungsManager {
	private ArrayList<Frage> fragen=new ArrayList<>();
	private String filename="C:\\Java\\test2\\hilfe.properties";
	private Frage ausgewaehlteFrage;
	
	public EntscheidungsManager() throws Exception{
		Properties props=new Properties();
		props.load(new FileReader(filename));
		for (var p : props.entrySet()) {
			fragen.add(new Frage(p.getKey().toString(), p.getValue().toString().split(",")));
		}
	}
	public void fragenAuswaehlen(int index) {
		ausgewaehlteFrage=fragen.get(index);
	}
	public String getZufaelligeAntwort() {
		Random rnd = new Random();
		return ausgewaehlteFrage.getAntworten()[rnd.nextInt(ausgewaehlteFrage.getAntworten().length)];
	}
	public ArrayList<Frage> getFragen() {
		return fragen;
	}
	public Frage getAusgewaehlteFrage() {
		return ausgewaehlteFrage;
	}
	
	
}
