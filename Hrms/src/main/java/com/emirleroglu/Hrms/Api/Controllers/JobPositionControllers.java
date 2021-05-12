package com.emirleroglu.Hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emirleroglu.Hrms.Business.Abstracts.JobPositionService;
import com.emirleroglu.Hrms.Entities.concrete.JobPosition;

@RestController
@RequestMapping("/api/jobPosition")
public class JobPositionControllers {
		private JobPositionService myService;
		
		@Autowired
		public JobPositionControllers(JobPositionService myService) {
			super();
			this.myService = myService;
		}
		
		@GetMapping("/getAll")
		public List<JobPosition> getAll(){
			System.out.println("api çalışıyor");
			return this.myService.getAll();
		}
		
		@GetMapping("/{id}")
		public JobPosition findById(int id) {
			return this.myService.findById(id);
		}
		
		
}
