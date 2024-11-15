package com.trg;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@PrimaryKeyJoinColumn(name = "teacherKey")
public class Teacher extends Persone {
	@Column(name = "subjectName")
	private String subjectName;

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
}
