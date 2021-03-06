package 学生选课系统;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener {
    Addstu 增加学生界面;
    Updatastu 修改学生界面;
    Delstu 删除学生界面;
    AddC 增加课程界面;
    DelC 删除课程界面;
    UpdateC 修改课程界面;
    AddSC 增加选课界面;
    DelSC 删除选课界面;
    UpdateSC 修改选课界面;
    Selstu 学生查询界面;
    JPanel pCenter;
    CardLayout card = null;
    JLabel label = null;
    JMenuBar mb = new JMenuBar();//菜单栏
    JMenu m1 = new JMenu("学生管理");
    JMenuItem add1 = new JMenuItem("添加   ");
    JMenuItem updata1 = new JMenuItem("更新   ");
    JMenuItem delete1 = new JMenuItem("删除   ");
    JMenu m2 = new JMenu("课程管理");
    JMenuItem add2 = new JMenuItem("添加   ");
    JMenuItem updata2 = new JMenuItem("更新   ");
    JMenuItem delete2 = new JMenuItem("删除   ");
    JMenu m3 = new JMenu("选课管理");
    JMenuItem add3 = new JMenuItem("添加   ");
    JMenuItem updata3 = new JMenuItem("更新   ");
    JMenuItem delete3 = new JMenuItem("删除   ");
    JMenu m4 = new JMenu("查询管理");
    JMenuItem 学生查询 = new JMenuItem("查询信息   ");
    JMenuItem m5 = new JMenuItem("系统退出");
    Font t = new Font("黑体", Font.PLAIN, 28);
    Font tr = new Font("黑体", Font.PLAIN, 25);
    Font tr1 = new Font("黑体", Font.PLAIN, 20);
 

    public Menu() {
        setTitle("1904070273常丹妮");

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("不能设置外观:   " + e);
        }


        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
        imPanel.setOpaque(false);//将内容面板设为透明
 

        //组合菜单

        addMenu1();
        addMenu2();
        addMenu3();
        addMenu4();
        addJMenuBar();
        setJMenuBar(mb);


//点击事件
        add1.addActionListener(this);
        updata1.addActionListener(this);
        delete1.addActionListener(this);
        m5.addActionListener(this);
        add2.addActionListener(this);
        delete2.addActionListener(this);
        updata2.addActionListener(this);
        add3.addActionListener(this);
        delete3.addActionListener(this);
        updata3.addActionListener(this);
        学生查询.addActionListener(this);



        card = new CardLayout();
        pCenter = new JPanel();
        pCenter.setLayout(card);



        增加学生界面 = new Addstu();
        修改学生界面 = new Updatastu();
        删除学生界面 = new Delstu();
        增加课程界面 = new AddC();
        删除课程界面 = new DelC();
        修改课程界面 = new UpdateC();
        增加选课界面 = new AddSC();
        删除选课界面 = new DelSC();
        修改选课界面 = new UpdateSC();
        学生查询界面 = new Selstu();


        ImageIcon ico=new ImageIcon("C:\\Users\\常丹妮\\Desktop\\课程设计\\bj.jpg");

        JButton btn=new JButton("选课管理系统",ico);
        btn.setBounds(400,1500, ico.getIconWidth(), ico.getIconHeight());
        btn.setFocusPainted(false);//设置成透明
        btn.setBorderPainted(false);//聚焦阴影不显示
        btn.setContentAreaFilled(false);//外边框不显示、
        btn.setFont(new Font("宋体", Font.PLAIN, 80));
        btn.setHorizontalTextPosition(SwingConstants.CENTER);
        btn.setForeground(Color.white);//文字颜色

        pCenter.add("欢迎界面", btn);
        pCenter.add("增加学生界面", 增加学生界面);
        pCenter.add("修改学生界面", 修改学生界面);
        pCenter.add("删除学生界面", 删除学生界面);

        pCenter.add("增加课程界面", 增加课程界面);
        pCenter.add("删除课程界面", 删除课程界面);
        pCenter.add("修改课程界面", 修改课程界面);
        pCenter.add("增加选课界面", 增加选课界面);
        pCenter.add("删除选课界面", 删除选课界面);
        pCenter.add("修改选课界面", 修改选课界面);
        pCenter.add("学生查询界面", 学生查询界面);
        add(pCenter, BorderLayout.CENTER);

        setBounds(700, 250, 1100, 780);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {//关闭程序时的操作
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        validate();

    }


    private void addJMenuBar() {
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
    }

    private void addMenu4() {
    	add1.setFont(tr);
    	updata1.setFont(tr);
    	delete1.setFont(tr);
    	add2.setFont(tr);
    	updata2.setFont(tr);
    	delete2.setFont(tr);
    	add3.setFont(tr);
    	updata3.setFont(tr);
    	delete3.setFont(tr);
    	学生查询.setFont(tr);
    	m5.setFont(t);
        m4.add(学生查询);
        m4.setFont(t);
    }

    private void addMenu3() {
        m3.add(add3);
        m3.add(updata3);
        m3.add(delete3);
        m3.setFont(t);
    }

    private void addMenu2() {//将菜单加入到菜单栏中
        m2.add(add2);
        m2.add(updata2);
        m2.add(delete2);
        m2.setFont(t);
    }

    private void addMenu1() {
        m1.add(add1);
        m1.add(updata1);
        m1.add(delete1);
        m1.setFont(t);//字体
    }


    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == m5) {
            System.exit(0);
        } else {
            if (obj == add1) {
                card.show(pCenter, "增加学生界面");
            } else {
                if (obj == updata1) {
                    card.show(pCenter, "修改学生界面");
                } else {
                    if (obj == delete1) {
                        card.show(pCenter, "删除学生界面");
                    } else {
                        if (obj == add2) {
                            card.show(pCenter, "增加课程界面");
                        } else {
                            if (obj == delete2) {
                                card.show(pCenter, "删除课程界面");
                            } else {
                                if (obj == updata2) {
                                    card.show(pCenter, "修改课程界面");
                                } else {
                                    if (obj == add3) {
                                        card.show(pCenter, "增加选课界面");
                                    } else {
                                        if (obj == delete3) {
                                            card.show(pCenter, "删除选课界面");
                                        } else {
                                            if (obj == updata3) {
                                                card.show(pCenter, "修改选课界面");
                                            } else {
                                                if (obj == 学生查询) {
                                                    card.show(pCenter, "学生查询界面");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}

