
package Controladores;

import Modelos.Conexion;
import Vistas.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConexionController implements ActionListener{
    
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    
    Conexion ModeloConexion;

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal, Conexion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaLogin.btnAceptar)
        {
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(), this.VistaLogin.txtPass.getText());
        }
    }
    
}
