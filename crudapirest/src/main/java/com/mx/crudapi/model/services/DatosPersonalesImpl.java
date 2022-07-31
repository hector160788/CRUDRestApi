/**  
* Title: DatosPersonalesImpl.java  
* Description: 
* @author: Héctor Camargo 
* @date 31 jul. 2022
* @version 1.0
* Company: Hector Company
*/  
package com.mx.crudapi.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudapi.model.entity.DatosPersonalesEntity;
import com.mx.crudapi.model.repository.DatosPersonalesRepository;

/**
 *@class_name：DatosPersonalesImpl
 *@comments: esta clase contiene la logia para conectarse a la BD mediante la capa del services
 *@param:
 *@return: 
 *@author: Héctor Camargo
 *@createtime:31 jul. 2022
 */
@Service
public class DatosPersonalesImpl implements DatosPersonalesService {
	
	@Autowired
	private DatosPersonalesRepository dprdao;

	@Override
	public DatosPersonalesEntity insertaDatosPersonalesBD(DatosPersonalesEntity dpe) {
		// TODO Auto-generated method stub
		return dprdao.save(dpe);
	}

	@Override
	public List<DatosPersonalesEntity> consultaDatosPersonalesBD() {
		// TODO Auto-generated method stub
		return (List<DatosPersonalesEntity>) dprdao.findAll();
	}

	@Override
	public DatosPersonalesEntity actualizaDatosPersonalesBD(DatosPersonalesEntity dpe) {
		// TODO Auto-generated method stub
		return dprdao.save(dpe);
	}

	@Override
	public Long borraDatosPersonalesBD(Long id) {
		// TODO Auto-generated method stub
		dprdao.deleteById(id);
		return id;
	}
	
	

}
