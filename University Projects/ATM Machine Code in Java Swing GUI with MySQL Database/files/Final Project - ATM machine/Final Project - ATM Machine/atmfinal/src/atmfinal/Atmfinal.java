package atmfinal;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class Atmfinal {
    public static void main(String[] args) {
        Connector con=new Connector();
        con.initConnection();
        
        //MAIN FRAME//
      
        JFrame in=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in.getContentPane().setBackground(new java.awt.Color(255,165,0));
        in.setContentPane(new JLabel(new ImageIcon("D:\\atm.jpg")));
        in.setResizable(false);
        in.setSize(800,800);
        in.setLocationRelativeTo(null);
        in.setVisible(false);
        in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //TOP//
        
        JFrame front=new JFrame("CLICK TO OPEN");
        front.getContentPane().setBackground(new java.awt.Color(0,0,0));
        front.setResizable(false);
        front.setSize(800,800);
        front.setLayout(null);
        front.setLocationRelativeTo(null);
        front.setVisible(true);
        front.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton click=new JButton(new ImageIcon("D:\\BankHub.png"));
        click.setBounds(200,300,400,200);
        front.add(click);
        click.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              front.setVisible(false);
            }
        });
        //ACCOUNTS//
        
        //MAVERICK DAVE AGUINALDO
        JFrame in2=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in2.setContentPane(new JLabel(new ImageIcon("D:\\atms.jpg")));
        in2.setResizable(false);
        in2.setSize(600,600);
        in2.setLayout(null);
        in2.setLocationRelativeTo(null);
        in2.setVisible(false);
        in2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //EARL JOHN BUMANGLAG
        JFrame in3=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in3.setContentPane(new JLabel(new ImageIcon("D:\\atms.jpg")));
        in3.setResizable(false);
        in3.setSize(600,600);
        in3.setLayout(null);
        in3.setLocationRelativeTo(null);
        in3.setVisible(false);
        in3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //JOMEL ESTAVILLO
        JFrame in4=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in4.setContentPane(new JLabel(new ImageIcon("D:\\atms.jpg")));
        in4.setResizable(false);
        in4.setSize(600,600);
        in4.setLayout(null);
        in4.setLocationRelativeTo(null);
        in4.setVisible(false);
        in4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //MARVIN GALOPE
        JFrame in5=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in5.setContentPane(new JLabel(new ImageIcon("D:\\atms.jpg")));
        in5.setResizable(false);
        in5.setSize(600,600);
        in5.setLayout(null);
        in5.setLocationRelativeTo(null);
        in5.setVisible(false);
        in5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //REYNALDO SALVADOR
        JFrame in6=new JFrame("AUTOMATED TELLER MACHINE by Group 2 BSCpE 1-A");
        in6.setContentPane(new JLabel(new ImageIcon("D:\\atms.jpg")));
        in6.setResizable(false);
        in6.setSize(600,600);
        in6.setLayout(null);
        in6.setLocationRelativeTo(null);
        in6.setVisible(false);
        in6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //MAIN FRAME
        
        JLabel enter=new JLabel("Enter 4-digit PIN: ");
        enter.setBounds(120,200,200,60);
        enter.setFont(new Font("Rockwell", Font.BOLD, 18));
        JPasswordField pass=new JPasswordField();
        pass.setBounds(120,250,200,50);
        JButton bt=new JButton("Log in");
        bt.setBounds(120,310,100,40);
        bt.setForeground(Color.white);
        bt.setBackground(Color.black);
        bt.setEnabled(false);  
        JButton shutdown=new JButton("Exit");
        shutdown.setBounds(120,360,150,40);
        shutdown.setForeground(Color.white);
        shutdown.setBackground(Color.black);
        JLabel lb=new JLabel("Wrong PIN !!!");
        lb.setBounds(330,260,100,30);
        lb.setFont(new Font("Ink Free", Font.BOLD, 14));
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
                  bt.setEnabled(false);
              }
                if(pass.getText().length()>=1){
                  bt.setEnabled(true);
               }
            }
        });
        
        shutdown.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              in.setVisible(false);
              front.setVisible(true);
            }
        });
        
        in.add(enter);in.add(pass);in.add(bt);in.add(lb);in.add(shutdown);
  
       //ACCOUNT1//MAVERICK DAVE AGUINALDO
       
       double bal1=1000;
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
                if(mav1.getText().length()>=9){
                    e.consume();
                }
            }
        });
       JButton dep=new JButton("Deposit");
       dep.setBounds(110,210,375,50);
       JButton wit=new JButton("Withdraw");
       wit.setBounds(110,270,375,50);
       dep.setEnabled(false);
       wit.setEnabled(false);
       mav1.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if(mav1.getText().length()<=0){
                  dep.setEnabled(false);
                  wit.setEnabled(false);   
               }else{
                  dep.setEnabled(true);
                  wit.setEnabled(true);   
                }
            }
        });
         
       JButton exit=new JButton("LOG OUT");
       exit.setBounds(110,330,375,50);
       
         dep.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String first=mav1.getText();
                double x=Double.parseDouble(first);
                String second=mav.getText();
                double y=Double.parseDouble(second);
                double bal1;
                evt.getSource();
                double modulo=x%100;
                if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){
                bal1=x+y;
                String result=String.valueOf(bal1);
                mav.setText(result);
                String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result);
                        psmt.setString(2, "1234");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                  }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
                }
                mav1.setText("");             
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         
         wit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String first=mav1.getText();
                double x=Double.parseDouble(first);
                String second=mav.getText();
                double y=Double.parseDouble(second);
                double bal1;
                evt.getSource();
                double modulo=x%100;
                 if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){         
                if(x<=y){
                     bal1=y-x;
                     String result=String.valueOf(bal1);
                     mav.setText(result);
                     String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result);
                        psmt.setString(2, "1234");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                     }
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
              }
             mav1.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         exit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in2.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
              bt.setEnabled(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dep.setEnabled(false);
                wit.setEnabled(false); 
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==1234){
                in2.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
           String sql = "Select * from accounts where Pin =?";
           try{ 
               con.initConnection(); 
               PreparedStatement psmt = con.conn.prepareStatement(sql);
               psmt.setString(1, "1234");
               ResultSet rs=psmt.executeQuery();
               rs= psmt.executeQuery();
               if(rs.next())
               {
                   mav.setText(rs.getString("Balance"));
               }
           }catch(Exception e){
               e.printStackTrace();
           }
           }else{
                lb.setVisible(true); 
                }
                mav1.setText("");
            }
        });
       in2.add(acc1); in2.add(mav);in2.add(mav1);
       in2.add(dep);in2.add(wit);
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
       dep2.setEnabled(false);
       wit2.setEnabled(false);
       mav3.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if(mav3.getText().length()==0){
                  dep2.setEnabled(false);
                  wit2.setEnabled(false);   
               }else{
                  dep2.setEnabled(true);
                  wit2.setEnabled(true);   
                }
            }
        });
       
       JButton exit2=new JButton("LOG OUT");
       exit2.setBounds(110,330,375,50);
           
         dep2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String first=mav3.getText();
                double x=Double.parseDouble(first);
                String second=mav2.getText();
                double y=Double.parseDouble(second);
                double bal2;
                evt.getSource();
                double modulo=x%100;
                if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){
                bal2=x+y;
                String result2=String.valueOf(bal2);
                mav2.setText(result2);
                String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result2);
                        psmt.setString(2, "5678");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                  }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
                }
                mav3.setText("");    
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         wit2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                String first=mav3.getText();
                double x=Double.parseDouble(first);
                String second=mav2.getText();
                double y=Double.parseDouble(second);
                double bal2;
                evt.getSource();
                double modulo=x%100;
                 if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){         
                if(x<=y){
                     bal2=y-x;
                     String result2=String.valueOf(bal2);
                     mav2.setText(result2);
                     String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result2);
                        psmt.setString(2, "5678");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                     }
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance.", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
              }
             mav3.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         exit2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in3.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
              bt.setEnabled(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 dep2.setEnabled(false);
                 wit2.setEnabled(false);
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==5678){
                in3.setVisible(true);
                lb.setVisible(false); 
                in.setVisible(false);
                String sql = "Select * from accounts where Pin =?";
           try{ 
               con.initConnection(); 
               PreparedStatement psmt = con.conn.prepareStatement(sql);
               psmt.setString(1, "5678");
               ResultSet rs=psmt.executeQuery();
               rs= psmt.executeQuery();
               if(rs.next())
               {
                   mav2.setText(rs.getString("Balance"));
               }
           }catch(Exception e){
               e.printStackTrace();
           }
            }else{
                lb.setVisible(true); 
                }
             mav3.setText("");
            }
        }); 
       in3.add(acc2); in3.add(mav2);in3.add(mav3);
       in3.add(dep2);in3.add(wit2);
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
       dep3.setEnabled(false);
       wit3.setEnabled(false);
       mav5.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if(mav5.getText().length()==0){
                  dep3.setEnabled(false);
                  wit3.setEnabled(false);   
               }else{
                  dep3.setEnabled(true);
                  wit3.setEnabled(true);   
                }
            }
        });
       
       JButton exit3=new JButton("LOG OUT");
       exit3.setBounds(110,330,375,50);
           
         dep3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String first=mav5.getText();
                double x=Double.parseDouble(first);
                String second=mav4.getText();
                double y=Double.parseDouble(second);
                double bal3;
                evt.getSource();
                double modulo=x%100;
                if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){
                bal3=x+y;
                String result3=String.valueOf(bal3);
                mav4.setText(result3);
                String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result3);
                        psmt.setString(2, "6969");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                  }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
                }
                mav5.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         wit3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                String first=mav5.getText();
                double x=Double.parseDouble(first);
                String second=mav4.getText();
                double y=Double.parseDouble(second);
                double bal3;
                evt.getSource();
                double modulo=x%100;
                 if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){         
                if(x<=y){
                     bal3=y-x;
                     String result3=String.valueOf(bal3);
                     mav4.setText(result3);
                     String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result3);
                        psmt.setString(2, "6969");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                     }
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
              }
             mav5.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         exit3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in4.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
              bt.setEnabled(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dep3.setEnabled(false);
                wit3.setEnabled(false);
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==6969){
                in4.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
                String sql = "Select * from accounts where Pin =?";
           try{ 
               con.initConnection(); 
               PreparedStatement psmt = con.conn.prepareStatement(sql);
               psmt.setString(1, "6969");
               ResultSet rs=psmt.executeQuery();
               rs= psmt.executeQuery();
               if(rs.next())
               {
                   mav4.setText(rs.getString("Balance"));
               }
           }catch(Exception e){
               e.printStackTrace();
           }
            }else{
                lb.setVisible(true); 
                }
            mav5.setText("");
            }
        }); 
       in4.add(acc3); in4.add(mav4);in4.add(mav5);
       in4.add(dep3);in4.add(wit3);
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
       dep4.setEnabled(false);
       wit4.setEnabled(false);
       mav7.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if(mav7.getText().length()==0){
                  dep4.setEnabled(false);
                  wit4.setEnabled(false);   
               }else{
                  dep4.setEnabled(true);
                  wit4.setEnabled(true);   
                }
            }
        });
       
       JLabel empty4=new JLabel("Insufficient Balance");
       empty4.setFont(new Font("Impact", Font.BOLD, 28));
       empty4.setBounds(120,390,375,30);
       empty4.setVisible(false);
       
       JButton exit4=new JButton("LOG OUT");
       exit4.setBounds(110,330,375,50);
           
         dep4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                String first=mav7.getText();
                double x=Double.parseDouble(first);
                String second=mav6.getText();
                double y=Double.parseDouble(second);
                double bal4;
                evt.getSource();
                double modulo=x%100;
                if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){
                bal4=x+y;
                String result4=String.valueOf(bal4);
                mav6.setText(result4);
                String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result4);
                        psmt.setString(2, "1827");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                  }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
                }
                mav7.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         wit4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                String first=mav7.getText();
                double x=Double.parseDouble(first);
                String second=mav6.getText();
                double y=Double.parseDouble(second);
                double bal4;
                evt.getSource();
                double modulo=x%100;
                 if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){         
                if(x<=y){
                     bal4=y-x;
                     String result4=String.valueOf(bal4);
                     mav6.setText(result4);
                     String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result4);
                        psmt.setString(2, "1827");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                     }
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
              }
             mav7.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         exit4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in5.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
              bt.setEnabled(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dep4.setEnabled(false);
                wit4.setEnabled(false);
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==1827){
                in5.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
                String sql = "Select * from accounts where Pin =?";
           try{ 
               con.initConnection(); 
               PreparedStatement psmt = con.conn.prepareStatement(sql);
               psmt.setString(1, "1827");
               ResultSet rs=psmt.executeQuery();
               rs= psmt.executeQuery();
               if(rs.next())
               {
                   mav6.setText(rs.getString("Balance"));
               }
           }catch(Exception e){
               e.printStackTrace();
           }
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
       dep5.setEnabled(false);
       wit5.setEnabled(false);
       mav9.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e){
                if(mav9.getText().length()==0){
                  dep5.setEnabled(false);
                  wit5.setEnabled(false);   
               }else{
                  dep5.setEnabled(true);
                  wit5.setEnabled(true);   
                }
            }
        });
       
       JLabel empty5=new JLabel("Insufficient Balance");
       empty5.setFont(new Font("Impact", Font.BOLD, 28));
       empty5.setBounds(120,390,375,30);
       empty5.setVisible(false);
       
       JButton exit5=new JButton("LOG OUT");
       exit5.setBounds(110,330,375,50);
           
         dep5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                 String first=mav9.getText();
                double x=Double.parseDouble(first);
                String second=mav8.getText();
                double y=Double.parseDouble(second);
                double bal5;
                evt.getSource();
                double modulo=x%100;
                if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){
                bal5=x+y;
                String result5=String.valueOf(bal5);
                mav8.setText(result5);
                String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result5);
                        psmt.setString(2, "3333");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                  }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
                }
                mav9.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                } 
        });
         wit5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                String first=mav9.getText();
                double x=Double.parseDouble(first);
                String second=mav8.getText();
                double y=Double.parseDouble(second);
                double bal5;
                evt.getSource();
                double modulo=x%100;
                 if(x>10000){
                    JOptionPane.showMessageDialog(null,"Sorry, you've reached the maximum amount.", "Warning", JOptionPane.WARNING_MESSAGE);
                }else{
                if(modulo==0 && x>=200 && x>=0){         
                if(x<=y){
                     bal5=y-x;
                     String result5=String.valueOf(bal5);
                     mav8.setText(result5);
                     String sql = "Update accounts set Balance = ? where Pin = ? ";
                    try{
                        con.initConnection(); 
                        PreparedStatement psmt = con.conn.prepareStatement(sql);
                        psmt.setString(1, result5);
                        psmt.setString(2, "3333");
                        int j = psmt.executeUpdate();
                        System.out.print(j);
                    }catch(Exception e){
                        System.out.println(e);
                     }
                }else{
                    JOptionPane.showMessageDialog(null,"Insufficient Balance", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                }else{
                   JOptionPane.showMessageDialog(null,"ERROR", "Warning", JOptionPane.WARNING_MESSAGE); 
                }
              }
             mav9.setText("");
            }
                private void initConnection() {
                throw new UnsupportedOperationException("Not supported yet."); 
                }
        });
         exit5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
              in.setVisible(true);
              in6.setVisible(false);
              pass.setText("");
              lb.setVisible(false);
              bt.setEnabled(false);
            }
        });
         bt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dep5.setEnabled(false);
                  wit5.setEnabled(false);
                String first=pass.getText();
                int x=Integer.parseInt(first);
                if(x==3333){
                in6.setVisible(true);
                lb.setVisible(false);
                in.setVisible(false);
                String sql = "Select * from accounts where Pin =?";
           try{ 
               con.initConnection(); 
               PreparedStatement psmt = con.conn.prepareStatement(sql);
               psmt.setString(1, "3333");
               ResultSet rs=psmt.executeQuery();
               rs= psmt.executeQuery();
               if(rs.next())
               {
                   mav8.setText(rs.getString("Balance"));
               }
           }catch(Exception e){
               e.printStackTrace();
           }
            }else{
                lb.setVisible(true); 
                }
            mav9.setText("");
            }
        }); 
       in6.add(acc5); in6.add(mav8);in6.add(mav9);
       in6.add(dep5);in6.add(wit5);in6.add(empty5);
       in6.add(exit5);in6.add(name5);in6.add(amount5);
   }           
}