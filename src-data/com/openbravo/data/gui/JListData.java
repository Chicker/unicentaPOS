//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2014 uniCenta & previous Openbravo POS works
//    http://www.unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.data.gui;

import java.util.*;

/**
 *
 * @author JG uniCenta
 */
public class JListData extends javax.swing.JDialog {
    
    private Object m_selected;
    
    /** Creates new form JListData
     * @param parent */
    public JListData(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        
        getRootPane().setDefaultButton(m_jOK);
    }
    
    /**
     *
     * @param data
     * @return
     */
    public Object showList(List data) {
        
        return showList(new MyListData(data));       
    }

    /**
     *
     * @param model
     * @return
     */
    public Object showList(javax.swing.ListModel model) {
        
        m_jData.setModel(model);
        
        m_selected = null;
        
        setVisible(true);
        //show();
        
        return m_selected;        
    }
    
    private static class MyListData extends javax.swing.AbstractListModel {
        
        private List m_data;
        
        public MyListData(List data) {
            m_data = data;
        }
        
        @Override
        public Object getElementAt(int index) {
            return m_data.get(index);
        }
        
        @Override
        public int getSize() {
            return m_data.size();
        } 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        m_jOK = new javax.swing.JButton();
        m_jCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_jData = new javax.swing.JList();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        m_jOK.setText("Accept");
        m_jOK.setMaximumSize(new java.awt.Dimension(65, 33));
        m_jOK.setMinimumSize(new java.awt.Dimension(65, 33));
        m_jOK.setPreferredSize(new java.awt.Dimension(65, 33));
        m_jOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jOKActionPerformed(evt);
            }
        });
        jPanel1.add(m_jOK);

        m_jCancel.setText("Cancel");
        m_jCancel.setMaximumSize(new java.awt.Dimension(65, 33));
        m_jCancel.setMinimumSize(new java.awt.Dimension(65, 33));
        m_jCancel.setPreferredSize(new java.awt.Dimension(65, 33));
        m_jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m_jCancelActionPerformed(evt);
            }
        });
        jPanel1.add(m_jCancel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        m_jData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        m_jData.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(m_jData);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jToolBar1.setFloatable(false);

        jButton1.setText("jButton1");
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jToolBar1.add(jButton2);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.NORTH);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-264)/2, (screenSize.height-337)/2, 264, 337);
    }// </editor-fold>//GEN-END:initComponents

    private void m_jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jCancelActionPerformed
        
        dispose();
    }//GEN-LAST:event_m_jCancelActionPerformed

    private void m_jOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m_jOKActionPerformed

        m_selected = m_jData.getSelectedValue();
        
        dispose();
    }//GEN-LAST:event_m_jOKActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton m_jCancel;
    private javax.swing.JList m_jData;
    private javax.swing.JButton m_jOK;
    // End of variables declaration//GEN-END:variables
    
}
