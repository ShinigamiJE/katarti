package compilador;

import java.io.IOException;

/**
 *
 * @author Jesús
 */
public class Compilador {
    /*
    
        Compilador Katarti
    */
    
            
    public static void main(String[] args) throws IOException {
        
        //Objeto Depurador código fuente, remover Comentarios y tabulaciones
        depurar dep = new depurar();
                
        //Fichero contenedor del codigo fuente, escrito en katarti, con extencion .gri
        ficheroFuente fuente = new ficheroFuente();
        
        //Fichero donde se almacena el codigo sin comentarios ni tabulaciones
        ficheroDestino destino = new ficheroDestino();
        
        //Analizador lexico, 
        lexico l = new lexico();
        
        dep.borrarCT(fuente, destino);
        
        System.out.println("\n\n\n\n");
        
        l.compara(destino);
        System.out.println("\n\n\n\n");
        l.exp.ident.impIdent();
        
        
        
        
        
        
        /*String token = "";      
        
        
        //obtener del archivo destino una linea
        token = destino.l.readLine();
        
        
        //declarar Objeto StringTokenizer
        StringTokenizer t = new StringTokenizer(token);
        
        //
        System.out.println(t.nextToken());*/
        
    }
    
}