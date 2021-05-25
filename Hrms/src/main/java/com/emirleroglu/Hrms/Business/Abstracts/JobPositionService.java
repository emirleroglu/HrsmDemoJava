package com.emirleroglu.Hrms.Business.Abstracts;

import java.util.List;

import com.emirleroglu.Hrms.Entities.concrete.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

	JobPosition findById(int id);
}
