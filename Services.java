package finalProject;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Services {

    //public static void main(String[] args) {
        Services(){

        JFrame frame = new JFrame("SVHospital Services");
        frame.setSize(1000, 800);
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
        botPanel.setBounds(0, 731, 985, 30);
        botPanel.setLayout(null);
        frame.add(botPanel);

        ImageIcon imageIcon1 = new ImageIcon("smolV.png");
        JLabel icon = new JLabel();
        icon.setIcon(imageIcon1);
        icon.setBounds(10, 7, 50, 50);
        topPanel.add(icon);

        JLabel textLabel = new JLabel("SVHospital");
        textLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(65, 7, 250, 50);
        topPanel.add(textLabel);

        JLabel titleLabel0 = new JLabel("Our Services");
        titleLabel0.setBounds(280, 50, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
        frame.add(titleLabel0);

        JLabel listServices0 = new JLabel("<html><ul>" +
                                        "<li>Emergency Vet Service</li>" +          
                                        "<li>24 Hours Hospitalization</li>" + 
                                        "<li>ICU Wards</li>" + 
                                        "<li>Soft Tissue Surgery</li>" +
                                        "<li>Ophthalmology Procedure</li>" +
                                        "<li>Emergency Surgery</li>" +
                                        "</ul><html>");
        listServices0.setBounds(140, 70, 700, 500);
        listServices0.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        frame.add(listServices0);

        JLabel listServices1 = new JLabel("<html><ul>" +
                                        "<li>Orthopedic Surgery</li>" +          
                                        "<li>Pet Dental Exams</li>" + 
                                        "<li>Dental X-Ray</li>" + 
                                        "<li>Deworming</li>" +
                                        "<li>Full Blood Test</li>" +
                                        "<li>Eye Exams</li>" +
                                        "</ul><html>");
        listServices1.setBounds(460, 70, 700, 500);
        listServices1.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        frame.add(listServices1);
        
        JLabel listServices2 = new JLabel("<html><ul>" +
                                        "<li>Complete in-house laboratory</li>" +          
                                        "<li>Soft Tissue Surgery</li>" + 
                                        "<li>Microchipping & Pet Identification</li>" + 
                                        "<li>A complete line of life stage & therapeutic diets</li>" +
                                        "<li>Colour Doppler echocardiography</li>" +
                                        "</ul><html>");
        listServices2.setBounds(250, 270, 700, 500);
        listServices2.setFont(new Font("Arial", Font.CENTER_BASELINE, 20));
        frame.add(listServices2);

        ImageIcon imageIcon2 = new ImageIcon("duck.png");
        JLabel icon2 = new JLabel();
        icon2.setIcon(imageIcon2);
        icon2.setBounds(800, 400, 200, 200);
        frame.add(icon2);

        JButton bHome = new JButton("HOME");
        bHome.setBounds(760, 14, 80, 30);
        bHome.setFont(new Font("Arial", Font.BOLD, 10));
        bHome.setForeground(Color.white);
        bHome.setOpaque(false);
        bHome.setContentAreaFilled(false);
        bHome.setBorderPainted(false);
        topPanel.add(bHome);
        bHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new HomeMenu();
                frame.dispose();
            }
        });

        JButton bAbout = new JButton("ABOUT");
        bAbout.setBounds(800, 14, 80, 30);
        bAbout.setFont(new Font("Arial", Font.BOLD, 10));
        bAbout.setForeground(Color.white);
        bAbout.setOpaque(false);
        bAbout.setContentAreaFilled(false);
        bAbout.setBorderPainted(false);
        topPanel.add(bAbout);
        bAbout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new About();
                frame.dispose();
            }
        });

        JButton bTeam = new JButton("TEAM");
        bTeam.setBounds(845, 14, 80, 30);
        bTeam.setFont(new Font("Arial", Font.BOLD, 10));
        bTeam.setForeground(Color.white);
        bTeam.setOpaque(false);
        bTeam.setContentAreaFilled(false);
        bTeam.setBorderPainted(false);
        topPanel.add(bTeam);
        bTeam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new Teams();
                frame.dispose();
            }
        });

        JButton bContact = new JButton("CONTACT");
        bContact.setBounds(880, 14, 100, 30);
        bContact.setFont(new Font("Arial", Font.BOLD, 10));
        bContact.setForeground(Color.white);
        bContact.setOpaque(false);
        bContact.setContentAreaFilled(false);
        bContact.setBorderPainted(false);
        topPanel.add(bContact);
        bContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new Contact();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}