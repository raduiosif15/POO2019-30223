public class Hangman {
    public static void main(String[] args) {
        HangmanModel model = new HangmanModel();
        HangmanView view = new HangmanView(model);
        HangmanController controller = new HangmanController(model, view);

        view.setVisible(true);
    }
}
