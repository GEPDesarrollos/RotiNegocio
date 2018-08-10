package com.example.gep.rotinegocio.datos;

public interface ComandosDeDatos {

  /*
   * leer datos
   * */
  PedidoBaseDeDatos[] leerDatosFirebase();



  /*
  * modificar datos
  * */
   boolean modificaDatos (int demora);


  /*
  * obtener usuario
  * */
  Cliente obtenerCliente(String token);





}
