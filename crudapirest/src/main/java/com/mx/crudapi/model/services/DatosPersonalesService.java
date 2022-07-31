/**  
* Title: DatosPersonalesService.java  
* Description: 
* @author: Héctor Camargo 
* @date 31 jul. 2022
* @version 1.0
* Company: Hector Company
*/  
package com.mx.crudapi.model.services;

import java.util.List;

import com.mx.crudapi.model.entity.DatosPersonalesEntity;

/**
 *@class_name：DatosPersonalesService
 *@comments: esta interface contendra la definicion de los metodos para poder acceder a la base de datos
 *
 *@param:
 *@return: 
 *@author: Héctor Camargo
 *@createtime:31 jul. 2022
 */
public interface DatosPersonalesService {
	
	public DatosPersonalesEntity insertaDatosPersonalesBD(DatosPersonalesEntity dpe);
	public List<DatosPersonalesEntity> consultaDatosPersonalesBD();
	public DatosPersonalesEntity actualizaDatosPersonalesBD(DatosPersonalesEntity dpe);
	public Long borraDatosPersonalesBD(Long id);

}
