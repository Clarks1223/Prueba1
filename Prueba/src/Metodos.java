import java.util.Scanner;
public class Metodos {
    Scanner sc=new Scanner(System.in);
    Banco obj=new Banco();
    public void deposito(){
        double auxcant, auxsaldo, auxtot;
        System.out.println("***DEPOSITO***");
        System.out.print("Ingrese la cantidad: ");
        auxcant=sc.nextDouble();
        while (auxcant<0){
            System.out.println("Dato erroneo");
            System.out.print("Ingrese otra cantidad: ");
            auxcant=sc.nextDouble();
        }
        auxsaldo=obj.getSaldo();
        auxtot=auxcant+auxsaldo;
        obj.setSaldo(auxtot);
        System.out.println("Proceso exitoso");
    }

    public void retiro(){
        double auxcant, auxsaldo, auxtot;
        System.out.println("***DEPOSITO***");
        System.out.print("Ingrese la cantidad: ");
        auxcant=sc.nextDouble();
        auxsaldo=obj.getSaldo();
        while(auxcant>auxsaldo){
            System.out.println("El saldo de su cuenta es insuficiente");
            System.out.print("Ingrese otra cantidad: ");
            auxcant=sc.nextDouble();
        }
        auxtot=auxsaldo-auxcant;
        obj.setSaldo(auxtot);
    }

    public void mostar(){
        System.out.println("***INF CUENTA***");
        System.out.println("Nombre: "+obj.getNombre());
        System.out.println("DNI: "+obj.getDNI());
        System.out.println("Saldo actual: "+obj.getSaldo());
    }
}
