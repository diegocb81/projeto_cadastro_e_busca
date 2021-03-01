import java.util.List;
import java.util.ArrayList;

public class ModeloDeDados {

    public static ArrayList<Contato> lista = new ArrayList<Contato>();

    public static void main(String[] args) {

        adicionarContato(new Contato("Pelé", "987654321", "pele@gmail.com", "Santos"));
        adicionarContato(new Contato("Maradona", "987654322", "maradona@gmail.com", "Nápoli"));
        adicionarContato(new Contato("Ronaldinho", "987654323", "ronaldinho@gmail.com", "Grêmio"));
        adicionarContato(new Contato("Messi", "987654324", "messi@gmail.com", "Barcelona"));
        adicionarContato(new Contato("Romário", "987654325", "romario@gmail.com", "Vasco"));
        adicionarContato(new Contato("Garrincha", "987654326", "garrincha@gmail.com", "Botafogo"));
        adicionarContato(new Contato("Zidane", "987654327", "zidane@gmail.com", "Real Madrid"));
        adicionarContato(new Contato("Maradona Jr", "987654328", "maradonajr@gmail.com", "Boca Juniors"));

        switch (Integer.parseInt(args[0])){
            case 1:imprimeListaCompleta();break;
            case 2:removerContato(args[1]);break;
            case 3:buscaNome(args[1]);break;
        }
        if (Integer.parseInt(args[2])==1){
            imprimeListaCompleta();
        }

    }

        public static void adicionarContato(Contato contato) {
            lista.add(contato);
        }

        public static void imprimeListaCompleta() {

            for (Contato item : lista) {
                System.out.println("Nome: " + item.nome +
                        "\nTel.: " + item.telefone +
                        "\nemail: " + item.email +
                        "\nEmpresa: " + item.empresa + "\n_____\n");
            }

        }

        public static void removerContato (String nome){
            boolean encontrado = false;
            for (int i = 0; i < lista.size(); i++) {
                String nomeVez = lista.get(i).nome;
                if (nomeVez.equals(nome)) {
                    encontrado = true;
                    lista.remove(i);
                    System.out.println("Nome Removido:" + nomeVez);
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Nome não encontrado!");
            }

        }
        public static void buscaNome (String nome){
            boolean encontrado = false;

            for (int i = 0; i < lista.size(); i++) {
                String nomeVez = lista.get(i).nome;
                if (nomeVez.equals(nome)) {
                    encontrado = true;
                    System.out.println("Nome Encontrado!\n\n" + lista.get(i).nome + "\n" + lista.get(i).telefone + "\n" + lista.get(i).email + "\n" + lista.get(i).empresa);
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Nome não encontrado!");
            }

        }

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



