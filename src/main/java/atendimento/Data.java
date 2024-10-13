package atendimento;

import java.util.ArrayList;

public class Data {
    private String data;
    private ArrayList<String> horarios;
    private String horarioMarcado;

    public Data(String data){
        this.data = data;
        this.horarios = new ArrayList<String>();
        this.horarios.add("07h");
        this.horarios.add("08h");
        this.horarios.add("09h");
        this.horarios.add("14h");
        this.horarios.add("16h");
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }
    public void setHorario(String horario){
        int n = this.horarios.size();
        int i;
        for (i=0; i<n; i++){
            if (horario == this.horarios.get(i)){
                this.horarioMarcado = this.horarios.get(i);
            }
        }
    }

    public ArrayList<String> getHorarios(){
        return this.horarios;
    }

    public String getHorarioMarcado(){
        return this.horarioMarcado;
    }
}
