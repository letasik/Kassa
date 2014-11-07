package gui;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class KtkView {


	
	
	
}

 class AddItem {
	
	 static JFrame addItemFrame = new JFrame ();
	 JPanel addPanel = new JPanel();
	 JTextField itemName = new JTextField();
	 JTextField itemQuantity = new JTextField();
	 JButton add = new JButton("ok");
	 JButton no = new JButton("cancel");
	 JPanel buttonPanel = new JPanel ();
	 
	 
	 
	AddItem (){
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(add, BorderLayout.WEST);
		buttonPanel.add(no, BorderLayout.EAST);
		getMainFrame();
		addPanel.setLayout(new GridLayout(5,1));
		addPanel.add(new JLabel("������� �������� ������"));
		addPanel.add(itemName);
		addPanel.add(new JLabel("������� ���������� ������"));
		addPanel.add(itemQuantity);
		addPanel.add(buttonPanel);
		addItemFrame.getContentPane().add(addPanel);
			
		
		
	}
	
	
		void getMainFrame(){
		
		addItemFrame.setVisible(true);
		addItemFrame.setSize(512,512);
		//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		addItemFrame.setTitle("add item");
		
	}
	
		
	
	
	
	
}
 
 
 
 class RemoveItem {
		
	 static JFrame addItemFrame = new JFrame ();
	 JPanel addPanel = new JPanel();
	 //JTextField itemName = new JTextField();
	 //JTextField itemQuantity = new JTextField();
	 JButton add = new JButton("ok");
	 JButton no = new JButton("cancel");
	 JPanel buttonPanel = new JPanel ();
	 final  String [] items = {"����� 1","����� 2", "����� 3", "����� 4", "����� 5", "����� 6", "����� 7",  };
	 JComboBox itemList = new JComboBox (items);	
	 
	 
	 RemoveItem() {
		

		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(add, BorderLayout.WEST);
		buttonPanel.add(no, BorderLayout.EAST);
		getMainFrame();
		addPanel.setLayout(new GridLayout(3,1));
		addPanel.add(new JLabel("�������� �����"));
		addPanel.add(itemList);
		
		
		
		
		addPanel.add(buttonPanel);
		addItemFrame.getContentPane().add(addPanel);
		
	
		
		
		
		
		
		
	}
	
	
		void getMainFrame(){
		
		addItemFrame.setVisible(true);
		addItemFrame.setSize(512,512);
		//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		addItemFrame.setTitle("remove item");
		
	}
		
		
		
		
		
	}
 
 
 	class WatchHistory{
 		
 		
 		 static JFrame addItemFrame = new JFrame ();
 		 JPanel addPanel = new JPanel();
 		 //JTextField itemName = new JTextField();
 		 //JTextField itemQuantity = new JTextField();
 		 JButton add = new JButton("ok");
 		 JButton no = new JButton("cancel");
 		 JPanel buttonPanel = new JPanel ();
 		JTextPane historyPane = new JTextPane();
 		 
 		 
 		 WatchHistory() {
 			

 			buttonPanel.setLayout(new BorderLayout());
 			buttonPanel.add(add, BorderLayout.WEST);
 			buttonPanel.add(no, BorderLayout.EAST);
 			getMainFrame();
 			addPanel.setLayout(new GridLayout(2,1));
 			addPanel.add(historyPane);
 			
 			addPanel.add(buttonPanel);
 			addItemFrame.getContentPane().add(addPanel);
 			
 		
 			
 			
 			
 			
 			
 			
 		}
 		
 		
 			void getMainFrame(){
 			
 			addItemFrame.setVisible(true);
 			addItemFrame.setSize(512,1024);
 			//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 			addItemFrame.setTitle("watch history");
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 	}
 	}
 
 	
 	
 	
 	
 	class AddUser {
 		
 		 static JFrame addItemFrame = new JFrame ();
 		 JPanel addPanel = new JPanel();
 		 JTextField itemName = new JTextField();
 		 JTextField itemQuantity = new JTextField();
 		JTextField userSecondName = new JTextField();
 		 JButton add = new JButton("ok");
 		 JButton no = new JButton("cancel");
 		 JPanel buttonPanel = new JPanel ();
 		 
 		 
 		 
 		AddUser (){
 			buttonPanel.setLayout(new BorderLayout());
 			buttonPanel.add(add, BorderLayout.WEST);
 			buttonPanel.add(no, BorderLayout.EAST);
 			getMainFrame();
 			addPanel.setLayout(new GridLayout(7,1));
 			addPanel.add(new JLabel("������� ������ ������������"));
 			addPanel.add(itemName);
 			addPanel.add(new JLabel("������� ��� ������������"));
 			addPanel.add(itemQuantity);
 			addPanel.add(new JLabel("������� ������� ������������"));
 			addPanel.add(userSecondName);
 			addPanel.add(buttonPanel);
 			addItemFrame.getContentPane().add(addPanel);
 				
 			
 			
 		}
 		
 		
 			void getMainFrame(){
 			
 			addItemFrame.setVisible(true);
 			addItemFrame.setSize(512,512);
 			//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 			addItemFrame.setTitle("add user");
 			
 		}
 		
 			
 		
 		
 		
 		
 	}
 	
 	
 	
 	class RemoveUser {
		
 		 static JFrame addItemFrame = new JFrame ();
 		 JPanel addPanel = new JPanel();
 		 //JTextField itemName = new JTextField();
 		 //JTextField itemQuantity = new JTextField();
 		 JButton add = new JButton("ok");
 		 JButton no = new JButton("cancel");
 		 JPanel buttonPanel = new JPanel ();
 		static String [] buyers = {"���������� 1", "���������� 2","���������� 3","���������� 4","���������� 5","���������� 6","���������� 7","���������� 8"
 			,"���������� 9","���������� 10","���������� 11","���������� 12","���������� 13","���������� 14","���������� 15","���������� 16","���������� 17"};
 		static JComboBox users = new JComboBox (buyers);	
 		 
 		 
 		 RemoveUser() {
 			

 			buttonPanel.setLayout(new BorderLayout());
 			buttonPanel.add(add, BorderLayout.WEST);
 			buttonPanel.add(no, BorderLayout.EAST);
 			getMainFrame();
 			addPanel.setLayout(new GridLayout(3,1));
 			addPanel.add(new JLabel("�������� ������������"));
 			addPanel.add(users);
 			
 			
 			
 			
 			addPanel.add(buttonPanel);
 			addItemFrame.getContentPane().add(addPanel);
 			
 		
 			
 			
 			
 			
 			
 			
 		}
 		
 		
 			void getMainFrame(){
 			
 			addItemFrame.setVisible(true);
 			addItemFrame.setSize(512,512);
 			//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
 			addItemFrame.setTitle("remove user");
 			
 		}
 			
 			
 			
 			
 			
 		}
 
 	
 	
 	
 	
 	class WatchUserHistory{
 		
 		
		 static JFrame addItemFrame = new JFrame ();
		 JPanel addPanel = new JPanel();
		 //JTextField itemName = new JTextField();
		 //JTextField itemQuantity = new JTextField();
		 JButton add = new JButton("ok");
		 JButton no = new JButton("cancel");
		 JPanel buttonPanel = new JPanel ();
		JTextPane historyPane = new JTextPane();
		static String [] buyers = {"���������� 1", "���������� 2","���������� 3","���������� 4","���������� 5","���������� 6","���������� 7","���������� 8"
 			,"���������� 9","���������� 10","���������� 11","���������� 12","���������� 13","���������� 14","���������� 15","���������� 16","���������� 17"};
 		static JComboBox users = new JComboBox (buyers);
		 
		 WatchUserHistory() {
			

			buttonPanel.setLayout(new BorderLayout());
			buttonPanel.add(add, BorderLayout.WEST);
			buttonPanel.add(no, BorderLayout.EAST);
			getMainFrame();
			addPanel.setLayout(new GridLayout(4,1));
			addPanel.add(new JLabel("�������� ������������"));
 			addPanel.add(users);
			addPanel.add(historyPane);
			
			addPanel.add(buttonPanel);
			addItemFrame.getContentPane().add(addPanel);
			
		
			
			
			
			
			
			
		}
		
		
			void getMainFrame(){
			
			addItemFrame.setVisible(true);
			addItemFrame.setSize(512,1024);
			//addItemFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
			addItemFrame.setTitle("watch user history");
		
		
		
		
		
		
		
		
		
		
	}
	}

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 