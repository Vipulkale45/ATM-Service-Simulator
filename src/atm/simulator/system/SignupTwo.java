package atm.simulator.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    // Instance Variables
   // long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
    JRadioButton male, female, other, married, unmarried;
    JButton next;
    JTextField pan , aadhar;
    JComboBox religion, category,Occupation, Education, Income;
    JRadioButton syes, sno, eyes, eno;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setTitle("New Account Application Form = page 2");

        

        JLabel additionalDetail = new JLabel("Page 2: Additional Details");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian","Other"};  
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
       
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        String valcategory[] = {"General","OBC", "SC", "ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        String Incomecategory[] = {"Null","< 1,50,000", "<2,50,000", "<5,00,000","Upto 10,00,000"};
        Income= new JComboBox(Incomecategory);
        Income.setBounds(300, 240, 400, 30);
        Income.setBackground(Color.WHITE);
        add(Income);
        
        

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String Eduvalue[] = {"Non-Graduation","Graducate", "Post-Graduation", "Doctorate","Others"};
        Education= new JComboBox(Eduvalue);
        Education.setBounds(300, 315, 400, 30);
        Education.setBackground(Color.WHITE);
        add(Education);

        JLabel ms = new JLabel("Occupiatipn:");
        ms.setFont(new Font("Raleway", Font.BOLD, 20));
        ms.setBounds(100, 390, 200, 30);
        add(ms);
        
        String Occupvalue[] = {"Salaried","Self-Employed", "Bussiness", "Student","Retired","Others"};
        Occupation= new JComboBox(Occupvalue);
        Occupation.setBounds(300, 390, 400, 30);
        Occupation.setBackground(Color.WHITE);
        add(Occupation);

        JLabel address= new JLabel("Pan Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        pan= new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);

        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);

        JLabel state = new JLabel("Senior citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
  

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup emaritalgroup = new ButtonGroup();
        emaritalgroup.add(eyes);
        emaritalgroup.add(eno);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
       // String formno = String.valueOf(random);
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String) Income.getSelectedItem();
        String seducation = (String) Education.getSelectedItem();
        String soccupation = (String) Occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected())
        {
            seniorcitizen = "Yes";
        }
        else if(sno.isSelected())
        {
            seniorcitizen="No";
        }
        
        String exisitingaccount = null;
        
            if(eyes.isSelected())
            {
                exisitingaccount = "Yes";
            }
            else if(eno.isSelected())
            {
                exisitingaccount = "No";
            }
   

        String span = pan.getText();
        String saadhar = aadhar.getText();

        
        try{
                 Conn c = new Conn();     
                 String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+exisitingaccount+"')";
                 c.s.executeUpdate(query);
                 
                 //Signup3 Object
                 setVisible(false);
                 new SignupThree(formno).setVisible(true);
                 
        } catch(Exception e)
        {
            System.out.println(e);
        }
    }
    

    public static void main(String[] args) {
        new SignupTwo("").setVisible(true);
    }
}
