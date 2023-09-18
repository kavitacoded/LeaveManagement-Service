package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.LeaveRequest;

public interface LeaveRepository  extends JpaRepository<LeaveRequest, Long>{

}
