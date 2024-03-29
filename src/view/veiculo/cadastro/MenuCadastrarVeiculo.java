package view.veiculo.cadastro;

import infra.BancoDadosVeiculo;
import repository.VeiculoRepository;
import service.VeiculoService;
import view.components.menu.ItemMenu;
import view.components.menu.MenuAbstrato;

import java.util.Scanner;

public class MenuCadastrarVeiculo extends MenuAbstrato {

    public MenuCadastrarVeiculo(Scanner scanner) {
        super(new ItemMenu[] {
                new ItemMenu(1, "Pequeno"),
                new ItemMenu(2, "Médio"),
                new ItemMenu(3, "SUV")
        }, scanner);
    }

    @Override
    protected void executarOpcao(Integer opcao) {
        switch (opcao) {
            case 1 -> new MenuCadastrarVeiculoPequeno(new VeiculoService(new VeiculoRepository(new BancoDadosVeiculo())), this.scanner).executar();
            case 2 -> new MenuCadastrarVeiculoMedio(new VeiculoService(new VeiculoRepository(new BancoDadosVeiculo())), this.scanner).executar();
            case 3 -> new MenuCadastrarVeiculoSUV(new VeiculoService(new VeiculoRepository(new BancoDadosVeiculo())), this.scanner).executar();
            default -> System.out.println("Opcão inválida");
        }
    }
}
