package com.cts.training.model;

public class FundTransfer {

	private int id;
	private String sender;
	private String recipient;
	private int amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "FundTransfer [id=" + id + ", sender=" + sender + ", recipient=" + recipient + ", amount=" + amount
				+ "]";
	}

}
