import javax.swing.*;

public class Katt extends Djur {

    public Katt(String namn, double vikt) {
        super(namn, vikt);

    }

    @Override
    public void eat() {
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                + HealthyDjurHotell.decimal.format(getVikt() / Djurfoder.KATT.getPortion())
                + "gram " + Djurfoder.KATT.getFoderTyp(), "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return getNamn();
    }
}
