package ejb;

import entities.*;
import javax.ejb.*;
import javax.persistence.*;

	@Stateless
	public class Product extends Abstract< Adress> {

		@PersistenceContext(unitName = "ejb" )
		private EntityManager em;
		
		@Override
		protected EntityManager getEntityManager() {
			return em;
		}
		
		public Product() {
			super(Adress.class);
		}

    }

