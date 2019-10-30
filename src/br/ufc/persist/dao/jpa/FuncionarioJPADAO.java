package br.ufc.persist.dao.jpa;

import br.ufc.persist.dao.FuncionarioDAO;
import br.ufc.persist.model.Funcionario;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario>
						   implements FuncionarioDAO {

	
	
	public FuncionarioJPADAO() {
		super(Funcionario.class);
	}

//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Contato> findByNome(String nome) {
//		EntityManager em = JPAUtil.getEntityManager();
//		Query query = em.createNamedQuery("Contato.findByNome");
//		// query.setParameter("nome", nome);
//		query.setParameter(1, nome);
//		return query.getResultList();
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<Contato> findByParteDoNome(String nome) {
//		EntityManager em = JPAUtil.getEntityManager();
//		Query query = em.createQuery("SELECT c FROM Contato c"
//									+ " WHERE c.nome LIKE :nome");
//		query.setParameter("nome", nome+"%");
//		return query.getResultList();
//	}
//	
}








