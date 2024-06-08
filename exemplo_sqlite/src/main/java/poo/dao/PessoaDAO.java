package poo.dao;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PessoaDAO {
    private static final SessionFactory SessionFactory;

    static {
        try {
            Configuration configuration = new Configuration().configure();
            SessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            throw new ExceptionInInitializerError();
        }
    }

    public void close() {
        SessionFactory.close();
    }

    public void cadastrarPessoa(Pessoa pessoa) {
        Transaction transaction = null;
        try(Session session = SessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.save(pessoa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


    public pessoa getPessoaById(long id) {
        try (Session session - SessionFactory.openSession()) {
            return session.get(Pessoa.class, id);
        }
    }


    public void atualizarPessoa(Pessoa pessoa) {
        Transaction transaction = null;
        try(Session session = SessionFactory.openSession()) {
            transaction = session.beginTransaction();
            session.update(pessoa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }



}