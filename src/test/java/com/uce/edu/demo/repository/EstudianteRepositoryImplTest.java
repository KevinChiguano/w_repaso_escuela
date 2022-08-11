package com.uce.edu.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.uce.edu.demo.repository.modelo.Estudiante;

@DataJpaTest
class EstudianteRepositoryImplTest {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Test
	void testBuscar() {

		Estudiante estu = new Estudiante();
		Integer id = 1;
		estu = estudianteRepository.buscar(id);
		assertThat(estu.getId()).isEqualTo(id);

	}

}
