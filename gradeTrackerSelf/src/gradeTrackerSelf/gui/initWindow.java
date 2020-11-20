package gradeTrackerSelf.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class initWindow extends JFrame {

	private JPanel contentPane;
	private JTable initSubjectList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					initWindow frame = new initWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void addSubject() {
		System.out.println("adding a new subject");
		
		//converting the table temporaily to DefaultTableModel in order to add data
		DefaultTableModel subjectList = (DefaultTableModel)initSubjectList.getModel();

		//call sujectInfoWindow

		//get info from subjectInfoWindow
		//tempoarily testing code
		Vector<String> newSubjectInfo = new Vector<String>();
		newSubjectInfo.add("Computer Science");
		newSubjectInfo.add("Ken Mcclure");
		newSubjectInfo.add("7");
		newSubjectInfo.add("HL");

		//adding the subject
		subjectList.addRow(newSubjectInfo);

		//sync data to database
		this.refreshWindow();
	}

	private void delSubject(String selected) {
		
		//converting the table temporaily to DefaultTableModel in order to add data
		DefaultTableModel subjectList = (DefaultTableModel)initSubjectList.getModel();
		
		//deleting the subject
		subjectList.removeRow(selected);
		//imaginery code
		this.refreshWindow();
	}

	private void editSubject(String selected) {
		//call subjectInfoWindow for selected subject

		//**editCellAt(int row, int column)**
		//Programmatically starts editing the cell at 
		//row and column, if those indices are in the 
		//valid range, and the cell at those indices is editable.

		this.refreshWindow();
	}

	public void refreshWindow() {
		//save all the subjectInfo to 1 file
	}

	/**
	 * initlizing the window
	 */
	public initWindow() {
		//controlPane
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 525);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//button for adding subject
		JButton addSubject = new JButton("+");
		addSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addSubject();
				refreshWindow();
			}
		});
		addSubject.setBounds(532, 76, 54, 29);
		contentPane.add(addSubject);
		
		//button for deleting subject
		JButton delSubject = new JButton("-");
		delSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the selected subject using Jtable.isCellSelected() 
				//when the button is pressed
				//delSubject(selected);
				refreshWindow();
			}
		});
		delSubject.setBounds(584, 76, 54, 29);
		contentPane.add(delSubject);
		
		//button for editing subject
		JButton editSubject = new JButton("edit");
		editSubject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the selected subject using Jtable.isCellSelected() 
				//when the button is pressed
				//editSubject(selected);
				refreshWindow();
			}
		});
		editSubject.setBounds(532, 109, 106, 29);
		contentPane.add(editSubject);
		
		//table model for the subjects table
		DefaultTableModel initSubjectListModel = new DefaultTableModel();

		//vector that contain the column titles
		Vector<String> columnTitles = new Vector<String>();
		columnTitles.add("Subject");
		columnTitles.add("Teacher");
		columnTitles.add("Level");
		columnTitles.add("HL/SL");

		//scrollPane to help the Jtable to operate
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 33, 426, 423);
		contentPane.add(scrollPane);

		//setting the table model to the vector
		initSubjectListModel.setColumnIdentifiers(columnTitles);
		
		//Jtable to display the subjects
		initSubjectList = new JTable(initSubjectListModel);
		initSubjectList.setBounds(45, 453, 423, -418);
		scrollPane.setViewportView(initSubjectList);
		
	}
	


}
