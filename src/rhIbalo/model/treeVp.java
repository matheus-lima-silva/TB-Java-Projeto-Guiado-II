package rhIbalo.model;
import rhIbalo.controller.VPDeEng;

public class treeVp extends treesetFunc<VPDeEng> {

    @Override
    public void adicionar(VPDeEng funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public VPDeEng buscar(String nome) {
        return super.buscar(nome);
    }

    @Override
    public void remover(String nome) {
        super.remover(nome);
    }

    @Override
    public void mostrarTodos() {

        super.mostrarTodos();
    }

    @Override
    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        super.atualizarDados(nome, novoSalario, novoCargo);
    }

}
