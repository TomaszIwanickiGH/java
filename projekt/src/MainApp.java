import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainApp extends JFrame {
    private JButton btnZaplac;
    private JButton btnWyplac;
    private JButton btn5zl;
    private JButton btn2zl;
    private JButton btn1zl;
    private JButton btn05zl;
    private JButton btn02zl;
    private JButton btn01zl;
    private JButton btnPanel;
    private JLabel lblSrodki;
    private JPanel mainPanel;
    private JLabel lblWplaconaKwota;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JLabel lblDoZaplaty;
    private JLabel lblKupiono;

    public static void main(String[] args) {
        MainApp mainApp = new MainApp();
        mainApp.setVisible(true);
    }

    public MainApp(){
        super("Automat z napojami");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);

        Kwota kwota = new Kwota();
        lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
        lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");

        btn5zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(5.00);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });
        btn2zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(2.00);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });
        btn1zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(1.00);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });
        btn05zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(0.50);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });
        btn02zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(0.20);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });
        btn01zl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.wplacKwote(0.10);
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + kwota.getWplaconaKwota() + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
            }
        });

        ProduktManager manager = new ProduktManager();
        List<Produkt> products = manager.loadProducts();
        for (Produkt product : products) {
            textArea1.append(product.toString() + "\n");
            comboBox1.addItem(product.wyswietlId() + "\n");
        }

        Platnosc platnosc = new Platnosc();
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedId = ((String) comboBox1.getSelectedItem()).trim();
                platnosc.setIdDoZaplaty(Integer.parseInt(selectedId));
                if (!selectedId.isEmpty()) {
                    for (Produkt product : products) {
                        if (product.getId() == Integer.parseInt(selectedId)) {
                            kwota.setKwotaDoZaplaty(product.getPrice());
                            lblDoZaplaty.setText("Do zapłaty: " + product.getPrice() + "zł");
                            break;
                        }
                    }
                }
            }
        });

        btnZaplac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                platnosc.zaplac(products, lblKupiono, kwota.getWplaconaKwota(), lblSrodki, lblWplaconaKwota, lblDoZaplaty);
                kwota.setWplaconaKwota(0);
            }
        });

        btnWyplac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kwota.reset();
                lblSrodki.setText("Posiadana kwota: " + kwota.getPosiadanaKwota() + "zł");
                lblWplaconaKwota.setText("Wpłacona kwota: " + 0 + "zł");
                kwota.validate(btn5zl, btn2zl, btn1zl, btn05zl, btn02zl, btn01zl);
                lblDoZaplaty.setText("Do zapłaty: 0");
                lblKupiono.setText("");
            }
        });

        btnPanel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelAdministacji panelAdministacji = new PanelAdministacji();
                panelAdministacji.setVisible(true);
            }
        });
    }

}

