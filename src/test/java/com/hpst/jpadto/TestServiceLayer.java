package com.hpst.jpadto;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@DataJpaTest
@ExtendWith(SpringExtension.class)
public class TestServiceLayer {

	 @TestConfiguration
	 static class DaoServiceTestContextConfiguration {
		 @Bean
		 DaoService daoService() {
			 return new DaoService();
		 }
	 }
	 
	 
	@Autowired
	DaoService service;
	
	
	

	@MockBean
	ModelJpaRepository repository;

	@BeforeEach
	public void setUp() {
		Model model = new Model(1l, "value", "hpst");
		Mockito.when(repository.findById(1l)).thenReturn(Optional.of(model));
		Mockito.when(repository.findByName("hpst")).thenReturn(model);
	}

	
	
	
	@Test
	@DisplayName("Unit test Service Layer")
	public void whenValidName_thenModelShouldBeFound() {
	    String name = "hpst";
	    Model found = service.getModelName("hpst");
	     assertThat(found.getName())
	      .isEqualTo(name);
	 }
}
