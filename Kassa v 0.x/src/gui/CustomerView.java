/*package gui;

	
	public CustomerView(){
		
		
		
		
		
		
		
		
		
		
		
		
		
		checkout.setLayout(new GridLayout(1,1));
		check.setEditable(false);
		Font font = new Font("Verdana", Font.BOLD, 16);
		check.setFont(font);
		checkout.add(check);
		confirmation.setLayout(new GridLayout(1,2));
		confirmation.add(confirm);
		confirmation.add(cancel);
		infoPanel.add(users , BorderLayout.NORTH);
		infoPanel.add(checkout, BorderLayout.CENTER);
		infoPanel.add(confirmation, BorderLayout.SOUTH);
		
		
		mainPanelCustomer.setVisible(true);
		
		
		mainPanelKtk.setLayout(new GridLayout(1,2));
		////////////zona vidimosti konteinera ktk
		mainPanelKtk.setVisible(false);		
		
		itemktk.setLayout(new GridLayout(5,1));
		userktk.setLayout(new GridLayout(4,1));
		itemktk.add(addItem);
		itemktk.add(removeItem);
		itemktk.add(eksportJournal);
		itemktk.add(showJournal);
		itemktk.add(clearJournal);
		
		userktk.add(userView);
		userktk.add(userAdd);
		userktk.add(userRemove);
		
		mainPanelKtk.add(itemktk);
		mainPanelKtk.add(userktk);
		
		
		
		
		
		//workArea.add(mainPanelKtk, BorderLayout.CENTER);
		
		//mainPanelKtk.setVisible(false);
		
		//mainframe.getContentPane().add(workArea);
		
		tab1.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log:customer pressed!");
		          mainPanelKtk.setVisible(false);
		          mainPanelCustomer.setVisible(true);
		          workArea.remove(mainPanelKtk);
		          workArea.add(mainPanelCustomer);
		          
		     }
		});
	
		tab2.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: KTK pressed!");
		          mainPanelCustomer.setVisible(false);
		          mainPanelKtk.setVisible(true);
		          workArea.remove(mainPanelCustomer);
		          workArea.add(mainPanelKtk, BorderLayout.CENTER);
		          
		     }  
		     
		});		
		
		
		
		confirm.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: buy button pressed!");
		         
		          
		     }  
		     
		});
		
		
		cancel.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: cancel pressed!");
		          
		          
		     }  
		     
		});
		
		
		item.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar 1 pressed!");
		          
		          
		     }  
		     
		});
		
		
		item2.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar 2 pressed!");
		          
		          
		     }  
		     
		});
		
		
		
		item3.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar 3 pressed!");
		         
		          
		     }  
		     
		});
		
		
		item4.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar4 pressed!");
		          
		          
		     }  
		     
		});
		
		
		item5.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar5 pressed!");
		          
		          
		     }  
		     
		});
		
		
		item6.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar6 pressed!");
		          
		          
		     }  
		     
		});
		
		
		item7.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: tovar7 pressed!");
		          
		          
		     }  
		     
		});
		
		
		addItem.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: additem pressed!");
		          KtkWindows.addItemWindow();
		          
		          
		     }  
		     
		});
		
		
		removeItem.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: remove item pressed!");
		          KtkWindows.removeItemWindow();
		        
		          
		     }  
		     
		});
		
		
		eksportJournal.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: eksport to file pressed!");
		          JOptionPane.showMessageDialog(null,"Журнал экспортирован в фаил");
		          
		     }  
		     
		});
		
		
	showJournal.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: show pressed!");
		          KtkWindows.journalView();
		          
		     }  
		     
		});
		
		
		clearJournal.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: clear pressed!");
		          JOptionPane.showConfirmDialog(null, "Вы уверены что хотите удалить журнал?");
		          
		     }  
		     
		});
		
		
		userAdd.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: add user pressed!");
		          		          
		     }  
		     
		});
		
		
		userRemove.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: user remove pressed!");
		          
		     }  
		     
		});
		
		
		userView.addActionListener(new ActionListener() {
		     public void actionPerformed(ActionEvent e) {
		          System.out.println("log: user journal pressed!");
		         
		          
		          
		     }  
		     
	}
		);		
		
		
		
		
		
		
	}
	
	
	
	
	public static CustomerView getCustomerView(){
		CustomerView view = new CustomerView();
		return view;
		
	}
	

	public void hideConsumerView(){
		mainPanelKtk.setVisible(true);
		mainPanelCustomer.setVisible(false);
	}
	
	public void hideKtkView(){
		mainPanelCustomer.setVisible(true);
		mainPanelKtk.setVisible(false);
	}

}
*/