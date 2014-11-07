package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Customer extends JFrame {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//static JPanel costumerArea = new JPanel(); // konteiner pokupatelja
	static JPanel mainPanelCustomer = new JPanel(); //rabo4aja zona pokupatelja vid iz 2h stolbcov
	static JPanel infoPanel = new JPanel(); // infopanel pokupatjela
	static JPanel itemPanel = new JPanel(); // panel s tovarom sprava
	//static JPanel checkout = new JPanel(); //konteiner checka
	//static JPanel confirmation = new JPanel(); // konteiner podtverzdenija pokupki
	static JButton item = new JButton("Товар 1 ");
	static JButton item1 = new JButton("Товар 2");
	static JButton item2 = new JButton("Товар 3 ");
	static JButton item3 = new JButton("Товар 4");
	static JButton item4 = new JButton("Товар 5");
	static JButton item5 = new JButton("Товар 6 ");
	static JButton item6 = new JButton("Товар 7 ");
	static JButton item7 = new JButton("Товар 8 ");

	
	
	public Customer () {
		
		//costumerArea.setLayout(new BorderLayout());	
		//costumerArea.setVisible(true);
		infoPanel.setLayout(new BorderLayout());
		//getItemPanel();
		itemPanel.setLayout(new GridLayout(8,1));
		itemPanel.add(item);
		itemPanel.add(item1);
		itemPanel.add(item2);
		itemPanel.add(item3);
		itemPanel.add(item4);
		itemPanel.add(item5);
		itemPanel.add(item6);
		itemPanel.add(item7);
		mainPanelCustomer.setLayout(new GridLayout(1,2));
		mainPanelCustomer.add(infoPanel);
		mainPanelCustomer.add(itemPanel);
		mainPanelCustomer.setVisible(true);
		//costumerArea.add(mainPanelCustomer);
		
		
		
	}
	
	
	
//	public static JPanel getConsumerArea (){
//		return costumerArea;
//		
//	}
	public static JPanel getMainPanelCostumer (){
		System.out.println("mainpanelcustomer called");
		return mainPanelCustomer;
		
	}
	
	
	
	
}
