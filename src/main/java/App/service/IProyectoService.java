package App.service;

import java.util.List;

import App.dto.Proyecto;

public interface IProyectoService {

	public List<Proyecto> listaProyecto();

	public Proyecto insertProyecto(Proyecto Proyecto);

	public Proyecto ProyectoID(int id);

	public Proyecto updateProyecto(Proyecto Proyecto);

	public void deleteProyecto(int id);
}
