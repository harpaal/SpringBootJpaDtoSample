package com.hpst.jpadto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ModelJpaRepository extends JpaRepository<Model, String> {
	
	@Query("select m.name from Model m")
	List<Model> getDataInModel();
	
	@Query("select com.hpst.jpadto.ModelDto(m.id,m.name) from Model m")
	List<ModelDto> getDataInDto();
	
}
	
