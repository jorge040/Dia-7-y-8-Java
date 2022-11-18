public class VideoJuegos implements Inter {

    String Titulo, Genero, Compania;
    String Estatus;
    int Duracion = 10;
    
    public VideoJuegos(String titulo, String genero, String compania, int duracion) {
        this.Titulo = titulo;
        this.Genero = genero;
        this.Compania = compania;
        this.Duracion = duracion;
    }

    public String getCompania() {
        return Compania;
    }

    public void setCompania(String compania) {
        Compania = compania;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    @Override
    public String toString() {
        return "VideoJuegos [Titulo=" + Titulo + ", Genero=" + Genero + ", Compania=" + Compania + ", Estatus="
                + Estatus + ", Duracion=" + Duracion + "]";
    }

    public void ArregloJuegos(){
        int[] Cantidad_Juegos = new int[5];

        Cantidad_Juegos[0] = 37;
        Cantidad_Juegos[1] = 37;
        Cantidad_Juegos[2] = 64;
        Cantidad_Juegos[3] = 24;
        Cantidad_Juegos[4] = 17;

        for (int i = 0; i < 5; i++) {
            System.out.println(Cantidad_Juegos[i]);
            
        }

     }

    public static void main(String[] args) {
        VideoJuegos VJ = new VideoJuegos(null, null, null, 0);
        VJ.ArregloJuegos();


    }
 


    
}
