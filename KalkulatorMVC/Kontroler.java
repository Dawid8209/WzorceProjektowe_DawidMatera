import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kontroler {
    private Widok widok;
    private Model model;

    public Kontroler(Widok widok, Model model) {
        this.widok = widok;
        this.model = model;

        this.widok.dodajSluchacza(new Sluchacz());
    }

    class Sluchacz implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double x, y = 0;

            try {
                x = widok.pobierzLiczbe1();
                y = widok.pobierzLiczbe2();

                String operacja = e.getActionCommand();

                double wynik = model.oblicz(x, y, operacja);

                widok.ustawWynik(wynik);
            } catch (NumberFormatException ex) {
                widok.wyswietlBlad("Musisz wprowadzić dwie liczby");
            } catch (ArithmeticException ex) {
                widok.wyswietlBlad(ex.getMessage());
            }
        }
    }
}

