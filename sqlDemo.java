package ѧ��ѡ��ϵͳ;

import java.sql.*;

public class sqlDemo {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from student.demo");

        try {
            // ����������
            Class.forName("com.mysql.jdbc.Driver");
            long start =System.currentTimeMillis();

            // ��������
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123456");
            long end = System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("�������Ӻ�ʱ�� " + (end - start) + "ms ����");

            // ����Statement����
            //Statement stmt = conn.createStatement();

            // ִ��SQL���
            //ResultSet rs = stmt.executeQuery("select * from demo");
            System.out.println("id\tusername\tpwd\t\tregTime");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2)
                        + "\t\t" + rs.getString(3) + "\t\t" + rs.getString(4));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}