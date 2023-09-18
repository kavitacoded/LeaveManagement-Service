package com.nt.service;

import java.util.List;

import com.nt.model.LeaveRequest;


public interface ILeaveService {

	public LeaveRequest createLeaveRequest(LeaveRequest leaveRequest);
	public  List<LeaveRequest> getAllLeaveRequest();
	public LeaveRequest getLeaveRequestById(Long id);
	public LeaveRequest updateLeaveRequest(Long id ,LeaveRequest leaveRequest);
	public void deleteLeaveRequest(Long id);
}
