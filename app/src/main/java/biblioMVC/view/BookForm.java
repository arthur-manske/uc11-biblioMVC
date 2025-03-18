package biblioMVC.view;

import biblioMVC.controller.BookController;
import biblioMVC.controller.PreferencesController;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * BookForm performs the view part of the MVP (Model View Controller) structure.
 * @author Arthur de Souza Manske
 */
public final class BookForm extends javax.swing.JFrame {
    private final BookController        bookController;
    private final PreferencesController preferencesController;
    
    /**
     * Creates a new form BookForm.
     * @param controller - The controller for this BookForm instance.
     * @param preferences - The controller for the preferences of this BookForm instance.
     */
    public BookForm(BookController controller, PreferencesController preferences) {       
        this.bookController        = controller;
        this.preferencesController = preferences;
                        
        initComponents();
        
        this.actualizeTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        switchThemeMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciador de Biblioteca");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(652, 512));

        background.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        background.setPreferredSize(new java.awt.Dimension(652, 512));
        background.setRequestFocusEnabled(false);

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
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        bookTable.setFillsViewportHeight(true);
        bookTable.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        bookTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookTable.setShowGrid(true);
        bookTable.getTableHeader().setReorderingAllowed(false);
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        bookTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                bookTableCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bookTableInputMethodTextChanged(evt);
            }
        });
        bookTable.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bookTablePropertyChange(evt);
            }
        });
        bookTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);
        bookTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        libraryManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        libraryManager.setText("Gerenciador de biblioteca");

        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabs.setMaximumSize(new java.awt.Dimension(177, 32767));
        tabs.setMinimumSize(new java.awt.Dimension(131, 185));
        tabs.setPreferredSize(new java.awt.Dimension(177, 185));

        editBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editBookPanel.setMaximumSize(new java.awt.Dimension(177, 32767));
        editBookPanel.setMinimumSize(new java.awt.Dimension(131, 185));

        editBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBookLabel.setText("Atualizar livro");

        editBookAuthorNameLabel.setText("Autor");

        editBookReleaseDateLabel.setText("Data de lançamento");

        editBookAuthorField.setToolTipText("O nome corrigido do autor");
        editBookAuthorField.setNextFocusableComponent(editBookReleaseDateField);
        editBookAuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookAuthorFieldActionPerformed(evt);
            }
        });

        editBookReleaseDateField.setToolTipText("A data de lançamento corrigida, no formato aaaa-mm-dd, por exemplo 2024-01-01.");
        editBookReleaseDateField.setNextFocusableComponent(editBookButton);
        editBookReleaseDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookReleaseDateFieldActionPerformed(evt);
            }
        });

        editBookTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        editBookTitleLabel.setText("Título");
        editBookTitleLabel.setToolTipText("");

        editBookButton.setText("Editar livro");
        editBookButton.setToolTipText("Edita o livro em seleção (Ctrl+w)");
        editBookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editBookButton.setNextFocusableComponent(bookTable);
        editBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookButtonActionPerformed(evt);
            }
        });

        editBookTitleField.setToolTipText("O título do livro a se editar, muda conforme sua seleção na tabela");
        editBookTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBookTitleFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editBookPanelLayout = new javax.swing.GroupLayout(editBookPanel);
        editBookPanel.setLayout(editBookPanelLayout);
        editBookPanelLayout.setHorizontalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBookReleaseDateField)
                    .addComponent(editBookAuthorNameLabel)
                    .addGroup(editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(editBookTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(editBookTitleField)
                    .addComponent(editBookAuthorField)
                    .addComponent(editBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        editBookPanelLayout.setVerticalGroup(
            editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookAuthorNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookReleaseDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editBookReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editBookButton)
                .addGap(0, 19939, Short.MAX_VALUE))
        );

        tabs.addTab("Atualizar", editBookPanel);

        addBookPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addBookPanel.setMaximumSize(new java.awt.Dimension(177, 217199999));
        addBookPanel.setMinimumSize(new java.awt.Dimension(131, 185));
        addBookPanel.setPreferredSize(new java.awt.Dimension(177, 185));

        addBookTitleLabel.setText("Título");

        addBookAuthorLabel.setText("Autor");

        addBookReleaseDateLabel.setText("Data de lançamento");

        addBookLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBookLabel.setText("Adicionar livro");

        addBookTitleField.setToolTipText("O título do livro a se adicionar");
        addBookTitleField.setNextFocusableComponent(addBookAuthorField);
        addBookTitleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookTitleFieldActionPerformed(evt);
            }
        });

        addBookAuthorField.setToolTipText("O autor do livro a se adicionra");
        addBookAuthorField.setNextFocusableComponent(addBookReleaseDateField);
        addBookAuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookAuthorFieldActionPerformed(evt);
            }
        });

        addBookReleaseDateField.setToolTipText("A data de lançamento do livro a se adicionar no formato aaaa-mm-dd, por exemplo, 2024-01-01");
        addBookReleaseDateField.setNextFocusableComponent(addBookButton);
        addBookReleaseDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookReleaseDateFieldActionPerformed(evt);
            }
        });

        addBookButton.setText("Adicionar");
        addBookButton.setToolTipText("Adiciona o livro ao banco de dados (Ctrl+w)");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookPanelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addBookTitleLabel)
                        .addComponent(addBookAuthorLabel)
                        .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBookTitleField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBookAuthorField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBookReleaseDateField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBookButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        addBookPanelLayout.setVerticalGroup(
            addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBookPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(addBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookTitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(addBookAuthorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookAuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookReleaseDateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBookReleaseDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addBookButton)
                .addGap(0, 19941, Short.MAX_VALUE))
        );

        tabs.addTab("Adicionar", addBookPanel);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(libraryManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(libraryManager, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 20187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 10115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Arquivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Abrir");
        jMenuItem2.setToolTipText("Troca o arquivo de database (Ctrl+O)");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem3");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem5.setText("Sair");
        jMenuItem5.setToolTipText("Fecha o programa (Alt+F4)");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualizar");

        switchThemeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        switchThemeMenuItem.setText("Trocar tema");
        switchThemeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchThemeMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(switchThemeMenuItem);

        jMenuBar1.add(jMenu2);

        helpMenu.setText("Ajuda");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem6.setText("Manual");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem6);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 20216, Short.MAX_VALUE)
                .addContainerGap())
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
                   "Erro ao adicionar novo livro",
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
        final var title       = this.editBookTitleField.getText();        
        final var author      = this.editBookAuthorField.getText().trim();
        final var releaseDate = this.editBookReleaseDateField.getText().trim();
        final var error       = this.bookController.updateBook(title, author, releaseDate);
        
        if (error != null) {
            JOptionPane.showMessageDialog(
                   null,
                   error, 
                   "Erro ao atualizar livro",
                   JOptionPane.ERROR_MESSAGE
            );
            
            return;
        }
        
        this.editBookAuthorField.setText("");
        this.editBookReleaseDateField.setText("");
        
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
        this.bookTablePropertyChange(null);

        if (evt.getKeyCode() != KeyEvent.VK_DELETE) return;
        if (this.bookTable.getSelectedRow() < 0) return;
        
        if (JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir o livro selecionado? ", "Confirmação", JOptionPane.OK_CANCEL_OPTION) != JOptionPane.OK_OPTION) return;
        
        final var error = this.bookController.delBook((String) this.bookTable.getValueAt(this.bookTable.getSelectedRow(), 0));
        
        if (error != null) {
            JOptionPane.showMessageDialog(null, error, "Erro ao deletar usuário", JOptionPane.ERROR_MESSAGE);
        }
        
        this.actualizeTable();
        this.bookTablePropertyChange(null);
    }//GEN-LAST:event_bookTableKeyPressed

    private void bookTablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bookTablePropertyChange
        if (evt == null || !"tableCellEditor".equals(evt.getPropertyName()) || this.bookTable.isEditing())
            return;
        
        int row = this.bookTable.getSelectedRow();
        int col = this.bookTable.getSelectedColumn();
        
        if (row < 0 || col < 0) return;

        final var title = (String) this.bookTable.getValueAt(row, 0);
        final var author = (String) this.bookTable.getValueAt(row, 1);
        final var releaseDate = (String) this.bookTable.getValueAt(row, 2);
               
        if (title == null || title.trim().isEmpty()) {
            this.bookTable.setValueAt("", row, 1);
            this.bookTable.setValueAt("", row, 2);
            return;
        }
               
        final var error = this.bookController.updateBook(title.trim(), author.trim(), releaseDate.trim());

        if (error != null) {
            JOptionPane.showMessageDialog(
                null, 
                "Erro ao atualizar livro: " + error, 
                "Erro", 
                JOptionPane.ERROR_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso", "Alteração", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bookTablePropertyChange

    private void bookTableCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTableCaretPositionChanged
    }//GEN-LAST:event_bookTableCaretPositionChanged

    private void bookTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTableInputMethodTextChanged

    }//GEN-LAST:event_bookTableInputMethodTextChanged

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
    }//GEN-LAST:event_bookTableMouseClicked

    private void editBookTitleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBookTitleFieldActionPerformed
        this.editBookAuthorField.requestFocusInWindow();
    }//GEN-LAST:event_editBookTitleFieldActionPerformed

    private void switchThemeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchThemeMenuItemActionPerformed
        this.preferencesController.setDarkModeEnabled(!this.preferencesController.isDarkModeEnabled());
        
        if (JOptionPane.showConfirmDialog(null, "Para aplicar as alterações, é preciso reiniciar o programa. Deseja reiniciar o programa agora? ", "Alteração de tema", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            final var error = SwingConfig.setFlatLafTheme(this.preferencesController.isDarkModeEnabled(), this.preferencesController.getAccentColor());            
            if (error == null) {
                JOptionPane.showMessageDialog(null, "As alterações foram aplicadas com sucesso!", "Alteração de tema", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível alterar o tema atual: " + error, "Alteração de tema", JOptionPane.ERROR_MESSAGE);    
            }
            
            new BookForm(this.bookController, this.preferencesController).setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "As alterações serão aplicadas na próxima vez que iniciar o programa.", "Alteração de tema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_switchThemeMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private final javax.swing.JTextField addBookAuthorField = new javax.swing.JTextField();
    private final javax.swing.JLabel addBookAuthorLabel = new javax.swing.JLabel();
    private final javax.swing.JButton addBookButton = new javax.swing.JButton();
    private final javax.swing.JLabel addBookLabel = new javax.swing.JLabel();
    private final javax.swing.JPanel addBookPanel = new javax.swing.JPanel();
    private final javax.swing.JTextField addBookReleaseDateField = new javax.swing.JTextField();
    private final javax.swing.JLabel addBookReleaseDateLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField addBookTitleField = new javax.swing.JTextField();
    private final javax.swing.JLabel addBookTitleLabel = new javax.swing.JLabel();
    private final javax.swing.JPanel background = new javax.swing.JPanel();
    private final javax.swing.JTable bookTable = new javax.swing.JTable() {
        @Override
        public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
            super.changeSelection(rowIndex, columnIndex, toggle, extend);

            final var string = (String) this.getValueAt(rowIndex, 0);
            if (string != null) {
                editBookTitleField.setText(string);
            }
        }
    };
    private final javax.swing.JTextField editBookAuthorField = new javax.swing.JTextField();
    private final javax.swing.JLabel editBookAuthorNameLabel = new javax.swing.JLabel();
    private final javax.swing.JButton editBookButton = new javax.swing.JButton();
    private final javax.swing.JLabel editBookLabel = new javax.swing.JLabel();
    private final javax.swing.JPanel editBookPanel = new javax.swing.JPanel();
    private final javax.swing.JTextField editBookReleaseDateField = new javax.swing.JTextField();
    private final javax.swing.JLabel editBookReleaseDateLabel = new javax.swing.JLabel();
    private final javax.swing.JTextField editBookTitleField = new javax.swing.JTextField();
    private final javax.swing.JLabel editBookTitleLabel = new javax.swing.JLabel();
    private javax.swing.JMenu helpMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private final javax.swing.JLabel libraryManager = new javax.swing.JLabel();
    private javax.swing.JMenuItem switchThemeMenuItem;
    private final javax.swing.JTabbedPane tabs = new javax.swing.JTabbedPane();
    // End of variables declaration//GEN-END:variables

    /**
     * Actualizes the visualization table with the database data.
     */
    private boolean actualizeTable() {   
        final var buffer = new ArrayList<String>();
        final var model  = (DefaultTableModel) this.bookTable.getModel();
        final var error  = this.bookController.listBooks(buffer);
               
        if (error != null) {
            JOptionPane.showMessageDialog(null, error, "Erro ao listar livros", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        model.setRowCount(0);
                        
        for (int i = 0; i < buffer.size(); ++i) {
            final Object[] rowData = { buffer.get(i), buffer.get(++i), buffer.get(++i)};            
            model.addRow(rowData);
        }
        
        final double rowsToFillScreen = this.bookTable.getHeight() / this.bookTable.getRowHeight();
        
        if (model.getRowCount() < (int) Math.ceil(rowsToFillScreen))
            model.setRowCount((int) Math.ceil(rowsToFillScreen));
                
        return true;
    }
}
