
package atm.simulator.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Deposite extends JFrame implements ActionListener {
       JTextField t1 , t2;
        JButton b1,b2,b3;
        JLabel l1,l2,l3;
        String pinnumber;
    Deposite(String pinnumber)
    {
       this.pinnumber = pinnumber;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        Image.setBounds(0, 0, 900, 900);
        add(Image);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("DEPOSIT");
        b2 = new JButton("BACK");
        
        l1.setBounds(170,300,400,20);
        Image.add(l1);
        
        t1.setBounds(170,350,320,25);
        Image.add(t1);
        
        b1.setBounds(355,485,150,30);
        Image.add(b1);
        
        b2.setBounds(355,520,150,30);
        Image.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae){
        try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
            
    }
    
    public static void main(String[] args) {
       new Deposite("");
    }
    
}
