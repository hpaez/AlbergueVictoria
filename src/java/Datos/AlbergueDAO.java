/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DerKow
 */
public class AlbergueDAO {

    private ConexionBD conexion;
    private static AlbergueDAO instancia;

    public static AlbergueDAO getInstancia() {
        if (instancia == null) {
            instancia = new AlbergueDAO();
        }
        return instancia;
    }

    public AlbergueDAO() {
        this.conexion =  ConexionBD.getInstancia();
        this.conexion.conectar();
    }

    public int actualizar(AlbergueVO objAlbergueVO) {
        String query = "UPDATE albergue SET ESTADOALBERGUE = '" + objAlbergueVO.getEstado() + "' WHERE IDALBERGUE = '" + objAlbergueVO.getIdAlbergue() + "'";
        System.out.println(query);
        return this.conexion.ejecutarUpdate(query);
    }

    public ArrayList<AlbergueVO> getListaAlbergue(UsuarioVO objUsuarioVO) {
        String query = "SELECT * FROM albergue WHERE RUTUSUARIO = '" + objUsuarioVO.getRut() + "'";
        ResultSet rs = this.conexion.ejecutarQuery(query);

        ArrayList<AlbergueVO> listaAlbergue = new ArrayList();

        try {
            while (rs.next()) {
                AlbergueVO objAlbergueVO = new AlbergueVO();
                objAlbergueVO.setIdAlbergue(rs.getInt("IDALBERGUE"));
                objAlbergueVO.setNombre(rs.getString("NOMBREALBERGUE"));
                listaAlbergue.add(objAlbergueVO);
            }
        } catch (Exception e) {
            return listaAlbergue;
        }
        return listaAlbergue;
    }
}
