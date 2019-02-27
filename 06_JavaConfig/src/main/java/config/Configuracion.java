package config;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import modelo.entidades.Director;
import modelo.entidades.Pelicula;
import modelo.negocio.GestorPelicula;
import modelo.persistencia.DAOPelicula;

@Configuration
public class Configuracion {
	
	@Bean("pelicula")
	@Scope("prototype")
	public Pelicula pelicula( @Qualifier("director") Director director ){
		Pelicula pelicula = new Pelicula();
		pelicula.setGenero("scifi");
		/* Asignar un director fijo => 
		 * pelicula.setDirector(getDirector());
		 * 
		 * Alternativa pasandoselo por parametroa este metodo	:
		 * pelicula.setDirector(director);
		*/
		return pelicula;
	}
	
	@Bean("director")
	@Scope("prototype")
	public Director getDirector() {
		Director director = new Director();
		return director;
	}
	
	@Bean("listaPeliculas")
	@Resource
	public List<Pelicula> getListaPeliculas() {
		return new ArrayList<>();
	}
	
	@Bean("daoPeliculas")
	public DAOPelicula getDaoPeliculas( List<Pelicula> listaPeliculas ) {
		DAOPelicula dao = new DAOPelicula();
		dao.setListaPeliculas(listaPeliculas);
		dao.setNumeroMaximoPeliculas(2);
		return dao;
	}
	
	@Bean("gestorPeliculas")
	public GestorPelicula getGestorPeliculas( DAOPelicula dao ) {
		GestorPelicula gestor = new GestorPelicula();
		gestor.setDaoPelicula(dao);
		return gestor;
	}
}
