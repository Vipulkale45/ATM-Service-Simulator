
package atm.simulator.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1, l2, l3, l4;
    MiniStatement(String pin) {
        super("Mini Statement");
        getContentPane().setBackground(Color.WHITE);
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        l1 = new JLabel();
        l1.setBounds(20, 140, 360, 300);
        add(l1);

        l2 = new JLabel("Bank Of Baroda");
        l2.setFont(new Font("Raleway", Font.BOLD, 16));
        l2.setBounds(150, 20, 200, 20);
        add(l2);

        l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        add(l3);

        l4 = new JLabel();
        l4.setBounds(20, 460, 300, 20);
        add(l4);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM login WHERE pin = '" + pin + "'");
            while (rs.next()) {
                l3.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4) + "XXXXXXXX" +
                        rs.getString("cardnumber").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance = 0;
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank WHERE pin = '" + pin + "'");
            
            StringBuilder statement = new StringBuilder();
            statement.append("<html><pre>");
            
            while (rs.next()) {
                String date = rs.getString("date");
                String type = rs.getString("type");
                String amount = rs.getString("amount");

                statement.append(String.format("%-25s %-10s %10s", date, type, amount)).append("<br>");
                
                if (type.equalsIgnoreCase("Deposit")) {
                    balance += Integer.parseInt(amount);
                } else {
                    balance -= Integer.parseInt(amount);
                }
            }
            statement.append("</pre></html>");
            l1.setText(statement.toString());
            l4.setText("Your current account balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        b1 = new JButton("Exit");
        b1.setBounds(20, 520, 100, 30);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("").setVisible(true);
    }
}
