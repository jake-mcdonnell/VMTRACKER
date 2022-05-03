import java.awt.*;
import javax.swing.*; 
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.lang.Object;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Process;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.util.concurrent.TimeUnit;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;


public class VMTRACKER 
{ 
		
	static void restartApp() throws IOException {

    // This launches a new instance of application dirctly, 
    // remember to add some sleep to the start of the cmd file to make sure current instance is
    // completely terminated, otherwise 2 instances of the application can overlap causing strange
    // things:)
    new ProcessBuilder("cmd","/c start /min C:/VBS.vbs").start();
    System.exit(0);
	
	}
public static void main(String[] args) throws IOException
    { 
	//colors
	
	Color myBlue3 = new Color(0,0,129);
 	Color myBlue2 = new Color(46,49,146);
	Color myBlue = new Color(0,0,64);
    Color myPurp = new Color(127, 0, 247);
	Color myGrey = new Color(50,50,50);
	
	//styles
	
	//loading screen
	ImageIcon loadingscrnimg = new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/Loadingscrn.png");
	
	JLabel loadinglb,loadingscrn,bullshit;
	 
	int counter = 1;
	JFrame loading = new JFrame("LOADING");
	loading.setSize(400,300);
	loading.setUndecorated(true);
	loading.setVisible(true);
	loading.setLocationRelativeTo(null);
	
	loading.setLayout(null); 
	loading.getContentPane().setBackground(myBlue);
	loading.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	loadinglb = new JLabel("Loading"); 
    loadinglb.setBounds(170,225, 500, 50);
	loadinglb.setForeground(Color.white);
	loadinglb.setFont(new Font("Gothic", Font.BOLD, 13));
	
	bullshit = new JLabel("Warmup"); 
    bullshit.setBounds(-53,250, 500, 50);
	bullshit.setForeground(Color.white);
	bullshit.setFont(new Font("Gothic", Font.BOLD, 11));
	bullshit.setHorizontalAlignment(JLabel.CENTER);
	
	
	loading.add(loadinglb);loading.add(bullshit);
	
	loadingscrn=new JLabel(loadingscrnimg);
    loadingscrn.setBounds(0,0, 400, 300);
	loadingscrn.setVisible(true);
	loading.add(loadingscrn);
	
	if (counter==1) {
		loadinglb.setText("Loading.");
		
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
				bullshit.setText("initializing dependencies");
							try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading.");
				bullshit.setText("Verifying Files");
							try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
				bullshit.setText("Loading Users");
							try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
	
			counter = counter+1;
	}
	
	
		if (counter==2) {
	loadinglb.setText("Loading.");
		
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
				bullshit.setText("Java Watchdog Handler Check");
							try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading.");
				bullshit.setText("Starting Flux Capacitor");
							try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		counter = counter+1;
	}
	
	//Check files
	
	Path path0 = Paths.get("timer0.txt");
	long size0 = Files.size(path0);
	
	Path path1 = Paths.get("timer1.txt");
	long size1 = Files.size(path1);

	Path path2 = Paths.get("timer2.txt");
	long size2 = Files.size(path2);

	Path path3 = Paths.get("timer3.txt");
	long size3 = Files.size(path3);

	Path path4 = Paths.get("timer4.txt");
	long size4 = Files.size(path4);
	
	if (size0 == 0) {
		
		JOptionPane.showMessageDialog(loading, "Error With Activity_Verify on machine 1, Contact Jake M ASAP. Press OK to continue");
		
	}
	
		if (size1 == 0) {
		
		JOptionPane.showMessageDialog(loading, "Error With Activity_Verify on machine 2, Contact Jake M ASAP. Press OK to continue");
		
	}
	
		if (size2 == 0) {
		
		JOptionPane.showMessageDialog(loading, "Error With Activity_Verify on machine 3, Contact Jake M ASAP. Press OK to continue");
		
	}
	
		if (size3 == 0) {
		
		JOptionPane.showMessageDialog(loading, "Error With Activity_Verify on machine 4, Contact Jake M ASAP. Press OK to continue");
		
	}
	
		if (size4 == 0) {
		
		JOptionPane.showMessageDialog(loading, "Error With Activity_Verify on machine XP, Contact Jake M ASAP. Press OK to continue");
		
	}
	

		if (counter==3) {
	loadinglb.setText("Loading.");
		
			try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading.");
				bullshit.setText("Performing Signin Hashing");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading..");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
			
				loadinglb.setText("Loading...");
				bullshit.setText("Verifying User Encryption");
							try
			{
				Thread.sleep(300);
			}
			catch(InterruptedException ex)
			{
				Thread.currentThread().interrupt();
			}
		counter = 1;
		loading.setVisible(false);
	}
	
	
	
	//usernames
	
	 Path fileName0 = Path.of("ACTIVE_USERS0.txt");
        String content0  = "";
        
         
        String actual0 = Files.readString(fileName0);
        System.out.println(actual0);
		
		
	 Path fileName1 = Path.of("ACTIVE_USERS1.txt");
        String content1  = "";
        
         
        String actual1 = Files.readString(fileName1);
        System.out.println(actual1);
		
	 Path fileName2 = Path.of("ACTIVE_USERS2.txt");
         String content2  = "";
        
         
        String actual2 = Files.readString(fileName2);
        System.out.println(actual2);
		
	 Path fileName3 = Path.of("ACTIVE_USERS3.txt");
        String content3  = "";
        
         
        String actual3 = Files.readString(fileName3);
        System.out.println(actual3);
		
	 Path fileName4 = Path.of("ACTIVE_USERS4.txt");
        String content4  = "";
        
         
        String actual4 = Files.readString(fileName4);
        System.out.println(actual4);
		
	//timers
	
		Path fileName5 = Path.of("timer0.txt");
         
        String timer0 = Files.readString(fileName5);
		String timer0n = timer0.replaceAll("[\\\r\\\n]+","");
		String timer0nn = timer0n.replaceAll(" ","");
        System.out.println(timer0n);
		
		Path fileName6 = Path.of("timer1.txt");
  
         
        String timer1 = Files.readString(fileName6);
		String timer1n = timer1.replaceAll("[\\\r\\\n]+","");
		String timer1nn = timer1n.replaceAll(" ","");
        System.out.println(timer1n);
		
		Path fileName7 = Path.of("timer2.txt");

        
        String timer2 = Files.readString(fileName7);
		String timer2n = timer2.replaceAll("[\\\r\\\n]+","");
		String timer2nn = timer2n.replaceAll(" ","");
        System.out.println(timer2n);
		
		
		Path fileName8 = Path.of("timer3.txt");
        
        String timer3 = Files.readString(fileName8);
		String timer3n = timer3.replaceAll("[\\\r\\\n]+","");
		String timer3nn = timer3n.replaceAll(" ","");
        System.out.println(timer3n);
		
		
		Path fileName9 = Path.of("timer4.txt");
		
		String timer4 = Files.readString(fileName9);
		String timer4n = timer4.replaceAll("[\\\r\\\n]+","");
		String timer4nn = timer4n.replaceAll(" ","");
        System.out.println(timer4n);
		
		
	//get value from string
	
		int maxtime = 1800;
	
		int number0 = Integer.parseInt(timer0nn);
		int number1 = Integer.parseInt(timer1nn);
		int number2 = Integer.parseInt(timer2nn);
		int number3 = Integer.parseInt(timer3nn);
		int number4 = Integer.parseInt(timer4nn);
		
	// Check for NULL value
	
	
	    
	//setup Jframe
		
	Image icon1 = Toolkit.getDefaultToolkit().getImage("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/eye-scanner.png");
	

	JFrame f= new JFrame("VMTRACKER");
	
	JDialog dialog0 = new JDialog();
		dialog0.setUndecorated(false);
	JDialog dialog1 = new JDialog();
		dialog1.setUndecorated(false);
	JDialog dialog2 = new JDialog();
		dialog2.setUndecorated(false);
	JDialog dialog3 = new JDialog();
		dialog3.setUndecorated(false);
	JDialog dialog4 = new JDialog();
		dialog4.setUndecorated(false);
	
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane().setBackground(myBlue);
	f.setIconImage(icon1);
	
	//add images
	
	ImageIcon icon = new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/BKG.png");
	ImageIcon CLOSEi = new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/CLOSE.png");
	ImageIcon UPDATEi = new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/UPDATE.png");
	ImageIcon CLEARi = new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/Assets/CLEAR.png");
	
	JLabel preview0 = new JLabel( new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview0.jpg"));
	JLabel preview1 = new JLabel( new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview1.jpg"));
	JLabel preview2 = new JLabel( new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview2.jpg"));
	JLabel preview3 = new JLabel( new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview3.jpg"));
	JLabel preview4 = new JLabel( new ImageIcon("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview4.jpg"));
	
	 File pv0 = new File("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview0.jpg");
	 File pv1 = new File("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview1.jpg");
	 File pv2 = new File("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview2.jpg");
	 File pv3 = new File("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview3.jpg");
	 File pv4 = new File("//Dc-email-ca/ftp/Active_VM_User_POA_WIP/preview4.jpg");
	
    JLabel la1,la2,la3,la4,la5,la7,la8;
	
	dialog0.add(preview0);
	dialog0.pack();
	
	dialog1.add(preview1);
	dialog1.pack();
	
	dialog2.add(preview2);
	dialog2.pack();
	
	dialog3.add(preview3);
	dialog3.pack();
	
	dialog4.add(preview4);
	dialog4.pack();
	
	
	//general design
	

	la8=new JLabel(icon);
    la8.setBounds(0,0, 700, 300);
	la8.setVisible(true);
	 
	la1=new JLabel(actual0); 
    la1.setBounds(125, 50, 500, 50);
	la1.setForeground(myBlue);
	la1.setFont(new Font("Gothic", Font.BOLD, 13));
	
    la2=new JLabel(actual1); 
    la2.setBounds(125,75, 500, 50);
	la2.setForeground(myBlue);
	la2.setFont(new Font("Gothic", Font.BOLD, 13));
	
    la3=new JLabel(actual2); 
    la3.setBounds(125, 100, 500, 50);
	la3.setForeground(myBlue);
	la3.setFont(new Font("Gothic", Font.BOLD, 13));
	
	la4=new JLabel(actual3);
	la4.setBounds(125, 125, 500, 50);
	la4.setForeground(myBlue);
	la4.setFont(new Font("Gothic", Font.BOLD, 13));
	
	la5=new JLabel(actual4);
	la5.setBounds(125, 150, 500, 50);
	la5.setForeground(myBlue);
	la5.setFont(new Font("Gothic", Font.BOLD, 13));
	
	la7=new JLabel("Active Users"); 
    la7.setBounds(53, -3, 120, 40); 
	la7.setForeground(Color.white);
	la7.setFont(new Font("Gothic", Font.BOLD, 14));
	
	
	//set [INACTIVE] 
	int inac0 = 0;
	int inac1 = 0;
	int inac2 = 0;
	int inac3 = 0;
	int inac4 = 0;
	
	if (actual0.length() >= 1) {
		if (number0 >= maxtime) {
		la1.setForeground(Color.red);
		la1.setText(la1.getText() + " [INACTIVE]");
		inac0 = 1;
	}} else {
		la1.setVisible(false);
		la1.setText(actual0);
	}
	
	if (actual1.length() >= 1) {
		if (number1 >= maxtime) {
		la2.setForeground(Color.red);
		la2.setText(la2.getText() + " [INACTIVE]");
		inac1 = 1;
	}} else {
		la2.setVisible(false);
		la2.setText(actual0);
	}
	
	if (actual2.length() >= 1) {
		if (number2 >= maxtime) {
		la3.setForeground(Color.red);
		la3.setText(la3.getText() + " [INACTIVE]");
		inac2 = 1;
	}} else {
		la3.setVisible(false);
		la3.setText(actual0);
	}
	
	if (actual3.length() >= 1) {
		if (number3 >= maxtime) {
		la4.setForeground(Color.red);
		la4.setText(la4.getText() + " [INACTIVE]");
		inac3 = 1;
	}} else {
		la4.setVisible(false);
		la4.setText(actual0);
	}
	
	if (actual4.length() >= 1) {
		if (number4 >= maxtime) {
		la5.setForeground(Color.red);
		la5.setText(la5.getText() + " [INACTIVE]");
		inac4 = 1;
	}} else {
		la5.setVisible(false);
		la5.setText(actual0);
	}
	
	JFrame dialouge = new JFrame("VMTRACKERD");
	boolean append = false;
	
	
	double x = 50;
	double y = 50;
	
	//Clear button
	JButton CLEAR = new JButton(CLEARi);
	CLEAR.setBounds(190,240,140,30);
	CLEAR.setBorder(BorderFactory.createEmptyBorder());
	CLEAR.setContentAreaFilled(false);
	CLEAR.setVisible(true);
	CLEAR.addActionListener(e ->{
	  {
	Object[] possibilities = {"","VM1", "VM2", "VM3","VM4","XPVM"};
	String s = (String)JOptionPane.showInputDialog(
					dialouge,
                    "Select a VM to Clear your name from",
                    "Name Clearing Tool",
                    JOptionPane.PLAIN_MESSAGE, null,
                    possibilities,
                    "");
			if ((s == "VM1")) {
			try(FileWriter writer = new FileWriter("ACTIVE_USERS0.txt", append) ){
			writer.write("");
			} catch (IOException a) {System.out.println("NO GOOD");}
			try {
				restartApp();
	  		} 
	  		catch (IOException ae) 
			  {
				System.out.println("File not Found");
	 		 }}
					if ((s == "VM2")) {
						try(FileWriter writer = new FileWriter("ACTIVE_USERS1.txt", append) ){
						writer.write("");
					}   catch (IOException a) {System.out.println("NO GOOD");} try {
		restartApp();
	  } 
	  catch (IOException ae) 
	  {
		System.out.println("File not Found");
	  }}
					if ((s == "VM3")) {
						try(FileWriter writer = new FileWriter("ACTIVE_USERS2.txt", append) ){
						writer.write("");
					}   catch (IOException a) {System.out.println("NO GOOD");} try {
		restartApp();
	  } 
	  catch (IOException ae) 
	  {
		System.out.println("File not Found");
	  }}
					if ((s == "VM4")) {
						try(FileWriter writer = new FileWriter("ACTIVE_USERS3.txt", append) ){
						writer.write("");
					}   catch (IOException a) {System.out.println("NO GOOD");} try {
		restartApp();
	  } 
	  catch (IOException ae) 
	  {
		System.out.println("File not Found");
	  }}
					if ((s == "XPVM")) {
						try(FileWriter writer = new FileWriter("ACTIVE_USERS4.txt", append) ){
						writer.write("");
					}   catch (IOException a) {System.out.println("NO GOOD");} try {
		restartApp();
	  } 
	  catch (IOException ae) 
	  {
		System.out.println("File not Found");
	  }}
					if ((s == "")) {
						return;
					}
					
	
					}

	} );
		
	f.add(CLEAR);
	
	
	//update button
	JButton UPDATE = new JButton(UPDATEi);
	UPDATE.setBounds(50,205,140,30);
	UPDATE.setBorder(BorderFactory.createEmptyBorder());
	UPDATE.setContentAreaFilled(false);
	UPDATE.setVisible(true);
	UPDATE.addActionListener(e ->{
	  try {
		restartApp();
	  } 
	  catch (IOException ae) 
	  {
		System.out.println("File not Found");
	  }
		 } );
		  
	f.add(UPDATE);
			
	//close button
	JButton CLOSE = new JButton(CLOSEi);
	CLOSE.setBounds(50,240,140,30);
	CLOSE.setBorder(BorderFactory.createEmptyBorder());
	CLOSE.setContentAreaFilled(false);
	CLOSE.setVisible(true);
	CLOSE.addActionListener(e ->{
	  {
		System.exit(0);
	  }
		} );
		
	f.add(CLOSE);
	
			
	JButton button3 = new JButton("o");
	button3.setFont(new Font("Gothic", Font.BOLD, 13));
	button3.setBounds(10,67,35,15);
	button3.setBackground(myBlue2);
	button3.setForeground(Color.white);
	button3.addActionListener(e ->{
	  {
		dialog0.setVisible(true);
	  }
		} );
		
	f.add(button3);
	
	JButton button4 = new JButton("o");
	button4.setFont(new Font("Gothic", Font.BOLD, 13));
	button4.setBounds(10,92,35,15);
	button4.setBackground(myBlue3);
	button4.setForeground(Color.white);
	button4.addActionListener(e ->{
	  {
		dialog1.setVisible(true);
	  }
		} );
		
	f.add(button4);
	
	JButton button5 = new JButton("o");
	button5.setFont(new Font("Gothic", Font.BOLD, 13));
	button5.setBounds(10,118,35,15);
	button5.setBackground(myBlue2);
	button5.setForeground(Color.white);
	button5.addActionListener(e ->{
	  {
		dialog2.setVisible(true);
	  }
		} );
		
	f.add(button5);
	
	JButton button6 = new JButton("o");
	button6.setFont(new Font("Gothic", Font.BOLD, 13));
	button6.setBounds(10,143,35,15);
	button6.setBackground(myBlue3);
	button6.setForeground(Color.white);
	button6.addActionListener(e ->{
	  {
		dialog3.setVisible(true);
	  }
		} );
		
	f.add(button6);
	
	JButton button7 = new JButton("o");
	button7.setFont(new Font("Gothic", Font.BOLD, 13));
	button7.setBounds(10,168,35,15);
	button7.setBackground(myBlue2);
	button7.setForeground(Color.white);
	button7.addActionListener(e ->{
	  {
		dialog4.setVisible(true);
	  }
		} );
		
	f.add(button7);
	//Draw Labels
	f.add(la1);f.add(la2);f.add(la3);f.add(la4);f.add(la5);f.add(la7);f.add(la8);
   
    f.setSize(700,320); 
    f.setLocationRelativeTo(null);
    f.setLayout(null); 
    f.setVisible(true); 

	
	//check for signin to allow visibility of preview buttons
	
	 if (actual0.length() == 0) {
		 button3.setVisible(false);
	 } else {
		 button3.setVisible(true);
	 }
	 if (actual1.length() == 0) {
		button4.setVisible(false);
	 } else {
		 button4.setVisible(true);
	 }
	 if (actual2.length() == 0) {
		 button5.setVisible(false);
	 } else {
		 button5.setVisible(true);
	 }
	 if (actual3.length() == 0) {
		 button6.setVisible(false);
	 } else {
		 button6.setVisible(true);
	 }
	 if (actual4.length() == 0) {
		 button7.setVisible(false);
	 } else {
		 button7.setVisible(true);
	 }
	 
	 //Check for 33kb preview to state [AFK]
	
	if (actual0.length() >= 1) {
		if (inac0 == 0) {
			if (pv0.length() <= 100000) {
			la1.setForeground(myGrey);
			la1.setText(la1.getText() + " [AFK]");
			button3.setVisible(false);
	}}} else {la1.setVisible(false);}
	
	if (actual1.length() >= 1) {
		if (inac1 == 0) {
			if (pv1.length() < 100000) {
			la2.setForeground(myGrey);
			la2.setText(la2.getText() + " [AFK]");
			button4.setVisible(false);
	}}} else {la2.setVisible(false);}
	
	if (actual2.length() >= 1) {
		if (inac2 == 0) {
			if (pv2.length() < 100000) {
			la3.setForeground(myGrey);
			la3.setText(la3.getText() + " [AFK]");
			button5.setVisible(false);
	}}} else {la3.setVisible(false);}
		
	if (actual3.length() >= 1) {
		if (inac3 == 0) {
			if (pv3.length() < 100000) {
			la4.setForeground(myGrey);
			la4.setText(la4.getText() + " [AFK]");
			button6.setVisible(false);
	}}} else {la4.setVisible(false);}
	
			if (pv4.length() <=100000) {
			la5.setForeground(myGrey);
			la5.setText(la5.getText() + " [AFK]");
			button7.setVisible(false);
	} else {la5.setVisible(false);}
	}}
