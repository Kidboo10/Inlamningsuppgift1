//abstrakt klass för att inte kunna skapa ett objekt av klassen djur
//Impementerar Iäta för att subklasserna tvingas att implementerar Iäta metoden
public abstract class Djur implements Iäta {
    private String namn;
    private double vikt;

    //Superkonstruktor som tar in två parametrar
    public Djur(String namn, double vikt) {
        this.namn = namn;
        if (vikt <= 0) // Kontroll att vikten inte är noll eller negativ
            throw new IllegalArgumentException("Djuret måste ha ett positivt värde.");
        this.vikt = vikt;
    }

    public String getNamn() {
        return namn;
    }

    public double getVikt() {
        return vikt;
    }

}
