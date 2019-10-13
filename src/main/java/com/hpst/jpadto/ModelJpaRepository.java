package com.hpst.jpadto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelJpaRepository extends JpaRepository<Model, String> {
	
	@Query("select m from Model m")
	List<Model> getDataInModel();
	
	@Query("select new com.hpst.jpadto.ModelDto(m.id,m.name) from Model m")
	List<ModelDto> getDataInDto();
	
}
	
