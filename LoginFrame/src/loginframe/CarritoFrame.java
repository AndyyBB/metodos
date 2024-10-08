
package loginframe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 * Clase que representa la ventana del carrito de compras.
 * Muestra las pizzas agregadas al carrito y permite eliminarlas o finalizar la compra.
 * 
 * @author ortun
 */
public class CarritoFrame extends javax.swing.JFrame {

    private MenuPrincipal menuPrincipal;  // Referencia a la ventana del menú principal
       
    
    /**
     * Crea una nueva instancia de la ventana del carrito.
     * Inicializa los componentes gráficos y ajusta la posición de la ventana al centro.
     * También carga las pizzas que se encuentran en el carrito.
     */
    public CarritoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.menuPrincipal = menuPrincipal; // Inicializa la referencia al menú principal
        cargarPizzasEnCarrito(); // Carga las pizzas en la tabla
        
    }
    
    
/**
     * Carga las pizzas que se encuentran en el carrito a la tabla de la interfaz gráfica.
     * Recorre la lista de pizzas en el carrito y las muestra en la tabla.
     */
private void cargarPizzasEnCarrito() {
    // Crear un DefaultTableModel personalizado para evitar que las celdas sean editables
    DefaultTableModel model = new DefaultTableModel(
        new Object[]{"Nombre de la Pizza", "Precio", "Tamaño"}, 0
    ) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;  // Esto hace que ninguna celda sea editable
        }
    };

    // Limpiar la tabla (si ya tenía filas previamente)
    model.setRowCount(0);

    // Añadir las pizzas de la lista al modelo
    for (Pizza pizza : MenuPrincipal.carritoPizzas) {
        model.addRow(new Object[]{pizza.getNombre(), pizza.getPrecio(), pizza.getTamaño()});
    }

    // Asignar el modelo no editable a la tabla
    tablaPizzas.setModel(model);
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSalirCarrito = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPizzas = new javax.swing.JTable();
        btnEliminarPizza = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        boxTamaño = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        boxPizza = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Come primero, piensa después!");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BAMBINO`S");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pizza");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Bienvenido, Bambino`s");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carrito");

        btnSalirCarrito.setText("Salir");
        btnSalirCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirCarritoActionPerformed(evt);
            }
        });

        tablaPizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de la Pizza", "Precio", "Tamaño"
            }
        ));
        jScrollPane2.setViewportView(tablaPizzas);

        btnEliminarPizza.setText("Eliminar");
        btnEliminarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPizzaActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setText("Finalizar compra");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        boxTamaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pequeña", "Mediana", "Grande", " " }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tamaño:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Pizza:");

        boxPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Napolitana", "Boloñesa", "Española", "Funghi", "Hawaiana" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSalirCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))))
                                .addGap(101, 101, 101)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminarPizza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxTamaño, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxPizza, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(boxPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxTamaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnEliminarPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalirCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción que ocurre al presionar el botón "Salir".
     * Cierra la ventana del carrito y vuelve al menú principal.
     * 
     * @param evt El evento de acción que dispara este método.
     */
    private void btnSalirCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirCarritoActionPerformed
            this.dispose(); // Cierra la ventana del carrito
            menuPrincipal.setVisible(true); // Vuelve a mostrar el menú principal
    }//GEN-LAST:event_btnSalirCarritoActionPerformed

    /**
     * Acción que ocurre al presionar el botón "Eliminar".
     * Elimina la pizza seleccionada del carrito de compras.
     * 
     * @param evt El evento de acción que dispara este método.
     */
    private void btnEliminarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPizzaActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel();
    
    // Obtiene la fila seleccionada
    int selectedRow = tablaPizzas.getSelectedRow();
    
    // Verifica si se ha seleccionado una fila
    if (selectedRow != -1) {
        // Obtiene el nombre de la pizza de la fila seleccionada
        String pizzaNombre = (String) model.getValueAt(selectedRow, 0);
        
        // Busca y elimina la pizza del carrito
        Pizza pizzaToRemove = null;
        for (Pizza pizza : MenuPrincipal.carritoPizzas) {
            if (pizza.getNombre().equals(pizzaNombre)) {
                pizzaToRemove = pizza;
                break;
            }
        }
        
        // Si se encuentra la pizza, se elimina
        if (pizzaToRemove != null) {
            MenuPrincipal.carritoPizzas.remove(pizzaToRemove);
            JOptionPane.showMessageDialog(this, "Pizza eliminada del carrito");
            cargarPizzasEnCarrito(); // Actualiza la tabla después de eliminar
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una pizza para eliminar.");
    }
    }//GEN-LAST:event_btnEliminarPizzaActionPerformed

    /**
 * Método que se ejecuta cuando se presiona el botón "Finalizar Compra".
 * Guarda el pedido actual en un archivo de texto y muestra un mensaje de confirmación.
 * Luego, cierra la ventana del carrito y redirige al menú principal.
 * 
 * @param evt El evento de acción que dispara este método.
 */
    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
       // Ruta del archivo de pedidos
        String filePath = "E:\\Octavo semestre\\metodos\\LoginFrame/pedidos.txt"; 
        
        // Manejo del archivo donde se guardarán los pedidos
    try (FileWriter writer = new FileWriter(filePath, true);
         BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
        
        // Obtener el modelo de la tabla donde se muestran las pizzas del carrito
        DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel(); // Verifica aquí

        // Recorre las filas de la tabla y guarda cada pizza en el archivo
        for (int i = 0; i < model.getRowCount(); i++) {
            String nombrePizza = (String) model.getValueAt(i, 0); // Nombre de la pizza
            double precioPizza = (Double) model.getValueAt(i, 1); // Precio de la pizza
            String tamañoPizza = (String) model.getValueAt(i, 2); // Tamaño de la pizza 
            
            // Escribe los detalles de la pizza en el archivo
            bufferedWriter.write(nombrePizza + "," + precioPizza + "," + tamañoPizza);
            bufferedWriter.newLine();  // Añade una nueva línea para el siguiente pedido
        }
        
        // Muestra un mensaje de confirmación al usuario
        JOptionPane.showMessageDialog(this, "¡Pedido realizado exitosamente!  " );
         // Muestra un mensaje de error si ocurre un problema al escribir el archivo
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage());
    }
    // Cierra la ventana del carrito
    this.dispose();
    
    // Muestra la ventana del menú principal
    new MenuPrincipal().setVisible(true);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Obtiene el modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tablaPizzas.getModel();
    
    // Verifica si hay una fila seleccionada
    int selectedRow = tablaPizzas.getSelectedRow();
    
    if (selectedRow != -1) {
        // Obtiene los valores seleccionados de los ComboBox
        String nuevaPizza = (String) boxPizza.getSelectedItem();
        String nuevoTamaño = (String) boxTamaño.getSelectedItem();

        // Calcula el nuevo precio basado en el tamaño seleccionado
        double nuevoPrecio = 0.0;
        switch (nuevoTamaño) {
            case "Pequeña":
                nuevoPrecio = 40.0;
                break;
            case "Mediana":
                nuevoPrecio = 50.0;
                break;
            case "Grande":
                nuevoPrecio = 60.0;
                break;
        }

        // Actualiza la fila seleccionada con los nuevos valores
        model.setValueAt(nuevaPizza, selectedRow, 0); // Modifica el nombre de la pizza
        model.setValueAt(nuevoPrecio, selectedRow, 1); // Modifica el precio
        model.setValueAt(nuevoTamaño, selectedRow, 2); // Modifica el tamaño

        // Muestra un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Pedido modificado exitosamente.");
    } else {
        // Muestra un mensaje de error si no hay ninguna fila seleccionada
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una pizza para modificar.");
    }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarritoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarritoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPizza;
    private javax.swing.JComboBox<String> boxTamaño;
    private javax.swing.JButton btnEliminarPizza;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalirCarrito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPizzas;
    // End of variables declaration//GEN-END:variables

    private static class carrito {

        private static Iterable<Pizza> getPizzas() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public carrito() {
        }
    }
}
