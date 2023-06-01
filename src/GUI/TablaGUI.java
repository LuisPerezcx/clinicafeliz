package GUI;

import menus.MainMenu;
import pojo.CitaGUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class TablaGUI extends JFrame{
    private JTable jTable;
    private DefaultTableModel modelo;
    private Button btnRegresar;
    private JPanel panelbtn;
    public TablaGUI (){
        initControl();
        configTable();
        configFrame();
        addActionListeners();
    }
    private void addActionListeners() {
        btnRegresar.addActionListener(e -> {
            setVisible(false);
            new GuiPrincipal();
        });
    }
    private void initControl(){
        /*
             DefaultTableModel()
             DefaultTableModel(int numRows, int numColumns)
             DefaultTableModel(Object[][] data, Object[] columnNames)
             DefaultTableModel(Object[] columnNames, int numRows)
             DefaultTableModel(Vector columnNames, int numRows)
             DefaultTableModel(Vector data, Vector columNames)
         */
        modelo = new DefaultTableModel();
        //DefaultTableModel modelo1 = new DefaultTableModel(UtilTable.usuarios,UtilTable.titulos);
        //modelo.setDataVector(UtilTable.usuarios,UtilTable.titulos);

        modelo.setColumnIdentifiers(Util.titulos);
        String [] fila = new String[modelo.getColumnCount()];
        // Vector<String> data = new Vector<>(modelo.getColumnCount());
        ArrayList<CitaGUI> lista = GuiPrincipal.getCitaGUIS();
        for (CitaGUI userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getaPaterno();
            fila[2] = userTable.getaMaterno();
            fila[3] = userTable.getEdad();
            fila[4] = userTable.getSexo();
            fila[5] = userTable.getMotivo();
            fila[6] = userTable.getDiabetes();
            fila[7] = userTable.getMedico();
            fila[8] = userTable.getHora();
            fila[9] = userTable.getFecha();
            fila[10] = userTable.getTelefono();
            fila[11] = userTable.getCorreo();
            modelo.addRow(fila);
        }
        panelbtn = new JPanel();
        jTable = new JTable(modelo);
        btnRegresar = new Button("Regresar");

    }
    private void configFrame() {
        setTitle("Tabla de usuarios");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // Establecer BoxLayout vertical
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 200);
        setResizable(true);
        setVisible(true);
    }

    private void configTable() {
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(600, 70));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane);

        panelbtn.add(btnRegresar); // Agregar el botón al panel
        getContentPane().add(panelbtn); // Agregar el panel al contenedor principal
    }
    public class Util{
        public static String[] titulos={"Nombre","aPaterno","aMaterno","edad","sexo","motivo","diabetes","medico","hora","fecha","telefono","correo"};
    }
}
