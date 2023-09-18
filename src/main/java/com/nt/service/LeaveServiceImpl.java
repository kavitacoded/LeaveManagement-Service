package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.exception.ResourceNotFoundException;
import com.nt.model.LeaveRequest;
import com.nt.repo.LeaveRepository;

@Service
public class LeaveServiceImpl  implements ILeaveService{

	@Autowired 
	private LeaveRepository repo;
	
	@Override
	public LeaveRequest createLeaveRequest(LeaveRequest leaveRequest) {
		return repo.save(leaveRequest);
	}
	
	@Override
	public List<LeaveRequest> getAllLeaveRequest() {
		return repo.findAll();
	}
	@Override
	public LeaveRequest getLeaveRequestById(Long id) {
		return repo.findById(id)
			.orElseThrow( () -> new ResourceNotFoundException("Leave Request not Found with id " +id))	;
	}
}
