import javax.swing.*;
import java.awt.event.ActionListener;

public class Widok extends JFrame {
    private JTextField poleX = new JTextField(10);
    private JTextField poleY = new JTextField(10);
    private JButton dodajButton = new JButton("+");
    private JButton odejmijButton = new JButton("-");
    private JButton pomnozButton = new JButton("*");
    private JButton podzielButton = new JButton("/");
    private JTextField wynikPole = new JTextField(10);

    public Widok() {
        JPanel panel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);

        panel.add(poleX);
        panel.add(poleY);
        panel.add(dodajButton);
        panel.add(odejmijButton);
        panel.add(pomnozButton);
        panel.add(podzielButton);
        panel.add(wynikPole);

        this.add(panel);
    }

    public double pobierzLiczbe1() {
        return Double.parseDouble(poleX.getText());
    }

    public double pobierzLiczbe2() {
        return Double.parseDouble(poleY.getText());
    }

    public void ustawWynik(double wynik) {
        wynikPole.setText(Double.toString(wynik));
    }

    public void dodajSluchacza(ActionListener sluchacz) {
        dodajButton.addActionListener(sluchacz);
        odejmijButton.addActionListener(sluchacz);
        pomnozButton.addActionListener(sluchacz);
        podzielButton.addActionListener(sluchacz);
    }

    public void wyswietlBlad(String komunikatBledu) {
        JOptionPane.showMessageDialog(this, komunikatBledu);
    }

    public void start() {
        this.setVisible(true);
    }
}
