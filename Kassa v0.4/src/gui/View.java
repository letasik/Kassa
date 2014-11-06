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
	static JButton tab1 = new JButton("Покупатель");
	static JButton tab2 = new JButton("К!Т!К!");
	static JPanel mainPanelCustomer = new JPanel(); //rabo4aja zona pokupatelja vid iz 2h stolbcov
	static JPanel infoPanel = new JPanel(); // infopanel pokupatjela
	static JPanel itemPanel = new JPanel(); // panel s tovarom sprava
	static JButton item = new JButton("Товар 1 ");
	static JButton item1 = new JButton("Товар 2");
	static JButton item2 = new JButton("Товар 3 ");
	static JButton item3 = new JButton("Товар 4");
	static JButton item4 = new JButton("Товар 5");
	static JButton item5 = new JButton("Товар 6 ");
	static JButton item6 = new JButton("Товар 7 ");
	static JButton item7 = new JButton("Товар 8 ");
	static String [] buyers = {"Покупатель 1", "Покупатель 2","покупатель 3","покупатель 4","покупатель 5","покупатель 6","покупатель 7","покупатель 8"
		,"покупатель 9","покупатель 10","покупатель 11","покупатель 12","покупатель 13","покупатель 14","покупатель 15","покупатель 16","покупатель 17"};
	static JComboBox users = new JComboBox (buyers);
	JButton confirm = new JButton("Купить");
	JButton cancel = new JButton ("Отмена");
	JTextArea check = new JTextArea("\n Покупатель: \n \n Покупка: \n \n Количество: \n \n Сумма:");
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
	static JButton addItem = new JButton("добавить товар");
	static JButton removeItem = new JButton("удалить товар");
	static JButton eksportJournal = new JButton("Сохранить  историю в файл ");
	static JButton removeJournal = new JButton("удалить историю");
	static JButton journalWindow = new JButton("просмотреть историю");
	static JButton addUser = new JButton("добавить пользователя");
	static JButton removeUser = new JButton("удалить пользователя");
	static JButton userJournal = new JButton("История пользователя");
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public View(){
		getMainFrame();	
		
		
		
		
		
		
		
		
		workArea.setLayout(new BorderLayout());	
		workArea.add(getTabPanel(), BorderLayout.NORTH);
		selectName.setLayout(new GridLayout(2,0));
		selectName.add(new JLabel("Выберите покупателя:"));
		selectName.add(users);
		kolvo.setLayout(new GridLayout(3,0));
		kolvo.add(new JLabel("Введите количество:"));
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
		
		//infoPanel.add(new JLabel("Выберите покупателя"));
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
				System.out.println("покупатель button pressed");
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
		mainframe.setTitle("Кассовый аппарат v0.4.1a");
		
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

