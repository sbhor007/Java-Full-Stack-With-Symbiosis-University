package com.trg;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	private String duration;
	private String courseName;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Course [duration=" + duration + ", courseName=" + courseName + "]";
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String duration, String courseName) {
		super();
		this.duration = duration;
		this.courseName = courseName;
	}
	
	
}
