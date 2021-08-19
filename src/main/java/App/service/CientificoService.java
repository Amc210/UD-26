package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.CientificoDAO;
import App.dto.Cientifico;

@Service
public class CientificoService implements ICientificoService {
	@Autowired
	CientificoDAO CientificoDAO;

	@Override
	public Cientifico insertCientifico(Cientifico Cientifico) {

		return CientificoDAO.save(Cientifico);
	}

	@Override
	public Cientifico CientificoID(int id) {
		return CientificoDAO.findById(id).get();
	}

	@Override
	public List<App.dto.Cientifico> listaCientifico() {
		return CientificoDAO.findAll();
	}

	@Override
	public App.dto.Cientifico updateCientifico(App.dto.Cientifico Cientifico) {
		return CientificoDAO.save(Cientifico);
	}

	@Override
	public void deleteCientifico(int id) {
		CientificoDAO.deleteById(id);		
	}
	
	@Override
	public List <Cientifico> CientificoName(String name) {
		
		return CientificoDAO.findByNombre(name);
	}
}
