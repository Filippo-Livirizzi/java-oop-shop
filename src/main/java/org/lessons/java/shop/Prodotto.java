package org.lessons.java.shop;

/**
 * 
Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva V
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
- alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random V
- il codice prodotto sia accessibile solo in lettura V
- gli altri attributi siano accessibili sia in lettura che in scrittura V
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

 */
import java.util.Random;
public class Prodotto  {
	private int code;
	private String name;
	private String descrizione;
	private double prezzo;
	private double iva;
	
//metodo per generare numeri random
	private int codeGenerator() {
		Random number = new Random();
		return number.nextInt(1001);
	}

//costruttore
public Prodotto (String name, String descrizione, double prezzo, double iva ) {
	//inizializzazione
	this.name = name;
	this.descrizione = descrizione;
	this.iva = iva;
	this.prezzo = prezzo;
	this.code = codeGenerator();
}

public int getCode() {
    return code;
}

// Metodi getter e setter per gli altri attributi
public String getNome() {
    return name;
}

public void setNome(String nome) {
    this.name = nome;
}

public String getDescrizione() {
    return descrizione;
}

public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
}

public double getPrezzo() {
    return prezzo;
}

public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
}

public double getPrezzoBase() {
    return prezzo;
}

public double getPrezzoIva() {
	return prezzo * (1+iva);
}

public String NomeEsteso() {
	return name + " " + iva;
}

public double getIva() {
    return iva;
}

public void setIva(double iva) {
    this.iva = iva;
}

}