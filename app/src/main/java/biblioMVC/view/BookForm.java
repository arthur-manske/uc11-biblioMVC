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
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        switchThemeButton = new javax.swing.JButton();

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
                false, false, false
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
        editBookNameLabel.setText("(n/a)");

        editBookButton.setText("Editar livro");
        editBookButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(editBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBookAuthorNameLabel)
                    .addComponent(editBookAuthorField)
                    .addComponent(editBookReleaseDateField)
                    .addComponent(editBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addContainerGap(19973, Short.MAX_VALUE))
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
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(addBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addBookAuthorLabel)
                    .addComponent(addBookTitleLabel)
                    .addComponent(addBookReleaseDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addBookReleaseDateField)
                    .addComponent(addBookAuthorField)
                    .addComponent(addBookTitleField)
                    .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
            .addComponent(addBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(19940, Short.MAX_VALUE))
        );

        tabs.addTab("Adicionar", addBookPanel);

        bookTable1.setForeground(new java.awt.Color(30, 30, 30));
        bookTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
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
        bookTable1.setFillsViewportHeight(true);
        bookTable1.setNextFocusableComponent(addBookTitleLabel);
        bookTable1.setOpaque(false);
        bookTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        bookTable1.setShowGrid(true);
        bookTable1.getTableHeader().setReorderingAllowed(false);
        bookTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTable1MouseClicked(evt);
            }
        });
        bookTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                bookTable1CaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                bookTable1InputMethodTextChanged(evt);
            }
        });
        bookTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                bookTable1PropertyChange(evt);
            }
        });
        bookTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bookTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(bookTable1);
        bookTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        switchThemeButton.setText("Mudar tema");
        switchThemeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        switchThemeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchThemeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(libraryManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(switchThemeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(libraryManager)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(switchThemeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 20187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 10115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 10115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        final var title       = this.editBookNameLabel.getText();        
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

    }//GEN-LAST:event_bookTablePropertyChange

    private void bookTableCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTableCaretPositionChanged
    }//GEN-LAST:event_bookTableCaretPositionChanged

    private void bookTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTableInputMethodTextChanged
    }//GEN-LAST:event_bookTableInputMethodTextChanged

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
    }//GEN-LAST:event_bookTableMouseClicked

    private void bookTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTable1MouseClicked

    private void bookTable1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTable1CaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTable1CaretPositionChanged

    private void bookTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_bookTable1InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTable1InputMethodTextChanged

    private void bookTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_bookTable1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTable1PropertyChange

    private void bookTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bookTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookTable1KeyPressed

    private void switchThemeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchThemeButtonActionPerformed
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
    }//GEN-LAST:event_switchThemeButtonActionPerformed
     
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
                editBookNameLabel.setText(string);
            } else {
                editBookNameLabel.setText("(n/a)");
            }
        }
    };
    private final javax.swing.JTable bookTable1 = new javax.swing.JTable() {
        @Override
        public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
            super.changeSelection(rowIndex, columnIndex, toggle, extend);

            final var string = (String) this.getValueAt(rowIndex, 0);
            if (string != null) {
                editBookNameLabel.setText(string);
            } else {
                editBookNameLabel.setText("(n/a)");
            }
        }
    };
    private final javax.swing.JTextField editBookAuthorField = new javax.swing.JTextField();
    private final javax.swing.JLabel editBookAuthorNameLabel = new javax.swing.JLabel();
    private final javax.swing.JButton editBookButton = new javax.swing.JButton();
    private final javax.swing.JLabel editBookLabel = new javax.swing.JLabel();
    private final javax.swing.JLabel editBookNameLabel = new javax.swing.JLabel();
    private final javax.swing.JPanel editBookPanel = new javax.swing.JPanel();
    private final javax.swing.JTextField editBookReleaseDateField = new javax.swing.JTextField();
    private final javax.swing.JLabel editBookReleaseDateLabel = new javax.swing.JLabel();
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private final javax.swing.JLabel libraryManager = new javax.swing.JLabel();
    private javax.swing.JButton switchThemeButton;
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
