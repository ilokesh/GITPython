package com.spi.hibernate;

public class Customer {
	private int txnid;
	private String custname;
	private String emial;
	private String address;
	private Txn txn;

	public int getTxnid() {
		return txnid;
	}
	public void setTxnid(int txnid) {
		this.txnid = txnid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Txn getTxn() {
		return txn;
	}
	public void setTxn(Txn txn) {
		this.txn = txn;
	}

	@Override
	public String toString() {
		return "Customer [txid=" + txnid + ", custname=" + custname + ", emial=" + emial + ", address=" + address + "]";
	}
}
