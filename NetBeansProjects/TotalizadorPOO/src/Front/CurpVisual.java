package Front;

import curp.MisFunciones;
import curp.Persona;
import java.util.Locale;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.*;

public class CurpVisual extends javax.swing.JFrame {
    private String arregloEnero[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30"};
    private String arregloFebrero[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28"};
     private String arregloFebrero2[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28"};
     private String arregloMarzo[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
     private String arregloAbril[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30"};
      private String arregloMayo[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
       private String arregloJunio[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30"};
        private String arregloJulio[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
         private String arregloAgosto[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
          private String arregloSeptiembre[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30"};
           private String arregloOctubre[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            private String arregloNoviembre[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30"};
             private String arregloDiciembre[]= {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17"
    ,"18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String estado;
    private String genero;
    private String año;
    private String mes;
    private String dia;
    Persona personAux = new Persona();
    Funciones funcion=new Funciones();

    public CurpVisual() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        panelDatosCURP = new javax.swing.JPanel();
        lNombres = new javax.swing.JLabel();
        lApellido1 = new javax.swing.JLabel();
        lApellido2 = new javax.swing.JLabel();
        lEstado = new javax.swing.JLabel();
        lGenero = new javax.swing.JLabel();
        lFechaNacimiento = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        lImpresion = new javax.swing.JLabel();
        bAgregarCurpArreglo = new javax.swing.JButton();
        tfNombres = new javax.swing.JTextField();
        tfApellido1 = new javax.swing.JTextField();
        tfApellido2 = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbAño = new javax.swing.JComboBox<>();
        cbMes = new javax.swing.JComboBox<>();
        tImprimirCurp = new javax.swing.JTextField();
        cbdia = new javax.swing.JComboBox<>();
        panelBotonesArreglos = new javax.swing.JPanel();
        crear_arreglo = new javax.swing.JButton();
        crear_objetos = new javax.swing.JButton();
        mostrar_objetos = new javax.swing.JButton();
        eliminar_objetos = new javax.swing.JButton();
        intercambiar_objetos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jTabbedPane4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(new java.awt.BorderLayout());

        lNombres.setText("Nombre(s)*");

        lApellido1.setText("Apellido Paterno*");

        lApellido2.setText("Apellido Materno*");

        lEstado.setText("Estado");

        lGenero.setText("Genero");

        lFechaNacimiento.setText("Fecha de Nacimiento");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Genero", "Masculino", "Feminino" }));

        lImpresion.setText("CURP");

        bAgregarCurpArreglo.setText("Generar Curp");
        bAgregarCurpArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarCurpArregloActionPerformed(evt);
            }
        });

        tfNombres.setBorder(null);
        tfNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNombresKeyTyped(evt);
            }
        });

        tfApellido1.setBorder(null);
        tfApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellido1ActionPerformed(evt);
            }
        });
        tfApellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellido1KeyTyped(evt);
            }
        });

        tfApellido2.setBorder(null);
        tfApellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfApellido2KeyTyped(evt);
            }
        });

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un Estado", "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua", "Ciudad de Mexico", "Coahuila de Zaragoza", "Colima", "Durango", "Estado de Mexico", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán de Ocampo", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosi", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatan", "Zacatecas" }));

        jLabel1.setText("Día");

        jLabel2.setText("Mes");

        jLabel3.setText("Año");

        cbAño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1970", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019" }));

        cbMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiebre", "Noviembre", "Diciembre" }));
        cbMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMesItemStateChanged(evt);
            }
        });

        tImprimirCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tImprimirCurpActionPerformed(evt);
            }
        });

        cbdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        javax.swing.GroupLayout panelDatosCURPLayout = new javax.swing.GroupLayout(panelDatosCURP);
        panelDatosCURP.setLayout(panelDatosCURPLayout);
        panelDatosCURPLayout.setHorizontalGroup(
            panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosCURPLayout.createSequentialGroup()
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lApellido2)
                    .addComponent(lApellido1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosCURPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfApellido1)
                    .addComponent(tfNombres)
                    .addComponent(tfApellido2))
                .addGap(21, 21, 21))
            .addGroup(panelDatosCURPLayout.createSequentialGroup()
                .addComponent(lFechaNacimiento)
                .addGap(28, 28, 28)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosCURPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosCURPLayout.createSequentialGroup()
                        .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelDatosCURPLayout.createSequentialGroup()
                                .addComponent(lEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosCURPLayout.createSequentialGroup()
                                .addComponent(lGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosCURPLayout.createSequentialGroup()
                        .addComponent(bAgregarCurpArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(panelDatosCURPLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(lImpresion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(tImprimirCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelDatosCURPLayout.setVerticalGroup(
            panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosCURPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lApellido1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lApellido2))
                .addGap(22, 22, 22)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEstado))
                .addGap(18, 18, 18)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lGenero)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lFechaNacimiento)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(bAgregarCurpArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(panelDatosCURPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tImprimirCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lImpresion))
                .addGap(20, 20, 20))
        );

        jPanel2.add(panelDatosCURP, java.awt.BorderLayout.CENTER);

        panelBotonesArreglos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBotonesArreglos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear_arreglo.setText("Crear arreglo");
        crear_arreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_arregloActionPerformed(evt);
            }
        });
        panelBotonesArreglos.add(crear_arreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        crear_objetos.setText("Crear objetos");
        crear_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_objetosActionPerformed(evt);
            }
        });
        panelBotonesArreglos.add(crear_objetos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        mostrar_objetos.setText("Mostrar objetos");
        mostrar_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_objetosActionPerformed(evt);
            }
        });
        panelBotonesArreglos.add(mostrar_objetos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        eliminar_objetos.setText("Eliminar objetos");
        eliminar_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_objetosActionPerformed(evt);
            }
        });
        panelBotonesArreglos.add(eliminar_objetos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));

        intercambiar_objetos.setText("Intercambiar objetos");
        intercambiar_objetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intercambiar_objetosActionPerformed(evt);
            }
        });
        panelBotonesArreglos.add(intercambiar_objetos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        jPanel2.add(panelBotonesArreglos, java.awt.BorderLayout.EAST);

        jTabbedPane4.addTab("Formluario", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Editar", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 746, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("tab3", jPanel4);

        getContentPane().add(jTabbedPane4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellido1ActionPerformed

    private void bAgregarCurpArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarCurpArregloActionPerformed
       boolean val=false;
        if (tfNombres.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de nombre no se ha llenado");
            val=true;
        } else if (tfApellido2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de apellido Paterno no se ha llenado");
            val=true;
        } else if (cbEstado.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Elija un estado para continuar");
            val=true;

        } else if (cbGenero.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Elija un genero para continuar");
            val=true;
        }

        nombre = tfNombres.getText().toUpperCase(Locale.ITALY);
        if (tfApellido1.getText().trim().isEmpty()) {
            
            apellido1="XXX";
        } else {
            apellido1 = tfApellido1.getText().toUpperCase(Locale.ITALY);
        }
        apellido2 = tfApellido2.getText().toUpperCase(Locale.ITALY);
        estado = cbEstado.getSelectedItem().toString().toUpperCase(Locale.ITALY);
        estado = estado.trim();

        //No eligir estado
        genero = cbGenero.getSelectedItem().toString();
        if (genero == "Masculino") {
            genero = "H";
        } else if (genero == "Femenino") {
            genero = "M";
        }
        año = cbAño.getSelectedItem().toString();
        mes = cbMes.getSelectedItem().toString();
        dia = cbdia.getSelectedItem().toString();
        //transformar mes de acuerdo a lo elegido
        switch (mes) {
            case "Enero":
                mes = "01";
                break;
            case "Febrero":
                mes = "02";
                break;
            case "Marzo":
                mes = "03";
                break;
            case "Abril":
                mes = "04";
                break;
            case "Mayo":
                mes = "05";
                break;
            case "Junio":
                mes = "06";
                break;
            case "Julio":
                mes = "07";
                break;
            case "Agosto":
                mes = "08";
                break;
            case "Septiembre":
                mes = "09";
                break;
            case "Octubre":
                mes = "10";
                break;
            case "Noviembre":
                mes = "11";
                break;
            case "Diciembre":
                mes = "12";
                break;
        }
        MisFunciones funcion = new MisFunciones();
 

        if(val==false){
        Persona person = new Persona(nombre, apellido1, apellido2, dia, mes, año, estado, genero);
        personAux=person;
        System.out.println(person);
        person.generarCurp();
        tImprimirCurp.setText(person.getCurp());
        
        }
        else{
            JOptionPane.showMessageDialog(null,"No puede generarse la CURP sí faltan datos");
        }


    }//GEN-LAST:event_bAgregarCurpArregloActionPerformed
//Cada campo con su keytypes apellidos y nombres
    private void tfNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombresKeyTyped
        char c = evt.getKeyChar();

        //copiar if de la funcion sí son letras, cambiar condicional por c para comparar
        //Sí es una letra la imprime
        //Sino consume(); la va a ignorar
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 'ñ' || c == 'Ñ' || c == ' ')) {
        } else {
            evt.consume();

        }


    }//GEN-LAST:event_tfNombresKeyTyped

    private void tfApellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellido1KeyTyped
        char c = evt.getKeyChar();
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 'ñ' || c == 'Ñ' || c == ' ')) {
            System.out.println("entro");
        } else {
            evt.consume();

        }
    }//GEN-LAST:event_tfApellido1KeyTyped

    private void tfApellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfApellido2KeyTyped
        char c = evt.getKeyChar();
        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 'ñ' || c == 'Ñ' || c == ' ')) {
            System.out.println("entro");
        } else {
            evt.consume();
        }

    }//GEN-LAST:event_tfApellido2KeyTyped

    private void cbMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMesItemStateChanged
      
        if(cbMes.getSelectedIndex()==0){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloEnero));
       }else if(cbMes.getSelectedIndex()==1){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloFebrero));
       }
       
       else if(cbMes.getSelectedIndex()==2){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloMarzo));
       }
       else if(cbMes.getSelectedIndex()==3){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloAbril));
       }
       else if(cbMes.getSelectedIndex()==4){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloMayo));
       }
       else if(cbMes.getSelectedIndex()==5){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloJunio));
       }
       else if(cbMes.getSelectedIndex()==6){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloJulio));
       }
       else if(cbMes.getSelectedIndex()==7){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloAgosto));
       }
       else if(cbMes.getSelectedIndex()==8){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloSeptiembre));
       }
       else if(cbMes.getSelectedIndex()==9){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloOctubre));
       }
       else if(cbMes.getSelectedIndex()==10){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloNoviembre));
       }
       else if(cbMes.getSelectedIndex()==11){
           cbdia.setModel( new DefaultComboBoxModel<String>(arregloDiciembre));
       }
       
        
    }//GEN-LAST:event_cbMesItemStateChanged
int auxiliarNumerico=0;
    private void crear_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_objetosActionPerformed

        int selection2;
        do {
            String[] optionsCase2 = {"Salir", "1", "2", "3", "4"};
            selection2 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Crear un objeto curp, y colocarlo en la primer posición vacia"
                    + "\n2: Crear un objeto curp, y colocarlo en una posición deseada disponible"
                    + "\n3: Agregar un objeto al principio del arreglo y llenarlo"
                    + "\n4: Agregar un objeto al final del arreglo y llenarlo", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase2, optionsCase2[0]);
            if (selection2 == -1) {
                break;
            }

            if (selection2 == -1) {
                JOptionPane.showMessageDialog(null, "Cancelando operación...");
                break;
            }
            int opcionCaso=0;
            switch (selection2) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del menú...");
                    break;
                case 1:
                    if(tamañoDeArreglo==0){
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }else{
                        for(int i=0; i<tamañoDeArreglo; i++) {
                            if(arregloCurp[(i)]==null) {
				auxiliarNumerico=i;
				break;
                            }
			}
                        if(arregloCurp[auxiliarNumerico]==null){
                            arregloCurp[auxiliarNumerico]=personAux;
                            JOptionPane.showMessageDialog(null, "se ha guardado el objeto");
                            //System.out.println("imprimiendo objeto\n"+arregloCurp[auxiliarNumerico]);
                        }else{
                            JOptionPane.showMessageDialog(null, "no hay espacios disponibles en el arreglo");
                        }
                    }
                    break;
                case 2:
                    opcionCaso=0;
                    auxiliarNumerico=0;
                    boolean auxBoolean=false;
                    for(int i=0;i<tamañoDeArreglo; i++){
                            if(arregloCurp[i]==null){
                                auxiliarNumerico++;
                            }
                        }
                    String[] opcionesDisponibles=new String[auxiliarNumerico];
                    if(tamañoDeArreglo==0){
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }else{
                        auxiliarNumerico=0;
                        for(int i=0;i<tamañoDeArreglo; i++){
                            if(arregloCurp[i]==null){
                                opcionesDisponibles[auxiliarNumerico]=Integer.toString(i);
                                auxiliarNumerico++;
                                auxBoolean=true;
                            }
                        }
                        //System.out.println(Arrays.toString(opcionesDisponibles));
                        if(auxBoolean==true){
                            opcionCaso = JOptionPane.showOptionDialog(null, "en qué posición desea agregar"
                                + " el objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesDisponibles, opcionesDisponibles[0]);
                            opcionCaso=Integer.parseInt(opcionesDisponibles[opcionCaso]);
                            //System.out.println(opcionCaso2);
                            arregloCurp[opcionCaso]=personAux;
                            JOptionPane.showMessageDialog(null, "se ha guardado el objeto en la posición "+opcionCaso);
                        }else{
                            JOptionPane.showMessageDialog(null, "no hay espacios disponibles en el arreglo");
                        }
                    }
                    
                    break;
                case 3:
                    opcionCaso=0;
                    if(arregloCurp[0]!=null){
                        String[] opcionesSiNo={"si","no"};
                        opcionCaso = JOptionPane.showOptionDialog(null, "el primer espacio está lleno desea recorrer el arreglo"
                                + " el objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSiNo, opcionesSiNo[0]);
                        switch(opcionCaso){
                            case 0:
                                //System.out.println(Arrays.toString(funcion.recorrerPrimero(arregloCurp, tamañoDeArreglo)));
                                funcion.recorrerPrimero(arregloCurp, tamañoDeArreglo);
                                arregloCurp[0]=personAux;
                                funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                                break;
                            case 1:
                                break;
                        }
                    }else{
                        arregloCurp[0]=personAux;
                        JOptionPane.showMessageDialog(null, "se ha guardado el objeto en la posición 0");
                    }
                    break;
                case 4:
                   opcionCaso=0;
                    if(arregloCurp[0]!=null){
                        String[] opcionesSiNo={"si","no"};
                        opcionCaso = JOptionPane.showOptionDialog(null, "el último espacio está lleno desea recorrer el arreglo"
                                + " el objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSiNo, opcionesSiNo[0]);
                        switch(opcionCaso){
                            case 0:
                                //System.out.println(Arrays.toString(funcion.recorrerUltimo(arregloCurp, tamañoDeArreglo)));
                                funcion.recorrerUltimo(arregloCurp, tamañoDeArreglo);
                                arregloCurp[tamañoDeArreglo-1]=personAux;
                                funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                                JOptionPane.showMessageDialog(null, "se ha guardado el objeto en la última posición");
                                break;
                            case 1:
                                break;
                        }
                    }else{
                        arregloCurp[0]=personAux;
                        JOptionPane.showMessageDialog(null, "se ha guardado el objeto en la última posición");
                    }
                    break; 
            }
        } while (selection2 != 0);
        
    }//GEN-LAST:event_crear_objetosActionPerformed
boolean arregloCreado=false;
int tamañoDeArreglo=0;
Persona[] arregloCurp;
    private void crear_arregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_arregloActionPerformed
        // TODO add your handling code here:
        
        if(arregloCreado==false){
            String[] optionsCase4 = {"3","4","5"};
            tamañoDeArreglo = JOptionPane.showOptionDialog(null, "Digite el tamaño del arreglo"
                    + "", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, optionsCase4, optionsCase4[0])+3;
            
            arregloCurp = new Persona[tamañoDeArreglo];
        JOptionPane.showMessageDialog(rootPane, "arreglo creado");
        arregloCreado=true;
        }else{
            JOptionPane.showMessageDialog(rootPane, "ya existe el arreglo");
        }
        
    }//GEN-LAST:event_crear_arregloActionPerformed

    private void mostrar_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_objetosActionPerformed
        // TODO add your handling code here:
        int selection3;
        do {
            String[] optionsCase3 = {"Salir", "1", "2", "3", "4"};
            selection3 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Buscar y mostrar el contenido de un objeto por curp"
                    + "\n2: Buscar y mostrar el contenido de un objeto por posición"
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
                    if(tamañoDeArreglo!=0){
                        String auxString=(JOptionPane.showInputDialog(null, "ingresa el curp a buscar")).toUpperCase();
                        funcion.buscarPorCurp(arregloCurp, tamañoDeArreglo, auxString);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 2:
                    if(tamañoDeArreglo!=0){
                        String[] AuxStrings=new String[tamañoDeArreglo];
                        auxiliarNumerico=0;
                        for(int i=0;i<tamañoDeArreglo; i++){
                                AuxStrings[i]=Integer.toString(i);
                        }
                        int auxInt=JOptionPane.showOptionDialog(null, "En qué posición desea buscar un objeto"
                    + "", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, AuxStrings, AuxStrings[0]);
                        funcion.buscarPorPosicion(arregloCurp, tamañoDeArreglo, auxInt);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 3:
                    if(tamañoDeArreglo!=0){
                        
                        funcion.buscarPorPosicion(arregloCurp, tamañoDeArreglo, tamañoDeArreglo-1);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 4:
                    if(tamañoDeArreglo!=0){
                        
                        funcion.buscarPorPosicion(arregloCurp, tamañoDeArreglo, 0);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                   

            }
        } while (selection3 != 0);
    }//GEN-LAST:event_mostrar_objetosActionPerformed

    private void eliminar_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_objetosActionPerformed
        // TODO add your handling code here:
        int selection5;
        do {
            String[] optionsCase5 = {"Salir", "1", "2", "3", "4"};
            selection5 = JOptionPane.showOptionDialog(null, "Digite lo del siguiente menú"
                    + "\nSalir del menú"
                    + "\n1: Busqueda por curp para borrar todos sus atributos"
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
                    if(tamañoDeArreglo!=0){
                        String auxString=(JOptionPane.showInputDialog(null, "ingresa el curp a buscar")).toUpperCase();
                        funcion.eliminarPorCurp(arregloCurp, tamañoDeArreglo, auxString);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 2:
                    if(tamañoDeArreglo!=0){
                        String[] AuxStrings=new String[tamañoDeArreglo];
                        auxiliarNumerico=0;
                        for(int i=0;i<tamañoDeArreglo; i++){
                                AuxStrings[i]=Integer.toString(i);
                        }
                        int auxInt=JOptionPane.showOptionDialog(null, "En qué posición desea buscar un objeto"
                    + "", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, AuxStrings, AuxStrings[0]);
                        funcion.buscarPorPosicion(arregloCurp, tamañoDeArreglo, auxInt);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 3:
                    int opcionCaso=0;
                    if(arregloCurp[0]!=null){
                        String[] opcionesSiNo={"si","no"};
                        opcionCaso = JOptionPane.showOptionDialog(null, "el primer espacio está lleno desea recorrer el arreglo"
                                + " el objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSiNo, opcionesSiNo[0]);
                        switch(opcionCaso){
                            case 0:
                                //System.out.println(Arrays.toString(funcion.recorrerPrimero(arregloCurp, tamañoDeArreglo)));
                                funcion.recorrerPrimero(arregloCurp, tamañoDeArreglo);
                                arregloCurp[0]=null;
                                funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                                break;
                            case 1:
                                break;
                        }
                    }else{
                        arregloCurp[0]=personAux;
                        JOptionPane.showMessageDialog(null, "se ha eliminado el objeto en la posición 0");
                    }
                    break;
                case 4:
                    opcionCaso=0;
                    if(arregloCurp[0]!=null){
                        String[] opcionesSiNo={"si","no"};
                        opcionCaso = JOptionPane.showOptionDialog(null, "el último espacio está lleno desea recorrer el arreglo"
                                + " el objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesSiNo, opcionesSiNo[0]);
                        switch(opcionCaso){
                            case 0:
                                //System.out.println(Arrays.toString(funcion.recorrerUltimo(arregloCurp, tamañoDeArreglo)));
                                funcion.recorrerUltimo(arregloCurp, tamañoDeArreglo);
                                arregloCurp[tamañoDeArreglo-1]=null;
                                funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                                JOptionPane.showMessageDialog(null, "se ha eliminado el objeto en la última posición");
                                break;
                            case 1:
                                break;
                        }
                    }else{
                        arregloCurp[0]=personAux;
                        JOptionPane.showMessageDialog(null, "se ha eliminado el objeto en la última posición");
                    }
                    break;
            }
        } while (selection5 != 0);
    }//GEN-LAST:event_eliminar_objetosActionPerformed

    private void intercambiar_objetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intercambiar_objetosActionPerformed
        // TODO add your handling code here:
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
                    if(tamañoDeArreglo!=0){
                        String[] AuxStrings=new String[tamañoDeArreglo];
                        auxiliarNumerico=0;
                        for(int i=0;i<tamañoDeArreglo; i++){
                                AuxStrings[i]=Integer.toString(i);
                        }
                        int auxInt=JOptionPane.showOptionDialog(null, "seleccione la primera posición a intercambiar"
                    + "", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, AuxStrings, AuxStrings[0]);
                        int auxInt2=JOptionPane.showOptionDialog(null, "seleccione la segunda posición a intercambiar"
                    + "", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, AuxStrings, AuxStrings[0]);
                        funcion.intercambiarPosiciones(arregloCurp, auxInt, auxInt2);
                        JOptionPane.showMessageDialog(null, "se han intercambiado los indices");
                        funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                    }else{
                        JOptionPane.showMessageDialog(null, "no se ha creado el arreglo");
                    }
                    break;
                case 2:
                    funcion.vaciarArreglo(arregloCurp, tamañoDeArreglo);
                    funcion.imprimirPersona(arregloCurp, tamañoDeArreglo);
                    JOptionPane.showMessageDialog(null, "se ha vaciado el arreglo");
                    break;

            }
        } while (selection6 != 0);
    }//GEN-LAST:event_intercambiar_objetosActionPerformed

    private void tImprimirCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tImprimirCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tImprimirCurpActionPerformed
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CurpVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurpVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurpVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurpVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurpVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bAgregarCurpArreglo;
    private javax.swing.JComboBox<String> cbAño;
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbMes;
    private javax.swing.JComboBox<String> cbdia;
    private javax.swing.JButton crear_arreglo;
    private javax.swing.JButton crear_objetos;
    private javax.swing.JButton eliminar_objetos;
    private javax.swing.JButton intercambiar_objetos;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lApellido1;
    private javax.swing.JLabel lApellido2;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lFechaNacimiento;
    private javax.swing.JLabel lGenero;
    private javax.swing.JLabel lImpresion;
    private javax.swing.JLabel lNombres;
    private javax.swing.JButton mostrar_objetos;
    private javax.swing.JPanel panelBotonesArreglos;
    private javax.swing.JPanel panelDatosCURP;
    private javax.swing.JTextField tImprimirCurp;
    private javax.swing.JTextField tfApellido1;
    private javax.swing.JTextField tfApellido2;
    private javax.swing.JTextField tfNombres;
    // End of variables declaration//GEN-END:variables
}
