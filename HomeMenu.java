package finalProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeMenu {

    // public static void main(String[] args){

    HomeMenu() {

        JFrame frame = new JFrame("Veterinary Hospital");
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

        JLabel credits = new JLabel("Hannya");
        credits.setBounds(455, 7, 120, 20);
        credits.setFont(new Font("Arial", Font.BOLD, 12));
        credits.setForeground(Color.white);
        botPanel.add(credits);

        JLabel icon0 = new JLabel();
        icon0.setIcon(new ImageIcon("Banner.png"));
        icon0.setBounds(470, 40, 700, 700);
        frame.add(icon0);

        ImageIcon imageIcon1 = new ImageIcon("smolV.png");
        JLabel icon1 = new JLabel();
        icon1.setIcon(imageIcon1);
        icon1.setBounds(10, 7, 50, 50);
        topPanel.add(icon1);

        JLabel textLabel = new JLabel("SVHospital");
        textLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(65, 7, 250, 50);
        topPanel.add(textLabel);

        JLabel welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setBounds(60, 180, 500, 50);
        welcomeLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 40));
        frame.add(welcomeLabel);

        JLabel titleLabel0 = new JLabel("Shimano");
        titleLabel0.setBounds(60, 235, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 90));
        frame.add(titleLabel0);

        JLabel titleLabel1 = new JLabel("Veterinary");
        titleLabel1.setBounds(60, 310, 700, 100);
        titleLabel1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 90));
        frame.add(titleLabel1);

        JLabel titleLabel2 = new JLabel("Hospital");
        titleLabel2.setBounds(60, 385, 700, 100);
        titleLabel2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 90));
        frame.add(titleLabel2);

        JButton bAbout = new JButton("ABOUT");
        bAbout.setBounds(740, 14, 80, 30);
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

        JButton bAppoint = new JButton("Set Appointment");
        bAppoint.setBounds(70, 520, 300, 40);
        bAppoint.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(bAppoint);
        bAppoint.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                new SetAppointment();
                frame.dispose();
            }
        });

        JButton bSearch = new JButton("Search Appointment");
        bSearch.setBounds(70, 565, 300, 40);
        bSearch.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(bSearch);
        bSearch.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    new SearchAppointment();
                    frame.dispose();
                } catch (Exception i) {
                    // TODO: handle exception
                }

            }
        });

        JButton bExit = new JButton("Exit");
        bExit.setBounds(70, 610, 300, 40);
        bExit.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(bExit);
        bExit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        frame.setVisible(true);

    }
}