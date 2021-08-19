package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.ProyectoDAO;
import App.dto.Proyecto;

@Service
public class ProyectoService  implements IProyectoService{
	@Autowired
	ProyectoDAO ProyectoDAO;

	@Override
	public Proyecto insertProyecto(Proyecto Proyecto) {

		return ProyectoDAO.save(Proyecto);
	}

	@Override
	public Proyecto ProyectoID(int id) {
		return ProyectoDAO.findById(id).get();
	}

	@Override
	public List<App.dto.Proyecto> listaProyecto() {
		return ProyectoDAO.findAll();
	}

	@Override
	public App.dto.Proyecto updateProyecto(App.dto.Proyecto Proyecto) {
		return ProyectoDAO.save(Proyecto);
	}

	@Override
	public void deleteProyecto(int id) {
		ProyectoDAO.deleteById(id);		
	}

}
