import java.util.Scanner;
public class Película {

    static String Titulo, Estatus, Genero, Director;
    static int Duracion = 2;

    

    public Película(String titulo, String genero, String director, int duracion) {
        this.Titulo = titulo;
        this.Genero = genero;
        this.Director = director;
        this.Duracion = duracion;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
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
        return "Película [Titulo=" + Titulo + ", Estatus=" + Estatus + ", Genero=" + Genero + ", Director=" + Director
                + ", Duracion=" + Duracion + "]";
    }

    public void ArregloPeliculas(){
        int[] Cantidad_Peliculas = new int[5];

        Cantidad_Peliculas[0] = 3;
        Cantidad_Peliculas[1] = 7;
        Cantidad_Peliculas[2] = 6;
        Cantidad_Peliculas[3] = 14;
        Cantidad_Peliculas[4] = 74;

        for (int i = 0; i < 5; i++) {
            System.out.println(Cantidad_Peliculas[i]);
            
        }
        

    }

    public void Buenas() {
        Scanner Entrada = new Scanner(System.in);

        int saludo;

        System.out.println("Que Hora es:");
        saludo = Entrada.nextInt();

        if (saludo >= 6 && saludo <= 12) {
            System.out.println("Buenos Dias");
        } else {
            if (saludo >= 13 && saludo <= 20) {
                System.out.println("Buenas Tardes");
            } else {
                System.out.println("Buenas Noches");
            }
        }
    }

    public void Triangulo(){
    Scanner Entrada = new Scanner(System.in);
    
    int T;

    System.out.println("Ingresa la altura de la figura entre 3 y 5");
    T = Entrada.nextInt();

    if (T == 3) {
        System.out.println("Completo: \n"+"*** \n" + "** \n"+"*");
        System.out.println("Hueco: \n"+"* *\n"+"*\n");
        
    } else {if (T == 4) {
        System.out.println("Completo: \n"+"**** \n"+"*** \n"+"**\n"+"*");
        System.out.println("Hueco: \n"+"*  *\n"+"* *\n"+" * ");
        
    } else {if (T == 5) {
        System.out.println("Completo: \n"+"*****\n"+"****\n"+"***\n"+"**\n"+"*");
        System.out.println("Hueco: \n"+"*   *\n"+"*   *\n"+"*  * \n"+"* *\n"+"*");
        
    } else {
        System.out.println("Error 404 no se encontro ese triangulo");
        
    }
        
    }
        
    }
    }
    public void MenosUno(){
        int Nu = 0, Ma = 0, Me = 0, Su = 0, Po  =0, Ne = 0;
        String LP = "";
        do {
            System.out.println("Ingresa el numero: ");
            Nu = Integer.parseInt(System.console().readLine());
            if (Nu == -1) {
                break;   
            }if (Nu != -1) {
                Su  += Nu;
                if (Nu > Ma) {
                    Ma = Nu;
                }
                if (Nu < Me) {
                    Me = Nu;
                }
                if (Nu > 0) {
                    Po  += Nu;
                }
                if (Nu % 2 != 0) {
                    LP += Nu + "";
                    
                }
            }else{
                Ne += Nu;
            }
        } while (Nu != -1);
        System.out.println("El numero Mayor es: " + Ma);
        System.out.println("El numero Menor es: " + Me);
        System.out.println("La suma es: " + Su);
        System.out.println("La suma de los numero Positivos es: " + Po);
        System.out.println("La suma de los numero Negativos es: " + Ne);
        System.out.println("Los numeros Primos son: " + LP);
    }

   
    public void Traductor(){
        Scanner Entrada = new Scanner(System.in);

        int traductor,traducir;
        String Extra;

        System.out.println("Agrega Una Palabra extra");
        Extra = Entrada.nextLine();

        System.out.println("Ingresa el idioma que vas a Traducir: "+"\n"+"Ingles: 1 Frances: 2");
        traductor = Entrada.nextInt();

        

        if (traductor == 1) {
            System.out.println("Seleccionaste Ingles");

        System.out.println("Ingresa la palabra para traducir: ");
        System.out.println(" Hola: 1 \n Adios: 2 \n Lapiz; 3 \n Libro: 4 \n Carro: 5");
        traducir = Entrada.nextInt();

        if (traducir == 1) {
            System.out.println("La traduccion es: Hello" + " Agregaste: " + Extra);
        }else{
            if (traducir == 2) {
                System.out.println("La traduccion es: Bye" + " Agregaste: " + Extra);
                
            } else {
                if (traducir == 3) {
                    System.out.println("La traduccion es: Pen" + " Agregaste: " + Extra);
                } else {
                    if (traducir == 4) {
                        System.out.println("La traduccion es: Book" + " Agregaste: " + Extra);         
                    } else {
                        if (traducir == 5) {
                            System.out.println("La traduccion es: Car" + " Agregaste: " + Extra);
                            
                        } else {
                            System.out.println("Esa traduccion no se encuentra" + " Agregaste: " + Extra);
                        }
                        
                    }
                }
                
            }
        }
            
        } else {
            if (traductor == 2) {
                System.out.println("Seleccionaste Frnaces"); 
                
        System.out.println("Ingresa la palabra para traducir: ");
        System.out.println(" Hola: 1 \n Adios: 2 \n Lapiz; 3 \n Libro: 4 \n Carro: 5");
        traducir = Entrada.nextInt();

        if (traducir == 1) {
            System.out.println("La traduccion es: Salut" + " Agregaste: " + Extra );
        }else{
            if (traducir == 2) {
                System.out.println("La traduccion es: adieu" + " Agregaste: " + Extra );
                
            } else {
                if (traducir == 3) {
                    System.out.println("La traduccion es: crayon" + " Agregaste: " + Extra);
                } else {
                    if (traducir == 4) {
                        System.out.println("La traduccion es: livre" + " Agregaste: " + Extra);         
                    } else {
                        if (traducir == 5) {
                            System.out.println("La traduccion es: chariot" + " Agregaste: " + Extra);
                            
                        } else {
                            System.out.println("Esa traduccion no se encuentra" + " Agregaste: " + Extra);
                        }
                        
                    }
                }
                
            }
        }
            } else {
                System.out.println("No entiendo ese idioma");                
            }
        }

    }

    public static void main(String[] args) {
        Película P = new Película(Titulo, Genero, Director, Duracion);
        //P.Buenas();
        //P.Triangulo();
        //P.MenosUno();
        //P.Traductor();
        //P.ArregloPeliculas();
        
    }

    

    
    
}
