/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scientific.unit.converter;

/**
 *
 * @author DELL
 */
import java.awt.*; 
import java.awt.event.*;
import java.applet.*; 
import javax.swing.*;
import java.math.*;

public class ScientificUnitConverter extends Frame implements ItemListener, ActionListener
{ 
    //iniatialized all the GUI components
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;
    long i = 0;
    long r = 0;     

    public ScientificUnitConverter() { 
        //add all the GUI components
        super("Scientific Calculator With Unit Converter v.1.0"); 
        setSize(400,400);
        setLayout(null);
        setBackground(Color.lightGray);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30,45,250,30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        convertFrom = new JComboBox();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("feet");
        convertFrom.addItem("inch");
        convertFrom.addItem("metre");
        convertFrom.addItem("millimetre");        
        convertFrom.addItem("pascal");
        convertFrom.addItem("mpa");
        convertFrom.addItem("kpa");
        convertFrom.addItem("gpa");
        convertFrom.addItem("bar");
        convertFrom.addItem("newton");
        convertFrom.addItem("kg");
        convertFrom.addItem("kg.m");
        convertFrom.addItem("kg.cm");
        convertFrom.addItem("kg.mm");
        convertFrom.addItem("n.m");
        convertFrom.addItem("n.cm");
        convertFrom.addItem("n.mm");
        //convertFrom.addItem("rps");
        convertFrom.addItem("rpm");
        convertFrom.addItem("yard");
        convertFrom.addItem("hectare");
        convertFrom.addItem("acre");
        add(convertFrom);


        lblTo = new JLabel("To:");
        lblTo.setBounds(230,45,250,30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        convertTo = new JComboBox();
        convertTo.setBounds(230,70,150,30);
        convertTo.addItem("feet");
        convertTo.addItem("inch");
        convertTo.addItem("metre");
        convertTo.addItem("millimetre");       
        convertTo.addItem("pascal");
        convertTo.addItem("mpa");
        convertTo.addItem("kpa");
        convertTo.addItem("gpa");
        convertTo.addItem("bar");
        convertTo.addItem("newton");
        convertTo.addItem("kg");
        convertTo.addItem("kg.m");
        convertTo.addItem("kg.cm");
        convertTo.addItem("kg.mm");
        convertTo.addItem("n.m");
        convertTo.addItem("n.cm");
        convertTo.addItem("n.mm");
        convertTo.addItem("rps");
        convertTo.addItem("rpm");
        convertTo.addItem("yard");
        convertTo.addItem("hectare");
        convertTo.addItem("acre");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50,110,300,30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50,140,300,30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(100,250,100,30);
        add(compute);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50,170,300,30);
        add(to);   

        txtTo = new JTextField(15);
        txtTo.setBounds(50,200,300,30);
        txtTo.setEditable(true);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        exit = new JButton("Exit");
        exit.setBounds(210,250,100,30);
        add(exit);
        
        //register all the GUI components who will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);
        
        //this will close the applet window if the user clicked the close or exit button
        addWindowListener(new WindowAdapter() { 
                public void windowClosing(WindowEvent e) { 
                    exit(); 
                } 
            });
    }
    //the exit method
    public void exit(){ 
        setVisible(false); 
        dispose(); 
        System.exit(0); 
    } 
    //show or make the applet window frame visible 
    public static void main(String args[]) { 
        ScientificUnitConverter w = new ScientificUnitConverter(); 
        w.setVisible(true); 
    } 

    public void Convertfeet() {
        if(convertTo.getSelectedItem()=="feet")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="inch")
        {
            result = (input * 12);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="metre")
        {
            result = (input * 0.305);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="millimetre")
        {
            result = (input * 304.8);
            txtTo.setText(""+result);
        }
        
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
    }

public void Convertinch() {
        if(convertTo.getSelectedItem()=="inch")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="feet")
        {
            result = (input * 0.0833);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="metre")
        {
            result = (input * 0.0254);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="millimetre")
        {
            result = (input * 25.4);
            txtTo.setText(""+result);
        }
        
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
    }

public void Convertmetre() {
        if(convertTo.getSelectedItem()=="metre")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="inch")
        {
            result = (input * 39.27);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="feet")
        {
            result = (input * 3.280);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="millimetre")
        {
            result = (input *1000);
            txtTo.setText(""+result);
        }
        
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
    }

public void Convertmillimetre() {
        if(convertTo.getSelectedItem()=="millimetre")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="inch")
        {
            result = (input * 0.0394);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="metre")
        {
            result = (input * 0.001);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="feet")
        {
            result = (input * 0.003);
            txtTo.setText(""+result);
        }
        
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
    }

public void Convertrpm() {       
       if(convertTo.getSelectedItem()=="rps")
        {
            result = (input * 60);
            txtTo.setText(""+result);
        }
}
public void Convertpascal() {
        if(convertTo.getSelectedItem()=="pascal")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="mpa")
        {
            result = (input * 1e-6);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="kpa")
        {
            result =  input * 0.001;
            txtTo.setText("0.002"+result);
        }
        else if(convertTo.getSelectedItem()=="gpa")
        {
            result = (input * 1e-9);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="bar")
        {
            result = (input * 1e-5);
            txtTo.setText(""+result);
        }
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
    }

public void Convertbar() {
        
        if(convertTo.getSelectedItem()=="pascal")
        {
            result = (input * 100000);
            txtTo.setText(""+result);
        }
        else 
        {
            result = (input * input);
            txtTo.setText(""+result);
        }
}

public void Convertnewton() {
        
         if(convertTo.getSelectedItem()=="kg")
        {
            //result = (input * 0.102);
            txtTo.setText(""+input * 0.102);
        }
}

    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());
        String msg = txtFrom.getText();

        if(e.getSource()==compute)
        {
            if(convertFrom.getSelectedItem()=="feet")
            {
                Convertfeet();                 
            }
            
          else if(convertFrom.getSelectedItem()=="inch")
            {
                Convertinch();
            }
             else if(convertFrom.getSelectedItem()=="millimetre")
            {
                Convertmillimetre();
            }      
            else if(convertFrom.getSelectedItem()=="metre")
            {
                Convertmetre();
            }     
            else
            {
                txtTo.setText(""+input);
            }

        }

          
        //this will asked the user to exit or not
        else
        {
            //this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null,"Do you want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {

    }
} 

