package com.hpst.jpadto;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")

public class JpaController {

	
	@Autowired
	private DaoService service;
	
	@RequestMapping(path="/myDtoList", method = RequestMethod.GET)
	public Iterable<ModelDto> getModelDto() throws IOException {
		return service.getModelDto();
	}

	

	@RequestMapping(path="/myModel", method = RequestMethod.GET)
	public Iterable<Model> getModel() throws IOException {
		return service.getDataInModel();
	}
	
	
	@RequestMapping(path="/repo", method = RequestMethod.GET)
	public Iterable<Model> findByRepo() throws IOException {
		return service.findByRepo();
	}
	
	
	
	
	
	
	@RequestMapping(value = "/repo/{value}", method = RequestMethod.GET)
	public void saveByRepo(@PathVariable String value) {
		
		
		service.saveModel(value);
	}
}
