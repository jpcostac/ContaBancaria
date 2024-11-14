package org.example;

public class Main {
    private double saldo;

    public Main() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarValor(double valor){
        try{
            if(valor<= 0){
                throw new IllegalArgumentException("Valor inválido para depósito.");
            }
            saldo += valor;
        }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public void sacarValor(double valor){
        try{
            if(valor <= 0){
                throw new IllegalArgumentException("Valor inválido para saque.");
            }
            if(valor > saldo){
                throw new IllegalArgumentException("Saldo insulficiente para saque.");
            }
            saldo -= valor;
         }catch(IllegalArgumentException e){
            System.out.println("Erro: " + e.getMessage());
          }
    }


    public static void main(String[] args) {
        Main obj = new Main();
        obj.depositarValor(20.0);
        System.out.println(obj.getSaldo());

        obj.sacarValor(50.0);
        System.out.println(obj.getSaldo());

    }
}