package App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import App.dao.AsignadoADAO;
import App.dto.AsignadoA;

@Service
public class AsignadoAService implements IAsignadoAService{
	@Autowired
	AsignadoADAO AsignadoADAO;

	@Override
	public AsignadoA insertAsignadoA(AsignadoA AsignadoA) {

		return AsignadoADAO.save(AsignadoA);
	}

	@Override
	public AsignadoA AsignadoAID(int id) {
		return AsignadoADAO.findById(id).get();
	}

	@Override
	public List<App.dto.AsignadoA> listaAsignadoA() {
		return AsignadoADAO.findAll();
	}

	@Override
	public App.dto.AsignadoA updateAsignadoA(App.dto.AsignadoA AsignadoA) {
		return AsignadoADAO.save(AsignadoA);
	}

	@Override
	public void deleteAsignadoA(int id) {
		AsignadoADAO.deleteById(id);		
	}

}
