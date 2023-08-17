package br.edu.ifpr.tsi.sisacad.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.edu.ifpr.tsi.sisacad.util.HibernateUtil;

public class GenericDAO<Entidade> {

	public void salvar(Entidade entidade) {

		// cria uma sessão de comunicação entre a aplicação Java, Hibernate e banco de
		// dados
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		// try = tentar
		try {
			transacao = sessao.beginTransaction();
			//sessao.merge(entidade);
			sessao.save(entidade);
			// commit = confirmar/consolidar ação
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}

	}

	public void excluir(Entidade entidade) {

		// cria uma sessão de comunicação entre a aplicação Java, Hibernate e banco de
		// dados
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		// try = tentar
		try {
			transacao = sessao.beginTransaction();
			sessao.delete(entidade);
			// commit = confirmar/consolidar ação
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}

	}
	
	public void editar(Entidade entidade) {

		// cria uma sessão de comunicação entre a aplicação Java, Hibernate e banco de
		// dados
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;

		// try = tentar
		try {
			transacao = sessao.beginTransaction();
			sessao.update(entidade);
			// commit = confirmar/consolidar ação
			transacao.commit();
		} catch (RuntimeException erro) {
			if (transacao != null) {
				transacao.rollback();
			}
			throw erro;
		} finally {
			sessao.close();
		}

	}
}
