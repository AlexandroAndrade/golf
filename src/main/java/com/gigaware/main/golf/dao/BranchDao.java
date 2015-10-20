package com.gigaware.main.golf.dao;

import java.util.List;

import com.gigaware.main.golf.entity.Branch;

public interface BranchDao {
	
	void saveBranch(Branch b);
	void updateBranch(Branch b);
	void deleteBranch(Branch b);
	
	List<Branch> getAll();
	Branch getBranchById(Long idBranch);
	
	
	
}
