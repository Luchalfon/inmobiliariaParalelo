package Validaciones;


public class Validaciones {

    public static boolean validarEntero(String ingreso){
        try {
            int x = Integer.parseInt(ingreso);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean validarDouble(String ingreso){
        try {
            double x = Double.parseDouble(ingreso);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    //letras y espacio para nombres
    public static boolean validarNombre(String ingreso){
        boolean esNombre=false;
        try{
        esNombre = ingreso.matches("^[a-zA-Z ]+$");
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
       return esNombre;
    }
    //solo letras para un solo nombre
    public static boolean validarSoloLetras(String ingreso){ 
        boolean soloLetras = false;
        try {
            soloLetras = ingreso.matches("^[a-zA-Z]+$");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return soloLetras;
    }
    
    //una letra
    public static boolean validarChar(String ingreso){
        boolean esChar = false;
        try {

            esChar = !(ingreso.length() > 1 || !validarSoloLetras(ingreso));

        } catch (NullPointerException e) {

            System.out.println(e.getMessage());
        }
        return esChar;
    }
    
    
    public static boolean validarDireccion(String ingreso){
        boolean esDire = false;
        try{
            esDire = ingreso.matches("^[a-zA-Z 0-9]+$");
            
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        return esDire;
    }
    /*
        for(char c : ingreso.toCharArray()){
            if(Character.isDigit(c)){
                esTexto = false;
                break;
            }else{
                esTexto=true;
            }
        }*/
}
