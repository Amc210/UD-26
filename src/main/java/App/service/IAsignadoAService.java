package App.service;

import java.util.List;

import App.dto.AsignadoA;

public interface IAsignadoAService {

	public List<AsignadoA> listaAsignadoA();

	public AsignadoA insertAsignadoA(AsignadoA AsignadoA);

	public AsignadoA AsignadoAID(int id);
	
	public AsignadoA updateAsignadoA(AsignadoA AsignadoA);

	public void deleteAsignadoA(int id);
}
