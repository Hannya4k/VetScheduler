package finalProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SearchAppointment {

    //public static void main(String[] args) {

        public SearchAppointment () throws FileNotFoundException{

            Scanner sf = new Scanner (new FileReader ("Appointments.txt"));
        JFrame frame = new JFrame("Veterinary Hospital");
        frame.setSize(500, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon imageIcon0 = new ImageIcon("veterinary.png");
        frame.setIconImage(imageIcon0.getImage());
        frame.setLocationRelativeTo(null);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.darkGray);
        topPanel.setBounds(0, 0, 985, 60);
        topPanel.setLayout(null);
        frame.add(topPanel);

        JPanel botPanel = new JPanel();
        botPanel.setBackground(Color.darkGray);
        botPanel.setBounds(0, 400, 985, 30);
        botPanel.setLayout(null);
        frame.add(botPanel);

        ImageIcon imageIcon1 = new ImageIcon("smolV.png");
        JLabel icon1 = new JLabel();
        icon1.setIcon(imageIcon1);
        icon1.setBounds(95, 7, 50, 50);
        topPanel.add(icon1);

        JLabel textLabel = new JLabel("SVHospital");
        textLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(150, 7, 250, 50);
        topPanel.add(textLabel);

        JLabel label = new JLabel("Enter Full Name: ");
        label.setFont(new Font("Arial", Font.BOLD, 17));
        label.setBounds(115, 110, 400, 50);
        frame.add(label);

        JTextField text = new JTextField();
        text.setBounds(110, 160, 250, 50);
        frame.add(text);

        JButton back = new JButton("Back");
        back.setBounds(100, 300, 270, 40);
        back.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

                new HomeMenu();
                frame.dispose();
            }
        });


        JButton bsearch = new JButton("Search");
        bsearch.setBounds(100, 240, 270, 40);
        bsearch.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(bsearch);
        bsearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // try {
                   
                    sf.useDelimiter(" : ");
                    String find = text.getText();
                    // String find = JOptionPane.showInputDialog("Search name ");
                    boolean poke = false;
                    while(sf.hasNext() && !poke){
                        String fname = sf.next();
                        long fcontact = sf.nextLong();
                        String femail = sf.next();
                        String fpname = sf.next();
                        String fage = sf.next();
                        // int fage = sf.nextInt();
                        // String flage = sf.next();
                        String fbreed = sf.next();
                        String fpoa = sf.next();
                        String fsd = sf.next();
                        String fst = sf.next();
                        sf.nextLine();
                    if(find.equalsIgnoreCase(fname)){
                        poke = true;
                        JOptionPane.showMessageDialog(null, "        Appointment Found! \n" +
                                                         "Name: " + fname + "\nContact: " + fcontact + "\nEmail: " + femail + 
                                                         "\nPet's Name: " + fpname + "\nAge: " + fage + "\nBreed/species: " + fbreed +
                                                         "\nPurpose of Appointment: " + fpoa + "\nSchedule Date: " + fsd + "\nSchedule Time: " + fst);
                      
                    //    System.out.println(fname + fcontact + femail + fpname + fage + fbreed + fpoa + fsd + fst);
                    }
                   
                    }
                    if(!poke){
                        JOptionPane.showMessageDialog(null, "Person not found");
                    }
                    // new HomeMenu();
                    // frame.dispose();
                // } catch (Exception e1) {
                    // JOptionPane.showMessageDialog(null, e1);
                    // e1.printStackTrace();
                }
            // }
            
        });

        frame.setVisible(true);
    }
}

// add search icon
// not everything can be solve by the robot 