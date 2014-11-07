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
		addPanel.add(new JLabel("Введите название товара"));
		addPanel.add(itemName);
		addPanel.add(new JLabel("Введите количество товара"));
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
	 final  String [] items = {"товар 1","товар 2", "товар 3", "товар 4", "товар 5", "товар 6", "товар 7",  };
	 JComboBox itemList = new JComboBox (items);	
	 
	 
	 RemoveItem() {
		

		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.add(add, BorderLayout.WEST);
		buttonPanel.add(no, BorderLayout.EAST);
		getMainFrame();
		addPanel.setLayout(new GridLayout(3,1));
		addPanel.add(new JLabel("выберите товар"));
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
 			addPanel.add(new JLabel("Введите статус пользователя"));
 			addPanel.add(itemName);
 			addPanel.add(new JLabel("Введите имя пользователя"));
 			addPanel.add(itemQuantity);
 			addPanel.add(new JLabel("введите фамилию пользователя"));
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
 		static String [] buyers = {"Покупатель 1", "Покупатель 2","покупатель 3","покупатель 4","покупатель 5","покупатель 6","покупатель 7","покупатель 8"
 			,"покупатель 9","покупатель 10","покупатель 11","покупатель 12","покупатель 13","покупатель 14","покупатель 15","покупатель 16","покупатель 17"};
 		static JComboBox users = new JComboBox (buyers);	
 		 
 		 
 		 RemoveUser() {
 			

 			buttonPanel.setLayout(new BorderLayout());
 			buttonPanel.add(add, BorderLayout.WEST);
 			buttonPanel.add(no, BorderLayout.EAST);
 			getMainFrame();
 			addPanel.setLayout(new GridLayout(3,1));
 			addPanel.add(new JLabel("выберите пользователя"));
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
		static String [] buyers = {"Покупатель 1", "Покупатель 2","покупатель 3","покупатель 4","покупатель 5","покупатель 6","покупатель 7","покупатель 8"
 			,"покупатель 9","покупатель 10","покупатель 11","покупатель 12","покупатель 13","покупатель 14","покупатель 15","покупатель 16","покупатель 17"};
 		static JComboBox users = new JComboBox (buyers);
		 
		 WatchUserHistory() {
			

			buttonPanel.setLayout(new BorderLayout());
			buttonPanel.add(add, BorderLayout.WEST);
			buttonPanel.add(no, BorderLayout.EAST);
			getMainFrame();
			addPanel.setLayout(new GridLayout(4,1));
			addPanel.add(new JLabel("выберите пользователя"));
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

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 