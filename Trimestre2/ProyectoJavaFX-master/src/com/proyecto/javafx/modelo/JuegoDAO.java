/*
 * Documento creado no 2020 por DAWDU10 y DAWDU08
 * CIFP A Carballeira. ExameJDBC en 21 mar. 2020
 * Contenido con licencia Creative Commons CC BY-NC-SA.
 */
package com.proyecto.javafx.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class JuegoDAO.
 *
 * @version 1.0
 */

public class JuegoDAO {

	/**
	 * Obter.
	 *
	 * @return the list
	 */
	public List<Juego> obter() {

		ArrayList<Juego> lista = new ArrayList<Juego>();

		try {
			int aux = 0;
			Connection con = ConexionPool.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT id_juego, titulo, genero, plataforma, multijugador FROM tbl_juegos");
			while (rs.next()) {
				lista.add(new Juego(rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
				lista.get(aux).setId_juego(rs.getInt(1));
				aux++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;

	}

	/**
	 * Obter.
	 *
	 * @param id_juego the id juego
	 * @return the juego
	 */
	public Juego obter(int id_juego) {

		Juego aux = new Juego();

		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT titulo, genero, plataforma, multijugador FROM tbl_juegos WHERE idCliente=" + id_juego + ";");
			if (rs.next()) {
				aux.setId_juego(id_juego);
				aux.setTitulo(rs.getString(1));
				aux.setGenero(rs.getString(2));
				aux.setPlataforma(rs.getString(3));
				aux.setMultijugador(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aux;

	}

	/**
	 * Rexistrar.
	 *
	 * @param cliente the cliente
	 * @return true, if successful
	 */
	public boolean rexistrar(Juego cliente) {
		boolean rs = false;
		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement st = con.createStatement();
			rs = st.execute("INSERT INTO tbl_juegos (titulo, genero, plataforma, multijugador) VALUES ('" + cliente.getTitulo() + "', '"
					+ cliente.getGenero() + "', '" + cliente.getPlataforma() + "', '" + cliente.isMultijugador() + "');");

			ConexionPool.devolverConexion(con);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Eliminar.
	 *
	 * @param cliente the cliente
	 * @return true, if successful
	 */
	public boolean eliminar(Juego cliente) {
		boolean rs = false;
		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement st = con.createStatement();
			rs = st.execute("DELETE FROM tbl_juegos WHERE id_juego = " + cliente.getId_juego() + ";");

			ConexionPool.devolverConexion(con);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

	/**
	 * Actualizar.
	 *
	 * @param cliente the cliente
	 * @return true, if successful
	 */
	public boolean actualizar(Juego cliente) {
		boolean rs = false;
		try {
			Connection con = ConexionPool.obtenerConexion();
			Statement st = con.createStatement();
			rs = st.execute("UPDATE tbl_juegos SET titulo = '" + cliente.getTitulo() + "', genero = '"
					+ cliente.getGenero() + "', plataforma = '" + cliente.getPlataforma() + "', multijugador = '" + cliente.isMultijugador() + "' WHERE id_juego = " + cliente.getId_juego() + ";");

			ConexionPool.devolverConexion(con);
			return rs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}

}
