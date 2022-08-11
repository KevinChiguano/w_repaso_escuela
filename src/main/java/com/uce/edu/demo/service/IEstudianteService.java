package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Estudiante;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	public Estudiante buscar(Integer id);
	public void actualizar(Estudiante estudiante);
	public void eliminar(Integer id);
	
	public List<Estudiante> buscarFetchJoin(Integer edad);

}
