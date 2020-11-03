package br.com.itaumon.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itaumon.beans.Evento;

public interface EventoDAO extends CrudRepository <Evento, Integer>{
	
	List<Evento> findByDataBetween(Date inicio, Date fim);

}
