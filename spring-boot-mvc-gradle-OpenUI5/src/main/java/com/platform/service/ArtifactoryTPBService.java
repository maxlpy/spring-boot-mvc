package com.platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.dao.ArtifactoryTPBDao;
import com.platform.entity.ArtifactoryTPB;

@Service
public class ArtifactoryTPBService {
	@Autowired
	ArtifactoryTPBDao artifactoryTPBDao;
	
	public List<ArtifactoryTPB> findAll() {
		List<ArtifactoryTPB> ret = artifactoryTPBDao.findAll();
		return ret;
	}
}
