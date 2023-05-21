package ejb;

import entities.*;
import javax.ejb.*;
import javax.persistence.*;

	@Stateless
	public class Product2 extends Abstract< Fil> {

		@PersistenceContext(unitName = "ejb" )
		private EntityManager em;
		
		@Override
		protected EntityManager getEntityManager() {
			return em;
		}
		
		public Product2() {
			super(Fil.class);
		}

    }