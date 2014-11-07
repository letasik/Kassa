/*package gui;

import java.awt.Component;
import java.awt.GridLayout;

import javax.activation.MailcapCommandMap;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KtkWindows  extends JFrame{
	
	static JPanel mainpanel = new JPanel();
	static JPanel itemName = new JPanel();
	static JPanel itemCost = new JPanel();
	static  JPanel confirmCancel = new JPanel();
	static JLabel nameLabel = new JLabel("Наименование\n");
	static JLabel costLabel = new JLabel("Наименование\n");
	static String [] items = {"item1","item2","item3","item4","item5"};
	static JComboBox tovar = new JComboBox(items);
	static JTextField itemField = new JTextField("Введите наменование товара");
	static JTextField costField = new JTextField("Введите цену товара");
	static JButton ok = new JButton("Добавить");
	static JButton remove = new JButton("Удалить");
	static JButton cancel = new JButton("отмена");
	
	
	
	
	
	
	
	
	
	
	public KtkWindows(){
		
		
		
	}
	
	public static JPanel additempanels(){
		mainpanel.setLayout(new GridLayout(3,1));
		itemName.add(nameLabel);
		itemName.add(itemField);
		mainpanel.add(itemName);
		itemCost.add(costLabel);
		itemCost.add(costField);
		mainpanel.add(itemCost);
		confirmCancel.add(ok);
		confirmCancel.add(cancel);
		mainpanel.add(confirmCancel);
		
		
		
		
		return mainpanel;
		
	}
	
	
	
	
	
	
	public static void addItemWindow(){
		
		JFrame additem = new JFrame();
		additem.setTitle("Добавить товар");
		additem.setSize(500, 250);
		additem.setVisible(true);
		additem.add(additempanels());
		
		
	}
	
	public static JPanel removeItemPanels(){
		mainpanel.setLayout(new GridLayout(2,1));
		itemName.add(nameLabel);
		itemName.add(tovar);
		mainpanel.add(itemName);
		confirmCancel.add(remove);
		confirmCancel.add(cancel);
		mainpanel.add(confirmCancel);		
		return mainpanel;
		
	}
	
	
	
	
	
	public static void removeItemWindow(){
		JFrame removeitem = new JFrame();
		removeitem.setTitle("удалить товар");
		removeitem.setSize(500, 250);
		removeitem.setVisible(true);
		removeitem.add(removeItemPanels());
		
		
		
	}
	
	
	public static void journalView (){
		
		JFrame journal = new JFrame();
		journal.setTitle("журнал покупок");
		journal.setSize(500, 700);
		journal.setVisible(true);
		JLabel text = new JLabel("Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ");
		journal.add(text);
		
		
	}
	
	public static JPanel addUserPanels(){
		mainpanel.setLayout(new GridLayout(2,1));
		itemName.add(nameLabel);
		itemName.add(itemField);
		mainpanel.add(itemName);
		confirmCancel.add(ok);
		confirmCancel.add(cancel);
		mainpanel.add(confirmCancel);
		
		
		
		
		return mainpanel;
		
	}
	
	
	
	
	
	
	public static void addUserWindows(){
		
		JFrame additem = new JFrame();
		additem.setTitle("Добавить пользователя");
		additem.setSize(500, 250);
		additem.setVisible(true);
		additem.add(additempanels());
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
*/