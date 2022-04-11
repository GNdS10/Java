/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Empresa {
    
    public String nome;
    public String nomeFanstasia;
    public String endereco;
    public int telefone;
    public String cnpj;
    public int numeroDeFun;
    

    public void infoEmpresa(){
        System.out.println("Nome da empresa: " + nome);
        System.out.println("Nome Fantasia:" + nomeFanstasia );
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Numeor de Funcioanrios: " + numeroDeFun);
       
    }



}
