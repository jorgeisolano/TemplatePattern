package co.unicauca.travelagency.client.presentation;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static co.unicauca.travelagency.client.infra.Messages.warningMessage;
import static co.unicauca.travelagency.client.infra.Messages.confirmMessage;

/**
 *
 * @author libardo Para que las celdas del jTable no sean editables, se usó este
 * tutorial: http://www.elprogramador.com.mx/celdas-no-editables-en-jtable/
 */
public class GUICustomizerPackage extends javax.swing.JInternalFrame {
    
    private static GUICustomizerPackage ins = null;
    
    public static GUICustomizerPackage getInstancia(){
        if (ins == null){
            ins = new GUICustomizerPackage();
        }
        return ins;
    }
    
    /**
     * Constructor
     */
    private GUICustomizerPackage() {
        initComponents();
        //inicializarTabla();
        inicializarFechas();
        this.setSize(790, 580);
        //btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("./recursos/agregar.png"))); // NOI18N

    }

    private void inicializarFechas() {


    }

    private void inicializarTabla() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlNorte = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cboCiudad = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaLLegada = new javax.swing.JFormattedTextField();
        pnlSur = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        tabPrincipal = new javax.swing.JTabbedPane();
        pnlPestaniaPaquete = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lstRegion = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        lstCiudad = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        lstPais = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaquetes = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlPestaniaFactura = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Paquetes Personalizados");
        setPreferredSize(new java.awt.Dimension(790, 580));

        pnlNorte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Ciudad Salida");
        pnlNorte.add(jLabel3);

        cboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Popayán", "Cali", "Pasto" }));
        pnlNorte.add(cboCiudad);

        jLabel1.setText("Fecha Salida (dd/mmaaaa):");
        pnlNorte.add(jLabel1);

        txtFechaSalida.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        txtFechaSalida.setToolTipText("");
        txtFechaSalida.setPreferredSize(new java.awt.Dimension(100, 32));
        pnlNorte.add(txtFechaSalida);

        jLabel2.setText("Fecha LLegada  (dd/mmaaaa):");
        pnlNorte.add(jLabel2);

        txtFechaLLegada.setPreferredSize(new java.awt.Dimension(100, 32));
        pnlNorte.add(txtFechaLLegada);

        getContentPane().add(pnlNorte, java.awt.BorderLayout.NORTH);

        pnlSur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/grabar.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });
        pnlSur.add(btnGrabar);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cerrar.png"))); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSur.add(btnCerrar);

        getContentPane().add(pnlSur, java.awt.BorderLayout.SOUTH);

        pnlPestaniaPaquete.setLayout(new java.awt.GridBagLayout());

        jLabel11.setText("Region");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 12, 0, 0);
        pnlPestaniaPaquete.add(jLabel11, gridBagConstraints);

        jLabel12.setText("Ciudad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 28, 0, 0);
        pnlPestaniaPaquete.add(jLabel12, gridBagConstraints);

        jLabel13.setText("Pais");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 28, 0, 0);
        pnlPestaniaPaquete.add(jLabel13, gridBagConstraints);

        lstRegion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Caribe", "Centro América", "Europa", "Tierra Santa", "Norte de Africa", "Asia" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstRegionMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(lstRegion);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.ipady = 173;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 12, 0, 0);
        pnlPestaniaPaquete.add(jScrollPane8, gridBagConstraints);

        jScrollPane9.setViewportView(lstCiudad);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 173;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        pnlPestaniaPaquete.add(jScrollPane9, gridBagConstraints);

        lstPais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPaisMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(lstPais);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 127;
        gridBagConstraints.ipady = 173;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        pnlPestaniaPaquete.add(jScrollPane10, gridBagConstraints);

        tblPaquetes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Región", "País", "Ciudad", "Vuelos", "Hotel", "FechaHoraSal", "FechaHoraLleg", "Valor Vuelos por persona", "Valor Hotel por persona"
            }
        ));
        jScrollPane1.setViewportView(tblPaquetes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 677;
        gridBagConstraints.ipady = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 12, 12, 0);
        pnlPestaniaPaquete.add(jScrollPane1, gridBagConstraints);

        btnAgregar.setToolTipText("Agregar Ciudad");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        pnlPestaniaPaquete.add(btnAgregar, gridBagConstraints);

        btnEliminar.setToolTipText("Eliminar Ciudad");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(61, 6, 0, 12);
        pnlPestaniaPaquete.add(btnEliminar, gridBagConstraints);

        tabPrincipal.addTab("Paquete", pnlPestaniaPaquete);
        tabPrincipal.addTab("Factura", pnlPestaniaFactura);

        getContentPane().add(tabPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if (lstCiudad.getSelectedIndex() == -1){
            warningMessage("Debe seleccionar primero una región, país y ciudad", "Atención");
            return;
        }
        GUIAddCityDialogDialog nuevaCiudad = new GUIAddCityDialogDialog(null, true);
        nuevaCiudad.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) tblPaquetes.getModel();
        model.addRow(new String[]{
            "Caribe", "Colombia", "San Andres", "AVC-1243, AVC-2345, SAT-6512, AVC-9823", "Sol Caribe San Andrés", "12-07-2019 7:30", "12-09-2019 14:00", "$1'600.500", "$120.000"
        });

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (tblPaquetes.getSelectedRow() == -1) {   
            warningMessage("Debe seleccionar una fila de la tabla paquetes", "Atención");
            return;
        }
        if (confirmMessage("Está seguro de eliminar paquete?", "Atención") == JOptionPane.YES_OPTION) {
            DefaultTableModel model = (DefaultTableModel) tblPaquetes.getModel();
            model.removeRow(tblPaquetes.getSelectedRow());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void lstRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstRegionMouseClicked
        // TODO add your handling code here:
        String region = lstRegion.getSelectedValue();
        DefaultListModel modelo;
        switch (region) {
            case "Caribe":
                modelo = new DefaultListModel();
                modelo.addElement("Colombia");
                modelo.addElement("Panamá");
                modelo.addElement("Costa Rica");
                lstPais.setModel(modelo);
                break;
            case "Europa":
                modelo = new DefaultListModel();
                modelo.addElement("España");
                modelo.addElement("Francia");
                modelo.addElement("Italia");
                lstPais.setModel(modelo);
                break;
            case "Centro América":
                modelo = new DefaultListModel();
                modelo.addElement("Costa Rica");
                modelo.addElement("Guatemala");
                modelo.addElement("México");
                modelo.addElement("Panamá");
                lstPais.setModel(modelo);
                break;
            default:
                modelo = new DefaultListModel();
                lstPais.setModel(modelo);
        }
    }//GEN-LAST:event_lstRegionMouseClicked

    private void lstPaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPaisMouseClicked
        // TODO add your handling code here:
        String pais = lstPais.getSelectedValue();
        DefaultListModel modelo;
        switch (pais) {
            case "Colombia":
                modelo = new DefaultListModel();
                modelo.addElement("San Andrés");
                modelo.addElement("Cartagena");
                modelo.addElement("Santa Marta");
                lstCiudad.setModel(modelo);
                break;
            case "España":
                modelo = new DefaultListModel();
                modelo.addElement("Albacete");
                modelo.addElement("Madrid");
                modelo.addElement("Valencia");
                lstCiudad.setModel(modelo);
                break;
            case "Costa Rica":
                modelo = new DefaultListModel();
                modelo.addElement("Cartago");
                modelo.addElement("Golfito");
                modelo.addElement("San Jose");

                lstCiudad.setModel(modelo);
                break;
            default:
                modelo = new DefaultListModel();
                lstCiudad.setModel(modelo);
        }
    }//GEN-LAST:event_lstPaisMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox<String> cboCiudad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JList<String> lstCiudad;
    private javax.swing.JList<String> lstPais;
    private javax.swing.JList<String> lstRegion;
    private javax.swing.JPanel pnlNorte;
    private javax.swing.JPanel pnlPestaniaFactura;
    private javax.swing.JPanel pnlPestaniaPaquete;
    private javax.swing.JPanel pnlSur;
    private javax.swing.JTabbedPane tabPrincipal;
    private javax.swing.JTable tblPaquetes;
    private javax.swing.JFormattedTextField txtFechaLLegada;
    private javax.swing.JFormattedTextField txtFechaSalida;
    // End of variables declaration//GEN-END:variables
}
