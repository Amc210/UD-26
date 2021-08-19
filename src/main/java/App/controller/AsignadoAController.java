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

import App.dto.AsignadoA;

@RestController
@RequestMapping("/api")
public class AsignadoAController {
	@Autowired
	App.service.AsignadoAService AsignadoAService;

	@GetMapping("/AsignadoA")
	public List<AsignadoA> listaAsignadoA() {
		return AsignadoAService.listaAsignadoA();
	}

	@PostMapping("/AsignadoA")
	public AsignadoA insertAsignadoA(@RequestBody AsignadoA AsignadoA) {
		return AsignadoAService.insertAsignadoA(AsignadoA);
	}

	@GetMapping("/AsignadoA/{id}")
	public AsignadoA AsignadoAID(@PathVariable(name = "id") int id) {
		AsignadoA AsignadoA_id = new AsignadoA();
		AsignadoA_id = AsignadoAService.AsignadoAID(id);

		return AsignadoA_id;
	}

	@PutMapping("/AsignadoA/{id}")
	public AsignadoA updateAsignadoA(@PathVariable(name = "id") int id, @RequestBody AsignadoA AsignadoA) {
		AsignadoA AsignadoASelected = new AsignadoA();
		AsignadoA AsignadoAUpdated = new AsignadoA();

		AsignadoASelected = AsignadoAService.AsignadoAID(id);
		AsignadoASelected.setCientifico(AsignadoA.getCientifico());
		AsignadoASelected.setProyecto(AsignadoA.getProyecto());
		
		AsignadoASelected = AsignadoAService.updateAsignadoA(AsignadoASelected);

		return AsignadoAUpdated;
	}

	@DeleteMapping("/AsignadoA/{id}")
	public void deleteAsignadoA(@PathVariable(name = "id") int id) {
		AsignadoAService.deleteAsignadoA(id);
	}
}
