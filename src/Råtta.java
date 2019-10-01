import javax.swing.*;

public class Råtta extends Djur {
    public Råtta(String namn, double vikt) {
        super(namn, vikt);
    }
    @Override
    public void eat() {
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                + HealthyDjurHotell.decimal.format(getVikt() / Djurfoder.RÅTTA.getPortion())
                + "gram " + Djurfoder.RÅTTA.getFoderTyp(), "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }
}
