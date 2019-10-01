import javax.swing.*;

public class Orm extends Djur {

    public Orm(String namn, double vikt) {
        super(namn, vikt);
    }

    @Override
    public void äta() {
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                        + Djurfoder.ORM.getPortion() + "gram " + Djurfoder.ORM.getFoderNamn()
                , "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String toString() {
        return getNamn();
    }
}
