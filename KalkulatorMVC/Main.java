public class Main {
    public static void main(String[] args) {
        Widok widok = new Widok();
        Model model = new Model();
        Kontroler kontroler = new Kontroler(widok, model);

        widok.start();
    }
}

