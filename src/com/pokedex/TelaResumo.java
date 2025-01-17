/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pokedex;

import java.util.ArrayList;
import java.util.List;
public class TelaResumo extends javax.swing.JFrame {

    private String nomeTreinador;
    private String idadeTreinador;
    private String cidadeTreinador;
    private String insigiasTreinador;
    private java.util.List<TelaCadastroPokemon.Pokemon> pokemons;
    
    public TelaResumo(String nomeTreinador, String idadeTreinador, String cidadeTreinador, 
                  String insigiasTreinador, java.util.List<TelaCadastroPokemon.Pokemon> pokemons) { 
        this.nomeTreinador = nomeTreinador;
        this.idadeTreinador = idadeTreinador;
        this.cidadeTreinador = cidadeTreinador;
        this.insigiasTreinador = insigiasTreinador;
        this.pokemons = pokemons;
       
    initComponents();
    mostrarResumo();  // chama um método para exibir o resumo
    
    }
    private void mostrarResumo() {
        // Exibe os dados do treinador
        StringBuilder resumo = new StringBuilder();
        resumo.append("Treinador: ").append(nomeTreinador).append("\n");
        resumo.append("Idade: ").append(idadeTreinador).append("\n");
        resumo.append("Cidade: ").append(cidadeTreinador).append("\n");
        resumo.append("Insígnias: ").append(insigiasTreinador).append("\n\n");
        resumo.append("Pokémons:\n");

        // Exibe a lista de Pokémons
        for (TelaCadastroPokemon.Pokemon p : pokemons) {
            resumo.append("- Nome: ").append(p.nome)
                  .append(", Tipo: ").append(p.tipo)
                  .append(", Nível: ").append(p.nivel).append("\n");
        }
        System.out.println(resumo.toString());
        txtResumoPokemons.setText(resumo.toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtResumoPokemons = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(0, 102, 0));
        btnVoltar.setText("Voltar");
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 700, 180, 90));

        txtResumoPokemons.setBackground(new java.awt.Color(102, 102, 102));
        txtResumoPokemons.setColumns(20);
        txtResumoPokemons.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txtResumoPokemons.setForeground(new java.awt.Color(242, 231, 231));
        txtResumoPokemons.setRows(5);
        jScrollPane2.setViewportView(txtResumoPokemons);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 350, 350));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resouces/pokedex_img-Photoroom.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaInicial telaInicial = new TelaInicial(); // Substitua pela sua tela inicial
        telaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
        // Criando uma lista de Pokémons de exemplo
        List<TelaCadastroPokemon.Pokemon> pokemonsTeste = new ArrayList<>();
        pokemonsTeste.add(new TelaCadastroPokemon.Pokemon("Pikachu", "Elétrico", "25"));
        pokemonsTeste.add(new TelaCadastroPokemon.Pokemon("Charmander", "Fogo", "18"));
        pokemonsTeste.add(new TelaCadastroPokemon.Pokemon("Bulbasaur", "Planta", "15"));

new TelaResumo("Ash", "10", "Pallet", "3", pokemonsTeste).setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtResumoPokemons;
    // End of variables declaration//GEN-END:variables
}
