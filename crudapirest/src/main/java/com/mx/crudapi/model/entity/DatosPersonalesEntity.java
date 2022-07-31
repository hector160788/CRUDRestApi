/**  
* Title: DatosPersonalesEntity.java  
* Description: 
* @author: Héctor Camargo 
* @date 31 jul. 2022
* @version 1.0
* Company: Hector Company
*/  
package com.mx.crudapi.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *@class_name：DatosPersonalesEntity
 *@comments: Esta clase contendra los parametros que haran relacion con la entidad de la base de datos
 *@param: id, nombre, apellidos, edad
 *@return: metodos get de id, nombre, apellidos, edad 
 *@author: Héctor Camargo
 *@createtime:31 jul. 2022
 *@paso: (2)paso
 */

@Entity // esta anotacion sirve para indicar que esta clase es una entidad para jpa
@Table(name = "datospersonales")// esta anotacion sirve para hacer referencia a la tabla de base de datos
public class DatosPersonalesEntity {
	
	@Id// esta anotacion nos indica que este parametro es la llave primaria de la BD y clase
	@GeneratedValue(strategy = GenerationType.IDENTITY)// indica que se generara el autoincremente
	private Long id;
	private String nombre;
	private String apellidos;
	private int edad;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	

}
