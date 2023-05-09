package atmfinal;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Atmfinal {
    public static void main(String[] args) {
        
        //MAIN FRAME//
        
        JFrame in=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in.getContentPane().setBackground(new java.awt.Color(255,165,0));
        in.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in.setResizable(false);
        in.setSize(600,600);
        in.setLocationRelativeTo(null);
        in.setVisible(false);
        in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel cred=new JLabel(new ImageIcon("D:\\group2.jpg"));
        cred.setBounds(100,320,400,200);
        //TOP//
        JFrame front=new JFrame("CLICK TO OPEN");
        front.getContentPane().setBackground(new java.awt.Color(0,0,0));
        front.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        front.setResizable(false);
        front.setSize(600,600);
        front.setLayout(null);
        front.setLocationRelativeTo(null);
        front.setVisible(true);
        front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton click=new JButton(new ImageIcon("D:\\BankHub.png"));
        click.setBounds(100,200,400,200);
        front.add(click);
        click.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                in.setVisible(true);
                front.setVisible(false);
            }
        });
        
        //
        
        //NEW ACCOUNT//
        
        JFrame inadd=new JFrame();
        inadd.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in.setResizable(false);
        inadd.setSize(600,600);
        inadd.setLayout(null);
        inadd.setLocationRelativeTo(null);
        inadd.setVisible(false);
        inadd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //DELETE ACCOUNT//
        
        JFrame indel=new JFrame("DELETE ACCOUNT");
        indel.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg"))); 
        indel.setResizable(false);
        indel.setSize(600,600);
        indel.setLayout(null);
        indel.setLocationRelativeTo(null);
        indel.setVisible(false);
        indel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
        //ACCOUNTS//
        //MAVERICK DAVE AGUINALDO
        JFrame in2=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in2.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in2.setResizable(false);
        in2.setSize(600,600);
        in2.setLayout(null);
        in2.setLocationRelativeTo(null);
        in2.setVisible(false);
        in2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //EARL JOHN BUMANGLAG
        JFrame in3=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in3.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in3.setResizable(false);
        in3.setSize(600,600);
        in3.setLayout(null);
        in3.setLocationRelativeTo(null);
        in3.setVisible(false);
        in3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JOMEL ESTAVILLO
        JFrame in4=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in4.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in4.setResizable(false);
        in4.setSize(600,600);
        in4.setLayout(null);
        in4.setLocationRelativeTo(null);
        in4.setVisible(false);
        in4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //MARVIN GALOPE
        JFrame in5=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in5.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in5.setResizable(false);
        in5.setSize(600,600);
        in5.setLayout(null);
        in5.setLocationRelativeTo(null);
        in5.setVisible(false);
        in5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //REYNALDO SALVADOR
        JFrame in6=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in6.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        in6.setResizable(false);
        in6.setSize(600,600);
        in6.setLayout(null);
        in6.setLocationRelativeTo(null);
        in6.setVisible(false);
        in6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //MAIN FRAME
        
        JLabel welcome=new JLabel(new ImageIcon("D:\\3.png"));
        welcome.setBounds(155,15,300,93);
        welcome.setFont(new Font("Impact", Font.PLAIN , 28));
        JLabel bdo=new JLabel("We find ways");
        bdo.setBounds(250,60,400,60);
        bdo.setFont(new Font("Forte", Font.PLAIN, 12));
        JLabel enter=new JLabel("Enter 4-digit PIN: ");
        enter.setBounds(100,100,200,60);
        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,150,200,50);
        JButton bt=new JButton("Log in");
        bt.setBounds(100,210,100,30);
        JButton shutdown=new JButton("Exit");
        shutdown.setBounds(270,250,100,30);
        JButton del=new JButton("Delete Account");
        del.setBounds(250,210,120,30);
        del.setForeground(Color.red);
        JLabel lb=new JLabel("Wrong PIN !!!");
        lb.setBounds(330,155,100,30);
        lb.setFont(new Font("Ink Free", Font.BOLD, 12));
        lb.setVisible(false);
        
        pass.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(pass.getText().length()>=4){
                    e.consume();
                }
                if(pass.getText().length()<=3){
                  lb.setVisible(false);
              }
            }
        });
        
        shutdown.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              in.setVisible(false);
              front.setVisible(true);
            }
        });
        
        in.add(welcome);in.add(bdo);in.add(enter);in.add(pass);in.add(cred);
        in.add(bt);in.add(lb);in.add(del);in.add(shutdown);
        //DELETE ACCOUNT//
        
        JLabel choose=new JLabel("Choose Account to be DELETED.");
        choose.setBounds(100,50,300,30);
        JRadioButton radio1=new JRadioButton("Maverick Dave Aguinaldo");
        radio1.setBounds(100,80,200,30);
        radio1.setOpaque(false);
        radio1.setBackground(new Color(255,165,0));
        JRadioButton radio2=new JRadioButton("Earl John Bumanglag");
        radio2.setBounds(100,105,200,30);
        radio2.setOpaque(false);
        radio2.setBackground(new Color(255,165,0));
        JRadioButton radio3=new JRadioButton("Jomel Estavillo");
        radio3.setBounds(100,130,200,30);
        radio3.setOpaque(false);
        radio3.setBackground(new Color(255,165,0));
        JRadioButton radio4=new JRadioButton("Marvin Galope");
        radio4.setBounds(100,155,200,30);
        radio4.setOpaque(false);
        radio4.setBackground(new Color(255,165,0));
        JRadioButton radio5=new JRadioButton("Reynaldo Salvador");
        radio5.setBounds(100,180,200,30);
        radio5.setOpaque(false);
        radio5.setBackground(new Color(255,165,0));
        JRadioButton radio6=new JRadioButton("New Created Account");
        radio6.setBounds(300,80,200,30);
        radio6.setOpaque(false);
        radio6.setBackground(new Color(255,165,0));
        radio6.setVisible(false);
        ButtonGroup bg=new ButtonGroup();
        bg.add(radio1); bg.add(radio2); bg.add(radio3); bg.add(radio4); bg.add(radio5); bg.add(radio6);
        JButton delete=new JButton("DELETE OR CANCEL");
        delete.setBounds(100,230,200,30);
        JLabel ars=new JLabel("CHOOSE: ");
        ars.setBounds(100,260,200,30);
        ars.setForeground(Color.green);
        ars.setVisible(false);
        JButton yes,no;
        yes=new JButton("Delete");
        no=new JButton("Cancel");
        yes.setBounds(100,290,100,30);
        no.setBounds(200,290,100,30);
        yes.setVisible(false);
        no.setVisible(false);
        del.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             indel.setVisible(true);
             in.setVisible(false);
             ars.setVisible(false);
             yes.setVisible(false);
             no.setVisible(false);
            }
        });
        delete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              ars.setVisible(true);
              yes.setVisible(true);
              no.setVisible(true);
            }
        });
        no.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              indel.setVisible(false);    
            }
        });
      
        indel.add(choose);indel.add(radio1);indel.add(radio2);indel.add(radio3);indel.add(radio4);indel.add(radio5);indel.add(delete);
        indel.add(ars);indel.add(yes);indel.add(no);indel.add(radio6);      
        
         //CREATE NEW ACCOUNT//
        
        JFrame inacc=new JFrame("Create New Bank Account");
        inacc.setContentPane(new JLabel(new ImageIcon("D:\\1.jpg")));
        inacc.setResizable(false);
        inacc.setSize(600,600);
        inacc.setLayout(null);
        inacc.setLocation(350,80);
        inacc.setVisible(false);
        inacc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton add=new JButton("Create New Account");
        add.setBounds(100,250,150,30);
        in.add(add);
        JLabel note=new JLabel("Note: 1 Account Only!");
        note.setBounds(115,275,170,30);
        note.setForeground(Color.blue);
        in.add(note);
        add.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             inacc.setVisible(true);
             in.setVisible(false);
            }
        });
        JLabel first=new JLabel("FILL UP");
        first.setBounds(50,50,200,30);
        first.setFont(new Font("Hobo Std", Font.PLAIN , 24));
        inacc.add(first);
        
        JLabel tf2=new JLabel("FULL NAME:  First-Name MI Last-Name");
        tf2.setBounds(50,80,300,20);
        inacc.add(tf2);
        JLabel sex=new JLabel("Sex:");
        sex.setBounds(120,140,100,20);
        inacc.add(sex);
        JRadioButton male=new JRadioButton("Male");
        male.setBounds(170,140,70,20);
        male.setOpaque(false);
        JRadioButton female=new JRadioButton("Female");
        female.setBounds(250,140,70,20);
        female.setOpaque(false);
        ButtonGroup bgsex=new ButtonGroup();
        bgsex.add(male); bgsex.add(female);
        inacc.add(male);inacc.add(female);
        
        JLabel error=new JLabel("Letter Only!!!");
        error.setBounds(360,105,100,30);
        error.setVisible(false);
        inacc.add(error);
        JTextField tf=new JTextField();
        tf.setBounds(120,105,200,30);
        inacc.add(tf);
        JLabel pin=new JLabel("Create 4-digit PIN:");
        pin.setBounds(120,170,200,20);
        inacc.add(pin);
        JTextField pin2=new JTextField();
        pin2.setBounds(120,190,100,30);
        inacc.add(pin2);
       
        JButton create=new JButton("Create");
        create.setBounds(120,230,100,30);
        create.setEnabled(false);
        inacc.add(create);
        JLabel wrong=new JLabel("Error");
        wrong.setBounds(250,190,100,30);
        wrong.setVisible(false);
        inacc.add(wrong);
        tf.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isDigit(c)){
                    e.consume();
                    error.setVisible(true);
                }else{
                    error.setVisible(false);
                }
                if(tf.getText().length()<=0){
                 create.setEnabled(false);
                }else if(pin2.getText().length()<3){
                 create.setEnabled(false);   
               }else{
                 create.setEnabled(true);
              }
            }
        });
        pin2.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(pin2.getText().length()>=4){
                    e.consume();
                }
               if(tf.getText().length()<=0){
                 create.setEnabled(false);
                }else if(pin2.getText().length()<3){
                 create.setEnabled(false);
               }else{
                 create.setEnabled(true);
              }
              if(pin2.getText().length()<1){
                wrong.setVisible(false);
              }
            }
        });
        create.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              String first=pin2.getText();
              int x=Integer.parseInt(first);
              if(x==1234){
                  wrong.setVisible(true);
              }else if(x==5678){
                  wrong.setVisible(true);
              }else if(x==6969){
                  wrong.setVisible(true);
              }else if(x==1827){
                  wrong.setVisible(true);
              }else if(x==3333){
                  wrong.setVisible(true);
              }else{
                  wrong.setVisible(false);
                  in.setVisible(true);
                  inacc.setVisible(false);
                  add.setVisible(false);
              }
                note.setVisible(false);
            }
        });
       
       //END OF CREATING OF BANK ACCOUNT//
        
       //ACCOUNT1//MAVERICK DAVE AGUINALDO
       
       double bal1=1000.0;
       JLabel acc1=new JLabel("Balance:  Php");
       acc1.setBounds(50,50,200,30);
       
       JLabel name1=new JLabel("ACCOUNT OF Maverick Dave Aguinaldo");
       name1.setBounds(50,15,300,30);
       JTextField mav=new JTextField();
       mav.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mav.setBounds(135,50,400,50);
       mav.setEditable(false);
       String result=String.valueOf(bal1);
       mav.setText(result);
       JLabel amount1=new JLabel("Enter Amount of Money:");
       amount1.setFont(new Font("Arial", Font.BOLD, 28));
       amount1.setBounds(135,107,375,50);
       JTextField mav1=new JTextField();
       mav1.setBounds(110,150,375,50);
       mav1.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav1.getText().length()>=8){
                    e.consume();
                }
            }
        });
       
       JButton dep=new JButton("Deposit");
       dep.setBounds(110,210,375,50);
       JButton wit=new JButton("Withdraw");
       wit.setBounds(110,270,375,50);
       
       JLabel empty=new JLabel("Insufficient Balance . . .");
       empty.setFont(new Font("Impact", Font.BOLD, 28));
       empty.setBounds(120,390,375,30);
       empty.setVisible(false);
       
       JButton exit=new JButton("LOG OUT");
       exit.setBounds(110,330,375,50);
          
         dep.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav1.getText();
                double x=Double.parseDouble(first);
                String second=mav.getText();
                double y=Double.parseDouble(second);
                double bal1;
                e.getSource();
                bal1=x+y;
                String result=String.valueOf(bal1);
                mav.setText(result);
                empty.setVisible(false);
                mav1.setText("");
            }
        });
         wit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav1.getText();
                double x=Double.parseDouble(first);
                String second=mav.getText();
                double y=Double.parseDouble(second);
                double bal1;
                e.getSource();
                if(x<=y){
                     bal1=y-x;
                     String result=String.valueOf(bal1);
                     mav.setText(result);
                     empty.setVisible(false);
                }else{
                     empty.setVisible(true);
                }
                 mav1.setText("");
            }
        });
         exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in2.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==1234){
                in2.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
           }else{
                lb.setVisible(true); 
                }
                mav1.setText("");
            }
        });
       in2.add(acc1); in2.add(mav);in2.add(mav1);
       in2.add(dep);in2.add(wit);in2.add(empty);
       in2.add(exit);in2.add(name1);in2.add(amount1);
       
       
       //ACCOUNT2//EARL JOHN BUMANGLAG
       double bal2=2000.0;
       JLabel acc2=new JLabel("Balance:  Php");
       acc2.setBounds(50,50,200,30);
       
       JLabel name2=new JLabel("ACCOUNT OF Earl John Bumanglag");
       name2.setBounds(50,15,300,30);
       JTextField mav2=new JTextField();
       mav2.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mav2.setBounds(135,50,400,50);
       mav2.setEditable(false);
       String result2=String.valueOf(bal2);
       mav2.setText(result2);
       JLabel amount2=new JLabel("Enter Amount of Money:");
       amount2.setFont(new Font("Arial", Font.BOLD, 28));
       amount2.setBounds(135,107,375,50);
       
       JTextField mav3=new JTextField();
       mav3.setBounds(110,150,375,50);
       mav3.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav3.getText().length()>=8){
                    e.consume();
                }
            }
        });
       
       JButton dep2=new JButton("Deposit");
       dep2.setBounds(110,210,375,50);
       JButton wit2=new JButton("Withdraw");
       wit2.setBounds(110,270,375,50);
       
       JLabel empty2=new JLabel("Insufficient Balance");
       empty2.setFont(new Font("Impact", Font.BOLD, 28));
       empty2.setBounds(120,390,375,30);
       empty2.setVisible(false);
       
       JButton exit2=new JButton("LOG OUT");
       exit2.setBounds(110,330,375,50);
           
         dep2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav3.getText();
                double x=Double.parseDouble(first);
                String second=mav2.getText();
                double y=Double.parseDouble(second);
                double bal2;
                e.getSource();
                bal2=x+y;
                String result2=String.valueOf(bal2);
                mav2.setText(result2);
                empty2.setVisible(false);
                mav3.setText("");
            }
        });
         wit2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav3.getText();
                double x=Double.parseDouble(first);
                String second=mav2.getText();
                double y=Double.parseDouble(second);
                double bal2;
                e.getSource();
                if(x<=y){
                     bal2=y-x;
                     String result2=String.valueOf(bal2);
                     mav2.setText(result2);
                     empty2.setVisible(false);
                }else{
                    empty2.setVisible(true);
                }
                mav3.setText("");
            }
        });
         exit2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in3.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==5678){
                in3.setVisible(true);
                lb.setVisible(false); 
                in.setVisible(false);
            }else{
                lb.setVisible(true); 
                }
             mav3.setText("");
            }
        }); 
       in3.add(acc2); in3.add(mav2);in3.add(mav3);
       in3.add(dep2);in3.add(wit2);in3.add(empty2);
       in3.add(exit2);in3.add(name2);in3.add(amount2);
       
       
       //ACCOUNT3//JOMEL ESTAVILLO
       double bal3=3000.0;
       JLabel acc3=new JLabel("Balance:  Php");
       acc3.setBounds(50,50,200,30);
      
       JLabel name3=new JLabel("ACCOUNT OF Jomel Estavillo");
       name3.setBounds(50,15,300,30);
       JTextField mav4=new JTextField();
       mav4.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mav4.setBounds(135,50,400,50);
       mav4.setEditable(false);
       String result3=String.valueOf(bal3);
       mav4.setText(result3);
       JLabel amount3=new JLabel("Enter Amount of Money:");
       amount3.setFont(new Font("Arial", Font.BOLD, 28));
       amount3.setBounds(135,107,375,50);
       
       JTextField mav5=new JTextField();
       mav5.setBounds(110,150,375,50);
       mav5.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav5.getText().length()>=8){
                    e.consume();
                }
            }
        });
      
       JButton dep3=new JButton("Deposit");
       dep3.setBounds(110,210,375,50);
       JButton wit3=new JButton("Withdraw");
       wit3.setBounds(110,270,375,50);
       
       JLabel empty3=new JLabel("Insufficient Balance");
       empty3.setFont(new Font("Impact", Font.BOLD, 28));
       empty3.setBounds(120,390,375,30);
       empty3.setVisible(false);
       
       JButton exit3=new JButton("LOG OUT");
       exit3.setBounds(110,330,375,50);
           
         dep3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav5.getText();
                double x=Double.parseDouble(first);
                String second=mav4.getText();
                double y=Double.parseDouble(second);
                double bal3;
                e.getSource();
                bal3=x+y;
                String result3=String.valueOf(bal3);
                mav4.setText(result3);
                empty3.setVisible(false);
                mav5.setText("");
            }
        });
         wit3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav5.getText();
                double x=Double.parseDouble(first);
                String second=mav4.getText();
                double y=Double.parseDouble(second);
                double bal3;
                e.getSource();
                if(x<=y){
                     bal3=y-x;
                     String result3=String.valueOf(bal3);
                     mav4.setText(result3);
                     empty3.setVisible(false);
                }else{
                    empty3.setVisible(true);
                }
                mav5.setText("");
            }
        });
         exit3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in4.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==6969){
                in4.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
            }else{
                lb.setVisible(true); 
                }
            mav5.setText("");
            }
        }); 
       in4.add(acc3); in4.add(mav4);in4.add(mav5);
       in4.add(dep3);in4.add(wit3);in4.add(empty3);
       in4.add(exit3);in4.add(name3);in4.add(amount3);
    
       
     //ACCOUNT4//MARVIN GALOPE
       double bal4=4000.0;
       JLabel acc4=new JLabel("Balance:  Php");
       acc4.setBounds(50,50,200,30);
       
       JLabel name4=new JLabel("ACCOUNT OF Marvin Galope");
       name4.setBounds(50,15,300,30);
       JTextField mav6=new JTextField();
       mav6.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mav6.setBounds(135,50,400,50);
       mav6.setEditable(false);
       String result4=String.valueOf(bal4);
       mav6.setText(result4);
       JLabel amount4=new JLabel("Enter Amount of Money:");
       amount4.setFont(new Font("Arial", Font.BOLD, 28));
       amount4.setBounds(135,107,375,50);
       
       JTextField mav7=new JTextField();
       mav7.setBounds(110,150,375,50);
       mav7.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav7.getText().length()>=8){
                    e.consume();
                }
            }
        });

       JButton dep4=new JButton("Deposit");
       dep4.setBounds(110,210,375,50);
       JButton wit4=new JButton("Withdraw");
       wit4.setBounds(110,270,375,50);
       
       JLabel empty4=new JLabel("Insufficient Balance");
       empty4.setFont(new Font("Impact", Font.BOLD, 28));
       empty4.setBounds(120,390,375,30);
       empty4.setVisible(false);
       
       JButton exit4=new JButton("LOG OUT");
       exit4.setBounds(110,330,375,50);
           
         dep4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav7.getText();
                double x=Double.parseDouble(first);
                String second=mav6.getText();
                double y=Double.parseDouble(second);
                double bal4;
                e.getSource();
                bal4=x+y;
                String result4=String.valueOf(bal4);
                mav6.setText(result4);
                empty4.setVisible(false);
                mav7.setText("");
            }
        });
         wit4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav7.getText();
                double x=Double.parseDouble(first);
                String second=mav6.getText();
                double y=Double.parseDouble(second);
                double bal4;
                e.getSource();
                if(x<=y){
                     bal4=y-x;
                     String result4=String.valueOf(bal4);
                     mav6.setText(result4);
                     empty4.setVisible(false);
                }else{
                    empty4.setVisible(true);
                }
                mav7.setText("");
            }
        });
         exit4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in5.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==1827){
                in5.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
            }else{
                lb.setVisible(true); 
                }
            mav7.setText("");
            }
        }); 
       in5.add(acc4); in5.add(mav6);in5.add(mav7);
       in5.add(dep4);in5.add(wit4);in5.add(empty4);
       in5.add(exit4);in5.add(name4);in5.add(amount4);
       
 
     //ACCOUNT5/REYNALDO SALVADOR
       double bal5=5000.0;
       JLabel acc5=new JLabel("Balance:  Php");
       acc5.setBounds(50,50,200,30);
       
       JLabel name5=new JLabel("ACCOUNT OF Reynaldo Salvador");
       name5.setBounds(50,15,300,30);
       JTextField mav8=new JTextField();
       mav8.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mav8.setBounds(135,50,400,50);
       mav8.setEditable(false);
       String result5=String.valueOf(bal5);
       mav8.setText(result5);
       JLabel amount5=new JLabel("Enter Amount of Money:");
       amount5.setFont(new Font("Arial", Font.BOLD, 28));
       amount5.setBounds(135,107,375,50);
       
       JTextField mav9=new JTextField();
       mav9.setBounds(110,150,375,50);
       mav9.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav9.getText().length()>=8){
                    e.consume();
                }
            }
        });
       
       JButton dep5=new JButton("Deposit");
       dep5.setBounds(110,210,375,50);
       JButton wit5=new JButton("Withdraw");
       wit5.setBounds(110,270,375,50);
       
       JLabel empty5=new JLabel("Insufficient Balance");
       empty5.setFont(new Font("Impact", Font.BOLD, 28));
       empty5.setBounds(120,390,375,30);
       empty5.setVisible(false);
       
       JButton exit5=new JButton("LOG OUT");
       exit5.setBounds(110,330,375,50);
           
         dep5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav9.getText();
                double x=Double.parseDouble(first);
                String second=mav8.getText();
                double y=Double.parseDouble(second);
                double bal5;
                e.getSource();
                bal5=x+y;
                String result5=String.valueOf(bal5);
                mav8.setText(result5);
                empty5.setVisible(false);
                mav9.setText("");
            }
        });
         wit5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav9.getText();
                double x=Double.parseDouble(first);
                String second=mav8.getText();
                double y=Double.parseDouble(second);
                double bal5;
                e.getSource();
                if(x<=y){
                     bal5=y-x;
                     String result5=String.valueOf(bal5);
                     mav8.setText(result5);
                     empty5.setVisible(false);
                }else{
                    empty5.setVisible(true);
                }
                mav9.setText("");
            }
        });
         exit5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in6.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==3333){
                in6.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
            }else{
                lb.setVisible(true); 
                }
            mav9.setText("");
            }
        }); 
       in6.add(acc5); in6.add(mav8);in6.add(mav9);
       in6.add(dep5);in6.add(wit5);in6.add(empty5);
       in6.add(exit5);in6.add(name5);in6.add(amount5);
       
        //NEW ACOUNT//        
 
       double bal1new=0.0;
       JLabel acc1new=new JLabel("Balance:  Php");
       acc1new.setBounds(50,50,200,30);
       
       JLabel namenew=new JLabel("NEW CREATED ACCOUNT");
       namenew.setBounds(160,15,300,30);
       namenew.setFont(new Font("Impact", Font.PLAIN, 28));
       JTextField mavnew=new JTextField();
       mavnew.setFont(new Font("Cambria Math", Font.BOLD, 28));
       mavnew.setBounds(135,50,400,50);
       mavnew.setEditable(false);
       String resultnew=String.valueOf(bal1new);
       mavnew.setText(resultnew);
       JLabel amount6=new JLabel("Enter Amount of Money:");
       amount6.setFont(new Font("Arial", Font.BOLD, 28));
       amount6.setBounds(135,107,375,50);
       
       
       JTextField mav1new=new JTextField();
       mav1new.setBounds(110,150,375,50);
       mav1new.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                char c= e.getKeyChar();
                if(Character.isLetter(c)){
                    e.consume();
                }
                if(mav1new.getText().length()>=8){
                    e.consume();
                }
            }
        });
       
       JButton depnew=new JButton("Deposit");
       depnew.setBounds(110,210,375,50);
       JButton witnew=new JButton("Withdraw");
       witnew.setBounds(110,270,375,50);
       
       JLabel emptynew=new JLabel("Insufficient Balance");
       emptynew.setFont(new Font("Impact", Font.BOLD, 28));
       emptynew.setBounds(120,390,375,30);
       emptynew.setVisible(false);
       
       JButton exitnew=new JButton("LOG OUT");
       exitnew.setBounds(110,330,375,50);
          
         depnew.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String first=mav1new.getText();
                double x=Double.parseDouble(first);
                String second=mavnew.getText();
                double y=Double.parseDouble(second);
                double bal1new;
                e.getSource();
                bal1new=x+y;
                String resultnew=String.valueOf(bal1new);
                mavnew.setText(resultnew);
                emptynew.setVisible(false);
                mav1new.setText("");
            }
        });
         witnew.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String first=mav1new.getText();
                double x=Double.parseDouble(first);
                String second=mavnew.getText();
                double y=Double.parseDouble(second);
                double bal1new;
                e.getSource();
                if(x<=y){
                     bal1new=y-x;
                     String resultnew=String.valueOf(bal1new);
                     mavnew.setText(resultnew);
                     emptynew.setVisible(false);
                }else{
                     emptynew.setVisible(true);
                }
                mav1new.setText("");
            }
        });
         exitnew.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              inadd.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
            }
        });
         create.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               bt.addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                           String first=pass.getText();
                           int x=Integer.parseInt(first);
                           String second=pin2.getText();
                           int y=Integer.parseInt(second);
                if(x==y){
                           inadd.setVisible(true);
                           lb.setVisible(false);
                           in.setVisible(false);                
                  }else{
                           lb.setVisible(true); 
                        }
                           mav1new.setText("");
                    }
                });
                radio6.setVisible(true);
            }
        });
       inadd.add(acc1new); inadd.add(mavnew);inadd.add(mav1new);
       inadd.add(depnew);inadd.add(witnew);inadd.add(emptynew);
       inadd.add(exitnew);inadd.add(namenew);inadd.add(amount6);
       
       //YES BUTTON//
       
         yes.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                   in.setVisible(true);
                   indel.setVisible(false);
                   if(radio1.isSelected()){
                        acc1.setVisible(false); 
                        mav.setVisible(false);
                        amount1.setText("Maverick Dave Aguinaldo");
                        mav1.setVisible(false);
                        dep.setVisible(false);
                        wit.setText("Account Deleted!!!");
                        wit.setEnabled(false);
                        empty.setVisible(false);
                        exit.setText("EXIT");
                        name1.setVisible(false);
                        radio1.setVisible(false);
                   }else if(radio2.isSelected()){
                        acc2.setVisible(false); 
                        mav2.setVisible(false);
                        amount2.setText("Earl John Bumanglag");
                        mav3.setVisible(false);
                        dep2.setVisible(false);
                        wit2.setText("Account Deleted!!!");
                        wit2.setEnabled(false);
                        empty2.setVisible(false);
                        exit2.setText("EXIT");
                        name2.setVisible(false);
                        radio2.setVisible(false);
                   }
                   else if(radio3.isSelected()){
                        acc3.setVisible(false); 
                        mav4.setVisible(false);
                        amount3.setText("Jomel Estavillo");
                        mav5.setVisible(false);
                        dep3.setVisible(false);
                        wit3.setText("Account Deleted!!!");
                        wit3.setEnabled(false);
                        empty3.setVisible(false);
                        exit3.setText("EXIT");
                        name3.setVisible(false);
                        radio3.setVisible(false);
                   }else if(radio4.isSelected()){
                        acc4.setVisible(false); 
                        mav6.setVisible(false);
                        amount4.setText("Marvin Galope");
                        mav7.setVisible(false);
                        dep4.setVisible(false);
                        wit4.setText("Account Deleted!!!");
                        wit4.setEnabled(false);
                        empty4.setVisible(false);
                        exit4.setText("EXIT");
                        name4.setVisible(false);
                        radio4.setVisible(false);
                   }else if(radio5.isSelected()){
                        acc5.setVisible(false); 
                        mav8.setVisible(false);
                        amount5.setText("Reynaldo Salvador");
                        mav9.setVisible(false);
                        dep5.setVisible(false);
                        wit5.setText("Account Deleted!!!");
                        wit5.setEnabled(false);
                        empty5.setVisible(false);
                        exit5.setText("EXIT");
                        name5.setVisible(false);
                        radio5.setVisible(false);
                   }
                   else if(radio6.isSelected()){
                        acc1new.setVisible(false); 
                        mavnew.setVisible(false);
                        amount6.setText("Unknown Account");
                        mav1new.setVisible(false);
                        depnew.setVisible(false);
                        witnew.setText("Account Deleted!!!");
                        witnew.setEnabled(false);
                        emptynew.setVisible(false);
                        exitnew.setText("EXIT");
                        namenew.setVisible(false);
                        radio6.setVisible(false);
                   }
            }
        });   
   }           
}