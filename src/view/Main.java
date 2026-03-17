package view;

import javax.swing.JOptionPane;
import controller.KillController;

public class Main {

	public static void main(String[] args) {
		KillController kill = new KillController();
        int opc = 0;

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                "MENU\n"
                + "1 - Lista Processos\n"
                + "2 - Kill PID\n"
                + "3 - Kill Name\n"
                + "9 - Fim"
            ));

            switch (opc) {
                case 1:
                    kill.listaProcessos();
                    break;
                case 2:
                    String pid = JOptionPane.showInputDialog("Digite o PID do processo:");
                    kill.killPid(pid);
                    break;
                case 3:
                    String nome = JOptionPane.showInputDialog("Digite o nome do processo:");
                    kill.killNome(nome);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Fim!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
	}
}