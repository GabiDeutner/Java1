
package ExercicioJava;

public class ProgramaB {

    public double SM, PR;


void lerSM ( double SM1) { this.SM = SM1; }
void lerPR ( double PR1) { this.PR = PR1; }



double calculaNS () {
    double NS = (this.SM)*(1+(this.PR/100));
return NS;
}


public void exibir ( ) {
 double NS = calculaNS();

System.out.println("\n*** Tela de Saída ***\n");
 System.out.println("\nValor do salário mensal: " + this.SM);
 System.out.println("\nValor do percentual de reajuste: " + this.PR);
 System.out.println("\nValor do novo salário: " + NS);

}
}
