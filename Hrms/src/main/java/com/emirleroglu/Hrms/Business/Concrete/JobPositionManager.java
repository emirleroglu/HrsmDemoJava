package com.emirleroglu.Hrms.Business.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emirleroglu.Hrms.Business.Abstracts.JobPositionService;
import com.emirleroglu.Hrms.Dao.Abstracts.JobPositionDao;
import com.emirleroglu.Hrms.Entities.concrete.JobPosition;
@Service
public class JobPositionManager implements JobPositionService {
	
	private JobPositionDao myDao;
	
	
	@Autowired
	public JobPositionManager(JobPositionDao myDao) {
		super();
		this.myDao = myDao;
	}



	@Override
	public List<JobPosition> getAll() {
		System.out.println("Business katmanı çalışıyor mu");
		return this.myDao.findAll();
	}



	@Override
	public JobPosition findById(int id) {
		
		return this.myDao.getOne(id);
	}

}
