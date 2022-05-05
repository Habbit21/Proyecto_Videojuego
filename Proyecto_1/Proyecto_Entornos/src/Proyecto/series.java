package Proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class series implements entregable{
	
	static BufferedReader lector=new BufferedReader(new InputStreamReader (System.in));
	
	private String titulo;
	private int ntemp;
	private boolean entregado=false;
	private String genero;
	private String creador;
	
	series() {
		
	}

	series(String titulo,String creador) {
			
	}
	
	series(String titulo,String creador,int ntemp,String genero) {
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNtemp() {
		return ntemp;
	}

	public void setNtemp(int ntemp) {
		this.ntemp = ntemp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	@Override
	public String toString() {
		return "series [titulo=" + titulo + ", ntemp=" + ntemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
	
	public void pedir() throws IOException {
		System.out.println("Introduzca el titulo de la serie: ");
		titulo=lector.readLine();
		System.out.println("Introduzca el numero de temporadas: ");
		ntemp=Integer.parseInt(lector.readLine());
		System.out.println("Introduzca el genero de la pelicula: ");
		genero=lector.readLine();
		System.out.println("Introduzca el nombre del creador: ");
		creador=lector.readLine();
	}
		
	public void entregar() {
		entregado = true;
	}
	public void devolver() {
		entregado = false;
	}
	public void isEntregado() {
		
	}
	
}
