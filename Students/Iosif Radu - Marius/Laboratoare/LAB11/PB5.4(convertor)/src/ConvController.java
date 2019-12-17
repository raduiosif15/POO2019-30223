import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvController {
    private ConvModel m_model;
    private ConvView m_view;

    ConvController(ConvModel model, ConvView view) {
        m_model = model;
        m_view  = view;

        //... Add listeners to the view.
        view.addMultiplyListener(new MultiplyListener());
    }

    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = "";
            String output = "";
            String valuta1 = "";
            String valuta2 = "";

            try {
                input = m_view.getInput();
                valuta1 = m_view.getValuta1();
                valuta2 = m_view.getValuta2();

                if (valuta1.equals("EUR")){
                    if (valuta2.equals("EUR")){
                        output = m_model.convertor(input, 1.0);
                    }
                    if (valuta2.equals("RON")){
                        output = m_model.convertor(input, 4.78);
                    }
                    if (valuta2.equals("USD")){
                        output = m_model.convertor(input, 1.12);
                    }
                }
                if (valuta1.equals("RON")){
                    if (valuta2.equals("EUR")){
                        output = m_model.convertor(input, 0.21);
                    }
                    if (valuta2.equals("RON")){
                        output = m_model.convertor(input, 1.0);
                    }
                    if (valuta2.equals("USD")){
                        output = m_model.convertor(input, 0.23);
                    }
                }
                if (valuta1.equals("USD")){
                    if (valuta2.equals("EUR")){
                        output = m_model.convertor(input, 0.90);
                    }
                    if (valuta2.equals("RON")){
                        output = m_model.convertor(input, 4.28);
                    }
                    if (valuta2.equals("USD")){
                        output = m_model.convertor(input, 1.0);
                    }
                }

                m_view.setResult(output);

            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + input + "'");
            }
        }
    }
}
