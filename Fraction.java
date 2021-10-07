public class Fraction {
    private int teller;
    private int nevner;
    private String resultat;

    public Fraction(int teller){
        this.teller = teller;
        this.nevner = 1;
    }

    public Fraction(int teller, int nevner1){
        if (nevner1 == 0) {
                throw new IllegalArgumentException("Nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner1;
    }
    
    public int getTeller(){
        return teller;
    }

    public int getNevner(){
        return nevner;
    }

    public void multiplisere(Fraction fraction){
        int resultatTeller = this.teller * fraction.teller;
        int resultatNevner = this.nevner * fraction.nevner;
        resultat = (this.teller+"/"+this.nevner+" * "+fraction.teller+"/"+fraction.nevner+" = "+resultatTeller+"/"+resultatNevner);

    }

    public void dividere(Fraction fraction){
        int resultatTeller = this.teller * fraction.nevner;
        int resultatNevner = this.nevner * fraction.teller;
        resultat = (this.teller+"/"+this.nevner+" / "+fraction.teller+"/"+fraction.nevner+" = "+resultatTeller+"/"+resultatNevner);

    }
    
    public void addere(Fraction fraction){
        int resultatTeller = (this.teller * fraction.nevner) + (fraction.teller * this.nevner);
        int resultatNevner = this.nevner * fraction.nevner;
        resultat = (this.teller+"/"+this.nevner+" + "+fraction.teller+"/"+fraction.nevner+" = "+resultatTeller+"/"+resultatNevner);

    }

    public void subtrahere(Fraction fraction){
        int resultatTeller = (this.teller * fraction.nevner) - (fraction.teller * this.nevner);
        int resultatNevner = this.nevner * fraction.nevner;
        resultat = (this.teller+"/"+this.nevner+" - "+fraction.teller+"/"+fraction.nevner+" = "+resultatTeller+"/"+resultatNevner);

    }

    public void printResultat(){
        System.out.println(resultat);
    }
    public static void main(String[] args) {
        Fraction a = new Fraction(5, 4);
        Fraction b = new Fraction(8, 2);

        a.multiplisere(b);
        a.printResultat();
        
        a.dividere(b);
        a.printResultat();

        a.addere(b);
        a.printResultat();

        a.subtrahere(b);
        a.printResultat();


        
    }
    
}
