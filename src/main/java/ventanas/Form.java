package ventanas;

import clases.Conexion;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class Form extends javax.swing.JFrame {

    private JDateChooser jdcFechaNacimiento;
    private JDateChooser jdcFechaInicio;
    private JDateChooser jdcFechaFin;
    
    public Form() {
        initComponents();
        
        jdcFechaNacimiento = new JDateChooser();
        jdcFechaNacimiento.setBounds(135, 125, 77, 30); 
        jpnDatos1.add(jdcFechaNacimiento); 
        jpnDatos1.revalidate(); 
        jpnDatos1.repaint(); 
        
        jdcFechaInicio = new JDateChooser();
        jdcFechaInicio.setBounds(100, 5, 110, 30); 
        jpnContrato.add(jdcFechaInicio); 
        jdcFechaFin = new JDateChooser();
        jdcFechaFin.setBounds(100, 42, 110, 30); 
        jpnContrato.add(jdcFechaFin); 
        jpnContrato.revalidate(); 
        jpnContrato.repaint();
        
        cargarDatosEnTabla();
        tableEmpleados.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent event){
                if (!event.getValueIsAdjusting()){
                    cargarDatosSeleccionados();
                }
            }
        }); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jpnDatos1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboSexo = new javax.swing.JComboBox<>();
        jpnDatos2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroDocumento = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        rdbSoltero = new javax.swing.JRadioButton();
        rdbCasado = new javax.swing.JRadioButton();
        rdbViudo = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jpnDatos3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInformacionAdicional = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jpnDatos4 = new javax.swing.JPanel();
        chkComunicacion = new javax.swing.JCheckBox();
        chkAnalisis = new javax.swing.JCheckBox();
        chkTrabajoEquipo = new javax.swing.JCheckBox();
        chkResolucionProblemas = new javax.swing.JCheckBox();
        chkLiderazgo = new javax.swing.JCheckBox();
        chkAdaptabilidad = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jpnDatos5 = new javax.swing.JPanel();
        rdbActivo = new javax.swing.JRadioButton();
        rdbInactivo = new javax.swing.JRadioButton();
        rdbSuspendido = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jpnDatos6 = new javax.swing.JPanel();
        rdbEfectivo = new javax.swing.JRadioButton();
        rdbTransferencia = new javax.swing.JRadioButton();
        rdbCheque = new javax.swing.JRadioButton();
        jPanel10 = new javax.swing.JPanel();
        jpnDatos7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtUltimaEmpresa = new javax.swing.JTextField();
        cboAnosExperiencia = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jpnDatos8 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jpnContrato = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cboDepartamento = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestión de Empleados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(584, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 60));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del empleado:"));

        jpnDatos1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Dirección:");

        txtApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidosActionPerformed(evt);
            }
        });

        jLabel8.setText("Fecha de nacimiento:");

        jLabel11.setText("Correo electrónico:");

        jLabel12.setText("Sexo:");

        cboSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        javax.swing.GroupLayout jpnDatos1Layout = new javax.swing.GroupLayout(jpnDatos1);
        jpnDatos1.setLayout(jpnDatos1Layout);
        jpnDatos1Layout.setHorizontalGroup(
            jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDatos1Layout.createSequentialGroup()
                        .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo)
                            .addComponent(cboSexo, 0, 99, Short.MAX_VALUE)))
                    .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpnDatos1Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDireccion))
                        .addGroup(jpnDatos1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(13, 13, 13)
                            .addComponent(txtApellidos))
                        .addComponent(jLabel8)
                        .addGroup(jpnDatos1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jpnDatos1Layout.setVerticalGroup(
            jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cboSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpnDatos2.setBackground(new java.awt.Color(102, 102, 102));

        jLabel5.setText("Tipo de documento:");

        jLabel6.setText("N° de documento:");

        jLabel7.setText("Teléfono:");

        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "Pasaporte" }));

        jLabel17.setText("Estado civil:");

        buttonGroup2.add(rdbSoltero);
        rdbSoltero.setText("Soltero/a");

        buttonGroup2.add(rdbCasado);
        rdbCasado.setText("Casado/a");

        buttonGroup2.add(rdbViudo);
        rdbViudo.setText("Viudo/a");

        javax.swing.GroupLayout jpnDatos2Layout = new javax.swing.GroupLayout(jpnDatos2);
        jpnDatos2.setLayout(jpnDatos2Layout);
        jpnDatos2Layout.setHorizontalGroup(
            jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnDatos2Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(62, 62, 62)
                        .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rdbCasado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(rdbSoltero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdbViudo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpnDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(28, 28, 28)
                            .addComponent(txtNumeroDocumento))
                        .addGroup(jpnDatos2Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(cboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDatos2Layout.setVerticalGroup(
            jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(rdbSoltero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbCasado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbViudo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnDatos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnDatos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnDatos1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Información adicional:"));

        jpnDatos3.setBackground(new java.awt.Color(102, 102, 102));

        txtInformacionAdicional.setColumns(20);
        txtInformacionAdicional.setRows(5);
        jScrollPane2.setViewportView(txtInformacionAdicional);

        javax.swing.GroupLayout jpnDatos3Layout = new javax.swing.GroupLayout(jpnDatos3);
        jpnDatos3.setLayout(jpnDatos3Layout);
        jpnDatos3Layout.setHorizontalGroup(
            jpnDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jpnDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpnDatos3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpnDatos3Layout.setVerticalGroup(
            jpnDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 74, Short.MAX_VALUE)
            .addGroup(jpnDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDatos3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Habilidades:"));

        jpnDatos4.setBackground(new java.awt.Color(102, 102, 102));

        chkComunicacion.setText("Comunicación");

        chkAnalisis.setText("Análisis");

        chkTrabajoEquipo.setText("Trabajo en equipo");

        chkResolucionProblemas.setText("Resolución de problemas");

        chkLiderazgo.setText("Liderazgo");

        chkAdaptabilidad.setText("Adaptabilidad");

        javax.swing.GroupLayout jpnDatos4Layout = new javax.swing.GroupLayout(jpnDatos4);
        jpnDatos4.setLayout(jpnDatos4Layout);
        jpnDatos4Layout.setHorizontalGroup(
            jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkComunicacion)
                    .addComponent(chkResolucionProblemas))
                .addGap(28, 28, 28)
                .addGroup(jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkAnalisis)
                    .addComponent(chkLiderazgo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkTrabajoEquipo)
                    .addComponent(chkAdaptabilidad))
                .addContainerGap())
        );
        jpnDatos4Layout.setVerticalGroup(
            jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkComunicacion)
                    .addComponent(chkAnalisis)
                    .addComponent(chkTrabajoEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnDatos4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkResolucionProblemas)
                    .addComponent(chkLiderazgo)
                    .addComponent(chkAdaptabilidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del empleado:"));

        jpnDatos5.setBackground(new java.awt.Color(102, 102, 102));

        buttonGroup1.add(rdbActivo);
        rdbActivo.setText("Activo");
        rdbActivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbActivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbInactivo);
        rdbInactivo.setText("Inactivo");

        buttonGroup1.add(rdbSuspendido);
        rdbSuspendido.setText("Suspendido/a");

        javax.swing.GroupLayout jpnDatos5Layout = new javax.swing.GroupLayout(jpnDatos5);
        jpnDatos5.setLayout(jpnDatos5Layout);
        jpnDatos5Layout.setHorizontalGroup(
            jpnDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbActivo)
                .addGap(18, 18, 18)
                .addComponent(rdbInactivo)
                .addGap(18, 18, 18)
                .addComponent(rdbSuspendido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDatos5Layout.setVerticalGroup(
            jpnDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbActivo)
                    .addComponent(rdbInactivo)
                    .addComponent(rdbSuspendido))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Método de pago:"));

        jpnDatos6.setBackground(new java.awt.Color(102, 102, 102));

        buttonGroup3.add(rdbEfectivo);
        rdbEfectivo.setText("Efectivo");

        buttonGroup3.add(rdbTransferencia);
        rdbTransferencia.setText("Transferencia");

        buttonGroup3.add(rdbCheque);
        rdbCheque.setText("Cheque");

        javax.swing.GroupLayout jpnDatos6Layout = new javax.swing.GroupLayout(jpnDatos6);
        jpnDatos6.setLayout(jpnDatos6Layout);
        jpnDatos6Layout.setHorizontalGroup(
            jpnDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbEfectivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbTransferencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdbCheque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDatos6Layout.setVerticalGroup(
            jpnDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbEfectivo)
                    .addComponent(rdbTransferencia)
                    .addComponent(rdbCheque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Experiencia laboral:"));

        jpnDatos7.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setText("Última empresa:");

        jLabel10.setText("Años de experiencia:");

        cboAnosExperiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        javax.swing.GroupLayout jpnDatos7Layout = new javax.swing.GroupLayout(jpnDatos7);
        jpnDatos7.setLayout(jpnDatos7Layout);
        jpnDatos7Layout.setHorizontalGroup(
            jpnDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltimaEmpresa)
                    .addGroup(jpnDatos7Layout.createSequentialGroup()
                        .addGroup(jpnDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboAnosExperiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnDatos7Layout.setVerticalGroup(
            jpnDatos7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUltimaEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboAnosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones:"));

        jpnDatos8.setBackground(new java.awt.Color(102, 102, 102));

        btnGuardar.setBackground(new java.awt.Color(153, 255, 153));
        btnGuardar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pietro\\Desktop\\JOSE TAREAS APUNTES\\Semestre 5\\3. TAREAS - SEMINARIO DE COMPLEMENTACIÓN PRÁCTICA II\\Tareas\\TAREA T13\\T13-Empleados\\src\\main\\java\\ventanas\\Imagenes\\save.png")); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("");
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(255, 204, 102));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pietro\\Desktop\\JOSE TAREAS APUNTES\\Semestre 5\\3. TAREAS - SEMINARIO DE COMPLEMENTACIÓN PRÁCTICA II\\Tareas\\TAREA T13\\T13-Empleados\\src\\main\\java\\ventanas\\Imagenes\\Edit.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Pietro\\Desktop\\JOSE TAREAS APUNTES\\Semestre 5\\3. TAREAS - SEMINARIO DE COMPLEMENTACIÓN PRÁCTICA II\\Tareas\\TAREA T13\\T13-Empleados\\src\\main\\java\\ventanas\\Imagenes\\eliminar.png")); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("");
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnDatos8Layout = new javax.swing.GroupLayout(jpnDatos8);
        jpnDatos8.setLayout(jpnDatos8Layout);
        jpnDatos8Layout.setHorizontalGroup(
            jpnDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnDatos8Layout.setVerticalGroup(
            jpnDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDatos8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnDatos8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnDatos8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del contrato:"));

        jpnContrato.setBackground(new java.awt.Color(102, 102, 102));

        jLabel13.setText("Fecha de inicio:");

        jLabel14.setText("Fecha de fin:");

        jLabel15.setText("Salario:");

        jLabel16.setText("Cargo:");

        jLabel18.setText("Departamento:");

        cboDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Innovación y Desarrollo", "Sostenibilidad", "Experiencia del Cliente", "Comunicación Interna", "Análisis de Datos", "Recursos Humanos ", "Tecnología de la Información (TI) y Ciberseguridad", "Marketing Digital y Contenidos", "Capacitación y Desarrollo Profesional", "Responsabilidad Social Empresarial (RSE)" }));

        javax.swing.GroupLayout jpnContratoLayout = new javax.swing.GroupLayout(jpnContrato);
        jpnContrato.setLayout(jpnContratoLayout);
        jpnContratoLayout.setHorizontalGroup(
            jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(153, 153, 153)
                .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtSalario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(txtCargo, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnContratoLayout.setVerticalGroup(
            jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel18)
                    .addComponent(cboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jpnContratoLayout.createSequentialGroup()
                        .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, 1160));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Empleado", "Correo", "Teléfono", "Salario"
            }
        ));
        jScrollPane4.setViewportView(tableEmpleados);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(745, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 360, 1160));

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1317, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDatosSeleccionados(){
        int selectedRow = tableEmpleados.getSelectedRow();
        if (selectedRow != -1){
            int idEmpleado = (int) tableEmpleados.getValueAt(selectedRow, 0);
            String sql = "SELECT * FROM empleado WHERE idEmpleado = ?";
            
            try(Connection con = Conexion.getConexion();
                PreparedStatement pst = con.prepareStatement(sql);){
                
                pst.setInt(1, idEmpleado); //Acá se ejecutó la sentencia
                
                try(ResultSet rs = pst.executeQuery()){
                    if(rs.next()){
                        txtNombres.setText(rs.getString("nombres"));
                        txtApellidos.setText(rs.getString("apellidos"));
                        txtDireccion.setText(rs.getString("direccion"));
                        jdcFechaNacimiento.setDate(rs.getDate("fechaNacimiento"));
                        txtCorreo.setText(rs.getString("correo"));
                        cboSexo.setSelectedItem(rs.getString("sexo")); 
                        cboTipoDocumento.setSelectedItem(rs.getString("tipoDocumento"));
                        txtNumeroDocumento.setText(rs.getString("numeroDocumento"));
                        txtTelefono.setText(rs.getString("telefono"));
                        
                        String estadoCivil = rs.getString("estadoCivil");
                        if (estadoCivil.equals("Soltero")) {
                            rdbSoltero.setSelected(true);
                        } else if (estadoCivil.equals("Casado")) {
                            rdbCasado.setSelected(true);
                        } else if (estadoCivil.equals("Viudo")) {
                            rdbViudo.setSelected(true);
                        }

                        txtInformacionAdicional.setText(rs.getString("informacionAdicional"));
                        jdcFechaInicio.setDate(rs.getDate("fechaInicio"));
                        jdcFechaFin.setDate(rs.getDate("fechaFin"));
                        cboDepartamento.setSelectedItem(rs.getString("departamento"));
                        txtSalario.setText(rs.getString("salario"));
                        txtCargo.setText(rs.getString("cargo"));

                        String estadoLaboral = rs.getString("estadoLaboral");
                        if (estadoLaboral.equals("Activo")) {
                            rdbActivo.setSelected(true);
                        } else if (estadoLaboral.equals("Inactivo")) {
                            rdbInactivo.setSelected(true);
                        } else if (estadoLaboral.equals("Suspendido")) {
                            rdbSuspendido.setSelected(true);
                        }

                        String metodoPago = rs.getString("metodoPago");
                        if (metodoPago.equals("Efectivo")) {
                            rdbEfectivo.setSelected(true);
                        } else if (metodoPago.equals("Transferencia")) {
                            rdbTransferencia.setSelected(true);
                        } else if (metodoPago.equals("Cheque")) {
                            rdbCheque.setSelected(true);
                        }

                        txtUltimaEmpresa.setText(rs.getString("ultimaEmpresa"));
                        cboAnosExperiencia.setSelectedItem(rs.getString("anosExperiencia"));

                        chkComunicacion.setSelected(rs.getBoolean("comunicacion"));
                        chkAnalisis.setSelected(rs.getBoolean("analisis"));
                        chkTrabajoEquipo.setSelected(rs.getBoolean("trabajoEquipo"));
                        chkResolucionProblemas.setSelected(rs.getBoolean("resolucionProblemas"));
                        chkLiderazgo.setSelected(rs.getBoolean("liderazgo"));
                        chkAdaptabilidad.setSelected(rs.getBoolean("adaptabilidad"));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los datos completos: " + e.getMessage());
            }
        }
    }
    
    private void actualizarDatos() {
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        
        int selectedRow = tableEmpleados.getSelectedRow();
        int idEmpleado = (int) tableEmpleados.getValueAt(selectedRow, 0);

        String sql = "UPDATE Empleado SET nombres = ?, apellidos = ?, correo = ?, telefono = ?, salario = ? WHERE idEmpleado = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setString(1, nombres);
            pst.setString(2, apellidos);
            pst.setString(3, correo);
            pst.setString(4, telefono);
            pst.setDouble(5, salario);
            pst.setInt(6, idEmpleado);

            pst.executeUpdate();
            System.out.println("Datos actualizados correctamente.");
            
            cargarDatosEnTabla();

        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al actualizar los datos: " + e.getMessage());
        }
    }
    
    private void rdbActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbActivoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        actualizarDatos();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tableEmpleados.getSelectedRow();
        
        if (selectedRow != -1){
            int idEmpleado = (int) tableEmpleados.getValueAt(selectedRow, 0);
            int confirmacion = JOptionPane.showConfirmDialog(this, 
                "¿Estás seguro de que deseas eliminar este registro?", 
                "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            
            if (confirmacion == JOptionPane.YES_OPTION) {
                eliminarRegistro(idEmpleado);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un registro para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void guardarDatos() {
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String direccion = txtDireccion.getText();
        java.util.Date fechaNacimiento = jdcFechaNacimiento.getDate();
        String correo = txtCorreo.getText();
        String sexo = (String) cboSexo.getSelectedItem();
        String tipoDocumento = (String) cboTipoDocumento.getSelectedItem();
        String numeroDocumento = txtNumeroDocumento.getText();
        String telefono = txtTelefono.getText();
        String estadoCivil = getEstadoCivil();
        String informacionAdicional = txtInformacionAdicional.getText();
        java.util.Date fechaInicio = jdcFechaInicio.getDate();
        java.util.Date fechaFin = jdcFechaFin.getDate();
        String departamento = (String) cboDepartamento.getSelectedItem();
        double salario = Double.parseDouble(txtSalario.getText());
        String cargo = txtCargo.getText();
        String estadoLaboral = getEstadoLaboral(); 
        String metodoPago = getMetodoPago(); 
        String ultimaEmpresa = txtUltimaEmpresa.getText();
        int anosExperiencia = Integer.parseInt((String) cboAnosExperiencia.getSelectedItem());

        boolean comunicacion = chkComunicacion.isSelected();
        boolean analisis = chkAnalisis.isSelected();
        boolean trabajoEquipo = chkTrabajoEquipo.isSelected();
        boolean resolucionProblemas = chkResolucionProblemas.isSelected();
        boolean liderazgo = chkLiderazgo.isSelected();
        boolean adaptabilidad = chkAdaptabilidad.isSelected();

        java.sql.Date sqlFechaNacimiento = new java.sql.Date(fechaNacimiento.getTime());
        java.sql.Date sqlFechaInicio = new java.sql.Date(fechaInicio.getTime());
        java.sql.Date sqlFechaFin = new java.sql.Date(fechaFin.getTime());

        Connection con = Conexion.getConexion();
        String sql = "INSERT INTO Empleado (nombres, apellidos, direccion, fechaNacimiento, correo, sexo, tipoDocumento, numeroDocumento, telefono, estadoCivil, informacionAdicional, fechaInicio, fechaFin, departamento, salario, cargo, estadoLaboral, metodoPago, ultimaEmpresa, anosExperiencia, comunicacion, analisis, trabajoEquipo, resolucionProblemas, liderazgo, adaptabilidad) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, nombres);
            pst.setString(2, apellidos);
            pst.setString(3, direccion);
            pst.setDate(4, sqlFechaNacimiento);
            pst.setString(5, correo);
            pst.setString(6,sexo); 
            pst.setString(7, tipoDocumento); 
            pst.setString(8, numeroDocumento);
            pst.setString(9, telefono);
            pst.setString(10, estadoCivil);
            pst.setString(11, informacionAdicional);
            pst.setDate(12, sqlFechaInicio);
            pst.setDate(13, sqlFechaFin);
            pst.setString(14, departamento); 
            pst.setDouble(15, salario);
            pst.setString(16, cargo);
            pst.setString(17, estadoLaboral);
            pst.setString(18, metodoPago);
            pst.setString(19, ultimaEmpresa);
            pst.setInt(20, anosExperiencia);
            pst.setBoolean(21, comunicacion);
            pst.setBoolean(22, analisis);
            pst.setBoolean(23, trabajoEquipo);
            pst.setBoolean(24, resolucionProblemas);
            pst.setBoolean(25, liderazgo);
            pst.setBoolean(26, adaptabilidad);

            pst.executeUpdate();
            System.out.println("Datos guardados correctamente.");
             cargarDatosEnTabla();
        } catch (Exception e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            Conexion.cerrarConexion(); 
        }
    }
    
    private String getEstadoCivil() {
        if (rdbSoltero.isSelected()) {
            return "Soltero";
        } else if (rdbCasado.isSelected()) {
            return "Casado";
        } else if (rdbViudo.isSelected()) {
            return "Viudo";
        }
        return null;
    }

    private String getEstadoLaboral() {
        if (rdbActivo.isSelected()) {
            return "Activo";
        } else if (rdbInactivo.isSelected()) {
            return "Inactivo";
        } else if (rdbSuspendido.isSelected()) {
            return "Suspendido";
        }
        return null;
    }

    private String getMetodoPago() {
        if (rdbEfectivo.isSelected()) {
            return "Efectivo";
        } else if (rdbTransferencia.isSelected()) {
            return "Transferencia";
        } else if (rdbCheque.isSelected()) {
            return "Cheque";
        }
        return null;
    }

    private void cargarDatosEnTabla() {
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        model.setRowCount(0); //Limpiar 

        String sql = "SELECT idEmpleado, nombres, apellidos, correo, telefono, salario FROM Empleado";

        try (Connection con = Conexion.getConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql)) {
            
            while (rs.next()) {
                String nombreCompleto = rs.getString("nombres") + " " + rs.getString("apellidos");
                Object[] fila = {
                    rs.getInt("idEmpleado"),
                    nombreCompleto,
                    rs.getString("correo"),
                    rs.getString("telefono"),
                    rs.getDouble("salario")
                };
                model.addRow(fila);
            }
        } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar los datos: " + e.getMessage());
        }
    }
    
    private void eliminarRegistro(int idEmpleado) {
        String sql = "DELETE FROM Empleado WHERE idEmpleado = ?";

        try (Connection con = Conexion.getConexion();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, idEmpleado);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.");
                cargarDatosEnTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo eliminar el registro.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al eliminar el registro: " + e.getMessage());
        }
    }

    
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboAnosExperiencia;
    private javax.swing.JComboBox<String> cboDepartamento;
    private javax.swing.JComboBox<String> cboSexo;
    private javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.JCheckBox chkAdaptabilidad;
    private javax.swing.JCheckBox chkAnalisis;
    private javax.swing.JCheckBox chkComunicacion;
    private javax.swing.JCheckBox chkLiderazgo;
    private javax.swing.JCheckBox chkResolucionProblemas;
    private javax.swing.JCheckBox chkTrabajoEquipo;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel jpnContrato;
    private javax.swing.JPanel jpnDatos1;
    private javax.swing.JPanel jpnDatos2;
    private javax.swing.JPanel jpnDatos3;
    private javax.swing.JPanel jpnDatos4;
    private javax.swing.JPanel jpnDatos5;
    private javax.swing.JPanel jpnDatos6;
    private javax.swing.JPanel jpnDatos7;
    private javax.swing.JPanel jpnDatos8;
    private javax.swing.JRadioButton rdbActivo;
    private javax.swing.JRadioButton rdbCasado;
    private javax.swing.JRadioButton rdbCheque;
    private javax.swing.JRadioButton rdbEfectivo;
    private javax.swing.JRadioButton rdbInactivo;
    private javax.swing.JRadioButton rdbSoltero;
    private javax.swing.JRadioButton rdbSuspendido;
    private javax.swing.JRadioButton rdbTransferencia;
    private javax.swing.JRadioButton rdbViudo;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtInformacionAdicional;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUltimaEmpresa;
    // End of variables declaration//GEN-END:variables
}
