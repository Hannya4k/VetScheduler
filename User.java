package finalProject;

public class User {

    private static String oName;
    private static long cNum;
    private static String oMail;
    private static String pName;
    private static int pAge;
    private static String pType;
    private static String pApp;
    private static String strDate;
    private static String lTime;
    private static String liAge;

    public static void SetName(String name) {
        oName = name;
    }

    public String getName() {
        return oName;
    }

    public static void SetContact(long contact) {
        cNum = contact;
    }

    public Long getContact() {
        return cNum;
    }

    public static void SetEmail(String email) {
        oMail = email;
    }

    public String getEmail() {
        return oMail;
    }

    public static void Setpname(String petname) {
        pName = petname;
    }

    public String getpname() {
        return pName;
    }

    public static void SetAge(int age) {
        pAge = age;
    }

    public Integer getAge() {
        return pAge;
    }

    public static void SetBreed(String breed) {
        pType = breed;
    }

    public String getBreed() {
        return pType;
    }

    public static void SetPurpose(String poa) {
        pApp = poa;
    }

    public String getPurpose() {
        return pApp;
    }

    public static void SetSetdate(String sd) {
        strDate = sd;
    }

    public String getSetdate() {
        return strDate;
    }

    public static void SetSetTime(String st) {
        lTime = st;
    }

    public String getSetTime() {
        return lTime;
    }

    public static void SetlAge(String la) {
        liAge = la;
    }

    public String getlAge() {
        return liAge;
    }
}