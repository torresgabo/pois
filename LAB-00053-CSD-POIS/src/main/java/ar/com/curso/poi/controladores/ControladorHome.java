package ar.com.curso.poi.controladores;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.gson.Gson;

import ar.com.curso.poi.tdd.PoiBean;

import java.util.List;

import javax.ws.rs.GET;

@Path("/")
public class ControladorHome {

	@GET
	@Path("/test")
	public String hola(){
		return "Test OK! Not OK!";
	}
	
	@GET
	@Path("/{servicio}/retoranpois")
	public String retoranpois(@PathParam("servicio") String servicio){
		
		List<PoiBean> obj = new PoiBean().getPois();
		Gson gson = new Gson();
		
		String json = gson.toJson(obj); 
		return json;
	}
	
}
