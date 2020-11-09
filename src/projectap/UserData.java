package projectap;

import java.sql.*;

public class UserData {

    //public static ArrayList<String> name = new ArrayList<String>();
    public UserData() {
    }

    public void RegUser(String name, String username, String password) throws Exception {
        //تسجيل مستخدم في حالتنا هذه سيكون هذا المستخدم هو الشخص الذي في المحل فيجب انشاء سطر جديد له في قواعد البيانات
        String sql = "INSERT INTO Admin (Name, Username, Pass) VALUES('" + name + "','" + username + "','" + password + "')";
        Connection con = this.connect();
        Statement st = con.createStatement();
        st.executeUpdate(sql);
        st.close();
        con.close();
        /*PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, password);
        ps.executeUpdate();
        ps.close();
        con.close();*/
    }

    public void Additems(String Dname, String Qun, String Price, String Brand, String Color, String CPU, String GPU, String RAM, String ROM, String SNo) throws Exception {
        //هذه الدالة لاضافة العناصر الجديدة او في حالتنا هذه الاجهزة الجديدة الى قواعد البيانات
        Connection con = this.connect();
        String sql = "insert into items (itemname, quantity, price, brand, color, cpu, gpu, ram, rom, serialcode) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, Dname);
        ps.setString(2, Qun);
        ps.setString(3, Price);
        ps.setString(4, Brand);
        ps.setString(5, Color);
        ps.setString(6, CPU);
        ps.setString(7, GPU);
        ps.setString(8, RAM);
        ps.setString(9, ROM);
        ps.setString(10, SNo);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void AddedItems() {
        //هذه الدالة كانت لطباعة محتويات الملف سيستيم برينت

    }

    public boolean CheckforLogin(String username, String password) throws Exception {
        //للتحقق من اسم المستخدم وكلمة المرور في تسجيل الدخول لنظام البائع
        //the return type must be fix

        boolean b = false;
        String sql = "select * from Admin where name like '" + username + "' and Pass = '" + password + "'";
        try {
            Connection con = this.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                String name = rs.getString("Name");
                String pass = rs.getString("Pass");
                if (username.equals(name) && password.equals(pass)) {
                    b = true;
                    break;
                }
            }
            st.close();
            con.close();
            System.out.println("Connection is Close");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    private Connection connect() throws SQLException {
        String url = "jdbc:sqlite:C:/Users/HsQ Galaxy Book/OneDrive - UMM AL-QURA UNIVERSITY/AdvanceProgramming_Project/AdvancedProgramming-Project-master/ProjectDB.db";
        Connection con = DriverManager.getConnection(url);//"jdbc:sqlite:ProjectDB.db");
        System.out.println("The Connection established");
        return con;
    }
}