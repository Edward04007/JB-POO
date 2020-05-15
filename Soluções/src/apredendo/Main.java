package apredendo;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        int op = 100;
        while (op != 0){
            op = Integer.parseInt(JOptionPane.showInputDialog(" 0 - Sair\n 1 - Nome\n 2 - Gerar uma senha"));
            if(op == 1){
                String nome = JOptionPane.showInputDialog("");
                System.out.println("Seu nome foi regristrado!" + "\n" + "Nome escolhido " + nome.toUpperCase());
                System.out.println(data);
            } else if(op == 2){
                System.out.println("Sua senha " + Math.random());
            }

        }

        }
    }
