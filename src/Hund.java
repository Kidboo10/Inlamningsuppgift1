import javax.swing.*;

public class Hund extends Djur {

    public Hund(String namn, double vikt) {
        super(namn, vikt);
    }

    public void äta() {
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                        + (int)getVikt() / Djurfoder.HUND.getPortion() + " gram " + Djurfoder.HUND.getFoderNamn()
                , "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return getNamn();
    }
}
