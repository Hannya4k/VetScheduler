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

public class About {

    // public static void main(String[] args) {
       About(){
            
        JFrame frame = new JFrame("About");
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

        JLabel titleLabel0 = new JLabel("About Us");
        titleLabel0.setBounds(40, 70, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 80));
        frame.add(titleLabel0);
       
        JLabel textContent = new JLabel("<html>Shimano Veterinary Hospital is a fully equipped animal hospital " +
                                        "dedicated to provide a full range of diagnostic, medical and surgical services " +
                                        "to pets. As pet owners ourselves, the SVH team is a pet hospital committed in treating " +
                                        "your beloved family members as our own and providing patient and compassionate care tailored to suit their needs.</html>");
        textContent.setBounds(150,70, 700, 500);
        textContent.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(textContent);

        ImageIcon imageIcon2 = new ImageIcon("dino.png");
        JLabel icon2 = new JLabel();
        icon2.setIcon(imageIcon2);
        icon2.setBounds(400, 450, 200, 200);
        frame.add(icon2);

        JButton bHome = new JButton("HOME");
        bHome.setBounds(740, 14, 80, 30);
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

        JButton bTeam = new JButton("TEAM");
        bTeam.setBounds(780, 14, 80, 30);
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
        bContact.setBounds(820, 14, 100, 30);
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

        JButton bServices = new JButton("SERVICES");
        bServices.setBounds(880, 14, 100, 30);
        bServices.setFont(new Font("Arial", Font.BOLD, 10));
        bServices.setForeground(Color.white);
        bServices.setOpaque(false);
        bServices.setContentAreaFilled(false);
        bServices.setBorderPainted(false);
        topPanel.add(bServices);
        bServices.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                new Services();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
