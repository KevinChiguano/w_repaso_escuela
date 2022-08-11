package com.uce.edu.demo;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Estudiante;
import com.uce.edu.demo.repository.modelo.Materia;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;

@SpringBootApplication
public class WRepasoEscuelaApplication implements CommandLineRunner{
	
	private static Logger LOG = Logger.getLogger(WRepasoEscuelaApplication.class);
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private IMateriaService materiaService;

	public static void main(String[] args) {
		SpringApplication.run(WRepasoEscuelaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*List<Estudiante> estu = this.estudianteService.buscarFetchJoin(20);
		for(Estudiante es: estu) {
			LOG.info("Estudiante: "+es);
			for(Materia ma: es.getMaterias()) {
				LOG.info("Materia: "+ma);
			}
		}*/
	}

}
