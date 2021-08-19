package App.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import App.dto.Proyecto;

public interface ProyectoDAO  extends JpaRepository<Proyecto, Integer>{

}
