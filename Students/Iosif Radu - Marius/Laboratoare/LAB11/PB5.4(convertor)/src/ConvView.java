import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConvView extends JFrame {

    private String[] valuta = {"EUR", "RON", "USD"};
    private JTextField input = new JTextField(10);
    private JTextField output = new JTextField(21);
    private JComboBox valuta1 = new JComboBox(valuta);
    private JComboBox valuta2 = new JComboBox(valuta);
    private JButton buton = new JButton(">>>>>");

    private ConvModel m_model;

    public ConvView(ConvModel model){
        m_model = model;

        valuta1.setSelectedIndex(0);
        valuta2.setSelectedIndex(1);

        JPanel content1 = new JPanel();
        content1.setBackground(Color.GREEN);
        content1.setLayout(new FlowLayout());
        content1.add(new JLabel("Suma"));
        content1.add(input);
        content1.add(valuta1);
        content1.add(buton);
        content1.add(valuta2);

        JPanel content2 = new JPanel();
        content2.setBackground(Color.BLACK);
        content2.setLayout(new FlowLayout());
        content2.add(new JLabel("Rezultat"));
        content2.add(output);

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(2, 0));
        content.add(content1);
        content.add(content2);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Convertor Valutar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getInput(){
        String input1 = this.input.getText();
        return input1;
    }

    public String getValuta1(){
        return (String) this.valuta1.getSelectedItem();
    }

    public String getValuta2(){
        return (String) this.valuta2.getSelectedItem();
    }

    public void setResult(String newResult){
        this.output.setText(newResult);
    }

    void addMultiplyListener(ActionListener mal) {
        buton.addActionListener(mal);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }
}
