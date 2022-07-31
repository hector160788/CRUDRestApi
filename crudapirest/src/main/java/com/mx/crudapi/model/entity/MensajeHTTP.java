package com.mx.crudapi.model.entity;


/**
 *@class_name：MensajeHTTP
 *@comments: esta clase contiene dos parametros para indicar si el proceso fue exitos o error
 *@param:
 *@return: 
 *@author: Héctor Camargo
 *@createtime:31 jul. 2022
 *paso: (4)paso
 */
public class MensajeHTTP {
	
	private String code;
	private String mensaje;
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
