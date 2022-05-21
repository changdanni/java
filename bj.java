package 学生选课系统;

import javax.swing.*;

public class bj extends JFrame {
    public void st(){
        JPanel imPanel=(JPanel) this.getContentPane();//注意内容面板必须强转为JPanel才可以实现下面的设置透明
        imPanel.setOpaque(false);//将内容面板设为透明
        ImageIcon icon=new ImageIcon("bj2.png");
        JLabel la = new JLabel(icon);//往一个标签中加入图片
        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//设置标签位置大小，记得大小要和窗口一样大
        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//标签添加到层面板
        add(la);
    }
}
