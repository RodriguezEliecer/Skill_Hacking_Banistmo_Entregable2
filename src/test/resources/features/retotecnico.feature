   #Autor: Eliecer
     # language: es

   @HistoriaDeUsuario
   Característica: Yo como usuario, quiero automatizar la pagina de Bancolombia ingresando al modulo Comporativo en la seccion Capital inteligente y que me permita descargar uno de los reportes
      @Escenario:
      Escenario: descargar reporte de la seccion Actualidad Económica
      Dado ingreso a la pagina de bancolombia en el menu corportativo opcion capital inteligente
      Cuando selecciono el apartado actualidad economica y selecciono el reporte a descargar
      Entonces descargo el reporte y valido que sea el correcto


