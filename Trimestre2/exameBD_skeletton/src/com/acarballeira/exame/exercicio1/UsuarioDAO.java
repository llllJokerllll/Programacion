/*
 * Documento creado no 2020 por DAWDU10
 * CIFP A Carballeira. ExameJDBC en 19 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.acarballeira.exame.exercicio1;

/**
 * @author Jose Manuel Sabarís García <Josemsabaris@gmail.com>
 * Título: ExameJDBC
 * @version 1.0
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class UsuarioDAO.
 */
public class UsuarioDAO implements DAO<Usuario> {

	/**
	 * Gets the.
	 *
	 * @param id the id
	 * @return the usuario
	 */
	@Override
	public Usuario get(int id) {
		Usuario u1 = new Usuario("auxiliar", "auxiliar");
        try {
            Connection con = ConexionBD.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT nome, email, rol FROM usuario where id = " + id + ";");
            
            if(rs.next()) {
            	u1.setId(id);
            	u1.setNome(rs.getString(1));
            	u1.setEmail(rs.getString(2));
            	u1.setRol(Integer.parseInt(rs.getString(3)));
            }
            ConexionBD.devolverConexion(con);
            
        } catch (SQLException e) {
            System.out.println("ERROR SQL: " + e.getMessage());
        } 
        return u1;
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@Override
	public List<Usuario> getAll() {
		List<Usuario> usuarios = new ArrayList<>();
		int aux = 0;
		try {
            Connection con = ConexionBD.obterConexion();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT id, nome, email, rol FROM usuario");
            
            while (rs.next()) { 
                usuarios.add(new Usuario(rs.getString(2), rs.getString(3), Integer.parseInt(rs.getString(4))));
                usuarios.get(aux).setId(rs.getInt(1));
                aux++;
            }
            ConexionBD.devolverConexion(con);
            return usuarios;
            
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        }
		return usuarios;
	}

	/**
	 * Save.
	 *
	 * @param usuario the usuario
	 * @return true, if successful
	 */
	@Override
	public boolean save(Usuario usuario) {
		boolean aceptado = true;
        try {
            Connection con = ConexionBD.obterConexion();
            Statement st = con.createStatement();
            aceptado = st.execute("INSERT INTO usuario (nome, email, rol) VALUES ('" + usuario.getNome() + "', '" + usuario.getEmail() + "', '" + usuario.getRol() + "');");
           
            ConexionBD.devolverConexion(con);
            return aceptado;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        return aceptado;
	}

	/**
	 * Update.
	 *
	 * @param usuario the usuario
	 * @return true, if successful
	 */
	@Override
	public boolean update(Usuario usuario) {
		boolean aceptado = true;
        try {
            Connection con = ConexionBD.obterConexion();
            Statement st = con.createStatement();
            aceptado = st.execute("UPDATE usuario SET nome = '" + usuario.getNome() + "', email = '" + usuario.getEmail() + "', rol = '" + usuario.getRol() + "' WHERE id = " + usuario.getId() + ";");
           
            ConexionBD.devolverConexion(con);
            return aceptado;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: " + e.getMessage());
        } 
        return aceptado;
	}

	/**
	 * Delete.
	 *
	 * @param usuario the usuario
	 * @return true, if successful
	 */
	@Override
	public boolean delete(Usuario usuario) {
		boolean aceptado = true;
        try {
            Connection con = ConexionBD.obterConexion();
            Statement st = con.createStatement();
            aceptado = st.execute("DELETE FROM usuario WHERE id = " + usuario.getId() + ";");
           
            ConexionBD.devolverConexion(con);
            return aceptado;
        } catch (SQLException e) {
            System.out.println("ERROR SQL: ");e.printStackTrace();
        } 
        return aceptado;
	}

}
