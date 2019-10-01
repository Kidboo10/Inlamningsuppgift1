public abstract class Djur implements Iäta {
    private String namn;
    private double vikt;

    public Djur(String namn, double vikt) {
        this.namn = namn;
        if (vikt <= 0)
            throw new IllegalArgumentException("Djuret måste ha ett positivt värde.");
        this.vikt = vikt;
    }

    public String getNamn() {
        return namn;
    }

    public double getVikt() {
        return vikt;
    }

    public void eat() {
        System.out.println("Djur äter");
    }
}
