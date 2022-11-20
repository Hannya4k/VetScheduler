package finalProject;

import java.io.PrintWriter;
import java.io.FileWriter;

public class Database extends User{
  String age = getAge() + " " + getlAge();
  public Database() {
    
    saveToTextFile();
  }
  public void saveToTextFile(){
    try {

      PrintWriter fw = new PrintWriter(new FileWriter("Appointments.txt", true));

      fw.print(getName() + " : " + getContact() + " : " + getEmail() + " : ");
      fw.print(getpname() + " : " +  age + " : " + getBreed() + " : ");
      fw.print(getPurpose() + " : " + getSetdate() + " : " + getSetTime() + " : ");
      fw.println();
      fw.close();
    
    } catch (Exception e) {
      e.getStackTrace();
    }

  }
}
