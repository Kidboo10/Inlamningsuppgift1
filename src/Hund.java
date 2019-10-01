import javax.swing.*;

public class Hund extends Djur{

    public Hund(String namn, double vikt) {
        super(namn, vikt);
    }
    public void eat(){
        JOptionPane.showMessageDialog(null, getNamn() + " äter "
                            + getVikt()/Djurfoder.HUND.getPortion() + " gram "+Djurfoder.HUND.getFoderTyp()
                                    ,"HealthyDjurHotell",JOptionPane.INFORMATION_MESSAGE);
    }
    @Override
    public String toString() {
        return getNamn();
    }
}
