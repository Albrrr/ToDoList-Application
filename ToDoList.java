import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

/**
 * ToDoList is a Java Swing application for managing a to-do list.
 * It allows users to add and remove items from the list.
 * @author Arjun Mainali and Albert Joseph Bunyi
 * @since 11/21/2023
 */

public class ToDoList {

	private JFrame frmTodoList;
	private JTextField tfToDo;
	private Lists taskList;
	private JButton btnCompleted;
	private JTextField txtTasks;
	private JTextField txtAddTasksBelow;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToDoList window = new ToDoList();
					window.frmTodoList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ToDoList() {
		taskList = new Lists();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTodoList = new JFrame();
		frmTodoList.setTitle("To-do List");
		frmTodoList.setBounds(100, 100, 383, 416);
		frmTodoList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTodoList.getContentPane().setLayout(null);
		
		tfToDo = new JTextField();
		tfToDo.setBounds(33, 332, 197, 21);
		frmTodoList.getContentPane().add(tfToDo);
		tfToDo.setColumns(10);
		
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnOne = new JRadioButton("");
		rdbtnOne.setBounds(6, 25, 21, 23);
		frmTodoList.getContentPane().add(rdbtnOne);
		group.add(rdbtnOne);
		
		JRadioButton rdbtnTwo = new JRadioButton("");
		rdbtnTwo.setBounds(6, 50, 21, 23);
		frmTodoList.getContentPane().add(rdbtnTwo);
		group.add(rdbtnTwo);
		
		JRadioButton rdbtnThree = new JRadioButton("");
		rdbtnThree.setBounds(6, 75, 21, 23);
		frmTodoList.getContentPane().add(rdbtnThree);
		group.add(rdbtnThree);
		
		JRadioButton rdbtnFour = new JRadioButton("");
		rdbtnFour.setBounds(6, 100, 21, 23);
		frmTodoList.getContentPane().add(rdbtnFour);
		group.add(rdbtnFour);
		
		JRadioButton rdbtnFive = new JRadioButton("");
		rdbtnFive.setBounds(6, 125, 21, 23);
		frmTodoList.getContentPane().add(rdbtnFive);
		group.add(rdbtnFive);
		
		JRadioButton rdbtnSix = new JRadioButton("");
		rdbtnSix.setBounds(6, 150, 21, 23);
		frmTodoList.getContentPane().add(rdbtnSix);
		group.add(rdbtnSix);
		
		JRadioButton rdbtnSeven = new JRadioButton("");
		rdbtnSeven.setBounds(6, 175, 21, 23);
		frmTodoList.getContentPane().add(rdbtnSeven);
		group.add(rdbtnSeven);
		
		JRadioButton rdbtnEight = new JRadioButton("");
		rdbtnEight.setBounds(6, 200, 21, 23);
		frmTodoList.getContentPane().add(rdbtnEight);
		group.add(rdbtnEight);
		
		JRadioButton rdbtnNine = new JRadioButton("");
		rdbtnNine.setBounds(6, 225, 21, 23);
		frmTodoList.getContentPane().add(rdbtnNine);
		group.add(rdbtnNine);
		
		JRadioButton rdbtnTen = new JRadioButton("");
		rdbtnTen.setBounds(6, 250, 21, 23);
		frmTodoList.getContentPane().add(rdbtnTen);
		group.add(rdbtnTen);
		
		JRadioButton rdbtnEleven = new JRadioButton("");
		rdbtnEleven.setBounds(6, 275, 21, 23);
		frmTodoList.getContentPane().add(rdbtnEleven);
		group.add(rdbtnEleven);
		
		JTextArea textAreaOne = new JTextArea();
		textAreaOne.setEditable(false);
		textAreaOne.setBounds(33, 25, 251, 22);
		frmTodoList.getContentPane().add(textAreaOne);
		
		JTextArea textAreaTwo = new JTextArea();
		textAreaTwo.setEditable(false);
		textAreaTwo.setBounds(33, 50, 251, 22);
		frmTodoList.getContentPane().add(textAreaTwo);
		
		JTextArea textAreaThree = new JTextArea();
		textAreaThree.setEditable(false);
		textAreaThree.setBounds(33, 75, 251, 22);
		frmTodoList.getContentPane().add(textAreaThree);
		
		JTextArea textAreaFour = new JTextArea();
		textAreaFour.setEditable(false);
		textAreaFour.setBounds(33, 100, 251, 22);
		frmTodoList.getContentPane().add(textAreaFour);
		
		JTextArea textAreaFive = new JTextArea();
		textAreaFive.setEditable(false);
		textAreaFive.setBounds(33, 125, 251, 22);
		frmTodoList.getContentPane().add(textAreaFive);
		
		JTextArea textAreaSix = new JTextArea();
		textAreaSix.setEditable(false);
		textAreaSix.setBounds(33, 150, 251, 22);
		frmTodoList.getContentPane().add(textAreaSix);
		
		JTextArea textAreaSeven = new JTextArea();
		textAreaSeven.setEditable(false);
		textAreaSeven.setBounds(33, 175, 251, 22);
		frmTodoList.getContentPane().add(textAreaSeven);
		
		JTextArea textAreaEight = new JTextArea();
		textAreaEight.setEditable(false);
		textAreaEight.setBounds(33, 200, 251, 22);
		frmTodoList.getContentPane().add(textAreaEight);
		
		JTextArea textAreaNine = new JTextArea();
		textAreaNine.setEditable(false);
		textAreaNine.setBounds(33, 225, 251, 22);
		frmTodoList.getContentPane().add(textAreaNine);
		
		JTextArea textAreaTen = new JTextArea();
		textAreaTen.setEditable(false);
		textAreaTen.setBounds(33, 250, 251, 22);
		frmTodoList.getContentPane().add(textAreaTen);
		
		JTextArea textAreaEleven = new JTextArea();
		textAreaEleven.setEditable(false);
		textAreaEleven.setBounds(33, 275, 251, 22);
		frmTodoList.getContentPane().add(textAreaEleven);
		
		txtTasks = new JTextField();
		txtTasks.setEditable(false);
		txtTasks.setText("Tasks");
		txtTasks.setBounds(135, 0, 40, 20);
		frmTodoList.getContentPane().add(txtTasks);
		txtTasks.setColumns(10);
		
		txtAddTasksBelow = new JTextField();
		txtAddTasksBelow.setEditable(false);
		txtAddTasksBelow.setText("Add tasks below:");
		txtAddTasksBelow.setBounds(33, 309, 99, 20);
		frmTodoList.getContentPane().add(txtAddTasksBelow);
		txtAddTasksBelow.setColumns(10);
		
		btnCompleted = new JButton("Completed");
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean show = false;
				try {
					if(rdbtnOne.isSelected()) {
						taskList.removeFromList(0);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnTwo.isSelected()) {
						taskList.removeFromList(1);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnThree.isSelected()) {
						taskList.removeFromList(2);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnFour.isSelected()) {
						taskList.removeFromList(3);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnFive.isSelected()) {
						taskList.removeFromList(4);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnSix.isSelected()) {
						taskList.removeFromList(5);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnSeven.isSelected()) {
						taskList.removeFromList(6);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnEight.isSelected()) {
						taskList.removeFromList(7);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnNine.isSelected()) {
						taskList.removeFromList(8);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnTen.isSelected()) {
						taskList.removeFromList(9);
						addImg();
						taskList.decrementTaskNum();
					}
					if(rdbtnEleven.isSelected()) {
						taskList.removeFromList(10);
						addImg();
						taskList.decrementTaskNum();
					}
					show = true;
				}
				catch (Exception a) {
					JOptionPane.showMessageDialog(null,"There is no task to checked off.","Issue",JOptionPane.INFORMATION_MESSAGE);
				}
				finally {
					group.clearSelection();
				}
				if (show){
					showTasks(textAreaEleven, textAreaTen, textAreaNine, textAreaEight, textAreaSeven, textAreaSix, textAreaFive, textAreaFour, textAreaThree, textAreaTwo, textAreaOne);
				}
				
			}
		});
		btnCompleted.setBackground(new Color(209, 248, 250));
		btnCompleted.setBounds(240, 308, 99, 22);
		frmTodoList.getContentPane().add(btnCompleted);
		
		JButton btnAdd = new JButton("Add to List");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean searchItem = taskList.itemFound(tfToDo.getText());
				if (!searchItem) {
					if(!tfToDo.getText().equalsIgnoreCase("")) {
						taskList.addToList(tfToDo.getText());
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter a valid item.", "Error", JOptionPane.ERROR_MESSAGE);
					}
					tfToDo.setText("");
					showTasks(textAreaEleven, textAreaTen, textAreaNine, textAreaEight, textAreaSeven, textAreaSix, textAreaFive, textAreaFour, textAreaThree, textAreaTwo, textAreaOne);
				} else {
					JOptionPane.showMessageDialog(null, "Item already on the list.", "Error", JOptionPane.ERROR_MESSAGE);
					tfToDo.setText("");
				}
			} 
		});
		btnAdd.setBackground(new Color(209, 248, 250));
		btnAdd.setBounds(240, 331, 99, 22);
		frmTodoList.getContentPane().add(btnAdd);
		
		
	}
	
	/**
	 * Method to update the text areas with the tasks
	 * @param eleven, the eleventh text area
	 * @param ten, the tenth text area
	 * @param nine, the ninth text area
	 * @param eight, the eight text area
	 * @param seven, the seventh text area
	 * @param six, the sixth text area
	 * @param five, the fifth text area
	 * @param four, the fourth text area
	 * @param three, the third text area
	 * @param two, the second text area
	 * @param one, the first text area
	 */
	private void showTasks(JTextArea eleven, JTextArea ten, JTextArea nine, JTextArea eight, JTextArea seven, JTextArea six, JTextArea five, JTextArea four, JTextArea three, JTextArea two, JTextArea one) {
		int size = taskList.getSize();
		
		eleven.setText("");
		ten.setText("");
		nine.setText("");
		eight.setText("");
		seven.setText("");
		six.setText("");
		five.setText("");
		four.setText("");
		three.setText("");
		two.setText("");
		one.setText("");
		try {
			switch (size) {
				default:
					JOptionPane.showMessageDialog(null,"Invalid Option.","Issue",JOptionPane.INFORMATION_MESSAGE);
				case 11:
					eleven.setText(taskList.getList(10));
				case 10:
					ten.setText(taskList.getList(9));
				case 9:
					nine.setText(taskList.getList(8));
				case 8:
					eight.setText(taskList.getList(7));
				case 7:
					seven.setText(taskList.getList(6));
				case 6:
					six.setText(taskList.getList(5));
				case 5:
					five.setText(taskList.getList(4));
				case 4:
					four.setText(taskList.getList(3));
				case 3:
					three.setText(taskList.getList(2));
				case 2:
					two.setText(taskList.getList(1));
				case 1:
					one.setText(taskList.getList(0));
					break;
				case 0:
					taskList.setTaskNum();
					break;
	
			}
		}
		catch(Exception e) {
		}
	}
	private void addImg() {
		ImageIcon img = new ImageIcon(this.getClass().getResource("/taskComplete.png"));
		JOptionPane.showMessageDialog(null, "Task Completed!", "To-Do List", JOptionPane.INFORMATION_MESSAGE, img);

	}
}
