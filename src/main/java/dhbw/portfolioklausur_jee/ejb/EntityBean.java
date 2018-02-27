/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dhbw.portfolioklausur_jee.ejb;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
 
/**
 *
 * @author Christian
 */
public abstract class EntityBean<T, EntityId> {
     
    @PersistenceContext
    EntityManager em;
     
    private final Class<T> entityClass;
     
    public EntityBean(Class<T> entityClass)
    {
        this.entityClass = entityClass;
    }
     
    public T findById(EntityId id)
    {
        return em.find(entityClass, id);
    }
     
    public List<T> findAll()
    {
        String jql = "SELECT x FROM $C x".replace("$C", this.entityClass.getName());
        return this.em.createQuery(jql).getResultList();
    }
     
    public T saveNew(T entity) {
        em.persist(entity);
        return em.merge(entity);
    }
 
    public T update(T entity) {
        return em.merge(entity);
    }
 
    public void delete(T entity) {
        em.remove(entity);
    }
}