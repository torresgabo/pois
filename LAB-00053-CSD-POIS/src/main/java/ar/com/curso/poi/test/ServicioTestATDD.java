package ar.com.curso.poi.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import ar.com.curso.poi.controladores.ControladorHome;
import ar.com.curso.poi.tdd.PoiBean;

public class ServicioTestATDD {
	ControladorHome controlador = new ControladorHome();
	@Test
	public void validaElPoiMasCercano(){
		String url = "htto://localhost:8080/pois-api/Buenos_Aires_Turismo/latitud/longitud";
		assertThat(controlador.validaServicio("Argentina")).isFalse();
	}
	
	
}
