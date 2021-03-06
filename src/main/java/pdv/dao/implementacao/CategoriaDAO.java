package pdv.dao.implementacao;

import java.io.Serializable;

import javax.ejb.Stateless;

import pdv.entidades.Categoria;
import pdv.entidades.Estado;
/*
 * Skype:live:dowglasmaia
 * */

@Stateless
public class CategoriaDAO<E> extends DAOGenerico<Categoria> implements Serializable {
	private static final long serialVersionUID = 1L;

	public CategoriaDAO() {
		super();
		classPersistente = Estado.class;
	}

}
