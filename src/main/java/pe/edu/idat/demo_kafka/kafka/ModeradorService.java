package pe.edu.idat.demo_kafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_kafka.Model.ComentariosModel;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModeradorService {

    private static final List<ComentariosModel> listaComentarios = new ArrayList<>();

    @KafkaListener(topics ="comentarios_usuarios", groupId = "group_idat")

    public void guardarComentarios(ComentariosModel comentario) {
        System.out.println("Comentario recibido: " + comentario);
        listaComentarios.add(comentario);
    }

    public static List<ComentariosModel> listarComentarios() {
        return listaComentarios;
    }


}
