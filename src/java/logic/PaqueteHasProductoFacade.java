/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import entities.PaqueteHasProducto;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author huanc
 */
@Stateless
public class PaqueteHasProductoFacade extends AbstractFacade<PaqueteHasProducto> implements logic.PaqueteHasProductoFacadeRemote {

    @PersistenceContext(unitName = "EJBAviajarPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PaqueteHasProductoFacade() {
        super(PaqueteHasProducto.class);
    }
    
}
