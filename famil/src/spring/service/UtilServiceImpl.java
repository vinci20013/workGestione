package spring.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.hibernate.HibernateException;

import spring.domain.*;
import spring.reposity.HibernateDao;

public class UtilServiceImpl implements UtilService{


		private HibernateDao dataAccess;
		
		public void setDataAccess(HibernateDao dataAccess){		
			this.dataAccess=dataAccess;
		}

		public Utente restituisciUtente(String u, String p) throws Exception {			
			Utente utente=dataAccess.daiUtente(u,p);
			return utente;			
		}		
		public Persona restituisciPersonaById(int rs) {
			Persona persona=dataAccess.daiPersona(rs);
			
			return persona;			
	}
		public void inserisciSpesa(int id,Spesa s){			
				
			dataAccess.insertSpesaNuova(id,s);
			
		}
		public void inserisciEntrata(int id,Spesa s){			
			
			dataAccess.insertEntrataNuova(id,s);
			
		}
		public void modificaEntrata(int id,Spesa s){			
			
			dataAccess.modificaEntr(id,s);
			
		}
		
	    public List recuperaEntrate(int id, int anno, int mese) throws ParseException{			
			
			return dataAccess.restituisciEntrate(id,anno,mese);
			
		}
       public List recuperaUscite(int id, int anno, int mese) throws ParseException{			
			
			return dataAccess.restituisciUscite(id,anno,mese);
			
		}
	    public Spesa recuperaEntr(int idS) throws ParseException{			
			
			return dataAccess.restituisciOggettoSpesa(idS);
			
		}
	    
    /*public Spesa recuperaOggettoSpesa(int idSpesa){			
			
			return dataAccess.restituisciOggettoSpesa(idSpesa);
			
		}*/

	}


