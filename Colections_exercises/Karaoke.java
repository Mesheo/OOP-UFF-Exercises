import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays; 

public class Karaoke{
    private static ArrayList<String> musicasDisponiveisList = new ArrayList<String>(Arrays.asList("musica1", "musica2"));
    private static Map<String, String> musica_artista = new HashMap<String, String>();
        
    public Karaoke(){
        musica_artista.put("cantor1", "musica1");
        musica_artista.put("cantor2", "musica2");
    }

    private void consultaMusicas(){
        System.out.println("Essa é a lista de musicas disponiveis"+ musicasDisponiveisList);
    }

    private void consultaMusicas(String musicaInfo){
        if(musica_artista.containsKey(musicaInfo)){
            System.out.println("--"+musica_artista.get(musicaInfo)+ "-- do artista " + (musicaInfo) + " está disponivel");
            return;
        }
        else {
            for( String musicName : musica_artista.values() ){
                if (musicName.equals(musicaInfo)){
                    System.out.println("Sim a música "+musicaInfo+"esta disponivel");
                    return;
                }
            }
        }
        System.out.println("Não existe musica com esse nome ou desse artista disponível: " +musicaInfo);
            
    }

    public static void main(String[] args){

        // TODO: Criar metodo addToQueue()
        // TODO Criar metodo playNextSong()
        Karaoke sistema_de_Karaoke = new Karaoke();
        sistema_de_Karaoke.consultaMusicas();
        sistema_de_Karaoke.consultaMusicas("cantor1");

    }
}