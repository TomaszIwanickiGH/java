import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class PanelAdministacji extends JFrame{
    private JPanel secondaryPanel;
    private JTextArea textArea1;
    private JButton dodajButton;
    private JButton edytujButton;
    private JButton usunButton;
    private JTextArea textArea2;
    private JTextField dodajNumer;
    private JTextField dodajOpis;
    private JTextField dodajCena;
    private JPanel dodajPanel;
    private JButton anulujButton;
    private JButton zapiszButton;
    private JPanel usunPanel;
    private JPanel edytujPanel;
    private JPanel operacjePanel;
    private JTextField edytujOpis;
    private JTextField edytujCena;
    private JButton anulujButton1;
    private JButton edytujZapisz;
    private JButton usunButton1;
    private JButton anulujButton2;
    private JLabel lblUruchomPonownie;
    private JComboBox comboUsun;
    private JComboBox comboEdytuj;

    int idDoUsuniecia;
    int idDoEdycji;

    public static void main(String[] args) {
//        PanelAdministacji panelAdministacji = new PanelAdministacji();
//        panelAdministacji.setVisible(true);

    }

    public PanelAdministacji(){
        super("Panel Administracji");
        this.setContentPane(this.secondaryPanel);
        this.setSize(500, 500);
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dodajPanel.setVisible(false);
        usunPanel.setVisible(false);
        edytujPanel.setVisible(false);

        ProduktManager manager = new ProduktManager();
        List<Produkt> products = manager.loadProducts();
        for (Produkt product : products) {
            textArea1.append(product.toString() + "\n");
            comboUsun.addItem(product.wyswietlId() + "\n");
            comboEdytuj.addItem(product.wyswietlId() + "\n");
        }

        Transakcje transakcje = new Transakcje();
        List<String> listaTransakcji = transakcje.loadTransactions();
        for(String tr: listaTransakcji){
            textArea2.append(tr + "\n");
        }

        CRUD crud = new CRUD();

        dodajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajPanel.setVisible(true);
                operacjePanel.setVisible(false);
            }
        });

        anulujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajPanel.setVisible(false);
                usunPanel.setVisible(false);
                edytujPanel.setVisible(false);
                operacjePanel.setVisible(true);
            }
        });

        zapiszButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    crud.addProduct(products, new Produkt(Integer.parseInt(dodajNumer.getText()), dodajOpis.getText(), Double.parseDouble(dodajCena.getText())));
                    lblUruchomPonownie.setText("Aby zobaczyć zmiany, uruchom program ponownie");
                } catch (Exception a) {
                    lblUruchomPonownie.setText("Podano błedne dane");
                }
                dodajPanel.setVisible(false);
                operacjePanel.setVisible(true);;
            }
        });

        edytujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                edytujPanel.setVisible(true);
                operacjePanel.setVisible(false);
            }
        });

        anulujButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajPanel.setVisible(false);
                usunPanel.setVisible(false);
                edytujPanel.setVisible(false);
                operacjePanel.setVisible(true);
            }
        });

        comboEdytuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedId = ((String) comboEdytuj.getSelectedItem()).trim();
                idDoEdycji = Integer.parseInt(selectedId);
            }
        });

        edytujZapisz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crud.updateProduct(products, idDoEdycji, edytujOpis.getText(), Double.parseDouble(edytujCena.getText()));
                edytujPanel.setVisible(false);
                operacjePanel.setVisible(true);
                lblUruchomPonownie.setText("Aby zobaczyć zmiany, uruchom program ponownie");
            }
        });

        usunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usunPanel.setVisible(true);
                operacjePanel.setVisible(false);
            }
        });

        anulujButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dodajPanel.setVisible(false);
                usunPanel.setVisible(false);
                edytujPanel.setVisible(false);
                operacjePanel.setVisible(true);
            }
        });

        comboUsun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedId = ((String) comboUsun.getSelectedItem()).trim();
                idDoUsuniecia = Integer.parseInt(selectedId);
            }
        });

        usunButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crud.deleteProduct(products, idDoUsuniecia);
                usunPanel.setVisible(false);
                operacjePanel.setVisible(true);
                lblUruchomPonownie.setText("Aby zobaczyć zmiany, uruchom program ponownie");
            }
        });
    }
}
