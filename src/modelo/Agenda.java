package modelo;

/**
 *
 * @author AndreyFernandesTraja
 */
public class Agenda {
    private int id_Agenda;
    private int idpaciente;
    private int idmedico;
    private String paciente;
    private String ano;
    private String mes;
    private String dia;
    private String hora;
    private String min;
    private String exame;
    private int exametipo;
    
    public Agenda() {
        
    }
    
    public Agenda(int id_Agenda, String paciente, String ano, String mes, String dia, String hora, String min, String exame, int exametipo) {
        this.id_Agenda = id_Agenda;
        this.paciente = paciente;
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.min = min;
        this.exame = exame;
        this.exametipo = exametipo;
    }

    public int getId_Agenda() {
        return id_Agenda;
    }

    public void setId_Agenda(int id_Agenda) {
        this.id_Agenda = id_Agenda;
    }

    public int getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(int idpaciente) {
        this.idpaciente = idpaciente;
    }

    public int getIdmedico() {
        return idmedico;
    }

    public void setIdmedico(int idmedico) {
        this.idmedico = idmedico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public int getExametipo() {
        return exametipo;
    }

    public void setExametipo(int exametipo) {
        this.exametipo = exametipo;
    }
    
    public void separarData(String data){
       String dia = "", mes = "", ano = "", hora = "", min = "";
       
       ano += data.charAt(0);
       ano +=data.charAt(1);
       ano +=data.charAt(2);
       ano +=data.charAt(3);
       setAno(ano);
       mes += data.charAt(5);
       mes +=data.charAt(6);
       setMes(mes);
       dia += data.charAt(8);
       dia +=data.charAt(9);
       setDia(dia);
       hora += data.charAt(11);
       hora +=data.charAt(12);
       setHora(hora);
       min += data.charAt(14);
       min +=data.charAt(15);
       setMin(min);
   }
   
   public void Data(String data){
       String dia = "", mes = "", ano = "", hora = "", min = "";
       
       dia += data.charAt(0);
       dia += data.charAt(1);
       setDia(dia);
       mes += data.charAt(3);
       mes +=data.charAt(4);
       setMes(mes);
       ano += data.charAt(6);
       ano +=data.charAt(7);
       ano +=data.charAt(8);
       ano +=data.charAt(9);
       setAno(ano);
       hora += data.charAt(11);
       hora +=data.charAt(12);
       setHora(hora);
       min += data.charAt(14);
       min +=data.charAt(15);
       setMin(min);
       
   }
   
   public String juntarDataTabela(){
       String data = "";
       data += dia+"/"+mes+"/"+ano+" "+hora+":"+min;
       return data;
   }
   
   public String juntarDataBanco(String ano, String mes, String dia, String hora, String min){
       String data = "";
       data+= ano+"/"+mes+"/"+dia+" "+hora+":"+min+":00";
       return data;
   }
}
