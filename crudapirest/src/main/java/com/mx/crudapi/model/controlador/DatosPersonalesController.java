/**  
* Title: DatosPersonalesController.java  
* Description: 
* @author: Héctor Camargo 
* @date 31 jul. 2022
* @version 1.0
* Company: Hector Company
*/
package com.mx.crudapi.model.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudapi.model.entity.DatosPersonalesEntity;
import com.mx.crudapi.model.services.DatosPersonalesService;

/**
 * @class_name：DatosPersonalesController
 * @comments: Esta clase contiene los 4 metodos expuestos por http para poder
 *            ser utilizados desde cualquier aplicacion y/o lenguaje que pueda
 *            hacer peticiones http POST: verbo que sirve para inserta en alguna
 *            fuente de datos GET: verbo que sirve para consultar en alguna
 *            fuente de datos PUT: verbo que sirve para actualizar en alguna
 *            fuente de datos DELETE: verbo que sirve para borrar en alguna
 *            fuente de datos
 * @param:
 * @return:
 * @author: Héctor Camargo
 * @createtime:31 jul. 2022 paso: (3)paso
 */
@RestController
public class DatosPersonalesController {
	
	@Autowired
	private DatosPersonalesService dps;

	/*
	 * ejecutar desde postman por post 
	 * {"nombre":"hector","apellidos":"camargo","edad":"34"}
	 * */
	@PostMapping(path = { "/insertadatospersonales" })
	public @ResponseBody DatosPersonalesEntity insertaDatosPersonales(@RequestBody DatosPersonalesEntity dpe) {
		System.out.println(dpe.toString());
		dps.insertaDatosPersonalesBD(dpe);
		return dpe;
	}

	@GetMapping(path = {"/consultadatospersonales"})
	public @ResponseBody List<DatosPersonalesEntity> consultaDatosPersonales() {
		List<DatosPersonalesEntity> resul = dps.consultaDatosPersonalesBD();
		return resul;
	}
	
	@PutMapping(path = {"/actualizadatospersonales"})
	public @ResponseBody DatosPersonalesEntity actualizaDatosPersonales(@RequestBody DatosPersonalesEntity dpe) {
		 return dps.actualizaDatosPersonalesBD(dpe);
	}
	
	@DeleteMapping(path = {"/borradatospersonales"})
	public @ResponseBody Long borraDatosPersonales(@RequestBody Long id) {
		return dps.borraDatosPersonalesBD(id);
	}

}
