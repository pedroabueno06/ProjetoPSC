import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.Usuario;

public class GerenciadorProjetosApp {
    private static EntityManagerFactory emf;


    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();

        Usuario usuario =
                new Usuario(1, "Pedro", "pedro.ascenco@gmail.com", "12345");

        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
    }
}
