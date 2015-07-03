package com.platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.bean.ArtifactoryTPB;
import com.platform.dao.ArtifactoryTPBDao;

@Service
public class ArtifactoryTPBService {
	@Autowired
	ArtifactoryTPBDao artifactoryTPBDao;
	
	public List<ArtifactoryTPB> findAll() {
		List<ArtifactoryTPB> ret = artifactoryTPBDao.findAll();
		return ret;
	}
}
