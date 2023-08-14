package com.collector;

public class CallQuality {
	
	int callId;
	int callDuration;
	float dropRate;
	String mobileNumber;
	public CallQuality(int callId, int callDuration, float dropRate, String mobileNumber) {
		super();
		this.callId = callId;
		this.callDuration = callDuration;
		this.dropRate = dropRate;
		this.mobileNumber = mobileNumber;
	}
	public int getCallId() {
		return callId;
	}
	public void setCallId(int callId) {
		this.callId = callId;
	}
	public int getCallDuration() {
		return callDuration;
	}
	public void setCallDuration(int callDuration) {
		this.callDuration = callDuration;
	}
	public float getDropRate() {
		return dropRate;
	}
	public void setDropRate(float dropRate) {
		this.dropRate = dropRate;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "CallQuality [callId=" + callId + ", callDuration=" + callDuration + ", dropRate=" + dropRate
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
