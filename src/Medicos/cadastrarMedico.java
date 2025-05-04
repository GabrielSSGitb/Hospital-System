package Medicos;

import java.util.Scanner;
public class cadastrarMedico {
    public static void main(String[] args) {
        cadastrarMedico();
    }
    public static void cadastrarMedico() {
        Scanner sc = new Scanner(System.in); //Scanner
        MedicosCadastro cadastro = new MedicosCadastro(); //Class Medicos

        //Informações para cadastro na classe cadastro:
        System.out.println("Informe o CRM: ");
        cadastro.crmCadastro = sc.nextInt();
        sc.nextLine(); // Remove o Enter na Linha

        //Verificar se todos os campos foram preenchidos:

        if(cadastro.crmCadastro < 6){ //CRM deve conter no mínimo 06 digitos
            System.out.println("Por favor, digite o CRM corretamente!");
            cadastrarMedico();
        }else {
            System.out.print("Informe o nome do Médico: ");
            cadastro.nomeCadastro = sc.nextLine();
            System.out.print("Informe a o cargo: ");
            cadastro.medicoscadastro = sc.nextLine();
            System.out.print("Informe a especialidade: ");
            cadastro.especialidadeCadastro = sc.nextLine();
            System.out.print("Informe a UF de registro do documento: ");
            cadastro.ufCadastro = sc.nextLine();

            if(cadastro.nomeCadastro == "") {
                System.out.println("Informe um nome!");
                cadastrarMedico();
            } else if(cadastro.medicoscadastro == "") {
                System.out.println("Informe o cargo!");
                cadastrarMedico();;
            }else if(cadastro.especialidadeCadastro == "") {
                System.out.println("Informe um especialidade!");
                cadastrarMedico();
            }else if(cadastro.ufCadastro == "") {
                System.out.println("Informe um UF de registro!");
                cadastrarMedico();
            }else {
                System.out.println("Cadastro Realizado com sucesso!!!");
            };
        };
    };
}
