package devandroid.moreira.appconsultamedica.model;

public class Paciente {

    private String nomeCompleto;
    private String Rg;
    private String especialista;
    private String telefoneContato;

    public Paciente(){

    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nomeCompleto='" + nomeCompleto + '\'' +
                ", Rg='" + Rg + '\'' +
                ", especialista='" + especialista + '\'' +
                ", telefoneContato='" + telefoneContato + '\'' +
                '}';
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;





    }
}
