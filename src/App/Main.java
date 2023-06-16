package App;

import BD.BDConnect;
import BD.Busquedas;
import BD.estudiante;
import BD.impartemodulo;
import BD.matricula;
import BD.modulo;
import BD.monitor;
import BD.profesor;
import BD.programa;
import Entidades.Estudiantes;
import Entidades.Matricula;
import Entidades.Modulos;
import Entidades.Profesores;
import Entidades.Programas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Main extends javax.swing.JFrame {

    BDConnect cc= new BDConnect();
    Connection cn= cc.conexion();
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps= null;

    profesor pro = new profesor();
    programa prog = new programa();
    estudiante est = new estudiante();
    modulo modu = new modulo();
    impartemodulo im = new impartemodulo();
    matricula ma = new matricula();
    monitor mo = new monitor();
    Busquedas bq = new Busquedas();

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        mostrarProfesor();
        mostrarPrograma();
        mostrarModulo();
        mostrarEstudiante();
        mostrarImparteModulo();
        mostrarMatricula();
        mostrarMonitor();
        JboxProgramaEstudiante();
        JboxProgramaModulo();
        JboxModuloImaparte();
        JboxProfesorImaparte();
        JboxEstudianteMatricula();
        JboxModuloMatricula();
        JboxProfesorMatricula();
        JboxEstudianteMonitor();
        JboxModuloMonitor();
        JboxProfesorMonitor();
        JboxBusquedaPorPrograma();
        JboxBusquedaPorFechaM();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        NombreProfe = new javax.swing.JTextField();
        IdProfe = new javax.swing.JTextField();
        TelProfe = new javax.swing.JTextField();
        mailProfe = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        GuardarProfe = new javax.swing.JButton();
        SexProfe = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaProfesor = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        IdPrograma = new javax.swing.JTextField();
        descripPrograma = new javax.swing.JTextField();
        DuracionProg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrograma = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        IdEstudiante = new javax.swing.JTextField();
        DireccionEstudiante = new javax.swing.JTextField();
        NombreEstudiante = new javax.swing.JTextField();
        SexoEstudiante = new javax.swing.JComboBox<>();
        TelefonoEstudiante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mailEstudinate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaEstudiantes = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        JBoxIDPEstudiantes = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        IdModulo = new javax.swing.JTextField();
        DescripcionModulo = new javax.swing.JTextField();
        nCreditosModulo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaModulo = new javax.swing.JTable();
        JCboxProgramaModulos = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaImparteModulo = new javax.swing.JTable();
        FechaImparteModulo = new com.toedter.calendar.JDateChooser();
        IdModuloImapartir = new javax.swing.JComboBox<>();
        IdProfeImparte = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaMatricula = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        FechaMatricula = new com.toedter.calendar.JDateChooser();
        EstudianteMatricula = new javax.swing.JComboBox<>();
        IdModuloMatricula = new javax.swing.JComboBox<>();
        IdProfesorMatricula = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        TablaMonitor = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        FechaMonitor = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        IdEstudianteMonitor = new javax.swing.JComboBox<>();
        IdModuloMonitor = new javax.swing.JComboBox<>();
        IdProfesorMonitor = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        JTableBusquedas = new javax.swing.JTable();
        jButton10 = new javax.swing.JButton();
        BusquedaPrograma = new javax.swing.JComboBox<>();
        JboxFechaMatricula = new javax.swing.JComboBox<>();
        BusquedaFechaMatricula = new javax.swing.JToggleButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane6.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Taller de Base de Datos");

        jTabbedPane1.setFocusable(false);

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jLabel4.setText("Correo");

        jLabel5.setText("Sexo");

        GuardarProfe.setText("Guardar");
        GuardarProfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProfeActionPerformed(evt);
            }
        });

        SexProfe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        TablaProfesor.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "ID", "Nombre", "Telefono", "Correo", "Sexo"
                }
        ) {
            boolean[] canEdit = new boolean [] {
                    false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(TablaProfesor);

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(IdProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(NombreProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(TelProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(mailProfe, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(SexProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(GuardarProfe)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton7)))
                                                .addGap(107, 107, 107))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jScrollPane7)
                                                .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NombreProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(IdProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TelProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mailProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SexProfe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GuardarProfe)
                                        .addComponent(jButton7))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Profesores", jPanel1);

        jLabel6.setText("ID");

        jLabel7.setText("Descripcion");

        jLabel8.setText("Duracon");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaPrograma.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane1.setViewportView(TablaPrograma);

        jButton8.setText("Eliminar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(descripPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel7))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel8)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(DuracionProg, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton1)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton8)))))
                                                .addGap(0, 297, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IdPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(descripPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DuracionProg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton8))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Programas", jPanel2);

        IdEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdEstudianteActionPerformed(evt);
            }
        });

        SexoEstudiante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        jLabel9.setText("ID");

        jLabel10.setText("Nombre");

        jLabel11.setText("Direccion");

        jLabel12.setText("Telefono");

        jLabel13.setText("Sexo");

        mailEstudinate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailEstudinateActionPerformed(evt);
            }
        });

        jLabel14.setText("Correo");

        jLabel15.setText("Programa");

        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        TablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane4.setViewportView(TablaEstudiantes);

        jButton9.setText("Eliminar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jScrollPane4)
                                                .addContainerGap())
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(IdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel9))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(NombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel10)))
                                                        .addComponent(jLabel14)
                                                        .addComponent(mailEstudinate))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel15)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(DireccionEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(JBoxIDPEstudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(TelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel12))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(SexoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jButton4)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jButton9)))
                                                                .addContainerGap(350, Short.MAX_VALUE))))))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IdEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(NombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(DireccionEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(TelefonoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(SexoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addGap(1, 1, 1)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(mailEstudinate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4)
                                        .addComponent(jButton9)
                                        .addComponent(JBoxIDPEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estudiantes", jPanel3);

        jLabel16.setText("Descripcion");

        jLabel17.setText("ID");

        jLabel18.setText("Numero de Creditos");

        jLabel19.setText("Programa");

        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        TablaModulo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane2.setViewportView(TablaModulo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(IdModulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(DescripcionModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel16))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel18)
                                                        .addComponent(nCreditosModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel19)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(JCboxProgramaModulos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jButton5)))
                                                .addGap(0, 166, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel19))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IdModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(DescripcionModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nCreditosModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5)
                                        .addComponent(JCboxProgramaModulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Modulos", jPanel4);

        jLabel20.setText("Modulo");

        jLabel21.setText("Profesor");

        jLabel22.setText("Fecha");

        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        TablaImparteModulo.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane3.setViewportView(TablaImparteModulo);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20)
                                                        .addComponent(IdModuloImapartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21)
                                                        .addComponent(IdProfeImparte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabel22)
                                                                .addGap(396, 687, Short.MAX_VALUE))
                                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(FechaImparteModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton6)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel20)
                                                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FechaImparteModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGap(0, 56, Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(IdModuloImapartir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(IdProfeImparte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jButton6)
                                                                .addGap(2, 2, 2)))
                                                .addGap(19, 19, 19)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Impartir Modulos", jPanel5);

        TablaMatricula.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane5.setViewportView(TablaMatricula);

        jLabel23.setText("Estudiante");

        jLabel24.setText("Modulo");

        jLabel25.setText("Profesor");

        jLabel26.setText("Fecha");

        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel23)
                                                        .addComponent(EstudianteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel24)
                                                        .addComponent(IdModuloMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel25)
                                                        .addComponent(IdProfesorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel26)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(FechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel23)
                                                        .addComponent(jLabel24)
                                                        .addComponent(jLabel25)
                                                        .addComponent(jLabel26))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(EstudianteMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(IdModuloMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(IdProfesorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(FechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addGap(2, 2, 2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Matriculas", jPanel6);

        TablaMonitor.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jScrollPane8.setViewportView(TablaMonitor);

        jLabel27.setText("Estudiante");

        jLabel28.setText("Modulo");

        jLabel29.setText("Profesor");

        jLabel30.setText("Fecha");

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel27)
                                                        .addComponent(IdEstudianteMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel28)
                                                        .addComponent(IdModuloMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel29)
                                                        .addComponent(IdProfesorMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel30)
                                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(FechaMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton3)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel28)
                                        .addComponent(jLabel29)
                                        .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton3)
                                        .addComponent(IdEstudianteMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(IdModuloMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(IdProfesorMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(FechaMonitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jTabbedPane1.addTab("Monitor", jPanel7);

        JTableBusquedas.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String [] {

                }
        ));
        jScrollPane9.setViewportView(JTableBusquedas);

        jButton10.setText("Mostrar Estudiantes Por Programa");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        BusquedaFechaMatricula.setText("Mostrar Estudiantes Por Fecha de Matricula");
        BusquedaFechaMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaFechaMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(BusquedaPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton10))
                                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                                .addComponent(JboxFechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(BusquedaFechaMatricula)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
                jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton10)
                                        .addComponent(BusquedaPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(JboxFechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BusquedaFechaMatricula))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Busquedas", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void JboxBusquedaPorFechaM(){
        JboxFechaMatricula.removeAllItems();
        ArrayList<Matricula> ListMatricula = bq.getFecha();
        for(int i=0 ;i < ListMatricula.size(); i++){
            JboxFechaMatricula.addItem(new Matricula(ListMatricula.get(i).getIdEstudiante(), ListMatricula.get(i).getIdModulo(), ListMatricula.get(i).getIdProfesor(), ListMatricula.get(i).getFecha()));
        }

    }

    void JboxBusquedaPorPrograma(){
        BusquedaPrograma.removeAllItems();
        ArrayList<Programas> ListProgramas = est.getProgramas();
        for(int i=0 ;i < ListProgramas.size(); i++){
            BusquedaPrograma.addItem(new Programas(ListProgramas.get(i).getIdprograma(),ListProgramas.get(i).getDescripcion(),ListProgramas.get(i).getDuración()));
        }

    }

    void JboxProfesorMonitor(){
        IdProfesorMonitor.removeAllItems();
        ArrayList<Profesores> ListProfesore = mo.getProfesores();
        for(int i=0 ;i < ListProfesore.size(); i++){
            IdProfesorMonitor.addItem(new Profesores(ListProfesore.get(i).getIdprofesor(), ListProfesore.get(i).getNombre(), ListProfesore.get(i).getTelefono(), ListProfesore.get(i).getCorreo(), ListProfesore.get(i).getSexo()));
        }

    }

    void JboxModuloMonitor(){
        IdModuloMonitor.removeAllItems();
        ArrayList<Modulos> ListModulos = mo.getModulos();
        for(int i=0 ;i < ListModulos.size(); i++){
            IdModuloMonitor.addItem(new Modulos(ListModulos.get(i).getIdmodulo(), ListModulos.get(i).getDescripcion(), ListModulos.get(i).getnrodecreditos(), ListModulos.get(i).getIdprograma()));
        }

    }

    void JboxEstudianteMonitor(){
        IdEstudianteMonitor.removeAllItems();
        ArrayList<Estudiantes> ListEstudiantes = mo.getEstudiantes();
        for(int i=0 ;i < ListEstudiantes.size(); i++){
            IdEstudianteMonitor.addItem(new Estudiantes(ListEstudiantes.get(i).getIdestudiante(), ListEstudiantes.get(i).getNombre(), ListEstudiantes.get(i).getDireccion(), ListEstudiantes.get(i).getTel(), ListEstudiantes.get(i).getSex(), ListEstudiantes.get(i).getCorreo(), ListEstudiantes.get(i).getIdPrograma()));
        }

    }

    void JboxProfesorMatricula(){
        IdProfesorMatricula.removeAllItems();
        ArrayList<Profesores> ListProfesore = ma.getProfesores();
        for(int i=0 ;i < ListProfesore.size(); i++){
            IdProfesorMatricula.addItem(new Profesores(ListProfesore.get(i).getIdprofesor(), ListProfesore.get(i).getNombre(), ListProfesore.get(i).getTelefono(), ListProfesore.get(i).getCorreo(), ListProfesore.get(i).getSexo()));
        }

    }

    void JboxModuloMatricula(){
        IdModuloMatricula.removeAllItems();
        ArrayList<Modulos> ListModulos = ma.getModulos();
        for(int i=0 ;i < ListModulos.size(); i++){
            IdModuloMatricula.addItem(new Modulos(ListModulos.get(i).getIdmodulo(), ListModulos.get(i).getDescripcion(), ListModulos.get(i).getnrodecreditos(), ListModulos.get(i).getIdprograma()));
        }

    }

    void JboxEstudianteMatricula(){
        EstudianteMatricula.removeAllItems();
        ArrayList<Estudiantes> ListEstudiantes = ma.getEstudiantes();
        for(int i=0 ;i < ListEstudiantes.size(); i++){
            EstudianteMatricula.addItem(new Estudiantes(ListEstudiantes.get(i).getIdestudiante(), ListEstudiantes.get(i).getNombre(), ListEstudiantes.get(i).getDireccion(), ListEstudiantes.get(i).getTel(), ListEstudiantes.get(i).getSex(), ListEstudiantes.get(i).getCorreo(), ListEstudiantes.get(i).getIdPrograma()));
        }

    }

    void JboxProfesorImaparte(){
        IdProfeImparte.removeAllItems();
        ArrayList<Profesores> ListProfesore = im.getProfesores();
        for(int i=0 ;i < ListProfesore.size(); i++){
            IdProfeImparte.addItem(new Profesores(ListProfesore.get(i).getIdprofesor(), ListProfesore.get(i).getNombre(), ListProfesore.get(i).getTelefono(), ListProfesore.get(i).getCorreo(), ListProfesore.get(i).getSexo()));
        }

    }

    void JboxModuloImaparte(){
        IdModuloImapartir.removeAllItems();
        ArrayList<Modulos> ListModulos = im.getModulos();
        for(int i=0 ;i < ListModulos.size(); i++){
            IdModuloImapartir.addItem(new Modulos(ListModulos.get(i).getIdmodulo(), ListModulos.get(i).getDescripcion(), ListModulos.get(i).getnrodecreditos(), ListModulos.get(i).getIdprograma()));
        }

    }

    void JboxProgramaEstudiante(){
        JBoxIDPEstudiantes.removeAllItems();
        ArrayList<Programas> ListProgramas = est.getProgramas();
        for(int i=0 ;i < ListProgramas.size(); i++){
            JBoxIDPEstudiantes.addItem(new Programas(ListProgramas.get(i).getIdprograma(),ListProgramas.get(i).getDescripcion(),ListProgramas.get(i).getDuración()));
        }

    }

    void JboxProgramaModulo(){
        JCboxProgramaModulos.removeAllItems();
        ArrayList<Programas> ListProgramas = modu.getProgramas();
        for(int i=0 ;i < ListProgramas.size(); i++){
            JCboxProgramaModulos.addItem(new Programas(ListProgramas.get(i).getIdprograma(),ListProgramas.get(i).getDescripcion(),ListProgramas.get(i).getDuración()));
        }

    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if((IdEstudiante.getText().length()==0)||(NombreEstudiante.getText().length()==0)||(DireccionEstudiante.getText().length()==0)
                ||(mailEstudinate.getText().length()==0)){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los recuadros !!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(IdEstudiante.getText());
            String Nombre = NombreEstudiante.getText();
            String Direccion = DireccionEstudiante.getText();
            String Telefono = TelefonoEstudiante.getText();
            String sex = "";
            String Correo =  mailEstudinate.getText();
            //int IdPrograma = Integer.parseInt(IdprogramaEs.getText());
            int IdPrograma = JBoxIDPEstudiantes.getItemAt(JBoxIDPEstudiantes.getSelectedIndex()).getIdprograma();

            int selection = SexoEstudiante.getSelectedIndex();
            switch (selection){
                case 0 -> sex = "M";
                case 1 -> sex = "F";
                case 2 -> sex = "O";
            }
            est.InsertEstudiante(id, Nombre, Direccion, Telefono, sex, Correo, IdPrograma);
            mostrarEstudiante();
            JboxEstudianteMatricula();
            JboxEstudianteMonitor();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mailEstudinateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailEstudinateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailEstudinateActionPerformed

    private void IdEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdEstudianteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if((IdModulo.getText().length()==0)||(DescripcionModulo.getText().length()==0)||(nCreditosModulo.getText().length()==0)){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los recuadros!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            int idm = Integer.parseInt(IdModulo.getText());
            String Descripcion = DescripcionModulo.getText();
            int ncreditos = Integer.parseInt(nCreditosModulo.getText());
            int idPrograma = JCboxProgramaModulos.getItemAt(JCboxProgramaModulos.getSelectedIndex()).getIdprograma();

            modu.InsertModulo(idm, Descripcion, ncreditos, idPrograma);
            mostrarModulo();
            JboxModuloImaparte();
            JboxModuloMatricula();
            JboxModuloMonitor();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if((IdPrograma.getText().length()==0)||(descripPrograma.getText().length()==0)||(DuracionProg.getText().length()==0)){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los recuadros!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(IdPrograma.getText());
            String descrip = descripPrograma.getText();
            int dura = Integer.parseInt(DuracionProg.getText());

            prog.InsertProgram(id, descrip, dura);
            mostrarPrograma();
            JboxProgramaEstudiante();
            JboxProgramaModulo();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void GuardarProfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProfeActionPerformed

        if( (IdProfe.getText().length()==0)||(NombreProfe.getText().length()==0)||(TelProfe.getText().length()==0)
                ||(mailProfe.getText().length()==0)){
            JOptionPane.showMessageDialog(null,"Debe llenar todos los recuadros!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            int id = Integer.parseInt(IdProfe.getText());
            String nombre = NombreProfe.getText();
            String tel = TelProfe.getText();
            String mail = mailProfe.getText();
            String sex = "";
            int selection = SexProfe.getSelectedIndex();
            switch (selection){
                case 0 -> sex = "M";
                case 1 -> sex = "F";
                case 2 -> sex = "O";
            }
            pro.InsertPro(id, nombre, tel, mail, sex);
            mostrarProfesor();
            JboxProfesorImaparte();
            JboxProfesorMatricula();
            JboxProfesorMonitor();
        }

    }//GEN-LAST:event_GuardarProfeActionPerformed
    public void mostrarProfesor(){

        eliminartablaProfesor();

        DefaultTableModel modelo = pro.mostrarP();

        TablaProfesor.setModel(modelo);

    }

    public void mostrarPrograma(){

        eliminartablaPrograma();

        DefaultTableModel modelo = prog.mostrarPrograma();

        TablaPrograma.setModel(modelo);

    }

    public void mostrarModulo(){

        eliminartablaModulo();

        DefaultTableModel modelo = modu.mostrarModulo();

        TablaModulo.setModel(modelo);

    }
    public void mostrarEstudiante(){

        eliminartablaEstudiante();

        DefaultTableModel modelo = est.mostrarEstudiantes();

        TablaEstudiantes.setModel(modelo);

    }

    public void mostrarImparteModulo(){

        eliminartablaImparteModulo();

        DefaultTableModel modelo = im.mostrarImparteModulo();

        TablaImparteModulo.setModel(modelo);

    }

    public void mostrarMatricula(){

        eliminartablaMatricula();

        DefaultTableModel modelo = ma.mostrarMatricula();

        TablaMatricula.setModel(modelo);

    }

    public void mostrarMonitor(){

        eliminartablaMonitor();

        DefaultTableModel modelo = mo.mostrarMonitor();

        TablaMonitor.setModel(modelo);

    }

    public void mostrarBusquedas1(String descripcion){

        eliminartablaBsuquedas();

        DefaultTableModel modelo = bq.mostrarEstudiantesPrograma(descripcion) ;

        JTableBusquedas.setModel(modelo);

    }

    public void mostrarBusquedas2(String fecha){

        eliminartablaBsuquedas();

        DefaultTableModel modelo = bq.mostrarEstudiantesFechaMatricula(fecha) ;

        JTableBusquedas.setModel(modelo);

    }

    public void eliminartablaBsuquedas(){
        DefaultTableModel tb = (DefaultTableModel) JTableBusquedas.getModel();
        int a = JTableBusquedas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaMonitor(){
        DefaultTableModel tb = (DefaultTableModel) TablaMonitor.getModel();
        int a = TablaMonitor.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaMatricula(){
        DefaultTableModel tb = (DefaultTableModel) TablaMatricula.getModel();
        int a = TablaMatricula.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaImparteModulo(){
        DefaultTableModel tb = (DefaultTableModel) TablaImparteModulo.getModel();
        int a = TablaImparteModulo.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaEstudiante(){
        DefaultTableModel tb = (DefaultTableModel) TablaEstudiantes.getModel();
        int a = TablaEstudiantes.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaModulo(){
        DefaultTableModel tb = (DefaultTableModel) TablaModulo.getModel();
        int a = TablaModulo.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaPrograma(){
        DefaultTableModel tb = (DefaultTableModel) TablaPrograma.getModel();
        int a = TablaPrograma.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }

    public void eliminartablaProfesor(){
        DefaultTableModel tb = (DefaultTableModel) TablaProfesor.getModel();
        int a = TablaProfesor.getRowCount()-1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount()-1);
        }
    }
    //cargaTicket();




    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        int idm = IdModuloImapartir.getItemAt(IdModuloImapartir.getSelectedIndex()).getIdmodulo();
        int idp = IdProfeImparte.getItemAt(IdProfeImparte.getSelectedIndex()).getIdprofesor();
        Date fecha = new Date(FechaImparteModulo.getDate().getYear(), FechaImparteModulo.getDate().getMonth(), FechaImparteModulo.getDate().getDate());
        // TODO add your handling code here:
        im.InsertImparteModulo(idm, idp, fecha);
        mostrarImparteModulo();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int ide = EstudianteMatricula.getItemAt(EstudianteMatricula.getSelectedIndex()).getIdestudiante();
        int idm = IdModuloMatricula.getItemAt(IdModuloMatricula.getSelectedIndex()).getIdmodulo();
        int idp = IdProfesorMatricula.getItemAt(IdProfesorMatricula.getSelectedIndex()).getIdprofesor();
        Date fecha = new Date(FechaMatricula.getDate().getYear(), FechaMatricula.getDate().getMonth(), FechaMatricula.getDate().getDate());

        ma.InsertMatricula(ide, idm, idp, fecha);
        mostrarMatricula();
        JboxBusquedaPorFechaM();
        // Matricula
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int ide = IdEstudianteMonitor.getItemAt(IdEstudianteMonitor.getSelectedIndex()).getIdestudiante();
        int idm = IdModuloMonitor.getItemAt(IdModuloMonitor.getSelectedIndex()).getIdmodulo();
        int idp = IdProfesorMonitor.getItemAt(IdProfesorMonitor.getSelectedIndex()).getIdprofesor();
        Date fecha = new Date(FechaMonitor.getDate().getYear(), FechaMonitor.getDate().getMonth(), FechaMonitor.getDate().getDate());

        mo.InsertMonitor(ide, idm, idp, fecha);
        mostrarMonitor();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(IdProfe.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID !!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "RECUERDE PARA ELIMINAR SALO ES REQUERIDO EL ID!!  ", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            int id = Integer.parseInt(IdProfe.getText());
            pro.DeleteProfesor(id);
            mostrarProfesor();
        }
        JboxProfesorImaparte();
        JboxProfesorMatricula();
        JboxEstudianteMonitor();
        JboxProfesorMonitor();

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(IdPrograma.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID !!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "RECUERDE PARA ELIMINAR SALO ES REQUERIDO EL ID!!  ", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            int id = Integer.parseInt(IdPrograma.getText());
            prog.DeletePrograma(id);
            mostrarPrograma();
            JboxProgramaEstudiante();
            JboxProgramaModulo();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(IdEstudiante.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID!!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);JOptionPane.showMessageDialog(null,"Debe llenar el recuadro ID !!","INFORMACIÓN", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "RECUERDE PARA ELIMINAR SALO ES REQUERIDO EL ID!!  ", "INFORMACIÓN", JOptionPane.INFORMATION_MESSAGE);
            int id = Integer.parseInt(IdEstudiante.getText());
            est.DeleteEstudiante(id);
            mostrarEstudiante();
            JboxEstudianteMatricula();
            JboxEstudianteMonitor();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String descripcion = BusquedaPrograma.getItemAt(BusquedaPrograma.getSelectedIndex()).getDescripcion();
        mostrarBusquedas1(descripcion);
        //Mostrar Busqueda por Programa
    }//GEN-LAST:event_jButton10ActionPerformed

    private void BusquedaFechaMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaFechaMatriculaActionPerformed
        String fecha = JboxFechaMatricula.getItemAt(JboxFechaMatricula.getSelectedIndex()).getFecha();
        mostrarBusquedas2(fecha);
    }//GEN-LAST:event_BusquedaFechaMatriculaActionPerformed


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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BusquedaFechaMatricula;
    private javax.swing.JComboBox<Programas> BusquedaPrograma;
    private javax.swing.JTextField DescripcionModulo;
    private javax.swing.JTextField DireccionEstudiante;
    private javax.swing.JTextField DuracionProg;
    private javax.swing.JComboBox<Estudiantes> EstudianteMatricula;
    private com.toedter.calendar.JDateChooser FechaImparteModulo;
    private com.toedter.calendar.JDateChooser FechaMatricula;
    private com.toedter.calendar.JDateChooser FechaMonitor;
    private javax.swing.JButton GuardarProfe;
    private javax.swing.JTextField IdEstudiante;
    private javax.swing.JComboBox<Estudiantes> IdEstudianteMonitor;
    private javax.swing.JTextField IdModulo;
    private javax.swing.JComboBox<Modulos> IdModuloImapartir;
    private javax.swing.JComboBox<Modulos> IdModuloMatricula;
    private javax.swing.JComboBox<Modulos> IdModuloMonitor;
    private javax.swing.JTextField IdProfe;
    private javax.swing.JComboBox<Profesores> IdProfeImparte;
    private javax.swing.JComboBox<Profesores> IdProfesorMatricula;
    private javax.swing.JComboBox<Profesores> IdProfesorMonitor;
    private javax.swing.JTextField IdPrograma;
    private javax.swing.JComboBox<Programas> JBoxIDPEstudiantes;
    private javax.swing.JComboBox<Programas> JCboxProgramaModulos;
    private javax.swing.JTable JTableBusquedas;
    private javax.swing.JComboBox<Matricula> JboxFechaMatricula;
    private javax.swing.JTextField NombreEstudiante;
    private javax.swing.JTextField NombreProfe;
    private javax.swing.JComboBox<String> SexProfe;
    private javax.swing.JComboBox<String> SexoEstudiante;
    private javax.swing.JTable TablaEstudiantes;
    private javax.swing.JTable TablaImparteModulo;
    private javax.swing.JTable TablaMatricula;
    private javax.swing.JTable TablaModulo;
    private javax.swing.JTable TablaMonitor;
    private javax.swing.JTable TablaProfesor;
    private javax.swing.JTable TablaPrograma;
    private javax.swing.JTextField TelProfe;
    private javax.swing.JTextField TelefonoEstudiante;
    private javax.swing.JTextField descripPrograma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mailEstudinate;
    private javax.swing.JTextField mailProfe;
    private javax.swing.JTextField nCreditosModulo;
    // End of variables declaration//GEN-END:variables
}
