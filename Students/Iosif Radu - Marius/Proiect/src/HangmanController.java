import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static jdk.nashorn.internal.objects.ArrayBufferView.length;

public class HangmanController {
    private HangmanModel m_model;
    private HangmanView m_view;

    HangmanController(HangmanModel model, HangmanView view){
        m_model = model;
        m_view = view;

        view.addMultiplyListener(new MultiplyListener());
    }

    class MultiplyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String input = "";
            String output = "";

            try{
                input = m_view.getInput();
                output = m_view.getOutput();

                String[] cuvantPosibil = {"persoana", "instanta", "metoda", "implementare", "clasa", "controler"};
                Random rand = new Random();
               // int indexRandom = rand.nextInt(6);
                String cuvantAlesRandom = new String(cuvantPosibil[2]);//indexRandom]);

                int m = length(cuvantAlesRandom);

                for (int i = 0; i < m; i++)
                {
                    output += "00";
                    output += " ";
                }

                m_view.setOutput(output);
            }
            catch(NumberFormatException nfex){
                m_view.showError("Bad input: " + input + "'");
            }
        }
    }
}
