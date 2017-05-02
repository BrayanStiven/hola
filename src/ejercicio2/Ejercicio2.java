package ejercicio2;
import javax.swing.JOptionPane;
public class Ejercicio2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char vocal;
    char r;
    do{
        vocal=(JOptionPane.showInputDialog("digite una letra")).charAt(0);
        
        switch(vocal)
        {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                JOptionPane.showMessageDialog(null,"la letra "+vocal+" es vocal");
            break;
            
            default:
                  {
                  JOptionPane.showMessageDialog(null,"la letra "+vocal+" es consonate");            
                  }
        }
        r=(JOptionPane.showInputDialog("1)contiunar \n 2)salir")).charAt(0);  
    }while(r=='1');    
    }
  }
    
//*hola joli holo //*
//que mas¿?...
