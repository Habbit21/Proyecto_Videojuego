package Proyecto;

public class videojuegos implements entregable {

	private String titulo;
	private int duracion=10;
	private boolean entregado=false;
	private String genero;
	private String compa�ia;
	
	videojuegos(){
		
	}
	
	videojuegos(String titulo, int duracion){
		
	}
	
	videojuegos(String titulo, int duracion,String genero,String compa�ia ){
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "videojuegos [titulo=" + titulo + ", duracion=" + duracion + ", entregado=" + entregado + ", genero="
				+ genero + ", compa�ia=" + compa�ia + "]";
	}
	
	public void entregar() {
		
	}
	public void devolver() {
		
	}
	public void isEntregado() {
		
	}
	
	
}
