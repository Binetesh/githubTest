/**
 * 
 */
package com.sita.beans;

/**
 * @author Binetesh.Thakur
 *
 */
public class Leave {
	private int leaveId;
	private int userId;
	private String fromDate;
	private String toDate;
	private String leaveType;
	private String reason;
	private int numDays;
	private String appliedDate;
	private String actionedOn;
	private String actionTaken;
	private User user;
	/**
	 * @return the leaveId
	 */
	public int getLeaveId() {
		return leaveId;
	}
	/**
	 * @param leaveId the leaveId to set
	 */
	public void setLeaveId(int leaveId) {
			this.leaveId = leaveId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
	
			this.userId = userId;
	}
	/**
	 * @return the fromDate
	 */
	public String getFromDate() {
		return fromDate;
	}
	/**
	 * @param fromDate the fromDate to set
	 */
	public void setFromDate(String fromDate) {
	
		if (fromDate == null)
			this.fromDate = "";
		else
			this.fromDate = fromDate;
	}
	/**
	 * @return the toDate
	 */
	public String getToDate() {
		return toDate;
	}
	/**
	 * @param toDate the toDate to set
	 */
	public void setToDate(String toDate) {
	
		if (toDate == null)
			this.toDate = "";
		else
			this.toDate = toDate;
	}
	/**
	 * @return the leaveType
	 */
	public String getLeaveType() {
		return leaveType;
	}
	/**
	 * @param leaveType the leaveType to set
	 */
	public void setLeaveType(String leaveType) {
	
		if (leaveType == null)
			this.leaveType = "";
		else
			this.leaveType = leaveType;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
	
		if (reason == null)
			this.reason = "";
		else
			this.reason = reason;
	}
	/**
	 * @return the numDays
	 */
	public int getNumDays() {
		return numDays;
	}
	/**
	 * @param numDays the numDays to set
	 */
	public void setNumDays(int numDays) {
			this.numDays = numDays;
	}
	/**
	 * @return the appliedDate
	 */
	public String getAppliedDate() {
		return appliedDate;
	}
	/**
	 * @param appliedDate the appliedDate to set
	 */
	public void setAppliedDate(String appliedDate) {
	
		if (appliedDate == null)
			this.appliedDate = "";
		else
			this.appliedDate = appliedDate;
	}
	/**
	 * @return the actionedOn
	 */
	public String getActionedOn() {
		return actionedOn;
	}
	/**
	 * @param actionedOn the actionedOn to set
	 */
	public void setActionedOn(String actionedOn) {
	
		if (actionedOn == null)
			this.actionedOn = "";
		else
			this.actionedOn = actionedOn;
	}
	/**
	 * @return the actionTaken
	 */
	public String getActionTaken() {
		return actionTaken;
	}
	/**
	 * @param actionTaken the actionTaken to set
	 */
	public void setActionTaken(String actionTaken) {
	
		if (actionTaken == null)
			this.actionTaken = "";
		else
			this.actionTaken = actionTaken;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
			this.user = user;
	}
	
	
}
