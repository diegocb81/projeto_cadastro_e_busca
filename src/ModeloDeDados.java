import java.util.List;
import java.util.ArrayList;

public class ModeloDeDados {

    public static ArrayList<Contato> lista = new ArrayList<Contato>();

    public static void main(String[] args) {

        adicionarContato(new Contato("Pelé", "987654321", "pele@gmail.com","Santos"));
        adicionarContato(new Contato("Maradona", "987654322", "maradona@gmail.com","Nápoli"));
        adicionarContato(new Contato("Ronaldinho", "987654323", "ronaldinho@gmail.com","Grêmio"));
        adicionarContato(new Contato("Messi", "987654324", "messi@gmail.com","Barcelona"));
        adicionarContato(new Contato("Romário", "987654325", "romario@gmail.com","Vasco"));
        adicionarContato(new Contato("Garrincha", "987654326", "garrincha@gmail.com","Botafogo"));
        adicionarContato(new Contato("Zidane", "987654327", "zidane@gmail.com","Real Madrid"));
        adicionarContato(new Contato("Maradona Jr", "987654328", "maradonajr@gmail.com", "Boca Juniors"));
        //imprimeListaCompleta();
        removerContato(args[0]);
       //buscaNome("Garrincha");
    }

    public static void adicionarContato(Contato contato){
        lista.add(contato);
    }

    public static void imprimeListaCompleta(){

        for (Contato item : lista){
            System.out.println("Nome: "+item.nome+
                    "\nTel.: "+item.telefone+
                    "\nemail: "+item.email+
                    "\nEmpresa: "+item.empresa+"\n_____\n");
        }

    }

    public static void removerContato(String nome){

        for (int i = 0; i<lista.size(); i++){
            String nomeVez = lista.get(i).nome;
            if (nomeVez.equals(nome)){
                lista.remove(i);
                System.out.println("Nome Removido:" + nomeVez);
                break;
            }
        }

    }
    //public void buscaNome(String nome){}

}

    class Contato {
        String nome;
        String telefone;
        String email;
        String empresa;


        public Contato(String nome, String telefone, String email, String empresa) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.empresa = empresa;
        }
    }
