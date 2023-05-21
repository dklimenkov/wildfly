package ejb;

import entities.*;
import javax.ejb.*;
import javax.persistence.*;

	@Stateless
	public class Product1 extends Abstract< Buil> {

		@PersistenceContext(unitName = "ejb" )
		private EntityManager em;
		
		@Override
		protected EntityManager getEntityManager() {
			return em;
		}
		
		public Product1() {
			super(Buil.class);
		}

    }