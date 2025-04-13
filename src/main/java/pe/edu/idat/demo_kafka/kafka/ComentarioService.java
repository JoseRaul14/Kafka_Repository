package pe.edu.idat.demo_kafka.kafka;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pe.edu.idat.demo_kafka.Model.ComentariosModel;

@Service
public class ComentarioService {
    private final KafkaTemplate<String, ComentariosModel> kafkaTemplate;

    private static final String TOPIC = "comentarios_usuarios";

    public ComentarioService(KafkaTemplate<String, ComentariosModel> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensaje(ComentariosModel comentariosModel){
        kafkaTemplate.send(TOPIC, comentariosModel);
    }

}
