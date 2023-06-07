package dev.normanpendzich.hilfe.model;

public class Frage {
	private String text;
	private String[] antworten;
	
	public Frage(String text, String[] antworten) {
		this.text=text;
		this.antworten = antworten;
	}

	public String getText() {
		return text;
	}

	public String[] getAntworten() {
		return antworten;
	}
	
}
