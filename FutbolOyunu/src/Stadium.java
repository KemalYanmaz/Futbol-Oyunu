
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Stadium {
int min=0;
JPanel main_panel=new JPanel();
JPanel Panel=new JPanel();

JPanel panel1=new JPanel();
JPanel panel2=new JPanel();
JPanel panel3=new JPanel();
JPanel panel4=new JPanel();
JPanel panel5=new JPanel();
JPanel panel6=new JPanel();
JPanel panel7=new JPanel();
JPanel panel8=new JPanel();
JPanel panel9=new JPanel();
JPanel panel10=new JPanel();

JPanel minute=new JPanel();
JLabel minute_=new JLabel();

JLabel label1=new JLabel();
JLabel label2=new JLabel();
JLabel label3=new JLabel();
JLabel label4=new JLabel();
JLabel label5=new JLabel();
JLabel label6=new JLabel();
JLabel label7=new JLabel();
JLabel label8=new JLabel();
JLabel label9=new JLabel();
JLabel label10=new JLabel();
    
    
    
public JPanel buildStadium(){
main_panel.setLayout(null);

Panel.setSize(400,500);
Panel.setLayout(null);
Panel.setLocation(0,0);
Panel.setBackground(Color.red);

panel1.setSize(370,30);
panel1.setLayout(null);
panel1.setLocation(15,30);    

panel2.setSize(370,30);
panel2.setLayout(null);
panel2.setLocation(15,65);

panel3.setSize(370,30);
panel3.setLayout(null);
panel3.setLocation(15,100);

panel4.setSize(370,30);
panel4.setLayout(null);
panel4.setLocation(15,135);

panel5.setSize(370,30);
panel5.setLayout(null);
panel5.setLocation(15,170);

panel6.setSize(370,30);
panel6.setLayout(null);
panel6.setLocation(15,205);
    
panel7.setSize(370,30);
panel7.setLayout(null);
panel7.setLocation(15,240);

panel8.setSize(370,30);
panel8.setLayout(null);
panel8.setLocation(15,275);

panel9.setSize(370,30);
panel9.setLayout(null);
panel9.setLocation(15,310);

panel10.setSize(370,30);
panel10.setLayout(null);
panel10.setLocation(15,345);

minute.setSize(60,60);
minute.setLayout(null);
minute.setLocation(15,380);

label1.setSize(370,30);
label1.setLocation(0,0);

label2.setSize(370,30);
label2.setLocation(0,0);

label3.setSize(370,30);
label3.setLocation(0,0);

label3.setSize(370,30);
label3.setLocation(0,0);

label4.setSize(370,30);
label4.setLocation(0,0);

label5.setSize(370,30);
label5.setLocation(0,0);

label6.setSize(370,30);
label6.setLocation(0,0);

label7.setSize(370,30);
label7.setLocation(0,0);

label8.setSize(370,30);
label8.setLocation(0,0);

label9.setSize(370,30);
label9.setLocation(0,0);

label10.setSize(370,30);
label10.setLocation(0,0);

minute_.setSize(60,60);
minute_.setLocation(5,0);
minute_.setText("3'");
minute_.setFont(new Font("Serif", Font.PLAIN, 45));




main_panel.add(Panel);
Panel.add(minute);
Panel.add(panel1);
Panel.add(panel2);
Panel.add(panel3);
Panel.add(panel4);
Panel.add(panel5);
Panel.add(panel6);
Panel.add(panel7);
Panel.add(panel8);
Panel.add(panel9);
Panel.add(panel10);

minute.add(minute_);
panel1.add(label1);
panel2.add(label2);
panel3.add(label3);
panel4.add(label4);
panel5.add(label5);
panel6.add(label6);
panel7.add(label7);
panel8.add(label8);
panel9.add(label9);
panel10.add(label10);
    
return main_panel;
}
public static void main(String[]args){
    JFrame frame=new JFrame("Stadium");
    Stadium stad=new Stadium();
    frame.setSize(400,500);
    frame.setLocation(450,65);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(stad.buildStadium());
    frame.setVisible(true);
    frame.setResizable(false);
    ArrayList<String> a=new ArrayList<>();
        a.add("GS");a.add("FB");a.add("BJK");a.add("TS");
        a.add("SS");a.add("KS");a.add("GTS");a.add("KPS");
    Timer main_timer=new Timer(50,null);
    main_timer.addActionListener(new ActionListener(){
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(stad.min<91){
                stad.minute_.setText(stad.min+"'");
                










                
            }
        }
    });
    main_timer.start();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}
