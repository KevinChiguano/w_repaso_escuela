package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Materia;

public interface IMateriaService {

	public void insertar(Materia materia);
	public Materia buscar(Integer id);
	public void actualizar(Materia materia);
	public void eliminar(Integer id);
	
}
