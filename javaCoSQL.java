package ѧ��ѡ��ϵͳ;

import java.sql.*;

import java.sql.*;
public class javaCoSQL {
public static void main(String[] args) {
      String JDriver = "com.mysql.cj.jdbc.Driver";// SQL���ݿ�����
      String connectDB = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC&characterEncoding=utf8";// ����Դ
      try {
          Class.forName(JDriver);// �������ݿ����棬���ظ����ַ���������
      } catch (ClassNotFoundException e) {
          // e.printStackTrace();
          System.out.println("�������ݿ�����ʧ��");
          System.exit(0);
      }
      System.out.println("���ݿ������ɹ�");
      try {


          String user = "root";
          String password = "123456";
          Connection con = DriverManager.getConnection(connectDB, user, password);// �������ݿ����
          System.out.println("�������ݿ�ɹ�");
          Statement stmt = con.createStatement();// ����SQL�������
          // ������
          System.out.println("��ʼ������");
          String query = "create table TABLE2(ID NCHAR(2),NAME NCHAR(10))";// ������SQL���
          stmt.executeUpdate(query);// ִ��SQL�������
          System.out.println("�����ɹ�");
          // ��������
          System.out.println("��ʼ��������");
          //String a="INSERT INTO user VALUES('root','123456','root')";
          String a1 = "INSERT INTO TABLE2 VALUES('1','���')";// ��������SQL���
          String a2 = "INSERT INTO TABLE2 VALUES('2','ΰ��')";
          String a3 = "INSERT INTO TABLE2 VALUES('3','�Ÿ�')";
          //stmt.executeUpdate(a);
          stmt.executeUpdate(a1);// ִ��SQL�������
          stmt.executeUpdate(a2);
          stmt.executeUpdate(a3);
          System.out.println("�������ݳɹ�");
          // ��ȡ����
          System.out.println("��ʼ��ȡ����");


          ResultSet rs = stmt.executeQuery("SELECT * FROM TABLE2");// ����SQL����ѯ�����(����)
          // ѭ�����ÿһ����¼
          while (rs.next()) {
              // ���ÿ���ֶ�
              System.out.println(rs.getString("ID") + "\t" + rs.getString("NAME"));
          }
          System.out.println("��ȡ���");
          // �ر�����
          stmt.close();// �ر������������
          con.close();// �ر����ݿ�����
      } catch (SQLException e) {
          e.printStackTrace();
          System.out.println("���ݿ����Ӵ���");
          System.exit(0);
      }
  }
}