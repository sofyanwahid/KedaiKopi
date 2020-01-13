package KedaiKopi;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class tampilan extends JFrame{
    
    private String[][] data = new String[100][100];
    private int batas = 3;
    private boolean ulang = true;
    private JTable menu = new JTable();
    
    public tampilan(){
        
        super("Login");
        setSize(535,590);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        data[0][0] = "#3424";
        data[0][1] = "Moccachino";
        data[0][2] = "24000";
        data[0][3] = "20";
        data[1][0] = "#3342";
        data[1][1] = "Americano";
        data[1][2] = "32000";
        data[1][3] = "13";
        data[2][0] = "#4342";
        data[2][1] = "Cappuccino";
        data[2][2] = "15000";
        data[2][3] = "25";
        
        isiTable();
        
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Coffee Shop Cashier");
        JLabel label1id = new JLabel("Product ID");
        JLabel label1nama = new JLabel("Product Name");
        JLabel label1quantity = new JLabel("Quantity");
        JLabel label1price = new JLabel("Price");
        JLabel label1total = new JLabel("Total Sales");
        JButton lableID = new JButton("ID");
        JButton lableNama = new JButton("Nama");
        JButton lablePrice = new JButton("Price");
        JButton lableStok = new JButton("Stok");
        
        final JTextField id = new JTextField();
        id.setEnabled(true);
        final JTextField quantity = new JTextField();
        quantity.setEnabled(true);
        final JTextField productNama = new JTextField();
        productNama.setEnabled(false);
        final JTextField total = new JTextField();
        total.setEnabled(false);
        final JTextField price = new JTextField();
        price.setEnabled(false);
        
        JButton btnClear = new JButton("!Clear Field");
        JButton btnPrint = new JButton("Print Struct");
        JButton btnTambah = new JButton("+Add New Product");
        
        label1.setFont(new Font("serif", Font.PLAIN, 25));
        label1.setBounds(160,10,250,30);
        label1.setForeground(Color.white);
        lableID.setBounds(10, 80, 125, 20);
        lableID.setBorder(null);
        lableID.setEnabled(false);
        lableID.setForeground(Color.BLACK);
        lableID.setBackground(Color.gray);
        
        lableNama.setBounds(135, 80, 125, 20);
        lableNama.setBorder(null);
        lableNama.setEnabled(false);
        lableNama.setForeground(Color.BLACK);
        lableNama.setBackground(Color.gray);
        
        
        lablePrice.setBounds(260, 80, 125, 20);
        lablePrice.setBorder(null);
        lablePrice.setEnabled(false);
        lablePrice.setForeground(Color.BLACK);
        lablePrice.setBackground(Color.gray);
        
        lableStok.setBounds(385, 80, 125, 20);
        lableStok.setBorder(null);
        lableStok.setEnabled(false);
        lableStok.setForeground(Color.BLACK);
        lableStok.setBackground(Color.gray);
        
        label1id.setBounds(10, 270, 200, 30);
        label1id.setForeground(Color.white);
        id.setBounds(10,300,200,30);
        id.setBackground(Color.gray);
        
        label1quantity.setBounds(310, 270, 200, 30);
        label1quantity.setForeground(Color.white);
        quantity.setBounds(310,300,200,30);
        quantity.setBackground(Color.gray);
        
        label1nama.setBounds(10, 340, 200, 30);
        label1nama.setForeground(Color.white);
        productNama.setBounds(10,370,200,30);
        productNama.setBackground(Color.gray);
        
        label1total.setBounds(310, 340, 200, 30);
        label1total.setForeground(Color.white);
        total.setBounds(310,370,200,30);
        total.setBackground(Color.gray);
        
        label1price.setBounds(10, 410, 200, 30);
        label1price.setForeground(Color.white);
        price.setBounds(10,440,200,30);
        price.setBackground(Color.gray);
        
        btnClear.setBounds(10,510,150,30);
        btnClear.setBackground(Color.gray);
        btnPrint.setBounds(185,510,150,30);
        btnPrint.setBackground(Color.gray);
        btnTambah.setBounds(360,510,150,30);
        btnTambah.setBackground(Color.gray);
        
        panel.setLayout(null);
        panel.setBackground(Color.black);
        
        panel.add(productNama);
        panel.add(total);
        panel.add(label1id);
        panel.add(id);
        panel.add(quantity);
        panel.add(label1price);
        panel.add(price);
        panel.add(label1quantity);
        panel.add(label1nama);
        panel.add(label1total);
        panel.add(label1);
        panel.add(lableID);
        panel.add(lableNama);
        panel.add(lablePrice);
        panel.add(lableStok);
        panel.add(menu);
        panel.add(btnClear);
        panel.add(btnPrint);
        panel.add(btnTambah);
        add(panel);
        
        btnClear.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                
                id.setText("");
                productNama.setText("");
                total.setText("");
                price.setText("");
                quantity.setText("");
                
            }
        });
        btnTambah.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                final JFrame frame = new JFrame("Input Data");
                
                frame.setSize(535,240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JPanel panel = new JPanel();
                JLabel label1id = new JLabel("Product ID");
                JLabel label1nama = new JLabel("Product Name");
                JLabel label1stok = new JLabel("Stok");
                JLabel label1price = new JLabel("Price");
                
                final JTextField id = new JTextField();
                id.setEnabled(true);
                final JTextField quantity = new JTextField();
                quantity.setEnabled(true);
                final JTextField productNama = new JTextField();
                productNama.setEnabled(true);
                final JTextField price = new JTextField();
                price.setEnabled(true);

                JButton btnTambah = new JButton("Save");

                label1id.setBounds(10, 10, 200, 30);
                label1id.setForeground(Color.white);
                id.setBounds(10,40,200,30);
                id.setBackground(Color.gray);

                label1stok.setBounds(310, 10, 200, 30);
                label1stok.setForeground(Color.white);
                quantity.setBounds(310,40,200,30);
                quantity.setBackground(Color.gray);

                label1nama.setBounds(10, 80, 200, 30);
                label1nama.setForeground(Color.white);
                productNama.setBounds(10,110,200,30);
                productNama.setBackground(Color.gray);

                label1price.setBounds(310, 80, 200, 30);
                label1price.setForeground(Color.white);
                price.setBounds(310,110,200,30);
                price.setBackground(Color.gray);

                btnTambah.setBounds(360,160,150,30);
                btnTambah.setBackground(Color.gray);

                panel.setLayout(null);
                panel.setBackground(Color.black);

                panel.add(productNama);
                panel.add(price);
                panel.add(label1id);
                panel.add(id);
                panel.add(quantity);
                panel.add(label1stok);
                panel.add(label1nama);
                panel.add(label1price);
                panel.add(btnTambah);
                frame.add(panel);
        
                btnTambah.addActionListener(new ActionListener(){
                    public void actionPerformed (ActionEvent e){
                        if ("".equals(id.getText()) || "".equals(productNama.getText()) || "".equals(price.getText()) || "".equals(quantity.getText())){
                            JOptionPane.showMessageDialog (null,"Isi data terlebih dahulu!");
                        } else {
                            data[batas][0] = id.getText();
                            data[batas][1] = productNama.getText();
                            data[batas][2] = price.getText();
                            data[batas][3] = quantity.getText();
                            batas++;
                            frame.setVisible(false);
                            isiTable();
                        }
                    }
                });
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
        btnPrint.addActionListener(new ActionListener(){
            boolean status = false;
            int index = 0, hasil;
            public void actionPerformed (ActionEvent e){
                try {
                    
                    if ("".equals(id.getText()) || "".equals(quantity.getText())){
                        JOptionPane.showMessageDialog (null,"Isi data terlebih dahulu!");
                    } else {
                        for(int i = 0; i < batas; i++){
                            if (id.getText().equals(data[i][0])){
                                status = true;
                                index = i;
                            }
                        }
                        if (status == true){
                            if (Integer.parseInt(quantity.getText()) <= Integer.parseInt(data[index][3])){
                                productNama.setText(data[index][1]);
                                price.setText(data[index][2]);
                                hasil = Integer.parseInt(quantity.getText()) * Integer.parseInt(data[index][2]);
                                total.setText(Integer.toString(hasil));
                                hasil = Integer.parseInt(data[index][3]) - Integer.parseInt(quantity.getText());
                                data[index][3] = Integer.toString(hasil);
                                isiTable();
                            } else {
                                JOptionPane.showMessageDialog (null,"Maaf stok tidak cukup!");
                            }
                        }
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog (null,"Mohon input data denga benar!");
                }
            }
        });
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    private void isiTable(){
        final DefaultTableModel model = new DefaultTableModel();
        model.addColumn("");
        model.addColumn("");
        model.addColumn("");
        model.addColumn("");
        menu.setForeground(Color.white);
        menu.setBackground(Color.black);
        menu.setBounds(10, 100, 500, 100);
        for (int i = 0; i < data.length; i++){
            model.addRow(new Object[]{data[i][0],data[i][1],data[i][2],data[i][3]});
        }
        menu.setModel(model);
    }
}