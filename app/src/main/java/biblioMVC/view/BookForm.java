package biblioMVC.view;

import biblioMVC.controller.BookController;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * BookForm performs the view part of the MVP (Model View Controller) structure.
 * @author Arthur de Souza Manske
 */
public final class BookForm extends javax.swing.JFrame {
    private final BookController    bookController;
    
    /**
     * Creates new form BookForm
     */
    public BookForm() {       
        this.bookController = new BookController();
        initComponents();
        
        this.actualizeTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        libraryManager = new javax.swing.JLabel();
        addBookPanel = new javax.swing.JPanel();
        addBookTitleLabel = new javax.swing.JLabel();
        addBookAuthorLabel = new javax.swing.JLabel();
        addBookReleaseDateLabel = new javax.swing.JLabel();
        addBookLabel = new javax.swing.JLabel();
        addBookTitleField = new javax.swing.JTextField();
        addBookAuthorField = new javax.swing.JTextField();
        addBookReleaseDateField = new javax.swing.JTextField();
        addBookButton = new javax.swing.JButton();
        editBookPanel = new javax.swing.JPanel();
        editBookLabel = new javax.swing.JLabel();
        editBookAuthorNameLabel = new javax.swing.JLabel();
        editBookReleaseDateLabel = new javax.swing.JLabel();
        editBookAuthorField = new javax.swing.JTextField();
        editBookReleaseDateField = new javax.swing.JTextField();
        editBookNameLabel = new javax.swing.JLabel();
        editBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(240, 244, 246));
        background.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N

        bookTable.setBackground(new java.awt.Color(251, 254, 253));
        bookTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 254, 253), 3));
        bookTable.setForeground(new java.awt.Color(30, 30, 30));
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Autor", "Data de lançamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setGridColor(new java.awt.Color(230, 234, 236));
        bookTable.setNextFocusableComponent(addBookTitleLabel);
        bookTable.setSelectionBackground(new java.awt.Color(30, 30, 30));
        bookTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        bookTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookTable.setShowGrid(true);
        bookTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);
        bookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        libraryManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryManager.setText("Gerenciador de biblioteca");

        addBookPanel.setBackground(new java.awt.Color(251, 254, 253));
        addBookPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 254, 253), 3, true));

        addBookTitleLabel.setText("Título");

        addBookAuthorLabel.setText("Autor");

        addBookReleaseDateLabel.setText("Data de lançamento");

        addBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookLabel.setText("Adicionar livro");

        addBookTitleField.setNextFocusableComponent(addBookAuthorField);
        addBookTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookTitleFieldActionPerformed(evt);
            }
        });

        addBookAuthorField.setNextFocusableComponent(addBookReleaseDateField);
        addBookAuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookAuthorFieldActionPerformed(evt);
            }
        });

        addBookReleaseDateField.setNextFocusableComponent(addBookButton);
        addBookReleaseDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookReleaseDateFieldActionPerformed(evt);
            }
        });

        addBookButton.setText("Adicionar");
        addBookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBookButton.setNextFocusableComponent(bookTable);
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addBookPanelLayout = new javax.swing.GroupLayout(addBookPanel);
        addBookPanel.setLayout(addBookPanelLayout);
        addBookPanelLayout.setHorizontalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBookAuthorLabel)
                    .addComponent(addBookTitleLabel)
                    .addComponent(addBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookReleaseDateField)
                    .addComponent(addBookAuthorField)
                    .addComponent(addBookTitleField)
                    .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
            .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookAuthorLabel)
                .addGap(1, 1, 1)
                .addComponent(addBookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookReleaseDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addBookButton)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        editBookPanel.setBackground(new java.awt.Color(251, 254, 253));
        editBookPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(251, 254, 255), 3, true));

        editBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBookLabel.setText("Editar livro");

        editBookAuthorNameLabel.setText("Autor");

        editBookReleaseDateLabel.setText("Data de lançamento");

        editBookAuthorField.setNextFocusableComponent(editBookReleaseDateField);
        editBookAuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookAuthorFieldActionPerformed(evt);
            }
        });

        editBookReleaseDateField.setNextFocusableComponent(editBookButton);
        editBookReleaseDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookReleaseDateFieldActionPerformed(evt);
            }
        });

        editBookNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBookNameLabel.setText("   ");

        editBookButton.setText("Editar livro");
        editBookButton.setNextFocusableComponent(bookTable);
        editBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editBookPanelLayout = new javax.swing.GroupLayout(editBookPanel);
        editBookPanel.setLayout(editBookPanelLayout);
        editBookPanelLayout.setHorizontalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBookAuthorNameLabel)
                    .addComponent(editBookAuthorField)
                    .addComponent(editBookReleaseDateField)
                    .addComponent(editBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(editBookNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editBookPanelLayout.setVerticalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editBookLabel)
                .addGap(0, 0, 0)
                .addComponent(editBookNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBookAuthorNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookReleaseDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookButton)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(libraryManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(libraryManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        final var title       = this.addBookTitleField.getText().trim();
        final var author      = this.addBookAuthorField.getText().trim();
        final var releaseDate = this.addBookReleaseDateField.getText().trim();
        final var error       = this.bookController.addBook(title, author, releaseDate);
        
        if (error != null) {
            JOptionPane.showMessageDialog(
                   null,
                   error, 
                   "Erro ao adicionar novo usuário",
                   JOptionPane.ERROR_MESSAGE
            );
            
            return;
        }
        
        this.addBookTitleField.setText("");
        this.addBookAuthorField.setText("");
        this.addBookReleaseDateField.setText("");

        this.actualizeTable();
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void editBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookButtonActionPerformed
        // TODO
        this.actualizeTable();
    }//GEN-LAST:event_editBookButtonActionPerformed

    private void addBookTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookTitleFieldActionPerformed
        this.addBookAuthorField.requestFocusInWindow();
    }//GEN-LAST:event_addBookTitleFieldActionPerformed

    private void addBookAuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookAuthorFieldActionPerformed
        this.addBookReleaseDateField.requestFocusInWindow();
    }//GEN-LAST:event_addBookAuthorFieldActionPerformed

    private void addBookReleaseDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookReleaseDateFieldActionPerformed
        this.addBookButton.requestFocusInWindow();
    }//GEN-LAST:event_addBookReleaseDateFieldActionPerformed

    private void editBookAuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookAuthorFieldActionPerformed
        this.editBookReleaseDateField.requestFocusInWindow();
    }//GEN-LAST:event_editBookAuthorFieldActionPerformed

    private void editBookReleaseDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookReleaseDateFieldActionPerformed
        this.editBookButton.requestFocusInWindow();
    }//GEN-LAST:event_editBookReleaseDateFieldActionPerformed

    private void bookTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            int newCol = this.bookTable.getSelectedColumn() + ((evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) ? -1 : +1);
            if (newCol > this.bookTable.getColumnCount() || newCol < 0) {
                newCol = 0;
            }
            
            this.bookTable.changeSelection(0, newCol, false, false);
            return;
        }
        
        if (evt.getKeyCode() != KeyEvent.VK_DELETE) return;
        final var error = this.bookController.delBook((String) this.bookTable.getValueAt(this.bookTable.getSelectedRow(), 0));
        if (error != null) {
            JOptionPane.showMessageDialog(null, error, "Erro ao deletar usuário", JOptionPane.ERROR_MESSAGE);
        }
        
        this.actualizeTable();
    }//GEN-LAST:event_bookTableKeyPressed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addBookAuthorField;
    private javax.swing.JLabel addBookAuthorLabel;
    private javax.swing.JButton addBookButton;
    private javax.swing.JLabel addBookLabel;
    private javax.swing.JPanel addBookPanel;
    private javax.swing.JTextField addBookReleaseDateField;
    private javax.swing.JLabel addBookReleaseDateLabel;
    private javax.swing.JTextField addBookTitleField;
    private javax.swing.JLabel addBookTitleLabel;
    private javax.swing.JPanel background;
    private javax.swing.JTable bookTable;
    private javax.swing.JTextField editBookAuthorField;
    private javax.swing.JLabel editBookAuthorNameLabel;
    private javax.swing.JButton editBookButton;
    private javax.swing.JLabel editBookLabel;
    private javax.swing.JLabel editBookNameLabel;
    private javax.swing.JPanel editBookPanel;
    private javax.swing.JTextField editBookReleaseDateField;
    private javax.swing.JLabel editBookReleaseDateLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel libraryManager;
    // End of variables declaration//GEN-END:variables

    public void actualizeTable() {   
        final var buffer = new ArrayList<String>();
        final var model  = (DefaultTableModel) this.bookTable.getModel();
        final var error  = this.bookController.listBooks(buffer);
        
        if (error != null) {
            JOptionPane.showMessageDialog(null, error, "Erro ao listar livros", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        model.setRowCount(0);
                
        for (int i = 0; i < buffer.size(); ++i) {
            Object[] rowData = { buffer.get(i), buffer.get(++i), buffer.get(++i)};            
            model.addRow(rowData);
        }
    }
}
