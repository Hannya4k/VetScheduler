package finalProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checker extends User {

    //public static void main(String[] args) {

    Checker() {
        JFrame frame = new JFrame("Infomation Checker");
        frame.setSize(700, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon imageIcon0 = new ImageIcon("veterinary.png");
        frame.setIconImage(imageIcon0.getImage());
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.pack();

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.white);
        centerPanel.setBounds(80, 70, 520, 460);
        centerPanel.setLayout(null);
        frame.add(centerPanel);

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.DARK_GRAY);
        topPanel.setBounds(0, 0, 985, 60);
        topPanel.setLayout(null);
        frame.add(topPanel);

        ImageIcon imageIcon1 = new ImageIcon("smolV.png");
        JLabel icon1 = new JLabel();
        icon1.setIcon(imageIcon1);
        icon1.setBounds(180, 7, 50, 50);
        topPanel.add(icon1);

        JLabel textLabel = new JLabel("SVHospital");
        textLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 50));
        textLabel.setForeground(Color.white);
        textLabel.setBounds(240, 7, 250, 50);
        topPanel.add(textLabel);

        UIManager.put("TextField.inactiveBackground", new ColorUIResource(new Color(255, 255, 255)));

        JLabel oname = new JLabel("Name: " + getName());
        oname.setFont(new Font("Arial", Font.BOLD, 17));
        oname.setBounds(30, 50, 300, 50);
        JTextField nType = new JTextField();
        nType.setBounds(85, 60, 200, 30);
        nType.setEditable(false);
        nType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(oname);
        centerPanel.add(nType);

        JLabel contact = new JLabel("Contact #: 0" + getContact());
        contact.setFont(new Font("Arial", Font.BOLD, 17));
        contact.setBounds(30, 85, 300, 50);
        JTextField cType = new JTextField();
        cType.setBounds(120, 95, 200, 30);
        cType.setEditable(false);
        cType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(contact);
        centerPanel.add(cType);

        JLabel email = new JLabel("Email Address: " + getEmail());
        email.setFont(new Font("Arial", Font.BOLD, 17));
        email.setBounds(30, 120, 400, 50);
        JTextField eType = new JTextField();
        eType.setBounds(155, 130, 400, 30);
        eType.setEditable(false);
        eType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(email);
        centerPanel.add(eType);

        JLabel pname = new JLabel("Pet's Name: " + getpname());
        pname.setFont(new Font("Arial", Font.BOLD, 17));
        pname.setBounds(30, 155, 300, 50);
        JTextField pType = new JTextField();
        pType.setBounds(130, 165, 200, 30);
        pType.setEditable(false);
        pType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(pname);
        centerPanel.add(pType);

        JLabel age = new JLabel("Age of Pet:  " + getAge());
        age.setFont(new Font("Arial", Font.BOLD, 17));
        age.setBounds(30, 190, 300, 50);
        JTextField aType = new JTextField();
        aType.setBounds(120, 200, 20, 30);
        aType.setEditable(false);
        aType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(age);
        centerPanel.add(aType);

        JLabel lage = new JLabel(getlAge());
        lage.setFont(new Font("Arial", Font.BOLD, 17));
        lage.setBounds(145, 190, 300, 50);
        centerPanel.add(lage);

        /*
         * JTextField laType = new JTextField();
         * laType.setFont(new Font("Arial", Font.BOLD, 17));
         * laType.setBounds(160, 200, 200, 30);
         * laType.setEditable(false);
         * laType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
         * centerPanel.add(laType);
         */
         
        JLabel breed = new JLabel("Breed/Species: " + getBreed());
        breed.setFont(new Font("Arial", Font.BOLD, 17));
        breed.setBounds(30, 225, 300, 50);
        JTextField bType = new JTextField();
        bType.setBounds(155, 235, 200, 30);
        bType.setEditable(false);
        bType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(breed);
        centerPanel.add(bType);

        JLabel poa = new JLabel("Purpose of Appointment: " + super.getPurpose());
        poa.setFont(new Font("Arial", Font.BOLD, 17));
        poa.setBounds(30, 260, 300, 50);
        JTextField poaType = new JTextField();
        poaType.setBounds(230, 270, 400, 30);
        poaType.setEditable(false);
        poaType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(poa);
        centerPanel.add(poaType);

        JLabel sd = new JLabel("Schedule Date: " + getSetdate());
        sd.setFont(new Font("Arial", Font.BOLD, 17));
        sd.setBounds(30, 295, 300, 50);
        JTextField sdType = new JTextField();
        sdType.setBounds(155, 305, 200, 30);
        sdType.setEditable(false);
        sdType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(sd);
        centerPanel.add(sdType);

        JLabel st = new JLabel("Schedule Time: " + getSetTime());
        st.setFont(new Font("Arial", Font.BOLD, 17));
        st.setBounds(30, 330, 300, 50);
        JTextField stType = new JTextField();
        stType.setBounds(155, 340, 200, 30);
        stType.setEditable(false);
        stType.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        centerPanel.add(st);
        centerPanel.add(stType);

        JLabel info = new JLabel("Is the information above is correct?");
        info.setFont(new Font("Arial", Font.BOLD, 16));
        info.setBounds(210, 520, 300, 50);
        frame.add(info);

        JButton byes = new JButton("YES");
        byes.setBounds(240, 560, 80, 30);
        byes.setFont(new java.awt.Font("Arial Black", 1, 17));
        frame.add(byes);
        byes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                
                // SetName(oname.getName());
                // SetContact(cType.getContact());
                // System.out.println(oname.getName());
                new Database();
                JOptionPane.showMessageDialog(null, "All set. See you in the Clinic");
                new HomeMenu();
                frame.dispose();
            }
        });

        JButton bno = new JButton("NO");
        bno.setBounds(350, 560, 80, 30);
        bno.setFont(new java.awt.Font("Arial Black", 1, 15));
        frame.add(bno);
        bno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new SetAppointment();
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}
