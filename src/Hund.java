import javax.swing.*;
// Hund klass som ärver superklassen djur
public class Hund extends Djur {

    public Hund(String namn, double vikt) {
        super(namn, vikt);
    }
    @Override //override metoden (Polymorfism) som implementeras av superklassen med interface Iäta
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
