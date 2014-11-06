package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class View extends JFrame {
	static JFrame mainframe = new JFrame();// main window
	static JPanel workArea = new JPanel(); // konteiner Okon pokupatelja i ktk
	static JPanel tabPanel = new JPanel(); // tabs for consumer and ktk
	static JButton tab1 = new JButton("����������");
	static JButton tab2 = new JButton("�!�!�!");
	static JPanel mainPanelCustomer = new JPanel(); //rabo4aja zona pokupatelja vid iz 2h stolbcov
	static JPanel infoPanel = new JPanel(); // infopanel pokupatjela
	static JPanel itemPanel = new JPanel(); // panel s tovarom sprava
	static JButton item = new JButton("����� 1 ");
	static JButton item1 = new JButton("����� 2");
	static JButton item2 = new JButton("����� 3 ");
	static JButton item3 = new JButton("����� 4");
	static JButton item4 = new JButton("����� 5");
	static JButton item5 = new JButton("����� 6 ");
	static JButton item6 = new JButton("����� 7 ");
	static JButton item7 = new JButton("����� 8 ");
	static String [] buyers = {"���������� 1", "���������� 2","���������� 3","���������� 4","���������� 5","���������� 6","���������� 7","���������� 8"
		,"���������� 9","���������� 10","���������� 11","���������� 12","���������� 13","���������� 14","���������� 15","���������� 16","���������� 17"};
	static JComboBox users = new JComboBox (buyers);
	JButton confirm = new JButton("������");
	JButton cancel = new JButton ("������");
	JTextArea check = new JTextArea("\n ����������: \n \n �������: \n \n ����������: \n \n �����:");
	JTextPane checkpane = new JTextPane();
	JTextField quantity = new JTextField();
	JButton okButton = new JButton("OK");
	JPanel decision = new JPanel();//panel dlja knopok vybora
	JPanel selectName = new JPanel();//panel dlja vybora imeni pokupatelja
	JPanel cheque = new JPanel();// panel dlja koli4estva i 4eka
	JPanel kolvo = new JPanel(); // panel dlja koli4estva
	//////// //////////////////////////////////////////////////////////////////////////////////////////////////
	//                               KTK view////
	JPanel ktkPanel = new JPanel();
	static JButton addItem = new JButton("�������� �����");
	static JButton removeItem = new JButton("������� �����");
	static JButton eksportJournal = new JButton("���������  ������� � ���� ");
	static JButton removeJournal = new JButton("������� �������");
	static JButton journalWindow = new JButton("����������� �������");
	static JButton addUser = new JButton("�������� ������������");
	static JButton removeUser = new JButton("������� ������������");
	static JButton userJournal = new JButton("������� ������������");
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public View(){
		getMainFrame();	
		
		
		
		
		
		
		
		
		workArea.setLayout(new BorderLayout());	
		workArea.add(getTabPanel(), BorderLayout.NORTH);
		selectName.setLayout(new GridLayout(2,0));
		selectName.add(new JLabel("�������� ����������:"));
		selectName.add(users);
		kolvo.setLayout(new GridLayout(3,0));
		kolvo.add(new JLabel("������� ����������:"));
		kolvo.add(quantity);
		kolvo.add(okButton);
		cheque.setLayout(new BorderLayout());
		cheque.add(kolvo, BorderLayout.PAGE_START);
		check.setEditable(false);
		cheque.add(check);
		decision.add(confirm,BorderLayout.WEST);
		decision.add(cancel,BorderLayout.EAST);
		infoPanel.setLayout(new BorderLayout());
		infoPanel.add(selectName,BorderLayout.PAGE_START);
		infoPanel.add(decision, BorderLayout.PAGE_END);
		infoPanel.add(cheque,BorderLayout.CENTER);
		
		//infoPanel.add(new JLabel("�������� ����������"));
		//users.setPreferredSize(new Dimension(100, 20));
		//infoPanel.add(users);
		//infoPanel.add(quantity);
		//infoPanel.add(okButton);
		setItemPanel();
		setMainPanelCustomer();
		mainPanelCustomer.setLayout(new GridLayout(1,2));
		mainPanelCustomer.add(infoPanel);
		mainPanelCustomer.add(itemPanel);
		mainPanelCustomer.setVisible(true);
		
		
		
		workArea.add(mainPanelCustomer, BorderLayout.CENTER);
		
		
		
		ktkPanel.setLayout(new GridLayout(8,1));
		ktkPanel.add(addItem);
		ktkPanel.add(removeItem);
		ktkPanel.add(eksportJournal);
		ktkPanel.add(removeJournal);
		ktkPanel.add(journalWindow);
		ktkPanel.add(addUser);
		ktkPanel.add(removeUser);
		ktkPanel.add(userJournal);

		
		//workArea.add(ktkPanel, BorderLayout.CENTER);
		
		
		
		
		
		
		
		
		tab2.addActionListener(new ActionListener() {
			  

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("KTK button pressed");
				ktkPanel.setVisible(true);
				mainPanelCustomer.setVisible(false);
				workArea.add(ktkPanel, BorderLayout.CENTER);
			}
	        
	    });
		
		
		tab1.addActionListener(new ActionListener() {
			  

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���������� button pressed");
				ktkPanel.setVisible(false);
				workArea.add(mainPanelCustomer, BorderLayout.CENTER);
				mainPanelCustomer.setVisible(true);
				
			}
	        
	    });
		
		
		
		
		
		
		
		
		
		
		
		
		
		mainframe.getContentPane().add(workArea);	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static JPanel getTabPanel(){// creates 2 tabs on top with consumer and ktkt buttons
		tabPanel.setLayout(new GridLayout(1,2));
		tabPanel.add(tab1);
		tabPanel.add(tab2);	
		System.out.println("tabpanel called");
		return tabPanel;
		
		
	}
	

	
	private static void getMainFrame(){
		
		mainframe.setVisible(true);
		mainframe.setSize(1024, 768);
		mainframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		mainframe.setTitle("�������� ������� v0.4.1a");
		
	}
	
	
	// creates Main window frame
	public  static View  getView(){
		View mainview = new View();
		return   mainview;
		
	}
	
	private static void setItemPanel(){
		itemPanel.setLayout(new GridLayout(8,1));
		itemPanel.add(item);
		itemPanel.add(item1);
		itemPanel.add(item2);
		itemPanel.add(item3);
		itemPanel.add(item4);
		itemPanel.add(item5);
		itemPanel.add(item6);
		itemPanel.add(item7);
	}
	
	private static void setMainPanelCustomer (){
		
		mainPanelCustomer.setLayout(new GridLayout(1,2));
		mainPanelCustomer.add(infoPanel);
		mainPanelCustomer.add(itemPanel);
		mainPanelCustomer.setVisible(true);
		
		
	}

	
	
	
	
	
} // end of View class 

