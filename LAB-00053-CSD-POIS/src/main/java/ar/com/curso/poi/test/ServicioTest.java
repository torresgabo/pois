package ar.com.curso.poi.test;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import ar.com.curso.poi.controladores.ControladorHome;

public class ServicioTest {
	ControladorHome controlador = new ControladorHome();
	@Test
	public void validaSiServicioNoExiste(){
		
		assertThat(controlador.validaServicio("Argentina")).isFalse();
	}
	
	@Test
	public void validaSiServicioExiste(){
		assertThat(controlador.validaServicio("Buenos_Aires_Turismo")).isTrue();
	}
}
