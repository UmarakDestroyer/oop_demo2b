class Pelaaja {
    private String nimi;
    private int pelinumero;
    private int maalit;
    private int syotot;

    /**
     * Konstruktori luo uuden Pelaaja-olion
     *
     * @param nimi pelaajan nimi
     * @param pelinumero pelaajan pelinumero
     * @param maalit pelaajan maalien määrä
     * @param syotot pelaajan syöttöjen määrä
     *
     */
    public Pelaaja(String nimi, int pelinumero, int maalit, int syotot){
	    this.nimi = nimi;
	    this.pelinumero = pelinumero;
	    this.maalit = maalit;
	    this.syotot = syotot;
    }
    /**
     * Konstruktori luo uuden Pelaaja-olion. Pelaajan maalien ja
     * syöttöjen määräksi tulee 0.
     *
     * @param nimi pelaajan nimi
     * @param pelinumero pelaajan pelinumero
     *
     */
    public Pelaaja(String nimi, int pelinumero){
	    this.nimi = nimi;
	    this.pelinumero = pelinumero;
	    this.maalit = 0;
	    this.syotot = 0;
    }

    /**
     * Metodi palauttaa pelaajan nimen
     * @return pelaajan nimen
     */
    public String getNimi(){
	    return this.nimi;
    }

    /**
     * Metodi palauttaa pelaajan pelinumeron
     * @return pelaajan pelinumeron
     */
    public int getPelinumero(){
	    return this.pelinumero;
    }

    /**
     * Metodi lisää pelaajalle yhden tehdyn maalin
     */
    public void lisaaMaali(){
	    this.maalit+=1;
    }

    /**
     * Metodi lisää pelaajalle yhden syötön
     */
    public void lisaaSyotto(){
	    this.syotot+=1;
    }

    /**
     * Palauttaa pelaajan pisteiden määrän. Pisteisiin lasketaan
     * yhteen sekä maalit että syötöt.
     *
     * @return tiedon pelaajan pisteistä
     */
    public int pisteet(){
	    return this.syotot+this.maalit;
    }

    /**
     * Palauttaa pelaajan tiedot merkkijonona alla olevan esimerkin
     * mukaisesti. Esimerkissä pelaajan nimi on "Pekka Pelaaja", hänen
     * pelinumeronsa on 8 ja hänellä on 1 maali ja 3 syöttöä.
     *
     * 8. Pekka Pelaaja (1 + 3 = 4)
     */
    @Override
    public String toString(){
	    return Integer.toString(this.pelinumero)+". " + this.nimi + " (" + Integer.toString(this.maalit) + " + " + Integer.toString(this.syotot) + " = " + Integer.toString((this.maalit+this.syotot)) + ")" ;
    }
}
