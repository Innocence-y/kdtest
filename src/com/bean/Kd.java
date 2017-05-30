package com.bean;

/**
 * Created by WWWW on 2017/5/28.
 */
public class Kd {
	public Kd() {
	}

	private int id;
	private String kd_id;
	private String tele;
	private String address;
	private String sender;
	private String receiver;
	private String mydate;
	private String status;


	public String getMydate() {
		return mydate;
	}

	public void setMydate(String mydate) {
		this.mydate = mydate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getKd_id() {
		return kd_id;
	}

	public void setKd_id(String kd_id) {
		this.kd_id = kd_id;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receive) {
		this.receiver = receiver;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Kd{" +
				"id=" + id +
				", kd_id='" + kd_id + '\'' +
				", tele='" + tele + '\'' +
				", address='" + address + '\'' +
				", sender='" + sender + '\'' +
				", receiver='" + receiver + '\'' +
				", mydate='" + mydate + '\'' +
				", status='" + status + '\'' +
				'}';
	}

}
