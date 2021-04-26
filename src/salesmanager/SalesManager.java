/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j9neave
 */
public class SalesManager extends javax.swing.JFrame {

	private List<Map<String, String>> parsedList = new ArrayList();
	static JFileChooser chooser;
	
	/**
	 * Creates new form MainWindow
	 */
	public SalesManager() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        OpenButton = new javax.swing.JMenuItem();
        SaveButton = new javax.swing.JMenuItem();
        SaveAsButton = new javax.swing.JMenuItem();
        ExitSeparator = new javax.swing.JPopupMenu.Separator();
        ExitButton = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        NewRecordButton = new javax.swing.JMenuItem();
        RemoveRecordsButton = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Manager");
        setName("Sales Manager"); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("CSV not found");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenCSV(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jButton1, gridBagConstraints);

        jTextField1.setForeground(new java.awt.Color(109, 109, 109));
        jTextField1.setText("Search...");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        getContentPane().add(jTextField1, gridBagConstraints);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item Name", "Sales Rep", "Sale ID", "Sale Price", "Unit Cost", "Sales Area", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        getContentPane().add(jButton3, gridBagConstraints);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        getContentPane().add(jSeparator2, gridBagConstraints);

        FileMenu.setText("File");

        OpenButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        OpenButton.setText("Open...");
        OpenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenCSV(evt);
            }
        });
        FileMenu.add(OpenButton);

        SaveButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveButton.setText("Save...");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });
        FileMenu.add(SaveButton);

        SaveAsButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveAsButton.setText("Save As...");
        FileMenu.add(SaveAsButton);
        FileMenu.add(ExitSeparator);

        ExitButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExitButton.setText("Exit...");
        FileMenu.add(ExitButton);

        MenuBar.add(FileMenu);

        EditMenu.setText("Edit");

        NewRecordButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, 0));
        NewRecordButton.setText("New Record...");
        EditMenu.add(NewRecordButton);

        RemoveRecordsButton.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, 0));
        RemoveRecordsButton.setText("Remove Selected Record(s)...");
        EditMenu.add(RemoveRecordsButton);

        MenuBar.add(EditMenu);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OpenCSV(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenCSV
        // TODO add your handling code here:
		int return_value = chooser.showOpenDialog(this);
		if (return_value == JFileChooser.APPROVE_OPTION) {
			if (chooser.getSelectedFile().exists()) {
				if (chooser.getSelectedFile().getName().endsWith(".csv")) {
					this.setTitle("Sales Manager - " + chooser.getSelectedFile().getAbsolutePath());
					jButton1.setForeground(new java.awt.Color(0, 153, 0));
					jButton1.setText("CSV Found");
					try {
						parseCSV(chooser.getSelectedFile());
					} catch (FileNotFoundException ex) {
						Logger.getLogger(SalesManager.class.getName()).log(Level.SEVERE, null, ex);
					}
				} else {
					jButton1.setText("CSV not found");
					jButton1.setForeground(new java.awt.Color(204, 0, 0));
					this.setTitle("Sales Manager");
				}
			} else {
				jButton1.setText("CSV not found");
				jButton1.setForeground(new java.awt.Color(204, 0, 0));
				this.setTitle("Sales Manager");
			}
		} else {
			jButton1.setText("CSV not found");
			jButton1.setForeground(new java.awt.Color(204, 0, 0));
			this.setTitle("Sales Manager");
		}
    }//GEN-LAST:event_OpenCSV

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
		if (jTextField1.getText().equals("Search...")) {
			jTextField1.setForeground(new java.awt.Color(0, 0, 0));
			jTextField1.setText("");
		}
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
		if (jTextField1.getText().equals("")) {
			jTextField1.setForeground(new java.awt.Color(109, 109, 109));
			jTextField1.setText("Search...");
		}

    }//GEN-LAST:event_jTextField1FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
		try {
			FileWriter writer = new FileWriter(chooser.getSelectedFile().getAbsolutePath(), true);
			
			DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
			writer.write("Column1, Item Name, Sales Rep, Sales ID#, Sale Price, Unit Cost, Sales Area, Department\n");
			for (int i = 0; i != model.getRowCount(); i++) {
				String row = 
						"\"" + model.getValueAt(i, 0) + "\", " + //ID
						"\"" + model.getValueAt(i, 1) + "\", " + //Item Name
						"\"" + model.getValueAt(i, 2) + "\", " + //Sales Rep
						"\"" + model.getValueAt(i, 3) + "\", " + //Sales ID
						"\"" + model.getValueAt(i, 4) + "\", " + //Sale Price
						"\"" + model.getValueAt(i, 5) + "\", " + //Unit Cost
						"\"" + model.getValueAt(i, 6) + "\", " + //Sales Area
						"\"" + model.getValueAt(i, 7) + "\", \n" + //Department
						
				writer.write(row);
						
			}
			
		} catch (IOException ex) {
			Logger.getLogger(SalesManager.class.getName()).log(Level.SEVERE, null, ex);
		}
		
    }//GEN-LAST:event_SaveButtonActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		
		chooser = new JFileChooser();
		chooser.setFileFilter(new FileNameExtensionFilter("Comma Separated Values (.csv) Files", "csv"));
		
		
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SalesManager().setVisible(true);
			}
		});
	}
	
	private void parseCSV(File csv_file) throws FileNotFoundException {
		try (Scanner csv_scan = new Scanner(csv_file);){
			csv_scan.nextLine();
			while (csv_scan.hasNext()) {
				Map<String, String> parsedLine = new HashMap();
				String line = csv_scan.nextLine();
				String[] separated_line = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);

				parsedLine.put("ID", separated_line[0]);
				parsedLine.put("Item Name", separated_line[1]);
				parsedLine.put("Sales Rep", separated_line[2]);
				parsedLine.put("Sale ID", separated_line[3]);
				parsedLine.put("Sale Price", separated_line[4]);
				parsedLine.put("Unit Cost", separated_line[5]);
				parsedLine.put("Sales Area", separated_line[6]);
				parsedLine.put("Department", separated_line[7]);
				
				parsedList.add(parsedLine);
				
			}
			
			updateTable();
		
		}
	}
	
	private void updateTable() {
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		for (Map<String, String> line : parsedList) {
			Object[] row = {
				line.get("ID"),
				line.get("Item Name"),
				line.get("Sales Rep"), 
				line.get("Sale ID"),
				line.get("Sale Price"), 
				line.get("Unit Cost"), 
				line.get("Sales Area"),
				line.get("Department")
			};
			model.addRow(row);
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenuItem ExitButton;
    private javax.swing.JSeparator ExitSeparator;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem NewRecordButton;
    private javax.swing.JMenuItem OpenButton;
    private javax.swing.JMenuItem RemoveRecordsButton;
    private javax.swing.JMenuItem SaveAsButton;
    private javax.swing.JMenuItem SaveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
