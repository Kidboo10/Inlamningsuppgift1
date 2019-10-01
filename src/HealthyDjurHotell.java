import javax.swing.*;
import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
//Huvudprogram
public class HealthyDjurHotell {
        //För att visa två decimaler kallas 'decimal'
    public static DecimalFormat decimal = new DecimalFormat("#.##");
    //konstruktor för HealthyDjurHotell
    public HealthyDjurHotell(){
        //Enkel form av databas
        List<Djur> namnLista = new LinkedList<>();
        try {
            Djur h1 = new Hund("Sixten", 5000);
            Djur h2 = new Hund("Dogge", 10000);
            Djur k1 = new Katt("Venus", 5000);
            Djur k2 = new Katt("Ove", 3000);
            Djur o1 = new Orm("Hypno", 1000);
            Djur r1 = new Råtta("Musse", 1000);

            namnLista.add(h1);
            namnLista.add(h2);
            namnLista.add(k1);
            namnLista.add(k2);
            namnLista.add(o1);
            namnLista.add(r1);

            while (true) { // Start för programmet
                boolean djurFinns = false;
                String vem = JOptionPane.showInputDialog(null, "Vem vill du mata?"
                        , "HealthyDjurHotell", JOptionPane.QUESTION_MESSAGE);
                if (vem == null) {
                    JOptionPane.showMessageDialog(null, "Du har avslutat programmet."
                            , "HealthyDjurHotell", JOptionPane.INFORMATION_MESSAGE);
                    break;
                } else if (vem.isEmpty())
                    JOptionPane.showMessageDialog(null, "Du måste ange ett namn."
                            , "HealthyDjurHotell", JOptionPane.ERROR_MESSAGE);
                else {
                    //Polymorfism
                    for (Djur djur : namnLista) {
                        if (vem.equalsIgnoreCase(djur.getNamn())) {
                            djur.äta();
                            djurFinns = true;
                        }
                    }
                    if (!djurFinns)
                        JOptionPane.showMessageDialog(null, vem + " finns inte på hotellet"
                                , "HealthyDjurHotell", JOptionPane.QUESTION_MESSAGE);
                }
            }
        }catch(IllegalArgumentException e){
        e.printStackTrace();
        }
    }
}


