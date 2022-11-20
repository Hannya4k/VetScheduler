package finalProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetAppointment extends User {

    // public static void main(String[] args) {
    SetAppointment() {

        JFrame frame = new JFrame("Appointment");
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

        JPanel extraPanel0 = new JPanel();
        extraPanel0.setBackground(Color.black);
        extraPanel0.setBounds(300, 0, 2, 1000);
        extraPanel0.setLayout(null);
        frame.add(extraPanel0);

        ImageIcon imageIcon1 = new ImageIcon("smolV.png");
        JLabel icon1 = new JLabel();
        icon1.setIcon(imageIcon1);
        icon1.setBounds(295, 7, 50, 50);
        topPanel.add(icon1);

        JLabel textLabel = new JLabel("SVHospital");
        textLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(350, 7, 250, 50);
        topPanel.add(textLabel);

        JLabel icon0 = new JLabel();
        icon0.setIcon(new ImageIcon("catsheesh.png"));
        icon0.setBounds(300, 220, 700, 700);
        frame.add(icon0);

        JLabel icon2 = new JLabel();
        icon2.setIcon(new ImageIcon("pawPrint.png"));
        icon2.setBounds(760, 220, 700, 700);
        frame.add(icon2);

        JLabel titleLabel0 = new JLabel("Appointment");
        titleLabel0.setBounds(330, 90, 700, 100);
        titleLabel0.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 70));
        frame.add(titleLabel0);

        JLabel ownerName = new JLabel("Owner's Full Name:");
        ownerName.setBounds(350, 220, 200, 50);
        JTextField oName = new JTextField();
        oName.setBounds(350, 260, 200, 30);
        frame.add(ownerName);
        frame.add(oName);

        JLabel contactNum = new JLabel("Contact #: ");
        contactNum.setBounds(570, 220, 100, 50);
        JTextField cNum = new JTextField();
        cNum.setBounds(570, 260, 150, 30);
        frame.add(contactNum);
        frame.add(cNum);

        JLabel ownersEmail = new JLabel("Email Address:");
        ownersEmail.setBounds(740, 220, 100, 50);
        JTextField oMail = new JTextField();
        oMail.setBounds(740, 260, 200, 30);
        frame.add(ownersEmail);
        frame.add(oMail);

        JLabel petName = new JLabel("Pet's Name:");
        petName.setBounds(350, 300, 100, 50);
        JTextField pName = new JTextField();
        pName.setBounds(350, 340, 200, 30);
        frame.add(petName);
        frame.add(pName);

        JLabel petAge = new JLabel("Age of Pet:");
        petAge.setBounds(570, 300, 100, 50);
        JTextField pAge = new JTextField();
        pAge.setBounds(570, 340, 75, 30);
        frame.add(petAge);
        frame.add(pAge);

        String[] listAge = { "Days old", "Months old", "Years old" };
        JComboBox<String> liAge = new JComboBox<String>(listAge);
        liAge.setBounds(647, 340, 70, 30);
        frame.add(liAge);

        JLabel petType = new JLabel("Breed/Species:");
        petType.setBounds(740, 300, 100, 50);
        JTextField pType = new JTextField();
        pType.setBounds(740, 340, 200, 30);
        frame.add(petType);
        frame.add(pType);

        JLabel purposeApp = new JLabel("Purpose of Appointment:");
        purposeApp.setBounds(350, 380, 300, 50);
        String[] listOfPurpose = { "Surgery", "Dental", "Groom", "Booster/Vaccine", "Check-up" };
        JComboBox<String> pApp = new JComboBox<String>(listOfPurpose);
        pApp.setBounds(350, 420, 200, 30);
        frame.add(purposeApp);
        frame.add(pApp);

        JLabel schedTime = new JLabel("Scheduling Time");
        schedTime.setBounds(70, 490, 180, 50);
        schedTime.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(schedTime);

        String[] listOfTime = { "8:00 AM - 11:30 AM", "1:30 PM - 4:30 PM" };
        JComboBox<String> lTime = new JComboBox<String>(listOfTime);
        lTime.setBounds(55, 540, 200, 30);
        frame.add(lTime);

        JLabel schedDate = new JLabel("Scheduling Date");
        schedDate.setBounds(70, 130, 180, 50);
        schedDate.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(schedDate);

        ImageIcon calendarIcon = new ImageIcon("calendar.png");
        JButton bCalendar = new JButton();
        bCalendar.setIcon(calendarIcon);
        bCalendar.setBounds(23, 180, 255, 255);
        bCalendar.setOpaque(false);
        bCalendar.setContentAreaFilled(false);
        bCalendar.setBorderPainted(false);
        frame.add(bCalendar);
        bCalendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Cder();
                frame.dispose();
            }
        });
        
        /*
         * JCheckBox check = new JCheckBox("Confirm");
         * check.setBounds(500, 640, 300, 40);
         * check.setFont(new java.awt.Font("Arial", 1, 17));
         * frame.add(check);
         * check.addActionListener(new ActionListener() {
         * 
         * @Override
         * public void actionPerformed(ActionEvent e) {
         * if(e.getSource() == check){
         * 
         * }else
         * JOptionPane.showMessageDialog(null, "Pls Check the button");
         * }
         * });
         */

        JButton bSubmit = new JButton("SUBMIT");
        bSubmit.setBounds(490, 688, 300, 40);
        bSubmit.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(bSubmit);
        bSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    long Contacts = Long.parseLong(cNum.getText());
                    int Age = Integer.parseInt(pAge.getText());
                    SetName(oName.getText());
                    SetContact(Contacts);
                    SetAge(Age);
                    SetEmail(oMail.getText());
                    Setpname(pName.getText());
                    SetBreed(pType.getText());
                    SetPurpose(String.valueOf(pApp.getSelectedItem()));
                    SetSetdate(Cder.strDate);
                    SetSetTime(String.valueOf(lTime.getSelectedItem()));
                    SetlAge(String.valueOf(liAge.getSelectedItem()));

                    new Checker();

                    frame.dispose();
                } catch (Exception a) {
                    JOptionPane.showMessageDialog(null, a);
                }
            }
        });

        JButton bBack = new JButton("Back");
        bBack.setBounds(5, 7, 80, 28);
        bBack.setFont(new java.awt.Font("Arial Black", 1, 15));
        topPanel.add(bBack);
        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new HomeMenu();
                frame.dispose();
            }
        });

        frame.setVisible(true);

    }
}
