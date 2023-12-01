package Model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EstadiaDAO {
    public EntityManager getEM(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("EstacionamentoPU");
        return factory.createEntityManager();
    }
    
    public Estadia Inserir(Estadia estadia){
        EntityManager em = getEM();
        try{
            em.getTransaction().begin();
            em.persist(estadia);// Executa o insert
            em.getTransaction().commit();
        } catch(Exception e){
            em.getTransaction().rollback();
        } finally{
            em.close();
        }
        return estadia;
    }
    
    public Estadia remove(Integer id){
        EntityManager em = getEM();
        Estadia est = null;
        try{
            est = em.find(Estadia.class, id);
            
            em.getTransaction().begin();
            em.remove(est);
            em.getTransaction().commit();
        }catch(Exception e){
             System.out.println(e);
             em.getTransaction().rollback();
        }finally{
            em.close(); 
        }
        return est;
    }
    
    public Estadia findByTicket(Integer ticket){
         EntityManager em = getEM();
         Estadia est = null;
         try{
             est = em.find(Estadia.class, ticket);
         }catch(Exception e){
            //System.out.println("valor nao encontrado");
         }finally{
            em.close(); 
         }
        return est;
    }
    
    
    public List<Estadia> findAll(){
        EntityManager em = getEM();
        List<Estadia> estadias = null;
        try{
            estadias = em.createQuery("from Estadia l").getResultList();
        }catch(Exception e){
            System.out.println(e);
        }finally{
            em.close(); 
        }
        return estadias;
    }
    
    
    public void Registrar_saida(Integer tk, String data, String hora){
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.createQuery("Update Estadia set data_saida = :data where ticket = :tk")
                .setParameter("tk", tk)
                .setParameter("data", data)
                .executeUpdate();
        em.createQuery("Update Estadia set hora_saida = :hora where ticket = :tk")
                .setParameter("tk", tk)
                .setParameter("hora", hora)
                .executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    public void atualizar_valor(Integer tk, String valor){
        EntityManager em = getEM();
        em.getTransaction().begin();
        em.createQuery("Update Estadia set valor = :valor where ticket = :tk")
                .setParameter("tk", tk)
                .setParameter("valor", valor)
                .executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
}
