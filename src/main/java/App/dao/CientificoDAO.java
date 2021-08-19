package App.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Cientifico;

public interface CientificoDAO extends JpaRepository<Cientifico, Integer>{
	public List <Cientifico> findByNombre (String nombre);
}
