/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author tony
 */
public class CurpArreglos {
    ProductoFresco productos[] = new ProductoFresco[0];
    ProductoFresco productos2[] = new ProductoFresco[1];
    int intervalo = 0;
    int posiciones = -1, contObjetos = -1;
    int cont = 0;

    public static void main(String[] args) {
        TestProductosExamenTwo ob1 = new TestProductosExamenTwo();
        ob1.menuPrincipal();
    }

    public void menuPrincipal() {
        int selection;
        do {
            String[] options = {"Salir", "1", "2", "3", "4", "5", "6", "7"};
            selection = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1:Crear arreglo de tipo Productos Frescos"
                    + "\n2: Menú para opciones de agregar objetos y formularlos"
                    + "\n3: Menú para opciones de  mostrar en consola la información del arreglo y los objetos"
                    + "\n4: Menú para opciones de modificar objetos ya formulados"
                    + "\n5: Menú para opciones de eliminar contenido de los objetos del arreglo"
                    + "\n6: Menú para opciones  de intercambiar posiciones o vaciar arreglo"
                    + "\n7: Eliminar arreglo ", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (selection == -1) {
                JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                System.exit(0);
            }

            switch (selection) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    System.exit(0);
                    break;
                case 1:

                    if (arregloCreado(productos) == false || productos2 == null) {
                        posiciones = 0;
                        tamañoArreglo();

                        impresion(productos);

                    } else {
                        impresionYaEstaCreado();
                    }

                    break;
                case 2:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {

                        menuCaso2();

                    }

                    break;
                case 3:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {
                        if (posicionesVaciasTres(posiciones) == 0) {
                            imprimirNoLlenado();
                        } else {

                            menuCaso3();
                        }
                    }

                    break;
                case 4:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {
                        if (productos == null) {
                            JOptionPane.showMessageDialog(null, "Su arreglo no existe");
                        } else if (posicionesVaciasTres(posiciones) == 0) {
                            imprimirNoLlenado();

                        } else {
                            menuCaso4();
                        }

                    }
                    break;
                case 5:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {
                        if (posicionesVaciasTres(posiciones) == 0) {
                            imprimirNoLlenado();

                        } else {
                            menuCaso5();
                        }
                    }
                    break;
                case 6:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {
                        if (posicionesVaciasTres(posiciones) == 0) {
                            imprimirNoLlenado();

                        } else {
                            menuCaso6();
                        }
                    }
                    break;
                case 7:
                    if (validacionNoPrimerCaso(posiciones) == false) {
                        JOptionPane.showMessageDialog(null, "No se ha creado el arreglo");
                    } else {

                        if (destruirArreglo() == true) {
                            posiciones = -1;
                            contObjetos = -1;

                        } else {

                            impresion(productos);
                        }

                    }
                    break;

            }
        } while (selection != 0);

        JOptionPane.showMessageDialog(null, "Saliendo del programa...");

    }

    //Para el caso 1
    public boolean arregloCreado(ProductoFresco[] productos) {
        boolean val;
        if (productos.length == 0) {
            val = false;
        } else if (productos == null) {
            val = true;
        } else {
            val = true;
        }
        return val;
    }

    public void tamañoArreglo() {
        int selec;
        int var = 0;
        do {
            String[] one = {"Salir", "1", "2", "3"};
            selec = JOptionPane.showOptionDialog(null, "¿De qué tamaño desea su arreglo?"
                    + "\n1: 3 Objetos"
                    + "\n2: 4 Objetos"
                    + "\n3: 5 Objetos", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, one, one[0]);
            if (selec == -1) {
                posiciones--;
                JOptionPane.showMessageDialog(null, "Saliendo...");
                break;
            }
            switch (selec) {
                case 0:
                    posiciones--;
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    var = 1;
                    break;

                case 1:
                    intervalo = 3;
                    productos = new ProductoFresco[intervalo];
                    var = 1;

                    break;
                case 2:
                    intervalo = 4;
                    productos = new ProductoFresco[intervalo];
                    var = 1;

                    break;
                case 3:
                    intervalo = 5;
                    productos = new ProductoFresco[intervalo];
                    var = 1;
                    break;

            }

        } while (var == 0);

    }

    public void impresionYaEstaCreado() {
        JOptionPane.showMessageDialog(null, "Ya existe un arreglo creado, destruyalo para crear uno nuevo");
    }

    public void impresion(ProductoFresco[] productos) {

        for (int i = 0; i < productos.length; i++) {

            System.out.println("Objeto número " + (i + 1) + " del arreglo: " + productos[i]);
        }
        System.out.println("\n");
    }

    //Para el caso 2
    public void menuCaso2() {
        int selection2;
        do {
            String[] optionsCase2 = {"Salir", "1", "2", "3", "4"};
            selection2 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Crear un objeto del arreglo de tipo Productos Frescos, formularlo y colocarlo en la primer posición vacia"
                    + "\n2: Crear un objeto del arreglo de tipo Productos Frescos, formularlo y colocarlo en una posición deseada disponible"
                    + "\n3: Agregar un objeto al principio del arreglo y llenarlo"
                    + "\n4: Agregar un objeto al final del arreglo y llenarlo", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase2, optionsCase2[0]);
            if (selection2 == -1) {
                break;
            }

            if (selection2 == -1) {
                JOptionPane.showMessageDialog(null, "Cancelando operación...");
                break;
            }
            switch (selection2) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    if (posicionesVaciasTres(posiciones) == 1) {
                        JOptionPane.showMessageDialog(null, "No hay posiciones vacias, no se puede ingresar objeto con esta opción");
                    } else {
                        construirObjeto(contObjetos);
                        contObjetos++;
                        posiciones++;
                        impresion(productos);
                    }

                    break;
                case 2:
                    if (posicionExisteOcupada() == true) {
                        contObjetos++;
                        posiciones++;
                        impresion(productos);
                    }
                    break;
                case 3:
                    construirObjetoPrincipio();
                    contObjetos++;
                    posiciones++;
                    impresion(productos);
                    break;
                case 4:
                    construirObjetoUltimo();
                    impresion(productos);
                    break;

            }
        } while (selection2 != 0);
    }

    //vALIDACIONES DE ENTRADA CASO 2
    public boolean validacionNoPrimerCaso(int posiciones) {
        boolean val = true;
        if (posiciones == -1) {
            val = false;
        }
        return val;

    }

    public int posicionesVaciasTres(int posiciones) {
        int val = 0;
        if (posiciones == 0) {
            val = 0;
        } else if (productos.length == posiciones) {
            val = 1;
        } else {
            val = 2;
        }
        return val;
    }

    public int posicionesVaciasDos(int posiciones) {
        int val = 0;
        if (posiciones == 0) {
            val = 0;
        } else if (productos.length == posiciones) {
            val = 1;
        } else {
            val = 0;
        }
        return val;
    }

    public void impresionSinEspacio() {
        JOptionPane.showMessageDialog(null, "No hay espacios en el arreglo disponible");
    }

    //SUB 1 CASO 2
    public void construirObjeto(int contObjetosDos) {

        ProductoFresco productosAux = new ProductoFresco();
        int matriculaComparar;
        int tresCancelar = 0;
        contObjetosDos = contObjetos;

        if (productos.length > contObjetosDos + 1) {
            for (int i = 0; i < productos.length; i++) {

                if (productos[i] == (null)) {

                    try {
                        do {

                            productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));

                            if (productosAux.getNumeroDeLote() <= 0) {
                                JOptionPane.showMessageDialog(null, "Digite ese número de lote mayor a cero");
                            }

                        } while (productosAux.getNumeroDeLote() <= 0);

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "No digito un número");
                        tresCancelar++;
                    }
                    productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen del producto"));
                    if (productosAux.getPaisDeOrigen() == null) {
                        tresCancelar++;

                    }
                    productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
                    if (productosAux.getFechaDeCaducidad() == null) {
                        tresCancelar++;
                    }
                    if (tresCancelar == 3) {
                        tresCancelar = 0;
                        contObjetos--;
                        posiciones--;
                        productos[i] = (null);
                        JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default , cancelando operación...");
                        break;
                    } else {
                        productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
                        if (productosAux.getFechaDeEnvasado() == null) {
                            tresCancelar++;
                        }
                        if (tresCancelar == 3) {
                            JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default, cancelando operación...");
                            tresCancelar = 0;
                            contObjetos--;
                            posiciones--;
                            productos[i] = (null);
                            break;
                        }
                    }
                    boolean existenteOEncontrado = false;
                    for (int j = 0; j < productos.length; j++) {
                        if (productosAux.equals(productos[j])) {
                            JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                            existenteOEncontrado = true;
                            break;
                        }
                    }
                    if (existenteOEncontrado == false) {
                        productos[i] = productosAux;
                        break;
                    }
                    break;

                }

            }

        }

    }

    //SUB 2 CASO 2
    public boolean posicionExisteOcupada() {
        ProductoFresco productosAux = new ProductoFresco();
        //true es que sí existe y está vacio
        //false es que no existe posicion o está lleno
        boolean existenteOEncontrado = false;
        boolean validacion = false;
        int aux = 0, repetir = 0, cont = 0, cont2, variAux = 0;
        int tresCancelar = 0;
        cont2 = productos.length;
        //Existencia de la posicion
        do {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null) {
                    cont++;
                }
            }
            if (cont == cont2) {

                variAux = 1;
                repetir = 0;
                int pregunta;
                pregunta = JOptionPane.showConfirmDialog(null, "Su arreglo está lleno, ¿quiere recorrerlo apartir de la posicion deseada? ", "", JOptionPane.YES_NO_OPTION);
                if (pregunta == JOptionPane.YES_OPTION) {
                    try {
                        String res = JOptionPane.showInputDialog("Digite la posición del arreglo que desea insertar su objeto");
                        res.trim();
                        aux = Integer.parseInt(res);
                        if ((aux < 1 || aux > 5)) {
                            JOptionPane.showMessageDialog(null, "No existe ese rango a buscar ");
                            repetir = 0;
                        } else if (aux <= productos.length) {
                            int aux2 = aux - 1;
                            for (int j = productos.length - 1; j > aux2; j--) {
                                productos[j] = productos[j - 1];
                            }
                            productos[aux2] = null;
                            try {

                                do {
                                    productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));

                                    if (productosAux.getNumeroDeLote() <= 0) {
                                        JOptionPane.showMessageDialog(null, "Digite un número de lote mayor a cero");
                                    }
                                    existenteOEncontrado = false;

                                    for (int j = 0; j < productos.length; j++) {
                                        if (productosAux.equals(productos[j])) {
                                            JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                                            existenteOEncontrado = true;

                                        }

                                    }

                                } while (productosAux.getNumeroDeLote() <= 0 || existenteOEncontrado == true);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "No digito un número");
                                tresCancelar++;
                            }
                            productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen del producto"));
                            if (productosAux.getPaisDeOrigen() == null) {
                                tresCancelar++;
                            }
                            productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
                            if (productosAux.getFechaDeCaducidad() == null) {
                                tresCancelar++;
                            }
                            if (tresCancelar == 3) {
                                tresCancelar = 0;
                                contObjetos--;
                                posiciones--;
                                productos[aux2] = (null);
                                JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default , cancelando operación...");
                                break;
                            } else {
                                productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
                                if (productosAux.getFechaDeEnvasado() == null) {
                                    tresCancelar++;
                                }
                                if (tresCancelar == 3) {
                                    JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default, cancelando operación...");
                                    tresCancelar = 0;
                                    contObjetos--;
                                    posiciones--;
                                    productos[aux2] = (null);
                                    break;
                                }
                            }

                            productos[aux2] = productosAux;
                            validacion = true;
                            break;

                        } else {
                            JOptionPane.showMessageDialog(null, "No existe tal posición en el arreglo");
                        }

                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Cancelando operación");
                        repetir = 1;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                        repetir = 0;
                    }

                } else if (pregunta == JOptionPane.NO_OPTION) {
                    contObjetos--;
                    posiciones--;
                    variAux = 1;
                    repetir = 0;
                    break;

                }

            }

            if (variAux == 0) {

                try {
                    String res = JOptionPane.showInputDialog("Digite la posición del arreglo que desea insertar su objeto");
                    res.trim();
                    aux = Integer.parseInt(res);

                    if ((aux < 1 || aux > 5)) {
                        JOptionPane.showMessageDialog(null, "No existe ese rango a buscar ");
                        repetir = 0;
                    } else if (aux <= productos.length) {
                        //Ver sí está lleno

                        if (productos[aux - 1] == (null)) {
                            repetir = 1;
                            //Llenado
                            try {

                                do {
                                    productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));

                                    if (productosAux.getNumeroDeLote() <= 0) {
                                        JOptionPane.showMessageDialog(null, "Digite un número de lote mayor a cero");
                                    }
                                    existenteOEncontrado = false;

                                    for (int j = 0; j < productos.length; j++) {
                                        if (productosAux.equals(productos[j])) {
                                            JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                                            existenteOEncontrado = true;

                                        }

                                    }

                                } while (productosAux.getNumeroDeLote() <= 0 || existenteOEncontrado == true);

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "No digito un número");
                                tresCancelar++;
                            }
                            productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen del producto"));
                            if (productosAux.getPaisDeOrigen() == null) {
                                tresCancelar++;
                            }
                            productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
                            if (productosAux.getFechaDeCaducidad() == null) {
                                tresCancelar++;
                            }
                            if (tresCancelar == 3) {
                                tresCancelar = 0;
                                contObjetos--;
                                posiciones--;
                                productos[aux - 1] = (null);
                                JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default , cancelando operación...");
                                break;
                            } else {
                                productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
                                if (productosAux.getFechaDeEnvasado() == null) {
                                    tresCancelar++;
                                }
                                if (tresCancelar == 3) {
                                    JOptionPane.showMessageDialog(null, "Alcanzo los tres intentos sus atributos serán por default, cancelando operación...");
                                    tresCancelar = 0;
                                    contObjetos--;
                                    posiciones--;
                                    productos[aux - 1] = (null);
                                    break;
                                }
                            }
                            productos[aux - 1] = productosAux;
                            validacion = true;

                        } else {
                            JOptionPane.showMessageDialog(null, "Lo sentimos, la posición deseada ya está llena,\nPero las posiciones vacias son");
                            for (int i = 0; i < productos.length; i++) {
                                if (productos[i] == null) {
                                    JOptionPane.showMessageDialog(null, "posición vacia número: " + (i + 1));
                                    cont = 0;
                                }
                            }
                            repetir = 0;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No existe tal posición en el arreglo");

                    }

                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Cancelando operación");
                    repetir = 1;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                    repetir = 0;
                }
            }

        } while (repetir == 0);
        return validacion;
    }

    //SUB 3 CASO 2
    public void construirObjetoPrincipio() {
        ProductoFresco productosAux = new ProductoFresco();
        int tresCancelar = 0;
        boolean existenteOEncontrado;
        if (productos[0] == null) {
            try {
                do {
                    if (tresCancelar == 3) {
                        contObjetos--;
                        posiciones--;
                        JOptionPane.showMessageDialog(null, "Alcanzò el nùmero màximo de intentos...");
                        break;
                    }
                    productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));
                    if (productosAux.getNumeroDeLote() <= 0) {
                        JOptionPane.showMessageDialog(null, "Digite un número de lote mayor a cero");
                    }
                    existenteOEncontrado = false;

                    for (int j = 0; j < productos.length; j++) {
                        if (productosAux.equals(productos[j])) {
                            JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                            tresCancelar++;
                            existenteOEncontrado = true;

                        }

                    }

                } while (productosAux.getNumeroDeLote() <= 0 || existenteOEncontrado == true);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No digito un número");
            }
            productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
            productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
            productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen"));
            productos[0] = productosAux;

        } else if (productos[0] != null) {
            int pregunta;
            pregunta = JOptionPane.showConfirmDialog(null, "Su espacio está lleno, ¿quiere recorrerlo y llenarlo?", "", JOptionPane.YES_NO_OPTION);
            if (pregunta == JOptionPane.YES_OPTION) {
                for (int i = productos.length - 1; i > 0; i--) {
                    productos[i] = productos[i - 1];
                }
                try {
                    do {
                        if (tresCancelar == 3) {

                            JOptionPane.showMessageDialog(null, "Alcanzò el nùmero màximo de intentos...");
                            break;
                        }
                        productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));
                        if (productosAux.getNumeroDeLote() <= 0) {
                            JOptionPane.showMessageDialog(null, "Digite un número de lote mayor a cero");
                        }
                        existenteOEncontrado = false;

                        for (int j = 0; j < productos.length; j++) {
                            if (productosAux.equals(productos[j])) {
                                JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                                tresCancelar++;
                                existenteOEncontrado = true;
                                break;
                            }

                        }

                    } while (productosAux.getNumeroDeLote() <= 0 || existenteOEncontrado == true);

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "No digito un número");
                }
                productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
                productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
                productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen"));
                productos[0] = productosAux;
                contObjetos--;
                posiciones--;

            } else if (pregunta == JOptionPane.NO_OPTION) {
                contObjetos--;
                posiciones--;

            }
        }
    }

    //SUB 4 CASO 2
    public void construirObjetoUltimo() {
        ProductoFresco productosAux = new ProductoFresco();
        boolean existenteOEncontrado;
        if (posicionesVaciasTres(posiciones) != 1) {
            contObjetos++;
            posiciones++;
        }
        try {
            do {
                productosAux.setNumeroDeLote(Integer.parseInt(JOptionPane.showInputDialog("Digite el número de lote")));
                if (productosAux.getNumeroDeLote() <= 0) {
                    JOptionPane.showMessageDialog(null, "Digite un número de lote mayor a cero");
                }
                existenteOEncontrado = false;

                for (int j = 0; j < productos.length; j++) {
                    if (productosAux.equals(productos[j])) {
                        JOptionPane.showMessageDialog(null, "Ya existe esa matricula");
                        existenteOEncontrado = true;
                        break;
                    }

                }

            } while (productosAux.getNumeroDeLote() <= 0 || existenteOEncontrado == true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No digito un número");
        }
        productosAux.setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la fecha de caducidad"));
        productosAux.setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la fecha de envasado"));
        productosAux.setPaisDeOrigen(JOptionPane.showInputDialog("Digite el país de origen"));

        productos[productos.length - 1] = productosAux;
    }

    //CASO 3
    public void menuCaso3() {
        int selection3;
        do {
            String[] optionsCase3 = {"Salir", "1", "2", "3", "4"};
            selection3 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Buscar y mostrar el contenido de un objeto del arreglo por número de lote"
                    + "\n2: Buscar y mostrar el contenido de un objeto del arreglo por posición"
                    + "\n3: Mostrar el ultimo objeto del arreglo"
                    + "\n4: Mostrar el primer objeto del arreglo  ", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase3, optionsCase3[0]);
            if (selection3 == -1) {
                JOptionPane.showMessageDialog(null, "Cancelando operación...");
                break;
            }
            switch (selection3) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    monstrarYBuscarID();
                    break;
                case 2:
                    mostrarYBuscarPosicion();
                    break;
                case 3:
                    mostrarUltimoObjeto();
                    break;
                case 4:
                    mostrarPrimerObjeto();
                    break;

            }
        } while (selection3 != 0);
    }

    //VALIDACIONES DE ENTRADA CASO 3
    public boolean posicionesVacias(int posiciones) {
        boolean val = true;
        if (posiciones == 0) {
            val = true;
        } else if (productos.length == posiciones) {
            val = false;
        } else if (posiciones > 0 && posiciones < productos.length) {
            val = false;
        }
        return val;
    }

    public void imprimirNoLlenado() {
        JOptionPane.showMessageDialog(null, "No se ha llenado ningún objeto");
    }

    //SUB 1 CASO 3
    public int monstrarYBuscarID() {
        ProductoFresco productosAux = new ProductoFresco();
        int error = 0;
        int aux = 0, repetir = 1, cont = 0, cont2, variAux = 0;
        int val = 0;
        int variableBo = -1;
        cont2 = productos.length;
        do {
            for (int i = 0; i < productos.length; i++) {
                if (productos[i] == null) {
                    cont++;
                } else if (cont == cont2) {
                    JOptionPane.showMessageDialog(null, "Su arreglo está vacio llenelo");
                    variAux = 1;
                    repetir = 0;
                }
            }
            if (variAux == 0) {
                try {

                    String res = JOptionPane.showInputDialog("Digite el número de lote del objeto que quiere buscar");
                    res.trim();
                    aux = Integer.parseInt(res);
                    productosAux.setNumeroDeLote(aux);

                    for (int i = 0; i < productos.length; i++) {
                        if (productosAux.equals(productos[i])) {
                            JOptionPane.showMessageDialog(null, "Se encontró su objeto, su información es..." + productos[i]);
                            val = 1;
                            variableBo = aux;
                            repetir = 0;
                            break;
                        }

                    }
                    if (val == 0) {
                        JOptionPane.showMessageDialog(null, "No existe esa matricula en el arreglo");
                        error++;
                        if (error == 3) {
                            JOptionPane.showMessageDialog(null, "Ha intentado 3 veces Cancelando operación...");
                            error = 0;
                            break;
                        }
                    }

                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Cancelando operación");
                    repetir = 0;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                    repetir = 1;
                }
            }

        } while (repetir == 1);
        return variableBo;
    }

    //SUB 2 CASO 3
    public int mostrarYBuscarPosicion() {
        // ProductoFresco[] productosAux = new ProductoFresco[productos.length];
        int error = 0;
        int aux = 0, repetir = 1, cont = 0, cont2, variAux = 0;
        int val = 0;
        int variableMandar = -1;
        cont2 = productos.length;
        do {

            try {
                String res = JOptionPane.showInputDialog("Digite la posición del objeto que quiere buscar");
                res.trim();
                aux = Integer.parseInt(res);
                if ((aux < 1 || aux > 5)) {
                    JOptionPane.showMessageDialog(null, "No existe ese rango a buscar ");
                    error++;
                    if (error == 3) {
                        JOptionPane.showMessageDialog(null, "Ha intentado 3 veces cancelando operación...");
                        error = 0;
                        break;
                    }

                    repetir = 1;
                } else if (aux <= productos.length) {

                    if (productos[aux - 1] == null) {
                        JOptionPane.showMessageDialog(null, "Su espacio está vacio no hay nada que mostrar");
                    } else {
                        JOptionPane.showMessageDialog(null, "Se encontró su objeto, su información es: " + productos[aux - 1]);
                        variableMandar = aux - 1;
                        repetir = 0;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No existe tal posición en el arreglo");
                    error++;
                    if (error == 3) {
                        JOptionPane.showMessageDialog(null, "Ha intentado 3 veces cancelando operación...");
                        error = 0;
                        break;
                    }

                }

            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Cancelando operación");
                repetir = 0;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                repetir = 1;
            }

        } while (repetir == 1);
        return variableMandar;
    }

    //SUB 3 CASO 3
    public void mostrarUltimoObjeto() {
        JOptionPane.showMessageDialog(null, "El último objeto de su arreglo es: " + productos[productos.length - 1]);
    }

    //SUB 4 CASO 3
    public void mostrarPrimerObjeto() {
        JOptionPane.showMessageDialog(null, "El primer objeto de su arreglo es: " + productos[0]);
    }

    // PARA CASO 4
    public void menuCaso4() {
        int selection4;
        do {
            String[] optionsCase4 = {"Salir", "1", "2"};
            selection4 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Sub menu modificación de objeto atributo por atributo  por posición"
                    + "\n2: Sub menu modificación de objeto atributo por atributo  por numero de lote  ", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase4, optionsCase4[0]);
            if (selection4 == -1) {
                JOptionPane.showMessageDialog(null, "Cancelando operación...");
                break;
            }
            switch (selection4) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    menuSub4Uno(monstrarYBuscarID());
                    break;
                case 2:
                    menuSub4Dos(mostrarYBuscarPosicion());
                    break;

            }
        } while (selection4 != 0);
    }

    //SUB 1 CASO 4
    public void menuSub4Uno(int aux) {
        int aux2 = aux;
        int selection = 0;
        if (aux >= 0) {
            do {
                String[] options = {"Salir", "1", "2", "3"};
                selection = JOptionPane.showOptionDialog(null, "Sub-menú para llenar los datos del objeto"
                        + "\n0: Salir"
                        + "\n1: País de origen"
                        + "\n2: Fecha de caducidad"
                        + "\n3: Fecha de envasado", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (selection == -1) {
                    break;
                }

                switch (selection) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                        break;
                    case 1:

                        modificarPais(aux2);
                        impresion(productos);
                        break;
                    case 2:
                        modificarCaducidad(aux2);
                        impresion(productos);
                        break;
                    case 3:
                        modificarEnvasado(aux2);
                        impresion(productos);
                        break;

                }
            } while (selection != 0);

        }
    }

    public void modificarEnvasado(int aux) {
        ProductoFresco productosAux = new ProductoFresco();
        productosAux.setNumeroDeLote(aux);
        for (int i = 0; i < productos.length; i++) {
            if (productosAux.equals(productos[i])) {
                productos[i].setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la nueva fecha de envasado"));
            }
        }
    }

    public void modificarCaducidad(int aux) {
        ProductoFresco productosAux = new ProductoFresco();
        productosAux.setNumeroDeLote(aux);
        for (int i = 0; i < productos.length; i++) {
            if (productosAux.equals(productos[i])) {
                productos[i].setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la nueva fecha de caducidad"));
            }
        }
    }

    public void modificarPais(int aux) {
        ProductoFresco productosAux = new ProductoFresco();
        productosAux.setNumeroDeLote(aux);
        for (int i = 0; i < productos.length; i++) {
            if (productosAux.equals(productos[i])) {
                productos[i].setPaisDeOrigen(JOptionPane.showInputDialog("Digite el nuevo país de origen"));
            }
        }
    }

    //SUB 2 CASO 4
    public void menuSub4Dos(int aux) {
        int aux2 = aux;
        int selection = 0;
        if (aux >= 0) {
            do {
                String[] options = {"Salir", "1", "2", "3"};
                selection = JOptionPane.showOptionDialog(null, "Sub-menú para llenar los datos del objeto"
                        + "\n0: Salir"
                        + "\n1: País de origen"
                        + "\n2: Fecha de caducidad"
                        + "\n3: Fecha de envasado", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                if (selection == -1) {
                    break;
                }

                switch (selection) {
                    case 0:
                        JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                        break;
                    case 1:

                        modificarPaisDos(aux2);
                        impresion(productos);
                        break;
                    case 2:
                        modificarCaducidadDos(aux2);
                        impresion(productos);
                        break;
                    case 3:
                        modificarEnvasadoDos(aux2);
                        impresion(productos);
                        break;

                }
            } while (selection != 0);

        }
    }

    public void modificarEnvasadoDos(int aux) {
        productos[aux].setFechaDeEnvasado(JOptionPane.showInputDialog("Digite la nueva fecha de envasado"));

    }

    public void modificarCaducidadDos(int aux) {
        productos[aux].setFechaDeCaducidad(JOptionPane.showInputDialog("Digite la nueva fecha de caducidad"));

    }

    public void modificarPaisDos(int aux) {

        productos[aux].setPaisDeOrigen(JOptionPane.showInputDialog("Digite el nuevo país de origen"));

    }

    //CASO 5
    public void menuCaso5() {
        int selection5;
        do {
            String[] optionsCase5 = {"Salir", "1", "2", "3", "4"};
            selection5 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Busqueda por número de lote de un objeto para borrar todos sus atributos"
                    + "\n2: Busqueda por posición de un objeto para borrar todos sus atributos  "
                    + "\n3: recorrer el arreglo y borrar el primer objeto"
                    + "\n4: Borrar último objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase5, optionsCase5[0]);
            if (selection5 == -1) {
                break;
            }
            switch (selection5) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    //aquí va el caso 
                    remover(monstrarYBuscarID());
                    impresion(productos);
                    if (posiciones != 0) {
                        posiciones--;
                    }
                    break;
                case 2:
                    //aquí va el caso
                    removerPorPosicion(mostrarYBuscarPosicion());
                    impresion(productos);
                    if (posiciones != 0) {
                        posiciones--;
                    }
                    break;
                case 3:
                    borrarPrimero();

                    impresion(productos);
                    break;
                case 4:
                    borrarUltimo();
                    contObjetos--;
                    posiciones--;
                    impresion(productos);

                    break;
            }
        } while (selection5 != 0);
    }

    //Sub 3 Caso 5
    public void borrarPrimero() {
        int pregunta;
        if(productos[0]==null){
            JOptionPane.showMessageDialog(null,"Su objeto ya está vacio");
        }
        else{
        pregunta = JOptionPane.showConfirmDialog(null, "¿Quiere borrar el primer objeto?", "", JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.YES_OPTION) {
            contObjetos--;
            posiciones--;
            JOptionPane.showMessageDialog(null, "Se ha borrado el objeto" + productos[0]);
            productos[0] = null;
        }

        for (int i = 0; i<productos.length-1; i++) {
            productos[i] = productos[i+1];
        }
         productos[productos.length-1]=null;
        }

    }

    //SUB 4 Caso 5
    public void borrarUltimo() {
        if(productos[productos.length-1]==null){
            JOptionPane.showMessageDialog(null,"Su objeto ya está vacio");
        }
        else{
        JOptionPane.showMessageDialog(null, "Se ha borrado el objeto" + productos[productos.length - 1]);
        productos[productos.length - 1] = null;
        }

    }

    //SUB 1 CASO 5
    public void remover(int matricula) {
        ProductoFresco productosAux = new ProductoFresco();
        if (matricula >= 0) {
            productosAux.setNumeroDeLote(matricula);
            for (int i = 0; i < productos.length; i++) {
                if (productosAux.equals(productos[i])) {
                    if (productos[i] == null) {
                        JOptionPane.showMessageDialog(null, "Ya estaba vacio el objeto");
                    } else {
                        productos[i] = null;
                    }
                    break;
                }

            }
        }

    }

    //SUB 2 CASO 5
    public void removerPorPosicion(int posicion) {
        if (posicion >= 0) {
            if (productos[posicion] == null) {
                JOptionPane.showMessageDialog(null, "Ya estaba vacio el objeto");
            } else {
                productos[posicion] = null;
            }
        }

    }

    //CASO 6 YA QUEDO HECHO
    public void menuCaso6() {
        int selection6;
        do {
            String[] optionsCase6 = {"Salir", "1", "2"};
            selection6 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Intercambiar dos objetos de posición"
                    + "\n2: Vaciar el Arreglo ", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase6, optionsCase6[0]);
            if (selection6 == -1) {
                break;
            }
            switch (selection6) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    cambiarPosicion();
                    impresion(productos);

                    break;
                case 2:
                    if (vaciarArreglo() == true) {
                        posiciones = 0;
                        contObjetos = -1;
                    }
                    impresion(productos);

                    break;

            }
        } while (selection6 != 0);
    }

    //SUB 2 CASO 6
    public boolean vaciarArreglo() {
        boolean val = true;
        int pregunta;
        pregunta = JOptionPane.showConfirmDialog(null, "Selecciono para borrar los objetos del arreglo", "¿Quiere borrarlos?", JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Se han borrado los datos de los objetos del arreglo");
            for (int i = 0; i < productos.length; i++) {

                productos = new ProductoFresco[intervalo];

            }

        } else {
            JOptionPane.showMessageDialog(null, "No se ejecutó la operación");
            val = false;
        }
        return val;
    }

    //SUB 1 CASO 6
    public void cambiarPosicion() {
        ProductoFresco productosAux = new ProductoFresco();
        int aux = 0, repetir = 0, cont = 0, cont2, variAux = 0, auxDos = 0, auxTres = 0;
        cont2 = productos.length;
        //Existencia de la posicion

        do {

            if (variAux == 0) {

                try {
                    String res = JOptionPane.showInputDialog("Digite la posición del arreglo");
                    res.trim();
                    aux = Integer.parseInt(res);

                    if ((aux < 1 || aux > 5)) {
                        JOptionPane.showMessageDialog(null, "No existe ese rango a buscar ");
                        repetir = 0;
                    } else if (aux <= productos.length) {

                        try {
                            String res2 = JOptionPane.showInputDialog("Digite la otra posición con la que quiere intercambiar el objeto");
                            res.trim();
                            auxDos = Integer.parseInt(res2);
                            if ((auxDos < 1 || auxDos > 5)) {
                                JOptionPane.showMessageDialog(null, "No existe ese rango a buscar ");
                                repetir = 0;
                            } else if (auxDos <= productos.length) {
                                //operaciones
                                productosAux = productos[auxDos - 1];
                                for (int i = 0; i < productos.length; i++) {
                                    productos[auxDos - 1] = productos[aux - 1];
                                    productos[aux - 1] = productosAux;
                                    repetir = 1;
                                    break;
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "No existe tal posición en el arreglo");

                            }
                        } catch (NullPointerException e) {
                            JOptionPane.showMessageDialog(null, "Cancelando operación");
                            repetir = 1;
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                            repetir = 0;
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "No existe tal posición en el arreglo");

                    }

                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(null, "Cancelando operación");
                    repetir = 1;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "No digito un número " + e.getMessage());
                    repetir = 0;
                }
            }
        } while (repetir == 0);

    }

    //CASO 7
    public boolean destruirArreglo() {
        boolean val = false;
        int pregunta;
        pregunta = JOptionPane.showConfirmDialog(null, "¿Desea Borrar su arreglo?", "¿Quiere borrarlo?", JOptionPane.YES_NO_OPTION);
        if (pregunta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Se ha borrado el arreglo");
            productos2 = null;
            val = true;

        } else {
            JOptionPane.showMessageDialog(null, "No se ejecutó la operación");
        }

        return val;
    }
}
