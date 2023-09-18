package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.LeaveRequest;
import com.nt.service.ILeaveService;

@RestController
@RequestMapping("/leave")
public class LeaveRequestController {

	@Autowired
	private ILeaveService service;

	@PostMapping("/create")
	public ResponseEntity<?> createLeaveRequest(@RequestBody LeaveRequest leaveRequest) {
		LeaveRequest request = service.createLeaveRequest(leaveRequest);
		return new ResponseEntity<>(request, HttpStatus.CREATED);
	}
	@GetMapping("all")
	public ResponseEntity<List<LeaveRequest>> getAllLeaveRequest(){
	List<LeaveRequest>leave=	service.getAllLeaveRequest();
	return new ResponseEntity<List<LeaveRequest>>(leave,HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<LeaveRequest> getLeaveRequestById(@PathVariable Long id){
	LeaveRequest req=	service.getLeaveRequestById(id);
	return new ResponseEntity<LeaveRequest>(req, HttpStatus.OK);
	}
	
}
