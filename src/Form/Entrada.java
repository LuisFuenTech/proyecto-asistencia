/*
Authors:
 LUIS ALBERTO FUENTES AURAAD
LILIANA CUADRO BATISTA
MAICOL VERGARA
 */
package Form;

import Docente.Docente;
import Modelo.Estudiante;
import Modelo.Reloj;
import Programa.Programa;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Entrada extends javax.swing.JFrame implements Runnable{

    Estudiante estudiante;
    List<Estudiante> registroEstudiantes = new ArrayList<>();
    Reloj reloj = new Reloj();
    Thread hilo;
    
    public Entrada() {
        initComponents();        
        hilo = new Thread(this);
        hilo.start();
        fechaLB.setText(reloj.fechaActual());
        
        
        
        if(this.isVisible())
        {
            this.nombreText.requestFocus();
        }        
        
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass()
                .getResource("/Imagenes/board.png")).getImage();
        setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreLB = new javax.swing.JLabel();
        apellidoLB = new javax.swing.JLabel();
        codigoLB = new javax.swing.JLabel();
        jornadaLB = new javax.swing.JLabel();
        claseLB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        codigoText = new javax.swing.JTextField();
        diurnaRB = new javax.swing.JRadioButton();
        nocturnaRB = new javax.swing.JRadioButton();
        programaLB = new javax.swing.JLabel();
        programaCB = new javax.swing.JComboBox<>();
        claseCB = new javax.swing.JComboBox<>();
        docenteCB = new javax.swing.JComboBox<>();
        asistirBT = new javax.swing.JButton();
        JScroll = new javax.swing.JScrollPane();
        datosText = new javax.swing.JTextArea();
        horaLB = new javax.swing.JLabel();
        listadoBT = new javax.swing.JButton();
        limpiarBT = new javax.swing.JButton();
        salirBT = new javax.swing.JButton();
        fechaLB = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        informacionBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asistencia a clases");
        setAutoRequestFocus(false);
        setFocusable(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setMaximumSize(new java.awt.Dimension(759, 626));

        jLabel2.setFont(new java.awt.Font("Muli", 1, 24)); // NOI18N
        jLabel2.setText("ASISTENCIA DE CLASES");

        jLabel1.setFont(new java.awt.Font("Muli", 1, 12)); // NOI18N
        jLabel1.setText("UNIVERSIDAD DE CARTAGENA");

        nombreLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        nombreLB.setText("Nombre");

        apellidoLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        apellidoLB.setText("Apellido");

        codigoLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        codigoLB.setText("Código");

        jornadaLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        jornadaLB.setText("Jornada");

        claseLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        claseLB.setText("Clase");

        jLabel3.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        jLabel3.setText("Docente");

        nombreText.setBackground(new java.awt.Color(204, 255, 255));
        nombreText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N

        apellidoText.setBackground(new java.awt.Color(204, 255, 255));
        apellidoText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N

        codigoText.setBackground(new java.awt.Color(204, 255, 255));
        codigoText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        codigoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoTextKeyTyped(evt);
            }
        });

        diurnaRB.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(diurnaRB);
        diurnaRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        diurnaRB.setSelected(true);
        diurnaRB.setText("Diurna");

        nocturnaRB.setBackground(new java.awt.Color(51, 204, 255));
        buttonGroup1.add(nocturnaRB);
        nocturnaRB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nocturnaRB.setText("Nocturna");

        programaLB.setFont(new java.awt.Font("Muli", 1, 18)); // NOI18N
        programaLB.setText("Programa");

        programaCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        programaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing. de sistemas ", "Ing. de alimentos", "Ingeniería civíl" }));
        programaCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programaCBActionPerformed(evt);
            }
        });

        claseCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        claseCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programación a obj.  ", "Cálculo vectorial    ", "Física teórica ll    ", "Metodología          " }));

        docenteCB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        docenteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Carlos Cáseres", "Jorge Acevedo", "Amaury Cabarcas", "Alexis Moreno" }));

        asistirBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        asistirBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/assits.png"))); // NOI18N
        asistirBT.setText("Asistir");
        asistirBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asistirBTActionPerformed(evt);
            }
        });

        JScroll.setBackground(new java.awt.Color(255, 255, 255));

        datosText.setEditable(false);
        datosText.setBackground(new java.awt.Color(204, 255, 255));
        datosText.setColumns(20);
        datosText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        datosText.setRows(5);
        JScroll.setViewportView(datosText);

        horaLB.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        horaLB.setText("hora");

        listadoBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        listadoBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contenido.png"))); // NOI18N
        listadoBT.setText("Registro");
        listadoBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoBTActionPerformed(evt);
            }
        });

        limpiarBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        limpiarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eraser.png"))); // NOI18N
        limpiarBT.setText("Limpiar");
        limpiarBT.setBorder(null);
        limpiarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTActionPerformed(evt);
            }
        });

        salirBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        salirBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        salirBT.setText("  Salir  ");
        salirBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBTActionPerformed(evt);
            }
        });

        fechaLB.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        fechaLB.setText("Fecha");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/escudo_64.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj_.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario_.png"))); // NOI18N

        informacionBT.setBackground(new java.awt.Color(255, 255, 255));
        informacionBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informacion_.png"))); // NOI18N
        informacionBT.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        informacionBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(informacionBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(apellidoLB)
                        .addGap(37, 37, 37)
                        .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JScroll, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jornadaLB)
                                .addGap(38, 38, 38)
                                .addComponent(diurnaRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nocturnaRB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(codigoLB)
                                .addGap(47, 47, 47)
                                .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asistirBT, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(limpiarBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(listadoBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salirBT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nombreLB)
                                .addGap(39, 39, 39)
                                .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(programaLB)
                            .addComponent(claseLB)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(docenteCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(claseCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(programaCB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(informacionBT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreLB)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoLB)
                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(codigoLB)
                            .addComponent(codigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jornadaLB)
                            .addComponent(diurnaRB)
                            .addComponent(nocturnaRB))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(programaLB)
                            .addComponent(programaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(claseLB)
                            .addComponent(claseCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(docenteCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(limpiarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listadoBT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salirBT, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(asistirBT, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(JScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBTActionPerformed
        System.exit(0);
        System.gc();
    }//GEN-LAST:event_salirBTActionPerformed

    private void limpiarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTActionPerformed
        limpiar();
        datosText.setText("");
    }//GEN-LAST:event_limpiarBTActionPerformed

    private void listadoBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoBTActionPerformed
        registro();
    }//GEN-LAST:event_listadoBTActionPerformed

    private void asistirBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asistirBTActionPerformed
        ingresar();
    }//GEN-LAST:event_asistirBTActionPerformed

    private void programaCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programaCBActionPerformed
        llenarCombox();
    }//GEN-LAST:event_programaCBActionPerformed

    private void codigoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoTextKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') | (caracter > '9')) & (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_codigoTextKeyTyped

    private void informacionBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionBTActionPerformed
        informacion();
    }//GEN-LAST:event_informacionBTActionPerformed

    public void llenarCombox()
    {
        Programa programa = new Programa();//Se crea objeto Programa
        Docente docente = new Docente();//Se crea objeto Docente
        
        if (programaCB.getSelectedIndex() == 0)/*Si el primero item del comBox programa es seleecionado,
            se comsidera la ing. de sistemas*/
        {            
            /*
                Crear un list tipo Programa donde se obtiene el listado de las clases de ing, de sistemas por el método
            asignaturaDeSistems().
            */
            List<Programa> asignaturas = programa.asignaturasDeSistemas();
            Vector<String> asigItems = new Vector<>();//Colección que crece dinámicamente. Capacidad inicial es 10.

            //Por cada elemento de la lista asiganturas se le asigna a la variable "asignatura".
            for (Programa asignatura : asignaturas) 
            {
                asigItems.add(asignatura.getPrograma());//Agregar las asignaturas al vector.
            }
            
            List<Docente> nombres = docente.nombresDeSistema();
            Vector<String> nomItems = new Vector<>();

            for (Docente nombre : nombres) 
            {
                nomItems.add(nombre.getNomApe());
            }

            claseCB.setModel(new javax.swing.DefaultComboBoxModel<>(asigItems));
            docenteCB.setModel(new javax.swing.DefaultComboBoxModel<>(nomItems));
        }

        if (programaCB.getSelectedIndex() == 1) 
        {            
            List<Programa> asignaturas = programa.asignaturasDeAlimentos();
            Vector<String> asigItems = new Vector<>();

            for (Programa asignatura : asignaturas) 
            {
                asigItems.add(asignatura.getPrograma());
            }
            
            List<Docente> nombres = docente.nombresDeAlimentos();
            Vector<String> nomItems = new Vector<>();

            for (Docente nombre : nombres) 
            {
                nomItems.add(nombre.getNomApe());
            }

            claseCB.setModel(new javax.swing.DefaultComboBoxModel<>(asigItems));
            docenteCB.setModel(new javax.swing.DefaultComboBoxModel<>(nomItems));
        }

        if (programaCB.getSelectedIndex() == 2) 
        {            
            List<Programa> asignaturas = programa.asignaturasDeCivil();
            Vector<String> asigItems = new Vector<>();

            for (Programa asignatura : asignaturas) 
            {
                asigItems.add(asignatura.getPrograma());
            }
            
            List<Docente> nombres = docente.nombresDeCivil();
            Vector<String> nomItems = new Vector<>();

            for (Docente nombre : nombres) 
            {
                nomItems.add(nombre.getNomApe());
            }

            claseCB.setModel(new javax.swing.DefaultComboBoxModel<>(asigItems));
            docenteCB.setModel(new javax.swing.DefaultComboBoxModel<>(nomItems));
        }
    }
    
    public void ingresar() 
    {
        if (nombreText.getText().length() == 0 | apellidoText.getText()
                .length() == 0 | codigoText.getText().length() == 0) 
        {
            JOptionPane.showMessageDialog(null, "Campos Vacios");
        } 
        else 
        {
            String nombre = nombreText.getText();            
            String apellido = apellidoText.getText();
            String codigo = codigoText.getText();
            String programa = (String) programaCB.getSelectedItem();            
            String jornada = "";
            String clase = (String) claseCB.getSelectedItem();
            String docente = (String) docenteCB.getSelectedItem();

            if (diurnaRB.isSelected() == true) 
            {
                jornada = "Diurna";
            }
            if (nocturnaRB.isSelected() == true) 
            {
                jornada = "Nocturna";
            }

            estudiante = new Estudiante(nombre, apellido, codigo, programa,
                    jornada, clase, docente);//Se llena con los parámetros, el estudiante.
            datosText.append("\n" + estudiante.toString());// Se imprime en pantalla.

            //Guardado para el registro
            registroEstudiantes.add(estudiante);
            nombreText.setText("");
            apellidoText.setText("");
            codigoText.setText("");
        }
    }

    public void registro() 
    {        
        Registro registro = new Registro();        
        registro.setRegistroEstudiantes(registroEstudiantes);
        registro.setForm1(this);
        registro.setAutoRequestFocus(true);
        registro.show();
        this.setVisible(false);
    }

    public void limpiar() 
    {
        nombreText.setText("");
        apellidoText.setText("");
        codigoText.setText("");
        diurnaRB.setSelected(true);
        programaCB.setSelectedIndex(0);
        nombreText.requestFocus();
    }
    
    public void informacion()
    {
        //this.setVisible(true);
        //this.enable(false);
        Informacion infomacion = new Informacion();        
        //registro.setRegistroEstudiantes(registroEstudiantes);
        infomacion.setForm3(this);
        infomacion.setAutoRequestFocus(true);
        infomacion.show();
        this.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Entrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScroll;
    private javax.swing.JLabel apellidoLB;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton asistirBT;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> claseCB;
    private javax.swing.JLabel claseLB;
    private javax.swing.JLabel codigoLB;
    private javax.swing.JTextField codigoText;
    private javax.swing.JTextArea datosText;
    private javax.swing.JRadioButton diurnaRB;
    private javax.swing.JComboBox<String> docenteCB;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JLabel horaLB;
    private javax.swing.JButton informacionBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jornadaLB;
    private javax.swing.JButton limpiarBT;
    private javax.swing.JButton listadoBT;
    private javax.swing.JRadioButton nocturnaRB;
    private javax.swing.JLabel nombreLB;
    private javax.swing.JTextField nombreText;
    private javax.swing.JComboBox<String> programaCB;
    private javax.swing.JLabel programaLB;
    private javax.swing.JButton salirBT;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == hilo) {
            Reloj reloj = new Reloj();
            horaLB.setText(reloj.horaActual());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}
