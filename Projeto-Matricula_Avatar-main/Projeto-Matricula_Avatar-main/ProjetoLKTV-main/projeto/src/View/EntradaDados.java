package View;

import java.awt.Color;
import java.sql.SQLException;
import model.bean.Aluno;
import model.dao.AlunoDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import model.bean.Deficiencia;
import model.dao.DeficienciaDAO;

public class EntradaDados extends javax.swing.JFrame {

    private final Border bordaPadrao = new JTextField().getBorder(); //Configuração da borda padrão.
    private final Border bordaErro = BorderFactory.createLineBorder(Color.RED, 3); //Configuração para a borda vermelha de 3 pixels, caso tenha erro.

    public EntradaDados() {
        initComponents();
        setLocationRelativeTo(null);
        txtdeficiencia.setVisible(false);
        txtnomesocial.setVisible(false);
        carregarDeficiencias();

    }

    private void carregarDeficiencias() {
        txtdeficiencia.removeAllItems();
        txtdeficiencia.addItem("Auditiva");
        txtdeficiencia.addItem("Visual");
        txtdeficiencia.addItem("Física");
        txtdeficiencia.addItem("Intelectual");
    }

    private void limparCampos() {
        txtnome.setText("");
        txtcpfaluno.setText("");
        txtemail.setText("");
        txtnomesocial.setText("");
        txtendereco.setText("");
        txttelefone.setText("");
        txtnomeresp.setText("");
        txttelefoneresp.setText("");
        txtcpfresp.setText("");
        txtnascimento.setText("");

        // Limpa os radio buttons
        rbtnsimdef.setSelected(false);
        rbtnnaodef.setSelected(false);
        rbtnsimnome.setSelected(false);
        rbtnnaonome.setSelected(false);

        // Limpa o combo de deficiência → volta para "Nenhuma"
        txtdeficiencia.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        btngtipodef = new javax.swing.ButtonGroup();
        btngnomesocial = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnsair = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnascimento = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtendereco = new javax.swing.JTextField();
        txtcpfaluno = new javax.swing.JFormattedTextField();
        txttelefone = new javax.swing.JFormattedTextField();
        txtnomeresp = new javax.swing.JTextField();
        txttelefoneresp = new javax.swing.JFormattedTextField();
        txtcpfresp = new javax.swing.JFormattedTextField();
        rbtnsimnome = new javax.swing.JRadioButton();
        rbtnnaonome = new javax.swing.JRadioButton();
        rbtnsimdef = new javax.swing.JRadioButton();
        rbtnnaodef = new javax.swing.JRadioButton();
        txtdeficiencia = new javax.swing.JComboBox();
        txtnomesocial = new javax.swing.JTextField();
        rbnti = new javax.swing.JRadioButton();
        rbnteletro = new javax.swing.JRadioButton();
        btnconsultar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(7, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnsair.setBackground(new java.awt.Color(3, 3, 51));
        btnsair.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnsair.setForeground(new java.awt.Color(255, 255, 255));
        btnsair.setText("SAIR");
        btnsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsairActionPerformed(evt);
            }
        });
        jPanel1.add(btnsair, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 120, 30));

        btnsalvar.setBackground(new java.awt.Color(3, 3, 51));
        btnsalvar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnsalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnsalvar.setText("SALVAR");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 120, 30));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CADASTRO DO ALUNO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 290, 20));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 96, -1));
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 530, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Curso:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 68, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data De Nascimento:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 138, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email do Aluno:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 112, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tem Nome Social?");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 121, -1));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tem Algum Tipo de Deficiencia?");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, 20));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Telefone: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 71, -1));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome do Responsável:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 191, -1));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CPF do Responsável:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 158, -1));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone do Responsável:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Endereço:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 88, -1));

        try {
            txtnascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtnascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnascimentoActionPerformed(evt);
            }
        });
        jPanel1.add(txtnascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 140, 30));

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CPF do Aluno:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 97, -1));
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 530, 30));
        jPanel1.add(txtendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 530, 30));

        try {
            txtcpfaluno.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtcpfaluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 160, 30));

        try {
            txttelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 140, 30));
        jPanel1.add(txtnomeresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 530, 30));

        try {
            txttelefoneresp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txttelefoneresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 140, 30));

        try {
            txtcpfresp.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(txtcpfresp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 140, 30));

        btngnomesocial.add(rbtnsimnome);
        rbtnsimnome.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbtnsimnome.setForeground(new java.awt.Color(255, 255, 255));
        rbtnsimnome.setText("Sim");
        rbtnsimnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnsimnomeActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnsimnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, -1, -1));

        btngnomesocial.add(rbtnnaonome);
        rbtnnaonome.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbtnnaonome.setForeground(new java.awt.Color(255, 255, 255));
        rbtnnaonome.setText("Não");
        rbtnnaonome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnnaonomeActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnnaonome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, -1, -1));

        btngtipodef.add(rbtnsimdef);
        rbtnsimdef.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbtnsimdef.setForeground(new java.awt.Color(255, 255, 255));
        rbtnsimdef.setText("Sim");
        rbtnsimdef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnsimdefActionPerformed(evt);
            }
        });
        jPanel1.add(rbtnsimdef, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, -1, -1));

        btngtipodef.add(rbtnnaodef);
        rbtnnaodef.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbtnnaodef.setForeground(new java.awt.Color(255, 255, 255));
        rbtnnaodef.setText("Não");
        jPanel1.add(rbtnnaodef, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        txtdeficiencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(txtdeficiencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 200, -1));
        jPanel1.add(txtnomesocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 530, 30));

        rbnti.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbnti.setForeground(new java.awt.Color(255, 255, 255));
        rbnti.setText("Técnico em Informática");
        jPanel1.add(rbnti, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        rbnteletro.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        rbnteletro.setForeground(new java.awt.Color(255, 255, 255));
        rbnteletro.setText("Técnico em Eletrotécnica");
        rbnteletro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbnteletroActionPerformed(evt);
            }
        });
        jPanel1.add(rbnteletro, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, -1, -1));

        btnconsultar.setBackground(new java.awt.Color(3, 3, 51));
        btnconsultar.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        btnconsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        jPanel1.add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 150, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\laila\\Downloads\\WhatsApp Image 2025-11-30 at 12.53.38.jpeg")); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, -200, 1090, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowGainedFocus

    private void btnsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnsairActionPerformed


    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
//Resetar bordas configuradas para a padrão
        txtnome.setBorder(bordaPadrao);
        txtcpfaluno.setBorder(bordaPadrao);
        txtemail.setBorder(bordaPadrao);
        txtendereco.setBorder(bordaPadrao);
        txttelefone.setBorder(bordaPadrao);

        if (txtnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do aluno é obrigatório.");
            txtnome.setBorder(bordaErro);
            return;
        }

        if (txtcpfaluno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF do aluno é obrigatório.");
            return;
        }

        if (txtemail.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O e-mail do aluno é obrigatório.");
            return;
        }

        if (txtendereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O endereço do aluno é obrigatório.");
            return;
        }

        if (txttelefone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do aluno é obrigatório.");
            return;
        }

        if (txtnomeresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome do responsável é obrigatório.");
            return;
        }

        if (txttelefoneresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O telefone do responsável é obrigatório.");
            return;
        }

        if (txtcpfresp.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O CPF do responsável é obrigatório.");
            return;
        }

        try {
            Aluno aluno = new Aluno();
            AlunoDAO adao = new AlunoDAO();

            aluno.setNomealuno(txtnome.getText());
            aluno.setCpfaluno(txtcpfaluno.getText().replaceAll("\\D", ""));
            aluno.setEmail_aluno(txtemail.getText());
            aluno.setEnderecoaluno(txtendereco.getText());

            // Remove máscara do telefone
            aluno.setTelefonealuno(txttelefone.getText().replaceAll("\\D", ""));
            aluno.setNomeresponsavel(txtnomeresp.getText());
            aluno.setTelefoneresponsavel(txttelefoneresp.getText().replaceAll("\\D", ""));
            aluno.setCpfresponsavel(txtcpfresp.getText().replaceAll("\\D", ""));

            // Nome social
            if (txtnomesocial.isVisible() && !txtnomesocial.getText().trim().isEmpty()) {
                aluno.setNomesocial_aluno(txtnomesocial.getText());
            } else {
                aluno.setNomesocial_aluno(null);
            }

            //Deficiencia
            String deficiencia = (String) txtdeficiencia.getSelectedItem();

            if ("Auditiva".equals(deficiencia)) {
                aluno.setTipo_deficiencia(1);
            } else if ("Visual".equals(deficiencia)) {
                aluno.setTipo_deficiencia(2);
            } else if ("Física".equals(deficiencia)) {
                aluno.setTipo_deficiencia(3);
            } else {
                aluno.setTipo_deficiencia(0); // caso nenhuma opção seja selecionada, padrão 0
            }

            //formatar data
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date data = sdf.parse(txtnascimento.getText());
                aluno.setData_nascimento(data);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data inválida!");
                return;
            }

            adao.create(aluno);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
            limparCampos();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar aluno: " + ex.getMessage());
        }

        limparCampos();

    }//GEN-LAST:event_btnsalvarActionPerformed

    private void rbnteletroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbnteletroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbnteletroActionPerformed

    private void txtnascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnascimentoActionPerformed

    private void rbtnnaonomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnnaonomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnnaonomeActionPerformed

    private void rbtnsimdefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnsimdefActionPerformed
        if (rbtnsimdef.isSelected()) {
            txtdeficiencia.setVisible(true);
            rbtnsimdef.setVisible(false);
            rbtnnaodef.setVisible(false);

        }

    }//GEN-LAST:event_rbtnsimdefActionPerformed

    private void rbtnsimnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnsimnomeActionPerformed
        if (rbtnsimnome.isSelected()) {
            rbtnsimnome.setVisible(false);
            rbtnnaonome.setVisible(false);
            txtnomesocial.setVisible(true);
        }
    }//GEN-LAST:event_rbtnsimnomeActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        ConsultarMatriculas tela = new ConsultarMatriculas();
        tela.setVisible(true);
    }//GEN-LAST:event_btnconsultarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaDados().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconsultar;
    private javax.swing.ButtonGroup btngnomesocial;
    private javax.swing.ButtonGroup btngtipodef;
    private javax.swing.JButton btnsair;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbnteletro;
    private javax.swing.JRadioButton rbnti;
    private javax.swing.JRadioButton rbtnnaodef;
    private javax.swing.JRadioButton rbtnnaonome;
    private javax.swing.JRadioButton rbtnsimdef;
    private javax.swing.JRadioButton rbtnsimnome;
    private javax.swing.JFormattedTextField txtcpfaluno;
    private javax.swing.JFormattedTextField txtcpfresp;
    private javax.swing.JComboBox txtdeficiencia;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtendereco;
    private javax.swing.JFormattedTextField txtnascimento;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomeresp;
    private javax.swing.JTextField txtnomesocial;
    private javax.swing.JFormattedTextField txttelefone;
    private javax.swing.JFormattedTextField txttelefoneresp;
    // End of variables declaration//GEN-END:variables
}
