package com.spi.hibernate;

import java.sql.Date;

public class Txn {

	private int	txnid;
	private Date date;
	private double total;


	public int getTxnid() {
		return txnid;
	}
	public void setTxnid(int txnid) {
		this.txnid = txnid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate( Date date1) {
		this.date =  date1;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	public String toString() {
		return "Txn [txnid=" + txnid + ", date=" + date + ", total=" + total + ",]";
	}
}