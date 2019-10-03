import javax.swing.*;

public class Katt extends Djur {

    public Katt(String namn, double vikt) {
        super(namn, vikt);

    }

    @Override //override metoden (Polymorfism) som implementeras av superklassen med interface Iäta
    public void äta() {

        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                + HealthyDjurHotell.decimal.format(getVikt() / Djurfoder.KATT.getPortion())
                + "gram " + Djurfoder.KATT.getFoderNamn(), "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return getNamn();
    }
}
