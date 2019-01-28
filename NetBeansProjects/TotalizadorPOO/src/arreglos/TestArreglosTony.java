/**
 * desarrollar un menu ciclado con las siguientes opciones:
 * 0. salir
 * 1. crear arreglo 
 * 		-preguntar al usuario un tamaÃ±o desde 3 y hasta 5 como rango valido, siempre
 * 		 y cuando no este creado
 * 2. agregar objeto
 * 		-crear un objeto y agregarlo en la primer posicion vacia, primero validar
 * 		 la posicion
 * 3. insertar objeto
 * 		-verificar si la posicion indicada existe
 * 		-verificar si la posicion esta ocupada, si es asi mostrar las posiciones
 * 		 disponibles, si no entonces crear e insertar el objeto
 * 4. buscar y mostrar objeto por id
 * 5. buscar y mostrar objeto por posicion
 * 		-validar si la posicion existe
 * 		-validar si esta ocupada, si no entonces la posicion estara vacia
 * 6. buscar, mostrar y modificar objeto por id
 * 		-si coincide mostrar todos los datos y un menu con:
 * 		0. regresar
 * 		1. primer atributo
 * 		2. segundo atributo
 * 		3...
 * 		de cada opcion preguntar el nuevo dato, cualquiera menos el id
 * 7. buscar, mostrar y modificar objeto por posicion
 * 		-lo mismo que el 6 pero si coincide la posicion
 * 8. buscar, mostrar y remover objeto por id
 * 		-igual que el 4 y 6, si lo encuentra le asignamos null, si no lo encuentra
 * 		 mostrar un mensaje que diga "no se encontro"
 * 9. buscar, mostrar y remover objeto por posicion	
 * 		-igual que el 7, si existe lo cambia por null
 * 10. intercambiar objetos entre posiciones
 * 		-pregunta que posicion quiere y validarla, si existe intercambiarlas
 * 11. vaciar arreglo
 * 		-poner cada posicion en null
 * 12. destruir arreglo
 * 		-asignarle null al arreglo
 * 13. agregar al principio
 * 14. agregar al final
 * 15. mostrar primero
 * 16. mostrar ultimo 
 * 17. eliminar primero
 * 18. eliminar ultimo
 * 
 * nota: validar todo en cuanto a posicion, vacios y ocupados
 * usar JOptionPane
 *  despues de cada opcion imprimir los elementos del arreglo en consola
 *  cambiar los iconos del menu
 */
package arreglos;
import java.util.*;
import javax.swing.JOptionPane;
public class TestArreglosTony {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		ProductosFrescos[] producto=null;
		String auxiliarCadena=null;
		String opcionesCasos=null;
		Validaciones validacion=new Validaciones();
		String[] opciones0 = {"0","1","2","3","4","5"};
		String[] opciones1 = {"0","1","2","3","4","5","6","7","8"};
		String[] opciones2= {"0","1","2","3"};
		String[] opciones3= {"0","1","2"};
		String[] opciones5= {"0","1","2","3","4","5","6"};
		boolean auxiliarBoleano=false;
		int auxiliarNumerico=0;
		int auxiliarNumerico2=0;
		int largoDeArreglo=0;
		int contadorErrores=0;
		int opcion=-1;
		int opcion2=-1;
		int opcion3=-1;
		try {
			while(opcion3!=0) {
				for(int i=0; i<largoDeArreglo; i++) {
					if(producto[i]!=null) {
						System.out.println("["+i+"] "+producto[i].toString());
					}else {
						System.out.println("["+i+"] Productos [null]");
					}
				}
				ProductosFrescos productoObj=new ProductosFrescos();
				opcion=-1;
				contadorErrores=0;
				if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
					JOptionPane.showMessageDialog(null, "se ha excedido la cantidad de intentos por caso");
					break;
				}
				opcion3 = JOptionPane.showOptionDialog(null, ""
						+ "0) salir\n1) crear\n2) agregar\n3) buscar y mostrar \n4) modificar"
						+ "\n5) eliminar", "menÃº principal", JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, opciones0, null);
				switch(opcion3) {
				case 1:
					opcionesCasos="abcd";
					opcion=JOptionPane.showOptionDialog(null, "0) regesar \n1) crear arreglo \n2) crear objeto \n3) insertar objeto", "crear", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, opciones2, null);
					break;
				case 2:
					opcionesCasos="acdnok";
					opcion=JOptionPane.showOptionDialog(null, "0) regresar \n1) crear objeto \n2) insertar objeto"
							+ "\n3) agregar al principio \n4) agregar al final \n5) intercambiar", "agregar e intercambiar", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, opciones0, null);
					break;
				case 3:
					opcionesCasos="aefghijpq";
					opcion=JOptionPane.showOptionDialog(null, "0) regresar \n1) buscar y mostrar objeto por id"
							+ "\n2) buscar y mostrar objeto por posiscion \n3) buscar, mostrar y modificar objeto por id"
							+ "\n4) buscar, mostrar y modificar objeto por posicion \n5) buscar, mostrar y remover objeto por id"
							+ "\n6) buscar, mostrar y remover objeto por posicion"
							+ "\n7) msotrar primero \n8) mostrar ultimo", "buscar y mostrar", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, opciones1, null);
					break;
				case 4:
					opcionesCasos="agh";
					opcion=JOptionPane.showOptionDialog(null, "0) regresar \n1) buscar, mostrar y modificar objeto por id"
							+ "\n2) buscar, mostrar y modificar objeto por posicion", "modificar", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, opciones3, null);
					break;
				case 5:
					opcionesCasos="aijrslm";
					opcion=JOptionPane.showOptionDialog(null, "0) regresar \n1) buscar, mostrar y remover objeto por id"
							+ "\n2) buscar, mostrar y remover objeto por posicion"
							+ "\n3) eliminar primero \n4) eliminar ultimo \n5) vaciar arreglo \n6) destruir arreglo", "eliminar", JOptionPane.DEFAULT_OPTION, 
							JOptionPane.QUESTION_MESSAGE, null, opciones5, null);
				}
				opcion=((int) opcionesCasos.charAt(opcion))-97;
				switch(opcion) {
				case 1:
					contadorErrores=0;
					if(largoDeArreglo>=3 && largoDeArreglo<=5) {
						JOptionPane.showMessageDialog(null, "El arreglo ya estÃ¡ creado");
					}
					do {
						auxiliarCadena=JOptionPane.showInputDialog("tamaÃ±o del arreglo desde 3 hasta 5 espacios");
						if((validacion.validarSiSonNumeros(auxiliarCadena)==false)  || validacion.validarSiContieneTexto(auxiliarCadena)==false
								|| (Integer.parseInt(auxiliarCadena)<3 || Integer.parseInt(auxiliarCadena)>5)) {
							JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
						}
						if(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false
								||(Integer.parseInt(auxiliarCadena)<3 || Integer.parseInt(auxiliarCadena)>5)) {
							contadorErrores++;
						}
						if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
							break;
						}
					}while(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false
							||(Integer.parseInt(auxiliarCadena)<3 || Integer.parseInt(auxiliarCadena)>5));
					largoDeArreglo=Integer.parseInt(auxiliarCadena);
					producto=new ProductosFrescos[largoDeArreglo];
					JOptionPane.showMessageDialog(null,"Arreglo creado");
					break;
				case 2:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						for(int i=0; i<largoDeArreglo; i++) {
							if(producto[(i)]==null) {
								auxiliarNumerico=i;
								break;
							}
						}
						if(producto[auxiliarNumerico]==null) {
							do {
								productoObj.setId(JOptionPane.showInputDialog("ingrese el id del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getId())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getId())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNombre(JOptionPane.showInputDialog("ingrese el nombre del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getNombre())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNombre())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese fecha de caducidad"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNumeroDeLote(JOptionPane.showInputDialog("ingrese numero de lote"));
								if(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
								break;
							}
							do {
								productoObj.setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la fecha de envasado"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el paÃ­s de origen"));
								if(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							producto[auxiliarNumerico]= productoObj;
						}else {
							JOptionPane.showMessageDialog(null,"no hay espacios disponibles en el arreglo");
						}
					}
					break;
				case 3:
					contadorErrores=0;
					auxiliarCadena="";
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						do {
							auxiliarNumerico=Integer.parseInt(JOptionPane.showInputDialog("en quÃ© posiciÃ³n desea insertar el objeto"));
							contadorErrores++;
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
						}while(validacion.validarSiSonNumeros(Integer.toString(auxiliarNumerico))==false);
						if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
							break;
						}
						if(auxiliarNumerico<=largoDeArreglo) {
							if(producto[auxiliarNumerico]==null) {
								do {
									productoObj.setId(JOptionPane.showInputDialog("ingrese el id del producto"));
									if(validacion.validarSiContieneTexto(productoObj.getId())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getId())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								do {
									productoObj.setNombre(JOptionPane.showInputDialog("ingrese el nombre del producto"));
									if(validacion.validarSiContieneTexto(productoObj.getNombre())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getNombre())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								do {
									productoObj.setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese fecha de caducidad"));
									if(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								do {
									productoObj.setNumeroDeLote(JOptionPane.showInputDialog("ingrese numero de lote"));
									if(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								do {
									productoObj.setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la fecha de envasado"));
									if(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								do {
									productoObj.setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el paÃ­s de origen"));
									if(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false) {
										contadorErrores++;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false);
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								producto[auxiliarNumerico]= productoObj;
							}else {
								JOptionPane.showMessageDialog(null,"este espacio no estÃ¡ disponible");
								for(int i=0; i<largoDeArreglo; i++) {
									if(producto[(i)]==null) {
										auxiliarBoleano=true;
										auxiliarCadena+="'"+i+"'"+",";
									}
								}
								contadorErrores++;
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
								if(auxiliarBoleano==true) {
									JOptionPane.showMessageDialog(null, "los espacios disbonibles son:"+auxiliarCadena);
								}else {
									JOptionPane.showMessageDialog(null, "no se encuantran espacios disponibles");
								}
							}
						}else {
							JOptionPane.showMessageDialog(null, "no existe la posiciÃ³n indicada");
						}
					}
					break;
				case 4:
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						auxiliarCadena=JOptionPane.showInputDialog("ingrese un id para buscar un objeto");
						for(int i=0; i<largoDeArreglo; i++) {
							if(producto[i]==null) {

							}else if(auxiliarCadena.equals(producto[i].getId())) {
								auxiliarBoleano=true;
								productoObj=producto[i];
							}
						}
						if(auxiliarBoleano==true) {
							JOptionPane.showMessageDialog(null, "objeto encontrado\n"+productoObj.toString());
						}else {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ el Id");
						}
					}
					break;
				case 5:
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						do {
							auxiliarNumerico=Integer.parseInt(JOptionPane.showInputDialog("ingrese una posiciÃ³n para buscar un objeto"));
						}while(validacion.validarSiSonNumeros(Integer.toString(auxiliarNumerico))==false);
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto en la posiciÃ³n indicada");
						}else {
							JOptionPane.showMessageDialog(null, "objeto encontrado en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());

						}
					}
					break;
				case 6:
					contadorErrores=0;
					auxiliarNumerico=-1;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						auxiliarCadena=JOptionPane.showInputDialog("ingrese un id para buscar un objeto");
						for(int i=0; i<largoDeArreglo; i++) {
							if(auxiliarCadena.equals(producto[i].getId())) {
								auxiliarNumerico=i;
								JOptionPane.showMessageDialog(null,"objeto encontrado" );
								do {
									opcion2 =JOptionPane.showOptionDialog(null, "objeto en el indice \ningrese una opciÃ³n:\n 0)regresar \n1)cambiar id del producto \n"
											+ "2)cambiar nombre \n3)cambiar fecha de caducidad \n4)cambiar numero de lote \n5)cambiar la fecha de envasado \n"
											+ "6)cambiar paÃ­s de origen","titulo", JOptionPane.DEFAULT_OPTION, 
											JOptionPane.QUESTION_MESSAGE, null, opciones5, null);
									switch(opcion2) {
									case 1:
										do {
											producto[auxiliarNumerico].setId(JOptionPane.showInputDialog("ingrese el nuevo Id del producto"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getId())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getId())==false);
										break;
									case 2:
										do {
											producto[auxiliarNumerico].setNombre(JOptionPane.showInputDialog("ingrese el nuevo nombre"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNombre())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNombre())==false);
										break;
									case 3:
										do {
											producto[auxiliarNumerico].setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese la nueva fecha de caducidad"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeCaducidad())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeCaducidad())==false);
										break;
									case 4:
										do {
											producto[auxiliarNumerico].setNumeroDeLote(JOptionPane.showInputDialog("ingrese el nuevo numero de lote"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNumeroDeLote())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNumeroDeLote())==false);
										break;
									case 5:
										do {
											producto[auxiliarNumerico].setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la nueva fecha de envasado"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeEnvasado())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeEnvasado())==false);
										break;
									case 6:
										do {
											producto[auxiliarNumerico].setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el nuevo paÃ­s de origen"));
											if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getPaisDeOrigen())==false) {
												contadorErrores++;
											}
											if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
												break;
											}
										}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getPaisDeOrigen())==false);
										break;
									default:
										contadorErrores++;
										break;
									}
									if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
										break;
									}
								}while(opcion2!=0);
								opcion2=-1;
								opcion=-1;
								break;
							}
						}
						if(auxiliarNumerico==-1) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ el Id");
						}
					}
					opcion2=-1;
					opcion=-1;
					break;
				case 7:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						do {
							auxiliarCadena=JOptionPane.showInputDialog("ingrese una posiciÃ³n para buscar un objeto");
							if(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false) {
								contadorErrores++;
							}
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
						}while(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false);
						if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
							break;
						}
						auxiliarNumerico=Integer.parseInt(auxiliarCadena);
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto en la posiciÃ³n indicada");
						}else {
							JOptionPane.showMessageDialog(null, "objeto encontrado en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());
							do {
								opcion2 =JOptionPane.showOptionDialog(null, "objeto en el indice \ningrese una opciÃ³n:\n 0)regresar \n1)cambiar id del producto \n"
										+ "2)cambiar nombre \n3)cambiar fecha de caducidad \n4)cambiar numero de lote \n5)cambiar la fecha de envasado \n"
										+ "6)cambiar paÃ­s de origen","titulo", JOptionPane.DEFAULT_OPTION, 
										JOptionPane.QUESTION_MESSAGE, null, opciones2, opciones2[0]);
								switch(opcion2) {
								case 1:
									do {
										producto[auxiliarNumerico].setId(JOptionPane.showInputDialog("ingrese el nuevo Id del producto"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getId())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getId())==false);
									break;
								case 2:
									do {
										producto[auxiliarNumerico].setNombre(JOptionPane.showInputDialog("ingrese el nuevo nombre"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNombre())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNombre())==false);
									break;
								case 3:
									do {
										producto[auxiliarNumerico].setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese la nueva fecha de caducidad"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeCaducidad())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeCaducidad())==false);
									break;
								case 4:
									do {
										producto[auxiliarNumerico].setNumeroDeLote(JOptionPane.showInputDialog("ingrese el nuevo numero de lote"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNumeroDeLote())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getNumeroDeLote())==false);
									break;
								case 5:
									do {
										producto[auxiliarNumerico].setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la nueva fecha de envasado"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeEnvasado())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getFechaDeEnvasado())==false);
									break;
								case 6:
									do {
										producto[auxiliarNumerico].setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el nuevo paÃ­s de origen"));
										if(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getPaisDeOrigen())==false) {
											contadorErrores++;
										}
										if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
											break;
										}
									}while(validacion.validarSiContieneTexto(producto[auxiliarNumerico].getPaisDeOrigen())==false);
									break;
								default:
									contadorErrores++;
									break;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(opcion2!=0);
							opcion2=-1;
							opcion=-1;
							break;
						}
					}
					opcion=-1;
					break;

				case 8:
					auxiliarNumerico=-1;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						auxiliarCadena=JOptionPane.showInputDialog("ingrese un id para buscar un objeto");
						for(int i=0; i<largoDeArreglo; i++) {
							if(auxiliarCadena.equals(producto[i].getId())) {
								auxiliarNumerico=i;
								JOptionPane.showMessageDialog(null,"objeto encontrado" );
								JOptionPane.showMessageDialog(null,"objeto en el indice "+i+":\n"+producto[i].toString());
								producto[auxiliarNumerico]=null;
								JOptionPane.showMessageDialog(null, "objeto eliminado");
								break;
							}
							if(auxiliarNumerico==-1) {
								JOptionPane.showMessageDialog(null, "no se encontrÃ³ el Id");
							}
						}
						opcion2=-1;
						opcion=-1;
					}
					break;

				case 9:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						do {
							auxiliarCadena=JOptionPane.showInputDialog("ingrese una posiciÃ³n para buscar un objeto");
							if(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false) {
								contadorErrores++;
							}
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
						}while(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false);
						if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
							break;
						}
						auxiliarNumerico=Integer.parseInt(auxiliarCadena);
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto en la posiciÃ³n indicada");
						}else {
							JOptionPane.showMessageDialog(null, "objeto encontrado en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());
							producto[auxiliarNumerico]=null;
							JOptionPane.showMessageDialog(null, "objeto eliminado");
						}
					}
					opcion=-1;
					break;

				case 10:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						do {
							auxiliarCadena=JOptionPane.showInputDialog("ingrese una posiciÃ³n para buscar un objeto");
							if(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false) {
								contadorErrores++;
							}
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
						}while(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false );
						if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
							break;
						}
						auxiliarNumerico=Integer.parseInt(auxiliarCadena);
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto en la posiciÃ³n indicada");
						}else {
							JOptionPane.showMessageDialog(null, "objeto encontrado en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());

							do {
								auxiliarCadena=JOptionPane.showInputDialog("ingrese una segunda posiciÃ³n para buscar un objeto");
								if(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena)==false) {
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiSonNumeros(auxiliarCadena)==false || validacion.validarSiContieneTexto(auxiliarCadena) ==false);
							auxiliarNumerico2=Integer.parseInt(auxiliarCadena);
							if(producto[auxiliarNumerico2]==null) {
								JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto en la posiciÃ³n indicada");
							}else {
								JOptionPane.showMessageDialog(null, "objeto encontrado en el indice "+auxiliarNumerico2+":\n"+producto[auxiliarNumerico2].toString());
								productoObj=producto[auxiliarNumerico];
								producto[auxiliarNumerico]=producto[auxiliarNumerico2];
								producto[auxiliarNumerico2]=productoObj;
								JOptionPane.showMessageDialog(null, "objetos intercambiados");

							}
						}
					}
					break;
				case 11:
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						for(int i=0; i<largoDeArreglo; i++) {
							producto[i]=null;
						}
						JOptionPane.showMessageDialog(null, "arreglo vacio");
					}
					break;

				case 12:
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						producto=null;
						JOptionPane.showMessageDialog(null, "arreglo destruido");
						largoDeArreglo=0;
					}
					break;
				case 13:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						for(int i=1; i<largoDeArreglo-1; i++) {
							producto[i]=producto[i-1];
						}
						producto[0]=null;
						for(int i=0; i<largoDeArreglo; i++) {
							if(producto[(i)]==null) {
								auxiliarNumerico=i;
								break;
							}
						}
						if(producto[auxiliarNumerico]==null) {
							do {
								productoObj.setId(JOptionPane.showInputDialog("ingrese el id del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getId())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getId())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNombre(JOptionPane.showInputDialog("ingrese el nombre del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getNombre())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNombre())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese fecha de caducidad"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNumeroDeLote(JOptionPane.showInputDialog("ingrese numero de lote"));
								if(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
								break;
							}
							do {
								productoObj.setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la fecha de envasado"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el paÃ­s de origen"));
								if(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							producto[auxiliarNumerico]= productoObj;
						}else {
							JOptionPane.showMessageDialog(null,"no hay espacios disponibles en el arreglo");
						}
					}
					break;
				case 14:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
						for(int i=largoDeArreglo-1; i>0; i--) {
							producto[i]=producto[i-1];
						}
						producto[largoDeArreglo-1]=null;
						for(int i=largoDeArreglo-1; i>=0; i--) {
							if(producto[(i)]==null) {
								auxiliarNumerico=i;
								break;
							}
						}
						if(producto[auxiliarNumerico]==null) {
							do {
								productoObj.setId(JOptionPane.showInputDialog("ingrese el id del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getId())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getId())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNombre(JOptionPane.showInputDialog("ingrese el nombre del producto"));
								if(validacion.validarSiContieneTexto(productoObj.getNombre())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNombre())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setFechaDeCaducidad(JOptionPane.showInputDialog("ingrese fecha de caducidad"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeCaducidad())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setNumeroDeLote(JOptionPane.showInputDialog("ingrese numero de lote"));
								if(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getNumeroDeLote())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
								break;
							}
							do {
								productoObj.setFechaDeEnvasado(JOptionPane.showInputDialog("ingrese la fecha de envasado"));
								if(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getFechaDeEnvasado())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							do {
								productoObj.setPaisDeOrigen(JOptionPane.showInputDialog("ingrese el paÃ­s de origen"));
								if(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false) {
									JOptionPane.showMessageDialog(null,"ingrese un valor vÃ¡lido \nintentos: "+(contadorErrores+1));
									contadorErrores++;
								}
								if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
									break;
								}
							}while(validacion.validarSiContieneTexto(productoObj.getPaisDeOrigen())==false);
							if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
								break;
							}
							producto[auxiliarNumerico]= productoObj;
						}else {
							JOptionPane.showMessageDialog(null,"no hay espacios disponibles en el arreglo");
						}
					}
					break;
				case 15:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
							for(int i=0; i<largoDeArreglo; i++) {
								auxiliarNumerico=i;
								if(producto[(i)]!=null) {
									auxiliarNumerico=i;
									break;
								}
							}
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto");
						}else {
							JOptionPane.showMessageDialog(null, "el primer objeto esta en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());
						}
					}
					opcion=-1;
					break;
				case 16:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
							for(int i=largoDeArreglo-1; i>=0; i--) {
								auxiliarNumerico=i;
								if(producto[(i)]!=null) {
									auxiliarNumerico=i;
									break;
								}
							}
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto");
						}else {
							JOptionPane.showMessageDialog(null, "el ultimo objeto esta en el indice "+auxiliarNumerico+":\n"+producto[auxiliarNumerico].toString());
						}
					}
					opcion=-1;
					break;
				case 17:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
							for(int i=0; i<largoDeArreglo; i++) {
								auxiliarNumerico=i;
								if(producto[(i)]!=null) {
									auxiliarNumerico=i;
									break;
								}
							}
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto");
						}else {
							producto[auxiliarNumerico]=null;
							JOptionPane.showMessageDialog(null, "el primer objeto en el indice "+auxiliarNumerico+" "+"se ha eliminado");
						}
					}
					opcion=-1;
					break;
				case 18:
					contadorErrores=0;
					if(largoDeArreglo==0) {
						JOptionPane.showMessageDialog(null, "no se ha creado un arreglo");
					}else {
							for(int i=largoDeArreglo-1; i>=0; i--) {
								auxiliarNumerico=i;
								if(producto[(i)]!=null) {
									auxiliarNumerico=i;
									break;
								}
							}
						if(producto[auxiliarNumerico]==null) {
							JOptionPane.showMessageDialog(null, "no se encontrÃ³ ningÃºn objeto");
						}else {
							producto[auxiliarNumerico]=null;
							JOptionPane.showMessageDialog(null, "el ultimo objeto en el indice "+auxiliarNumerico+" "+"se ha eliminado");
						}
					}
					break;
				default:
					contadorErrores++;
					break;
				}
				if(validacion.excedioLimiteDeErrores(contadorErrores)==true) {
					JOptionPane.showMessageDialog(null, "se ha excedido el limite de intentos");
					break;
				}
			}
		}catch(Exception e){

		}
	}
}

