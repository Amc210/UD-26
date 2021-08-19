package App.service;

import java.util.List;

import App.dto.Cientifico;

public interface ICientificoService {

	public List<Cientifico> listaCientifico();

	public Cientifico insertCientifico(Cientifico Cientifico);

	public Cientifico CientificoID(int id);
	
	public List<Cientifico> CientificoName(String name);

	public Cientifico updateCientifico(Cientifico Cientifico);

	public void deleteCientifico(int id);
}
