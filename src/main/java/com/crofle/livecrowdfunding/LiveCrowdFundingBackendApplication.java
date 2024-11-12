package com.crofle.livecrowdfunding;

import com.crofle.livecrowdfunding.controller.AdminProject;
import com.crofle.livecrowdfunding.dto.ProjectInfoDTO;
import com.crofle.livecrowdfunding.dto.request.PageRequestDTO;
import com.crofle.livecrowdfunding.service.AdminProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class LiveCrowdFundingBackendApplication {

	public static void main(String[] args) {SpringApplication.run(LiveCrowdFundingBackendApplication.class, args);}

}
