package Proyecto;

public class videojuegos implements entregable {

	private String titulo;
	private int duracion=10;
	private boolean entregado=false;
	private String genero;
	private String compañia;
	
	videojuegos(){
		
	}
	
	videojuegos(String titulo, int duracion){
		
	}
	
	videojuegos(String titulo, int duracion,String genero,String compañia ){
		
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

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "videojuegos [titulo=" + titulo + ", duracion=" + duracion + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + compañia + "]";
	}
	
	public void entregar() {
		
	}
	public void devolver() {
		
	}
	public void isEntregado() {
		
	}
	
	
}
