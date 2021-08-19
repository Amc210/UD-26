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

import App.dto.Cientifico;


@RestController
@RequestMapping("/api")
public class CientificoController {
	@Autowired
	App.service.CientificoService CientificoService;

	@GetMapping("/cientificos")
	public List<Cientifico> listaCientifico() {
		return CientificoService.listaCientifico();
	}

	@PostMapping("/cientificos")
	public Cientifico insertCientifico(@RequestBody Cientifico Cientifico) {
		return CientificoService.insertCientifico(Cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cientifico CientificoID(@PathVariable(name = "id") int id) {
		Cientifico Cientifico_id = new Cientifico();
		Cientifico_id = CientificoService.CientificoID(id);
		
		return Cientifico_id;
	}
	@GetMapping("/cientificos/{name}")
	public List<Cientifico> ArticuloName(@PathVariable(name = "nombre") String nombre) {

		return CientificoService.CientificoName(nombre);
	}


	@PutMapping("/cientificos/{id}")
	public Cientifico updateCientifico(@PathVariable(name = "id") int id, @RequestBody Cientifico Cientifico) {
		Cientifico CientificoSelected = new Cientifico();
		Cientifico CientificoUpdated = new Cientifico();

		CientificoSelected = CientificoService.CientificoID(id);
		CientificoSelected.setNombre(Cientifico.getNombre());

		CientificoSelected = CientificoService.updateCientifico(CientificoSelected);

		return CientificoUpdated;
	}

	@DeleteMapping("/cientificos/{id}")
	public void deleteCientifico(@PathVariable(name = "id") int id) {
		CientificoService.deleteCientifico(id);
	}
}
