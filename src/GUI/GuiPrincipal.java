package GUI;

import pojo.CitaGUI;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GuiPrincipal extends JFrame implements ChangeListener{
    private JPanel panelIz, panelDer, panelContenedor,panelRadio,panelDatos,panelRadio2,panelConsulta,panelRadio3,panelRadio4,panelRadio5;
    private JLabel lblPrimeraCita, lblPersonales, lblConsulta,lblMotivo,lblDiabetico,lblMedico,lblHora,lblFecha,lblvacio,lblvacio2;
    private JLabel nombre,apellido1,apellido2,edad,lblvacio1,vacio1,vacio2,lblContacto;
    private JTextField txtNombre, txtApellido1, txtApellido2,txtEdad,txtMotivo, txtMedico,txtHora, txtFecha;
    private  JRadioButton si, no,hombre,mujer,si2,no2,si3,no3,si4,no4;
    private ButtonGroup grupo,grupo2,grupo3,grupo4,grupo5;
    private JPanel panel1Cita,panelContacto,panelBtns;
    private JLabel lblTelefono,lblTelefono1,lblCorreo,lblCorreo1,vacio3,vacio4,vacio5,vacio6,vacio7,vacio8;
    private JTextField txtTelefono,txtCorreo;
    private JButton btnGuardar,btnConsultar;
    private JLabel a,b,c,d,e,f,g,h,i,j,k,l;
    private String sexo="",diabetes="";
    private static ArrayList<CitaGUI> citaGUIS = new ArrayList<>();

    public GuiPrincipal(){
        iniciarComponentes();
        setupPanelContenedor();
        add(panelContenedor);
        setUpFrame();
        addActionListeners();
    }
    public void setUpFrame(){
        setTitle("Formulario Clinica");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setSize(1000, 600);
        setVisible(true);
    }
    public void iniciarComponentes(){
        panelIz = new JPanel();
        panelDer = new JPanel();
        panelContenedor = new JPanel();
        lblPrimeraCita = new JLabel("¿Primera cita?");
        grupo = new ButtonGroup();
        si = new JRadioButton("SI");
        no = new JRadioButton("NO");
        panelRadio = new JPanel();
        lblPersonales = new JLabel("Datos Personales");

        panelDatos = new JPanel();

        nombre = new JLabel("Nombre:        ");
        apellido1 = new JLabel("Apellido Paterno:       ");
        apellido2 = new JLabel("Apellido Materno:       ");
        edad = new JLabel("Edad:        ");

        txtNombre = new JTextField();
        txtApellido1 = new JTextField();
        txtApellido2 = new JTextField();
        txtEdad = new JTextField();

        panelRadio2 = new JPanel();
        grupo2 = new ButtonGroup();
        hombre = new JRadioButton("Hombre");
        mujer = new JRadioButton("Mujer");

        lblConsulta = new JLabel("Datos de consulta");
        panelConsulta = new JPanel();

        lblMotivo = new JLabel("Motivo de la cita medica:");
        lblDiabetico = new JLabel("Es Diabetico:        ");
        lblMedico = new JLabel("Nombre del Medico:      ");
        lblHora = new JLabel("Hora de cita medica:     ");
        lblFecha = new JLabel("Fecha de cita medica:     ");

        grupo3 = new ButtonGroup();
        txtMotivo = new JTextField();
        txtMedico = new JTextField();
        txtFecha = new JTextField();
        txtHora = new JTextField();

        lblvacio = new JLabel("");
        lblvacio2 = new JLabel("");
        panelRadio3 = new JPanel();
        si2 = new JRadioButton("SI");
        no2 = new JRadioButton("NO");

        panel1Cita = new JPanel();
        lblvacio1 = new JLabel("");
        vacio1 = new JLabel("");
        vacio2 = new JLabel("");

        panelContacto = new JPanel();
        lblContacto = new JLabel("              Datos de Contacto");

        si3 = new JRadioButton("SI");
        no3 = new JRadioButton("NO");
        grupo4 = new ButtonGroup();

        lblTelefono = new JLabel("              ¿Tiene Telefono?");
        lblTelefono1 = new JLabel("             Telefono:");
        lblCorreo = new JLabel("                ¿Tiene Coreo?");
        lblCorreo1 = new JLabel("               Correo:");

        txtTelefono = new JTextField();
        txtCorreo = new JTextField();
        vacio3 = new JLabel("");
        vacio4 = new JLabel("");
        vacio5 = new JLabel("");
        vacio6 = new JLabel("");
        vacio7 = new JLabel("");
        vacio8 = new JLabel("");
        panelRadio4 = new JPanel();

        si4 = new JRadioButton("SI");
        no4 = new JRadioButton("NO");
        grupo5 = new ButtonGroup();
        panelRadio5 = new JPanel();

        btnGuardar = new JButton("GUARDAR");
        btnConsultar = new JButton("CONSULTAR");
        panelBtns = new JPanel();

        a = new JLabel("");
        b = new JLabel("");
        c = new JLabel("");
        d = new JLabel("");
        e = new JLabel("");
        f = new JLabel("");
        g = new JLabel("");
        h = new JLabel("");
        i = new JLabel("");
        j = new JLabel("");
        k = new JLabel("");
        l = new JLabel("");


    }
    public void setupPanelContenedor(){
        panelIz.setLayout(new BoxLayout(panelIz, BoxLayout.Y_AXIS));

        panel1Cita.setLayout(new GridLayout(2,2));
        panel1Cita.add(lblPrimeraCita);
        panel1Cita.add(lblvacio1);
        grupo.add(si);
        grupo.add(no);
        panelRadio.setLayout(new FlowLayout());
        panelRadio.add(si);
        panelRadio.add(no);
        panel1Cita.add(panelRadio);

        panelIz.add(panel1Cita);

        panelDatos.setLayout(new GridLayout(6,2));
        panelDatos.add(lblPersonales);
        panelDatos.add(vacio1);
        panelDatos.add(nombre);
        panelDatos.add(txtNombre);
        panelDatos.add(apellido1);
        panelDatos.add(txtApellido1);
        panelDatos.add(apellido2);
        panelDatos.add(txtApellido2);
        panelDatos.add(edad);
        panelDatos.add(txtEdad);
        grupo2.add(hombre);
        grupo2.add(mujer);
        panelRadio2.add(hombre);
        panelRadio2.add(mujer);
        panelDatos.add(panelRadio2);
        panelIz.add(panelDatos);


        panelConsulta.setLayout(new GridLayout(7,2));
        panelConsulta.add(lblConsulta);
        panelConsulta.add(vacio2);
        panelConsulta.add(lblMotivo);
        panelConsulta.add(txtMotivo);
        panelConsulta.add(lblDiabetico);
        panelConsulta.add(lblvacio);
        grupo3.add(si2);
        grupo3.add(no2);
        panelRadio3 = new JPanel(new GridLayout());
        panelRadio3.add(si2);
        panelRadio3.add(no2);
        panelConsulta.add(panelRadio3);
        panelConsulta.add(lblvacio2);
        panelConsulta.add(lblMedico);
        panelConsulta.add(txtMedico);
        panelConsulta.add(lblHora);
        panelConsulta.add(txtHora);
        panelConsulta.add(lblFecha);
        panelConsulta.add(txtFecha);

        panelIz.add(panelConsulta);

        panelDer.setLayout(new BoxLayout(panelDer,BoxLayout.Y_AXIS));

        panelContacto.setLayout(new GridLayout(14,2));
        panelContacto.add(lblContacto);
        panelContacto.add(vacio3);
        panelContacto.add(lblTelefono);
        panelContacto.add(vacio4);
        grupo4.add(si3);
        grupo4.add(no3);
        panelRadio4.setLayout(new FlowLayout());

        panelRadio4.add(si3);
        panelRadio4.add(no3);
        panelContacto.add(panelRadio4);
        panelContacto.add(vacio5);
        panelContacto.add(lblTelefono1);

        panelContacto.add(txtTelefono);
        panelContacto.add(lblCorreo);
        panelContacto.add(vacio6);
        grupo5.add(si4);
        grupo5.add(no4);
        panelRadio5.setLayout(new FlowLayout());
        panelRadio5.add(si4);
        panelRadio5.add(no4);
        panelContacto.add(panelRadio5);
        panelContacto.add(vacio7);
        panelContacto.add(lblCorreo1);
        panelContacto.add(txtCorreo);
        panelBtns.setLayout(new FlowLayout());
        panelBtns.add(btnGuardar);
        panelBtns.add(btnConsultar);
        panelContacto.add(a);
        panelContacto.add(b);
        panelContacto.add(c);
        panelContacto.add(d);
        panelContacto.add(e);
        panelContacto.add(f);
        panelContacto.add(g);
        panelContacto.add(h);
        panelContacto.add(i);
        panelContacto.add(j);
        panelContacto.add(k);
        panelContacto.add(l);
        panelContacto.add(vacio8);
        panelContacto.add(panelBtns);

        panelDer.add(panelContacto);

        panelContenedor.setLayout(new GridLayout(1,2));
        panelContenedor.add(panelIz);
        panelContenedor.add(panelDer);

    }
    private void clearTextFields() {
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtEdad.setText("");
        txtMotivo.setText("");
        txtMedico.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
    }
    private void addActionListeners() {
        btnGuardar.addActionListener(new EventClick());
        btnConsultar.addActionListener(e -> {
            setVisible(false);
            new TablaGUI();
        });
        si.addChangeListener(this);
        no.addChangeListener(this);
        hombre.addChangeListener(this);
        mujer.addChangeListener(this);
        si2.addChangeListener(this);
        no2.addChangeListener(this);
        si3.addChangeListener(this);
        no3.addChangeListener(this);
        si4.addChangeListener(this);
        no4.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(si.isSelected()){
            txtNombre.setEnabled(true);
            txtApellido1.setEnabled(true);
            txtApellido2.setEnabled(true);
            txtEdad.setEnabled(true);
            txtNombre.setEnabled(true);
            txtNombre.setEnabled(true);
            txtNombre.setEnabled(true);
            txtNombre.setEnabled(true);
            txtNombre.setEnabled(true);
            txtNombre.setEnabled(true);

            hombre.setEnabled(true);
            mujer.setEnabled(true);
            si2.setEnabled(true);
            no2.setEnabled(true);
            si3.setEnabled(true);
            no3.setEnabled(true);
            txtTelefono.setEnabled(true);
            si4.setEnabled(true);
            no4.setEnabled(true);
            txtCorreo.setEnabled(true);

        }
        if(no.isSelected()){
            clearTextFields();
            txtNombre.setEnabled(false);
            txtApellido1.setEnabled(false);
            txtApellido2.setEnabled(false);
            txtEdad.setEnabled(false);
            txtNombre.setEnabled(false);
            txtNombre.setEnabled(false);
            txtNombre.setEnabled(false);
            txtNombre.setEnabled(false);
            txtNombre.setEnabled(false);
            txtNombre.setEnabled(false);

            hombre.setEnabled(false);
            mujer.setEnabled(false);
            si2.setEnabled(false);
            no2.setEnabled(false);
            si3.setEnabled(false);
            no3.setEnabled(false);
            txtTelefono.setEnabled(false);
            si4.setEnabled(false);
            no4.setEnabled(false);
            txtCorreo.setEnabled(false);
        }
        if(hombre.isSelected()){
            sexo="Hombre";
        }
        if(mujer.isSelected()){
            sexo="Mujer";
        }
        if(si2.isSelected()){
            diabetes="SI";
        }
        if(no2.isSelected()){
            diabetes="NO";
        }
    }

    public class EventClick implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = txtNombre.getText();
            String aPaterno = txtApellido1.getText();
            String aMaterno = txtApellido2.getText();
            String edad = txtEdad.getText();
            String motivo = txtMotivo.getText();
            String medico = txtMedico.getText();
            String hora = txtHora.getText();
            String fecha = txtFecha.getText();
            String telefono = txtTelefono.getText();
            String correo = txtCorreo.getText();

            citaGUIS.add(new CitaGUI(nombre,aPaterno,aMaterno,edad,sexo,motivo,diabetes,medico,hora,fecha,telefono,correo));
            mostrar(citaGUIS);

            clearTextFields();
        }
    }
    public void mostrar(ArrayList<CitaGUI> lista){
        System.out.println("----------CITAS----------");
        for (CitaGUI cita:lista) {
            System.out.println(cita);
            System.out.println("*********************************************************");
        }
    }

    public static ArrayList<CitaGUI> getCitaGUIS() {
        return citaGUIS;
    }
}
