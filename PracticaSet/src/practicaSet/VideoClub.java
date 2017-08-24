package practicaSet;

import java.io.IOException;

public class VideoClub implements Comparable<VideoClub> {

	private Integer codigo;
    private String nombrePelicula;
    private String director;
    private Integer anhoEstreno;
    private Integer precioMercado;
    private Integer cantidad;
    
    public VideoClub() {
    }

    public VideoClub(Integer codigo, String nombrePelicula, String director, Integer anhoEstreno, Integer precioMercado, Integer cantidad) {
        this.codigo = codigo;
        this.nombrePelicula = nombrePelicula;
        this.director = director;
        this.anhoEstreno = anhoEstreno;
        this.precioMercado = precioMercado;
        this.cantidad = cantidad;
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getAnhoEstreno() {
        return anhoEstreno;
    }

    public void setAnhoEstreno(Integer anhoEstreno) {
        this.anhoEstreno = anhoEstreno;
    }

    public Integer getPrecioMercado() {
        return precioMercado;
    }

    public void setPrecioMercado(Integer precioMercado) {
        this.precioMercado = precioMercado;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public static void main(String[] args) {
    	Operaciones operaciones = new Operaciones();
		try {
			operaciones.menu();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

	@Override
	public int compareTo(VideoClub o) {
		if (this.nombrePelicula.compareTo(o.nombrePelicula) == 0) {
			return 0;
		}
		if (this.nombrePelicula.compareTo(o.nombrePelicula) < 0)	{
			return 0;
		}
		if (this.nombrePelicula.compareTo(o.nombrePelicula ) < 0) {
			return -1;
		}
	 return -1;	
	}

}
