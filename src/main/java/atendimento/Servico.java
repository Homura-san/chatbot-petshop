package atendimento;

public class Servico {
    private String tipo;
    private Data dataAgendada;
    private Usuario usuario;
    

    public Servico(String tipo) {
        this.tipo = tipo;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setDataAgendada(Data dataAgendada){
        this.dataAgendada = dataAgendada;
    }

    public Data getDataAgendada(){
        return dataAgendada;
    }

    public void exibirConsulta(String pet) {
        String a = this.usuario.getNomePet(pet);
        System.out.println("Consulta agendada para " + a + " na data " + this.dataAgendada.getData() + "às " + this.dataAgendada.getHorarioMarcado() + ".");
    }
}
