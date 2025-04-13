package pe.edu.idat.demo_kafka.controller;

import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_kafka.Model.ComentariosModel;
import pe.edu.idat.demo_kafka.kafka.ComentarioService;
import pe.edu.idat.demo_kafka.kafka.ModeradorService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ComentarioController {

    public final ModeradorService moderadorService;


    private final ComentarioService comentarioService;

    public ComentarioController(ModeradorService moderadorService, ComentarioService comentarioService) {
        this.moderadorService = moderadorService;
        this.comentarioService = comentarioService;
    }

    @PostMapping("/comentario")
    public String enviarMensaje(@RequestBody ComentariosModel comentariosModel) {
        moderadorService.guardarComentarios(comentariosModel);
        return "Mensaje enviado a Kafka";
    }

    @GetMapping("/comentarios")
    public List<ComentariosModel> listarComentarios() {
        return moderadorService.listarComentarios();
    }

}
