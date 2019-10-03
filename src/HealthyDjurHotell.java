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
        List<Djur> djurLista = new LinkedList<>();

       try {
            Djur h1 = new Hund("Sixten", 5000);
            Djur h2 = new Hund("Dogge", 10000);
            Djur k1 = new Katt("Venus", 5000);
            Djur k2 = new Katt("Ove", 3000);
            Djur o1 = new Orm("Hypno", 1000);
            Djur r1 = new Råtta("Musse", 1000);


            djurLista.add(h1);
            djurLista.add(h2);
            djurLista.add(k1);
            djurLista.add(k2);
            djurLista.add(o1);
            djurLista.add(r1);

       }catch(IllegalArgumentException e){
           e.printStackTrace();
           System.exit(0);
       }

            while (true) { // Start för programmet
                boolean djurFinns = false;
                String vem = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?"
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
                    for (Djur djur : djurLista) {
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
    }
}


