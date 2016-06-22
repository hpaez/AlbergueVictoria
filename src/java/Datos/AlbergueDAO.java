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

    public AlbergueDAO() {
        this.conexion = new ConexionBD();
        this.conexion.conectar();
    }

    public int actualizar(AlbergueVO objAlbergueVO) {
        String query = "UPDATE albergue SET ESTADOALBERGUE = '" + objAlbergueVO.getEstado() + "' WHERE IDALBERGUE = '" + objAlbergueVO.getIdAlbergue() + "'";
        System.out.println(query);
        return this.conexion.ejecutarUpdate(query);
    }

    public ArrayList<AlbergueVO> getListaAlbergue(AlbergueVO objAlbergueVO) {
        String query = "SELECT * FROM albergue WHERE RUTUSUARIO = '" + objAlbergueVO.getRutUsuario() + "'";
        ResultSet rs = this.conexion.ejecutarQuery(query);

        ArrayList<AlbergueVO> listaAlbergue = new ArrayList();

        try {
            while (rs.next()) {
                objAlbergueVO.setIdAlbergue(rs.getInt("IDALBERGUE"));
                objAlbergueVO.setNombre(rs.getString("NOMBRE"));
                listaAlbergue.add(objAlbergueVO);
            }
        } catch (Exception e) {
            return listaAlbergue;
        }
        return listaAlbergue;
    }
}
