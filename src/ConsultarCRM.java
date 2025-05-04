import Medicos.MedicosCadastro;
import java.util.Scanner;

import static Medicos.cadastrarMedico.cadastrarMedico;

public class ConsultarCRM {
    public static void main(String[] args) {
        DadosDoMedico();
    }

    public static void DadosDoMedico() {
        Scanner scanner = new Scanner(System.in);
        MedicosCadastro cadastro = new MedicosCadastro();

        int CRM;

        System.out.println("Digite a CRM do medico: ");
        CRM = scanner.nextInt();

        if (CRM == cadastro.crmCadastro) {
            System.out.println("Nome do medico: " + cadastro.nomeCadastro);
            System.out.println("Cargo do medico: " + cadastro.medicoscadastro);
            System.out.println("Especialidade do medico: " + cadastro.especialidadeCadastro);
            System.out.println("UF de Registro: " + cadastro.ufCadastro);
        }

        else { System.out.println("CRM inexistente, gostaria de cadastrar um novo?");
            System.out.println("[1] Sim");
            System.out.println("[2] Nao");
            int escolha = scanner.nextInt();

            switch(escolha) {
                case 1 -> cadastrarMedico();
                case 2 -> //TODO COLOCAR O MÉTODO PARA VOLTAR AO PRIMEIRO SWITCH
                        System.out.println("Voltando para o menu...");
            }
        }

    }
}
