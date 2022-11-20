package finalProject;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField.AbstractFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.SqlDateModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

public class Cder {

    public static String strDate;
    //public static void main(String[]args){
        Cder(){

        JFrame frame = new JFrame("Calendar");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null);
        ImageIcon imageIcon0 = new ImageIcon("veterinary.png");
        frame.setIconImage(imageIcon0.getImage());
        frame.setLocationRelativeTo(null);

        JLabel schedTime = new JLabel("Set Schedule");
        schedTime.setBounds(125, 10, 180, 50);
        schedTime.setFont(new Font("Arial", Font.BOLD,20));
        frame.add(schedTime);
        
        JButton bBack = new JButton("OK");
        bBack.setBounds(150, 310, 80, 28);
        bBack.setFont(new java.awt.Font("Arial Black", 1, 15));
        frame.add(bBack);
        bBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                new SetAppointment();
                frame.dispose();
            }
        });
        
        SqlDateModel model = new SqlDateModel();
        Properties p = new Properties();
        model.setSelected(true);
        p.put("text.day", "Day");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl paneldate = new JDatePanelImpl(model,p);
        JDatePickerImpl datePicker = new JDatePickerImpl(paneldate, new AbstractFormatter(){ 
            
            @Override
            public String valueToString(Object value) throws ParseException {

                // TODO Auto-generated method stub
                if(value != null)
                {
                Calendar cal = (Calendar)value;
                SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");
                strDate = format.format(cal.getTime());
                cal.getTime();
                return strDate;
            }return "";
            }
            
            @Override
            public Object stringToValue(String text) throws ParseException {
                // TODO Auto-generated method stub
                return "";
            }
           
            });
            datePicker.setBounds(90, 70, 200, 50);
            frame.add(datePicker);
            frame.setVisible(true);
    }
}  



