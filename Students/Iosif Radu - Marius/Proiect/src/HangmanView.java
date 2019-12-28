import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class HangmanView extends JFrame {

    private String spanzuratoare1 = new String("  |------------------|");
    private String spanzuratoare2 = new String("  |                        |");
    private String spanzuratoare3 = new String("  |                       O");
    private String spanzuratoare4 = new String("  |                     /  |  \\");
    private String spanzuratoare5 = new String("  |                        |");
    private String spanzuratoare6 = new String("  |                      /   \\");
    private String spanzuratoare7 = new String("_|_");
    private JTextField output = new JTextField(5);
    private JTextField input = new JTextField(10);
    private JButton buton = new JButton(">>");
    private JButton butonSelectieCuvant = new JButton("Start!");

    private HangmanModel m_model;

    public HangmanView(HangmanModel model){
        m_model = model;

        JPanel content1 = new JPanel();
        content1.setLayout(new GridLayout(0, 2));
        content1.add(new JLabel(spanzuratoare1));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare2));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare3));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare4));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare5));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare6));
        content1.add(new JLabel(""));
        content1.add(new JLabel(spanzuratoare7));
        content1.add(new JLabel(""));
        content1.add(output);
        content1.add(butonSelectieCuvant);


        JPanel content2 = new JPanel();
        content2.setBackground(Color.BLUE);
        content2.setLayout(new FlowLayout());
        content2.add(new JLabel("Enter letter: "));
        content2.add(input);
        content2.add(buton);

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(2, 0));
        content.add(content1);
        content.add(content2);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Hangman");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getInput(){
        return this.input.getText();
    }

    public String getOutput() {
        return this.output.getText();
    }

    public String getSpanzuratoare1() {
        return spanzuratoare1;
    }

    public String getSpanzuratoare2() {
        return spanzuratoare2;
    }

    public String getSpanzuratoare3() {
        return spanzuratoare3;
    }

    public String getSpanzuratoare4() {
        return spanzuratoare4;
    }

    public String getSpanzuratoare5() {
        return spanzuratoare5;
    }

    public String getSpanzuratoare6() {
        return spanzuratoare6;
    }

    public String getSpanzuratoare7() {
        return spanzuratoare7;
    }

    public void setSpanzuratoare1(String spanzuratoare1) {
        this.spanzuratoare1 = spanzuratoare1;
    }

    public void setSpanzuratoare2(String spanzuratoare2) {
        this.spanzuratoare2 = spanzuratoare2;
    }

    public void setSpanzuratoare3(String spanzuratoare3) {
        this.spanzuratoare3 = spanzuratoare3;
    }

    public void setSpanzuratoare4(String spanzuratoare4) {
        this.spanzuratoare4 = spanzuratoare4;
    }

    public void setSpanzuratoare5(String spanzuratoare5) {
        this.spanzuratoare5 = spanzuratoare5;
    }

    public void setSpanzuratoare6(String spanzuratoare6) {
        this.spanzuratoare6 = spanzuratoare6;
    }

    public void setSpanzuratoare7(String spanzuratoare7) {
        this.spanzuratoare7 = spanzuratoare7;
    }

    public void setOutput(String output) {
        this.output.setText(output);
    }

    void addMultiplyListener(ActionListener mal){
        butonSelectieCuvant.addActionListener(mal);
    }

    void showError(String errMessage){
        JOptionPane.showMessageDialog(this, errMessage);
    }
}
