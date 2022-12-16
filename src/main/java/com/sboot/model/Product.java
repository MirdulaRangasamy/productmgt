package com.sboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int pid;
	private String pname;
	private float pcost;
	public Product(int pid, String pname, float pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}
	public Product() {
		super();
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPcost() {
		return pcost;
	}
	public void setPcost(float pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	
}
