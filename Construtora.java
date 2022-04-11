/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Construtora {
    
       public static void main(String[] args){
        Empresa empresa = new Empresa();
        empresa.nome = "Imed";
        empresa.nomeFanstasia = "Lobão";
        empresa.endereco = "R. Gen. Prestes Guimarães, 304 - Vila Rodrigues, Passo Fundo - RS, 99070-220";
        empresa.telefone = 123456789;
        empresa.cnpj = "00000000000000";
        empresa.numeroDeFun = 80;

        Funcionario funcioanario = new Funcionario();
        
        funcioanario.nome = "Gabriel";
        funcioanario.email = "naoseinãosei@gmail.com";
        funcioanario.telefone = 123456789;
        funcioanario.cargo = "Alundo da Imed";
        funcioanario.carteiraDeTrabalho = 1233453;
        funcioanario.salario = "R$ 1200" ;
       
        empresa.infoEmpresa();
        System.out.println("");
        funcioanario.dadosFuncionario();
        System.out.println("");
        empresa.infoEmpresa();
    }

}

