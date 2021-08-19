package App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import App.dto.Proyecto;

@RestController
@RequestMapping("/api")
public class ProyectoContoller {
	@Autowired
	App.service.ProyectoService ProyectoService;

	@GetMapping("/proyectos")
	public List<Proyecto> listaProyecto() {
		return ProyectoService.listaProyecto();
	}

	@PostMapping("/proyectos")
	public Proyecto insertProyecto(@RequestBody Proyecto Proyecto) {
		return ProyectoService.insertProyecto(Proyecto);
	}

	@GetMapping("/proyectos/{id}")
	public Proyecto ProyectoID(@PathVariable(name = "id") int id) {
		Proyecto Proyecto_id = new Proyecto();
		Proyecto_id = ProyectoService.ProyectoID(id);
		System.out.println("Proyecto ID: " + Proyecto_id);
		return Proyecto_id;
	}

	@PutMapping("/proyectos/{id}")
	public Proyecto updateProyecto(@PathVariable(name = "id") int id, @RequestBody Proyecto Proyecto) {
		Proyecto ProyectoSelected = new Proyecto();
		Proyecto ProyectoUpdated = new Proyecto();

		ProyectoSelected = ProyectoService.ProyectoID(id);
		ProyectoSelected.setNombre(Proyecto.getNombre());
		ProyectoSelected.setHoras(Proyecto.getHoras());

		ProyectoSelected = ProyectoService.updateProyecto(ProyectoSelected);

		System.out.println("Proyecto actualizado");

		return ProyectoUpdated;
	}

	@DeleteMapping("/proyectos/{id}")
	public void deleteProyecto(@PathVariable(name = "id") int id) {
		ProyectoService.deleteProyecto(id);
	}
}
