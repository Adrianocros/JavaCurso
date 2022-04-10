package ProgramaDePedidos.Entities;

import ProgramaDePedidos.Entities.Enuns.StatusDoPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedidos {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private StatusDoPedido status;
    private Cliente cliente;
    private List<ItensDoPedido> itens = new ArrayList<>();

    public Pedidos(){

    }

    public Pedidos(Date moment, StatusDoPedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusDoPedido getStatus() {
        return status;
    }

    public void setStatus(StatusDoPedido status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addItem(ItensDoPedido item){
        itens.add(item);
    }
    public void removeItens(ItensDoPedido item){
        itens.remove(item);
    }

    public double valorTotalPed(){
        double sum = 0.0;
        for(ItensDoPedido it : itens){
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Status do Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: " );
        sb.append(cliente + "\n");
        sb.append("Itens do pedido \n");
        for(ItensDoPedido item : itens){
            sb.append(item + "\n");
        }
        sb.append("Preço toral: R$ ");
        sb.append(String.format("%.2f", valorTotalPed()));
        return sb.toString();

    }

}
