package com.emirleroglu.Hrms.Dao.Abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emirleroglu.Hrms.Entities.concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer>{

}
