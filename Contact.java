package finalProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contact {
    
    //public static void main(String[] args){
        Contact(){

        JFrame frame = new JFrame("Contact");
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

        JLabel titleLabel0 = new JLabel("Contacts");
        titleLabel0.setBounds(40, 50, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
        frame.add(titleLabel0);

        JLabel info0 = new JLabel("Door 5 nabua building, Matina Crossing, Davao City");
        info0.setBounds(70, 110, 700, 100);
        info0.setFont(new Font("Arial",Font.CENTER_BASELINE, 17));
        frame.add(info0);

        JLabel info1 = new JLabel("shimanoveterinaryhospital@gmail.com");
        info1.setBounds(70, 130, 700, 100);
        info1.setFont(new Font("Arial",Font.CENTER_BASELINE, 17));
        frame.add(info1);

        JLabel info2 = new JLabel("09123456789");
        info2.setBounds(70, 150, 700, 100);
        info2.setFont(new Font("Arial",Font.CENTER_BASELINE, 17));
        frame.add(info2);

        JLabel titleLabel1 = new JLabel("Opening Hours");
        titleLabel1.setBounds(60, 190, 700, 100);
        titleLabel1.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
        frame.add(titleLabel1);

        JLabel textContent0 = new JLabel("Regular Consultation : 9am - 8pm");
        textContent0.setBounds(70, 220, 700, 100);
        textContent0.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(textContent0);

        JLabel textContent1 = new JLabel("Emergency Consultation: 24 Hours A Day.");
        textContent1.setBounds(70, 240, 700, 100);
        textContent1.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(textContent1);

        JLabel titleLabel2 = new JLabel("Follow us");
        titleLabel2.setBounds(60, 280, 700, 100);
        titleLabel2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
        frame.add(titleLabel2);

        JLabel textContent2 = new JLabel("Facebook.com/shimanoveterinaryhospital");
        textContent2.setBounds(70, 310, 700, 100);
        textContent2.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(textContent2);

        JLabel textContent3 = new JLabel("Instagram.com/shimanoveterinaryhospital/");
        textContent3.setBounds(70, 330, 700, 100);
        textContent3.setFont(new Font("Arial",Font.CENTER_BASELINE, 15));
        frame.add(textContent3);

        JLabel icon0 = new JLabel();
        icon0.setIcon(new ImageIcon("fpfp.png"));
        icon0.setBounds(450, 90, 700, 700);
        frame.add(icon0);

        JButton bHome = new JButton("HOME");
        bHome.setBounds(755, 14, 80, 30);
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
        bTeam.setBounds(840, 14, 80, 30);
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
