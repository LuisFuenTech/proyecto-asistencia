
package Form;

import Modelo.Estudiante;
import Modelo.Reloj;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//Este form usa la interfaz Runnable para manejar hilos. programa multiproceso.
public class Registro extends javax.swing.JFrame implements Runnable{

    private javax.swing.JFrame form1;
    private List<Estudiante> registroEstudiantes;
    Reloj reloj = new Reloj();
    Thread hilo;
    
    public Registro() 
    {
        initComponents();
        hilo = new Thread(this);//Instanciar el objeto Thread con el form actual como argumento.
        hilo.start();//Inicia el hilo.
        fechaLB.setText(reloj.fechaActual());//Obtiene la fecha de reloj y lo muestra.
        this.setLocationRelativeTo(null);
        Image icon = new ImageIcon(getClass()
                .getResource("/Imagenes/busqueda.png")).getImage();
        setIconImage(icon);//Colocar icono a la ventana.

        //Ocultar las combox y botone sde búsqueda
        asignaturaCB.setVisible(false);
        docenteCB.setVisible(false);
        docenteOK.setVisible(false);
        asignaturaOK.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        registroText = new javax.swing.JTextArea();
        fechaLB = new javax.swing.JLabel();
        horaLB = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        totalText = new javax.swing.JTextField();
        recibirBT = new javax.swing.JButton();
        porClaseBT = new javax.swing.JButton();
        porDocenteBT = new javax.swing.JButton();
        guardaBT = new javax.swing.JButton();
        docenteCB = new javax.swing.JComboBox<>();
        asignaturaCB = new javax.swing.JComboBox<>();
        asignaturaOK = new javax.swing.JButton();
        docenteOK = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        porCodigoText = new javax.swing.JTextField();
        buscarCodigaBT = new javax.swing.JButton();
        limpiarBT = new javax.swing.JButton();
        atrasBT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 255, 255));
        setFocusable(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setEnabled(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(720, 638));
        jPanel1.setPreferredSize(new java.awt.Dimension(720, 638));

        registroText.setBackground(new java.awt.Color(204, 255, 255));
        registroText.setColumns(20);
        registroText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        registroText.setRows(5);
        jScrollPane1.setViewportView(registroText);

        fechaLB.setText("Fecha");

        horaLB.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        horaLB.setText("hora");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Total");

        totalText.setBackground(new java.awt.Color(204, 255, 255));
        totalText.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        totalText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        recibirBT.setText("Ver listado");
        recibirBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibirBTActionPerformed(evt);
            }
        });

        porClaseBT.setText("Ver por clase");
        porClaseBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porClaseBTActionPerformed(evt);
            }
        });

        porDocenteBT.setText("Ver por docente");
        porDocenteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porDocenteBTActionPerformed(evt);
            }
        });

        guardaBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        guardaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        guardaBT.setText("Guardar");
        guardaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardaBTActionPerformed(evt);
            }
        });

        docenteCB.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        docenteCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Claudia Pérez", "Alexis Moreno", "Amaury Cabarcas", "Atilano Arrieta", "Carlos Cáseres", "Edilbert Almanza", "Enilsa Perez", "Jesus Atencio", "Jorge Acevedo", "Julio Padilla", "Kevin Beltran", "Luis Arrieta" }));
        docenteCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                docenteCBMousePressed(evt);
            }
        });

        asignaturaCB.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        asignaturaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cálculo diferencial  ", "Cálculo vectorial    ", "Diseño de estructuras", "Física teórica ll    ", "Gestión humana       ", "Metodología          ", "Programación a obj.  ", "Proceso industrial   ", "Salud ocupacional    " }));
        asignaturaCB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                asignaturaCBMousePressed(evt);
            }
        });

        asignaturaOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_bt.png"))); // NOI18N
        asignaturaOK.setBorder(null);
        asignaturaOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturaOKActionPerformed(evt);
            }
        });

        docenteOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_bt.png"))); // NOI18N
        docenteOK.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        docenteOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docenteOKActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Muli", 1, 14)); // NOI18N
        jLabel1.setText("Buscar por código");

        porCodigoText.setBackground(new java.awt.Color(204, 255, 255));
        porCodigoText.setFont(new java.awt.Font("Muli", 0, 14)); // NOI18N
        porCodigoText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        porCodigoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                porCodigoTextMouseClicked(evt);
            }
        });
        porCodigoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                porCodigoTextKeyTyped(evt);
            }
        });

        buscarCodigaBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        buscarCodigaBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/search_bt.png"))); // NOI18N
        buscarCodigaBT.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        buscarCodigaBT.setBorderPainted(false);
        buscarCodigaBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCodigaBTActionPerformed(evt);
            }
        });

        limpiarBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        limpiarBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eraser.png"))); // NOI18N
        limpiarBT.setText("Limpiar");
        limpiarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTActionPerformed(evt);
            }
        });

        atrasBT.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        atrasBT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back_.png"))); // NOI18N
        atrasBT.setText("Atrás");
        atrasBT.setBorderPainted(false);
        atrasBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBTActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/calendario_.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/reloj_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(porClaseBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(asignaturaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(asignaturaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(porDocenteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(docenteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(docenteOK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(atrasBT, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recibirBT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(limpiarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guardaBT)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(porCodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(29, 29, 29)))
                                .addComponent(buscarCodigaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(horaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaLB, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recibirBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(porCodigoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarCodigaBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(asignaturaOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(asignaturaCB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(porClaseBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(porDocenteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(docenteCB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(docenteOK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(atrasBT))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(guardaBT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(limpiarBT)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBTActionPerformed
        //form 1 = Entrada.
        this.hide();
        form1.setVisible(true);
        form1.setAutoRequestFocus(true);
        form1.show();
        System.gc();
    }//GEN-LAST:event_atrasBTActionPerformed

    private void limpiarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTActionPerformed
        limpiar();
    }//GEN-LAST:event_limpiarBTActionPerformed

    private void buscarCodigaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCodigaBTActionPerformed
        buscarPorCodigo();
    }//GEN-LAST:event_buscarCodigaBTActionPerformed

    private void porCodigoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_porCodigoTextKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') | (caracter > '9')) & (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_porCodigoTextKeyTyped

    private void porCodigoTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_porCodigoTextMouseClicked
        porCodigoText.setText("");//Limpiar el buscardor de código
    }//GEN-LAST:event_porCodigoTextMouseClicked

    private void docenteOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docenteOKActionPerformed
        buscarPorDocente();
    }//GEN-LAST:event_docenteOKActionPerformed

    private void asignaturaOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturaOKActionPerformed
        buscarPorAsignatura();
    }//GEN-LAST:event_asignaturaOKActionPerformed

    private void guardaBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardaBTActionPerformed
        guardarArchivo();
    }//GEN-LAST:event_guardaBTActionPerformed

    private void porDocenteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porDocenteBTActionPerformed
        docenteCB.setVisible(true);//Mostrar comBox de docente
    }//GEN-LAST:event_porDocenteBTActionPerformed

    private void porClaseBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porClaseBTActionPerformed
        asignaturaCB.setVisible(true);//Mostrar comBox de clase
    }//GEN-LAST:event_porClaseBTActionPerformed

    private void recibirBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibirBTActionPerformed
        inicio();
    }//GEN-LAST:event_recibirBTActionPerformed

    private void asignaturaCBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_asignaturaCBMousePressed
        habilitarAsignatura();
    }//GEN-LAST:event_asignaturaCBMousePressed

    private void docenteCBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docenteCBMousePressed
       habilitarDocente();
    }//GEN-LAST:event_docenteCBMousePressed

    public void habilitarAsignatura()
    {
        asignaturaOK.setVisible(true);//Mostrar botón de búsqueda por clase
    }
    
    public void habilitarDocente()
    {
        docenteOK.setVisible(true);//Mostrar botón de búsqueda por docente
    }
    
    public void limpiar()//Limpia todos los campos de la ventana
    {
        totalText.setText("");
        registroText.setText("");
        porCodigoText.setText("");
        atrasBT.requestFocus();//Resalta el botón de ir atrás
    }
    
    public void guardarArchivo()
    {
        this.setVisible(true);
        this.enable(false);//Bloquear ventana actual
        Archivos archivo = new Archivos();//Creación del objeto archivo para guardar fichero.
        archivo.setRegistroEstudiantes(registroEstudiantes);//Recibe la lista de estudiantes listados
        archivo.setForm1(this);//Enviar este form
        archivo.show();//mostrar el forma de archivo
    } 
    
    public void buscarPorAsignatura()
    {
        /*
        La variable asignatura toma el nombre que esté seleccionado en la combox, para luego comparar el valor.
        */
        String newLine = System.getProperty("line.separator");
        String asignatura = String.valueOf(asignaturaCB.getSelectedItem());
        int pos = -1, cont=0;
        registroText.setText("");
        registroText.append(String.format("%-25s %-25s %-25s %-35s %-28s "
                + "%-28s %-28s %-25s %s", "NOMBRE", "APELLIDO", "CODIGO", 
                "PROGRAMA","CLASE", "PROFESOR", "JORNADA", "FECHA", newLine));
        
        //Recorre la lista registroEstudiante
        for (Estudiante lista : registroEstudiantes) 
        {
            if (lista.getClase().equals(asignatura))/*Si consigue u objeto con el mismo nombre de la clase seleecionada 
                                                                        este irá apareciendo en pantalla.
                                                                       */                
            {                
                registroText.append(lista.toStringf());//Método append concatena cadenas.
                pos = 1;
                cont++;
            }
        }
        totalText.setText(String.valueOf(cont));//Cuanta y muestralso estudiantes encontrado
        
        if (pos != 1)//Si no se encuntra algo, muestra un mensaje. 
        {
            JOptionPane.showMessageDialog(null, "No hay asistentes");
        }        
    }
    
    public void buscarPorDocente()
    {   //Este método cumple con el mismo principio que buscarporAsignatura()
        String newLine = System.getProperty("line.separator");
        String docente = String.valueOf(docenteCB.getSelectedItem());
        registroText.setText("");
        registroText.append(String.format("%-25s %-25s %-25s %-35s %-28s "
                + "%-28s %-28s %-25s %s", "NOMBRE", "APELLIDO", "CODIGO", "PROGRAMA",
                "CLASE", "PROFESOR", "JORNADA", "FECHA", newLine));
        int pos = -1, cont=0;
        
        for (Estudiante lista : registroEstudiantes) 
        {
            if (lista.getDocente().equals(docente)) 
            {
                registroText.append(lista.toStringf());
                pos = 1;
                cont++;
            }
        }
        totalText.setText(String.valueOf(cont));
        
        if (pos != 1) 
        {
            JOptionPane.showMessageDialog(null, "No hay asistentes");
        }        
    }
    
    public void buscarPorCodigo()
    {
        String newLine = System.getProperty("line.separator");        
        int pos = -1, cont=0;
        
        if (porCodigoText.getText().length() == 0) 
        {
            totalText.setText(String.valueOf(cont));
            JOptionPane.showMessageDialog(null, "Campo vacio");            
        } 
        else 
        {   
            registroText.setText("");
            registroText.append(String.format("%-25s %-25s %-25s %-35s %-28s "
                + "%-28s %-28s %-25s %s", "NOMBRE", "APELLIDO", "CODIGO", "PROGRAMA",
                "CLASE", "PROFESOR", "JORNADA", "FECHA", newLine));
            for (Estudiante lista : registroEstudiantes) 
            {
                if (lista.getCodigo().equals(porCodigoText.getText())) 
                {
                    registroText.append(lista.toStringf());
                    pos = 1;
                    cont++;
                }
            }            
            if (pos != 1) 
            {
                JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
            }
            totalText.setText(String.valueOf(cont));
        }
    }
    
    public void inicio()
    {
        int cont=0;
        String newLine = System.getProperty("line.separator");
        registroText.setText("");
        registroText.append(String.format("%-25s %-25s %-25s %-35s %-28s "
                + "%-24s %-24s %-24s %s", "NOMBRE", "APELLIDO", "CODIGO", "PROGRAMA",
                "CLASE", "PROFESOR", "JORNADA", "FECHA", newLine));
        
        //Muestra todos los estudiante que asistieron a clases
        for (Estudiante lista : registroEstudiantes) 
        {
            registroText.append(lista.toStringf());
            cont++;
        }
        totalText.setText(String.valueOf(cont));
    } 

    public JFrame getForm1() 
    {
        return form1;
    }

    public void setForm1(JFrame form1) 
    {
        this.form1 = form1;
    }

    public List<Estudiante> getRegistroEstudiantes() 
    {
        return registroEstudiantes;
    }

    public void setRegistroEstudiantes(List<Estudiante> registroEstudiantes) 
    {
        this.registroEstudiantes = registroEstudiantes;
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asignaturaCB;
    private javax.swing.JButton asignaturaOK;
    private javax.swing.JButton atrasBT;
    private javax.swing.JButton buscarCodigaBT;
    private javax.swing.JComboBox<String> docenteCB;
    private javax.swing.JButton docenteOK;
    private javax.swing.JLabel fechaLB;
    private javax.swing.JButton guardaBT;
    private javax.swing.JLabel horaLB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiarBT;
    private javax.swing.JButton porClaseBT;
    private javax.swing.JTextField porCodigoText;
    private javax.swing.JButton porDocenteBT;
    private javax.swing.JButton recibirBT;
    private javax.swing.JTextArea registroText;
    private javax.swing.JTextField totalText;
    // End of variables declaration//GEN-END:variables

    //Método multiproceso que siempre se ejecuta. Usado para crear el reloj.
    @Override
    public void run() 
    {
        Thread ct = Thread.currentThread();/*La variable ct adoptará el valor del CurrenThread, es decir, el hilo que 
                                                               se esté ejecutando en determinado instante.*/
        while (ct == hilo) 
        {
            Reloj reloj = new Reloj();//Crea el objeto Reloj
            horaLB.setText(reloj.horaActual());//Muestra la hora obtenida con el método horaActual de reloj.    
            
            try 
            {
                Thread.sleep(1000);//Pausa el proceso un segundo.
            } 
            catch (InterruptedException e) 
            {
            }
        }
    }

}
