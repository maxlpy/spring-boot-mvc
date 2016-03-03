package com.platform.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.platform.entity.ArtifactoryTPB;
import com.platform.service.ArtifactoryTPBService;

@Controller
public class ArtifactoryTPBController {
	
	@Autowired
	ArtifactoryTPBService artifactoryTPBService;
	// Disable dependency checking feature.
	@Autowired(required = false) 
	List<ArtifactoryTPB> artifactorytpbs;
	
	@RequestMapping("/list")
	public String ArtifactoryList(Model model) {
		artifactorytpbs = artifactoryTPBService.findAll();
		model.addAttribute("artifactorytpbs", artifactorytpbs);
		return "jsp/list";
	}
}
