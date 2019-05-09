package com.hpst.jpadto;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jpa")
public class JpaController {

	@Autowired
	private ModelJpaRepository modelJpaRepository;
	
	
	@RequestMapping(path="/myDtoList", method = RequestMethod.GET)
	public Iterable<ModelDto> getModelDto() throws IOException {
		return modelJpaRepository.getDataInDto();
	}

	

	@RequestMapping(path="/myModel", method = RequestMethod.GET)
	public Iterable<Model> getModel() throws IOException {
		return modelJpaRepository.getDataInModel();
	}
	
	
	@RequestMapping(path="/repo", method = RequestMethod.GET)
	public Iterable<Model> findByRepo() throws IOException {
		return modelJpaRepository.findAll();
	}
	
	
	
	
	
	
	@RequestMapping(value = "/repo/{value}", method = RequestMethod.GET)
	public void saveByRepo(@PathVariable String value) {
		Model model = new Model();
		model.setId(System.currentTimeMillis());
		model.setValue(value);
		
		modelJpaRepository.save(model);
	}
}
