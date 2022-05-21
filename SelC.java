package 学生选课系统;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.util.*;

public class SelC extends JFrame {
Vector rowData, columnNames;
Statement stmt=null;
    String sql=null;
JTable jt = null;
JScrollPane jsp = null;
PreparedStatement ps=null;
ResultSet rs=null;
public SelC(String sql1){
columnNames = new Vector();
// 设置列名
columnNames.add("课号");
columnNames.add("课名");

ImageIcon bg = new ImageIcon("C:\\Users\\常丹妮\\Desktop\\课程设计\\bj6.jpg");	//创建一个背景图片
setBounds(0, 0, 1100,885);
JLabel label=new JLabel(bg);//把背景图片添加到标签里
label.setBounds(0, 290, 1100, 880);	//把标签设置为和图片等高等宽
bg.setImage(bg.getImage().getScaledInstance(getWidth(),getHeight(),Image.SCALE_DEFAULT));
add(label);

rowData=new Vector();
sql=sql1;
try{
    Connection dbConn1=CONN();
stmt=(Statement)dbConn1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
rs=stmt.executeQuery(sql);

while(rs.next()){
Vector hang = new Vector();
hang.add(rs.getString("Cno"));System.out.print(rs.getString("Cno"));
hang.add(rs.getString("Cname"));System.out.print(rs.getString("Cname"));
rowData.add(hang);}
jt=new JTable(rowData,columnNames);
jsp=new JScrollPane(jt);
this.add(jsp);
this.setSize(400,300);
this.setVisible(true);
}catch(SQLException e1){
   System.out.print("SQL Exception occur.Message is:"+e1.getMessage());
   }
}

//连接数据库方法
public static Connection CONN(){
   String driverName = "com.mysql.cj.jdbc.Driver";   //加载JDBC驱动
   String dbURL = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC&characterEncoding=utf8";   //连接服务器和数据库test
   String userName = "root";   //默认用户名
   String userPwd = "123456";   //密码
   Connection dbConn=null;

   try {
   Class.forName(driverName);
   dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
   System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!
   } catch (Exception e) {
   e.printStackTrace();
   }
   return dbConn;
}
}