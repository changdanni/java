package ѧ��ѡ��ϵͳ;

import javax.swing.*;

public class bj extends JFrame {
    public void st(){
        JPanel imPanel=(JPanel) this.getContentPane();//ע������������ǿתΪJPanel�ſ���ʵ�����������͸��
        imPanel.setOpaque(false);//�����������Ϊ͸��
        ImageIcon icon=new ImageIcon("bj2.png");
        JLabel la = new JLabel(icon);//��һ����ǩ�м���ͼƬ
        la.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());//���ñ�ǩλ�ô�С���ǵô�СҪ�ʹ���һ����
        this.getLayeredPane().add(la, Integer.valueOf(Integer.MIN_VALUE));//��ǩ��ӵ������
        add(la);
    }
}
