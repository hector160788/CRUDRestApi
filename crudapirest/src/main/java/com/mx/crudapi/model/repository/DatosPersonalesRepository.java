/**  
* Title: DatosPersonalesRepository.java  
* Description: 
* @author: Héctor Camargo 
* @date 31 jul. 2022
* @version 1.0
* Company: Hector Company
*/  
package com.mx.crudapi.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.mx.crudapi.model.entity.DatosPersonalesEntity;

/**
 *@class_name：DatosPersonalesRepository
 *@comments: Esta interface extendera de la clase CrudRepository de spring lo cual nos ayudara
 *a usar metodo ya creado por el framework para poder realizar el crud utilizando la clase entidad
 *DatosPersonalesEntity
 *@param:
 *@return: 
 *@author: Héctor Camargo
 *@createtime:31 jul. 2022
 *paso: (5)paso
 */


public interface DatosPersonalesRepository extends CrudRepository<DatosPersonalesEntity, Long>{

}
