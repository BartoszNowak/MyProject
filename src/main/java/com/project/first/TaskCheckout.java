package com.project.first;

/**
 * Checks if the result of the task which id is given is ready.
 *
 */
public interface TaskCheckout {
	/**
	 * Checks if the result of the task which id is given is ready.
	 * 
	 * @param id
	 *            a unique id of task
	 * @return true if the result of the task is ready, in other case return false
	 */
	boolean checkTask(long id);
}
