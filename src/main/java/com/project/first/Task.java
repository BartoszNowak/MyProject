package com.project.first;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TASK")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TASK_ID")
	private Long id;

	@Column(name = "DESCRIPTION")
	private String description;
	
	@OneToOne(mappedBy = "task", targetEntity = TaskData.class)
	private TaskData taskData;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Result result;
	
	public TaskData getTaskData() {
		return taskData;
	}

	public void setTaskData(TaskData taskData) {
		this.taskData = taskData;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}


	public Task() {
	}

	public Long getId() {
		return id;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setId(Long id) {
		if (this.id == null) {
			this.id = id;
		}
	}

}
