package com.hpst.jpadto;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DaoService {

	@Autowired
	private ModelJpaRepository modelJpaRepository;
	
	List<ModelDto> getModelDto() {
		return modelJpaRepository.getDataInDto();
	}
	
	Model getModelName(String name) {
		return modelJpaRepository.findByName(name);
	}
	
	public List<Model> getDataInModel() throws IOException {
		return modelJpaRepository.getDataInModel();
	}
	
	
	public List<Model> findByRepo() throws IOException {
		return modelJpaRepository.findAll();
	}

	public void saveModel(String value) {
		Model model = new Model();
		model.setId(System.currentTimeMillis());
		model.setValue(value);
		modelJpaRepository.save(model);
		
	}
	
}
