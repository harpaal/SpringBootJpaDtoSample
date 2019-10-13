package com.hpst.jpadto;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes=Application.class)
@ActiveProfiles(profiles = "test")
class TestServiceLayerIntegration {

	@Autowired
	DaoService service;
	
	
	 
	@Test
	@DisplayName("Testing Service Dao Layer")
	void testServiceDao() throws IOException {
		
		List<Model> dataModelList = service.getDataInModel();
		Assertions.assertAll( 
							() -> assertNotEquals(0,dataModelList.size()),
							()->  assertNotEquals(1, dataModelList.get(0))
		);
	}

}
