package com.trg.Controller;

import com.trg.Model.Employee;
import com.trg.View.EmpView;

public class EmpContrpller {
	private Employee model;
	private EmpView view;
	public Employee getModel() {
		return model;
	}
	public void setModel(Employee model) {
		this.model = model;
	}
	public EmpView getView() {
		return view;
	}
	public void setView(EmpView view) {
		this.view = view;
	}
	public EmpContrpller(Employee model, EmpView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void updateView() {
		view.printEmployeeDetails(model.getEmployeeName(), model.getEmployeeId(), model.getEmployeeDepartment());
	}

}
