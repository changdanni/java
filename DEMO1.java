package ѧ��ѡ��ϵͳ;

import java.sql.Connection;
import java.sql.DriverManager;

public class DEMO1 {
    public static void main(String[] args) {
        DEMO1 demo1 = new DEMO1();
        demo1.CONN();

    }
    public static Connection CONN(){
        String driverName = "com.mysql.cj.jdbc.Driver";   //����JDBC����
        String dbURL = "jdbc:mysql://localhost:3306/student/student?serverTimezone=UTC&characterEncoding=utf8";   //���ӷ����������ݿ�test
        String userName = "root";   //Ĭ���û���
        String userPwd = "123456";   //����
        Connection dbConn=null;

        try {
            Class.forName(driverName);
            dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("Connection Successful!");   //������ӳɹ� ����̨���Connection Successful!
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dbConn;
    }
}
