package sql;

import dao.dao;
import java.util.ArrayList;
import java.util.Scanner;
import model.Usuarios;


public class SQL {
    
    public static void main(String[] args) {
//        System.out.println("----USUARIOS CADASTRADOS----");
//        ArrayList<Usuarios> usuarios = dao.buscarUser();
//        
//        for (Usuarios u : usuarios){
//            System.out.println("ID: " + u.getId());
//            System.out.println("Nome: " + u.getNome());
//            System.out.println("Email: " + u.getEmail());
//            System.out.println("Senha: " + u.getSenha());
//            System.out.println("CPF: " + u.getCpf());
//            System.out.println("PIS: " + u.getPis());
//            System.out.println("Rua: " + u.getRua());
//            System.out.println("Numero: " + u.getNumero());
//            System.out.println("Complemento: " + u.getComplemento());
//            System.out.println("CEP: " + u.getCep());
//            System.out.println("Cidade: " + u.getCidade());
//            System.out.println("Estado: " + u.getEstado());
//            System.out.println("Pais: " + u.getPais());
//            System.out.println("");
//        }

//        System.out.println("----CADASTRAR USUARIO----");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Digite o nome: ");
//        String nome = scanner.nextLine();
//        System.out.print("Digite o email: ");
//        String email = scanner.nextLine();
//        System.out.print("Digite a senha: ");
//        String senha = scanner.nextLine();
//        System.out.print("Digite o cpf: ");
//        String cpf = scanner.nextLine();
//        System.out.print("Digite o pis: ");
//        String pis = scanner.nextLine();
//        System.out.print("Digite a rua: ");
//        String rua = scanner.nextLine();
//        System.out.print("Digite o numero: ");
//        String numero = scanner.nextLine();
//        System.out.print("Digite o complemento: ");
//        String complemento = scanner.nextLine();
//        System.out.print("Digite o cep: ");
//        String cep = scanner.nextLine();
//        System.out.print("Digite a cidade: ");
//        String cidade = scanner.nextLine();
//        System.out.print("Digite o estado: ");
//        String estado = scanner.nextLine();
//        System.out.print("Digite o pais: ");
//        String pais = scanner.nextLine();
//
//          Usuarios u = new Usuarios();
//          u.setNome(nome);
//          u.setEmail(email);
//          u.setSenha(senha);
//          u.setCpf(cpf);
//          u.setPis(pis);
//          u.setRua(rua);
//          u.setNumero(numero);
//          u.setComplemento(complemento);
//          u.setCep(cep);
//          u.setCidade(cidade);
//          u.setEstado(estado);
//          u.setPais(pais);
//
//        boolean criado = dao.criarUser(u);
//        
//        if(criado){
//            System.out.println("Usuario criado com sucesso.");
//        }else{
//            System.out.println("Erro ao criar usuario.");
//        }

          System.out.println("----DELETAR USUARIO----");
          ArrayList<Usuarios> usuarios = dao.buscarUser();
          
          for(Usuarios u : usuarios){
              System.out.println("[" + u.getId() + "] " + u.getNome());
          }
          Scanner scanner = new Scanner(System.in);
          System.out.print("Digite o Id do usuario a ser excluido: ");
          int id = scanner.nextInt();
          scanner.nextLine();
         
          Usuarios u = new Usuarios();
          u.setId(id);
          
          boolean removido = dao.deletarUser(u);
          
          if(removido){
              System.out.println("Usuario excluido com sucesso.");
          }else{
              System.out.println("Erro ao excluir usuario.");
          }
    }
    

}
