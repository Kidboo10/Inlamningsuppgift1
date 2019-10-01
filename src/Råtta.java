import javax.swing.*;

public class Råtta extends Djur {
    public Råtta(String namn, double vikt) {
        super(namn, vikt);
    }
    @Override
    public void äta() {
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                + HealthyDjurHotell.decimal.format(getVikt() / Djurfoder.RÅTTA.getPortion())
                + "gram " + Djurfoder.RÅTTA.getFoderNamn(), "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }
}
