import java.util.ArrayList;

/**
 * Lists is class that creates an array list to store the tasks added to the to-do list
 * @author Arjun Mainali and Albert Joseph Bunyi
 * @since 11/21/2023
 */
public class Lists {
	
	private ArrayList<String> task = new ArrayList<String>();
	private static int intitialTaskNum = 0;
	private int taskNum;
	
	/**
	 * default constructor
	 */
	public Lists() {
		taskNum = intitialTaskNum;
	}
	
	/**
	 * Setter method for the taskNum
	 */
	public void setTaskNum() {
		taskNum = 0;
	}
	
	/**
	 * Method to decrement the taskNum
	 */
	public void decrementTaskNum() {
		taskNum --;
	}
	
	/**
	 * Method to add a task into the array list
	 * @param input, the task to be input into the array list
	 */
	public void addToList(String input) {
			task.add(taskNum, input);
			taskNum++;
	}
	
	/**
	 * Method to remove the number from the array list
	 * @param index, the index of the item to be removed from the array list
	 */
	public void removeFromList(int index) {
		task.remove(index);
	}
	
	/**
	 * Getter method for the items in the array list
	 * @param index, the index of the item to be removed from the array list
	 * @return the item is in the array list at the given index
	 */
	public String getList(int index) {
		return task.get(index);
	}
	
	/**
	 * Getter method for the size of the array list
	 * @return the size of the array list
	 */
	public int getSize() {
		return task.size();
	}
	
	/**
	 * Method to check whether an item is already in the array list
	 * @param input, the item to be added to the list
	 * @return item, whether or not the item is already on the list
	 */
	public boolean itemFound(String input) {
		boolean item = false;
		for(int i = 0; i < task.size(); i++) {
			if (input.equalsIgnoreCase(task.get(i))) {
				item = true;
			} 
		}
		return item;
	}
}