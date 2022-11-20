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

public class Teams {

    //public static void main(String[] args) {
        Teams(){

        JFrame frame = new JFrame("SVHospital Team");
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

        JLabel titleLabel0 = new JLabel("Our Team");
        titleLabel0.setBounds(350, 90, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
        frame.add(titleLabel0);

        JLabel icon0 = new JLabel();
        icon0.setIcon(new ImageIcon("Law.png"));
        icon0.setBounds(60, 40, 700, 700);
        frame.add(icon0);

        JLabel icon1 = new JLabel();
        icon1.setIcon(new ImageIcon("Cora.png"));
        icon1.setBounds(365, 40, 700, 700);
        frame.add(icon1);

        JLabel icon2 = new JLabel();
        icon2.setIcon(new ImageIcon("Bon.png"));
        icon2.setBounds(670, 40, 700, 700);
        frame.add(icon2);

        JLabel dev = new JLabel("Developed by: Karl T. Andoque");
        dev.setBounds(320, 650, 700, 100);
        dev.setFont(new Font("Arial",Font.BOLD, 22));
        frame.add(dev);

        JLabel info0 = new JLabel("Dr.Water Law");
        info0.setBounds(115, 490, 700, 100);
        info0.setFont(new Font("Arial",Font.BOLD, 22));
        frame.add(info0);

        JLabel info1 = new JLabel("Donquixote Rosinante");
        info1.setBounds(380, 490, 700, 100);
        info1.setFont(new Font("Arial",Font.BOLD, 22));
        frame.add(info1);

        JLabel info2 = new JLabel("Bon Clay");
        info2.setBounds(750, 490, 700, 100);
        info2.setFont(new Font("Arial",Font.BOLD, 22));
        frame.add(info2);

        JLabel pos0 = new JLabel("Veterinarian");
        pos0.setBounds(135, 520, 700, 100);
        pos0.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(pos0);
        
        JLabel pos1 = new JLabel("Veterinary Technician");
        pos1.setBounds(410, 520, 700, 100);
        pos1.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(pos1);

        JLabel pos2 = new JLabel("Groomer");
        pos2.setBounds(765, 520, 700, 100);
        pos2.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(pos2);

        JButton bHome = new JButton("HOME");
        bHome.setBounds(745, 14, 80, 30);
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
        bAbout.setBounds(790, 14, 80, 30);
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

        JButton bContact = new JButton("CONTACT");
        bContact.setBounds(830, 14, 100, 30);
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
        bServices.setBounds(890, 14, 100, 30);
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
