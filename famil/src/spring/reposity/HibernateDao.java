package spring.reposity;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import spring.domain.*;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HibernateDao extends HibernateDaoSupport{
	
	//singleton: in modo tale che una sola sessione per utente sta in piedi	
	 private static HibernateDao istanza;	 
	 
	  private HibernateDao()
	  {
	  }
	  public static HibernateDao getInstance()
	  {
	    if (istanza == null)
	    {
	      istanza = new HibernateDao();
	    }
	    return istanza; 
	  }	
	  
	  public long insertObject(Object object) {
			
			Object generatedId=getHibernateTemplate().save(object);
			
			if(generatedId instanceof Integer)
				return ((Integer)generatedId).longValue();
			else if(generatedId instanceof Long)
				return ((Long)generatedId).longValue();
			else if(generatedId instanceof Short)
				return ((Short) generatedId).longValue();
			else return (long)0; 


		}
	  
	  public void saveOrUpdate(Object object){
			 System.out.println("Sono dentro saveOrUpdate");
			getHibernateTemplate().saveOrUpdate(object);
		}

		public Utente daiUtente(String u, String p) {
			 System.out.println("Sono dentro daiUtente del DAO");
			 
			    Utente utente=null;			 
			 	Criteria criteria = getSession().createCriteria(Utente.class);
				criteria.add(Restrictions.eq("username",u));
				criteria.add(Restrictions.eq("password",p));
				criteria.add(Restrictions.eq("eliminato",0));
				
				List e=criteria.list();				
				if(e.size() > 0){				
				utente = (Utente) e.get(0);		
				}
				return  utente;		
		}
		public Persona daiPersona(int idPersona) {
			   System.out.println("Sono dentro daiPersona del DAO");
			 
			    Persona persona=null;
			 
			    Criteria criteria = getSession().createCriteria(Persona.class);
				criteria.add(Restrictions.eq("idPersona",idPersona));		
				
				List e=criteria.list();				
				if(e.size() > 0){								
				persona = (Persona) e.get(0);	
				}
				return  persona;			
		}
		
		//inserisce nuova spesa
		public void insertSpesaNuova(int id, Spesa spesa){				
						
			Date data=spesa.getDat();
			
			double importo=spesa.getImporto();
			
			String tipologia=spesa.getTipologia();
			String descrizione=spesa.getDescrizione();
			int positiva=spesa.getPositiva();
			int eliminata=spesa.getEliminato();				
					 
		  
		  String sql= "Insert into spesa(idPersona,dat,importo,tipologia,descrizione,positiva,eliminato) VALUES ('"+id+"','"+data+"','"+importo+"','"+tipologia+"','"+descrizione+"','"+positiva+"','"+eliminata+"')";
		 
		  int query =getSession().createSQLQuery(sql).executeUpdate();
		  //System.out.println(query);
	}
		//inserisce entrata nuova
		public void insertEntrataNuova(int id, Spesa spesa){		
			
						
			Date data=spesa.getDat();
			
			double importo=spesa.getImporto();
			
			String tipologia=spesa.getTipologia();
			String descrizione=spesa.getDescrizione();
			int positiva=spesa.getPositiva();
			int eliminata=spesa.getEliminato();				
					 
		  
		  String sql= "Insert into spesa(idPersona,dat,importo,tipologia,descrizione,positiva,eliminato) VALUES ('"+id+"','"+data+"','"+importo+"','"+tipologia+"','"+descrizione+"','"+positiva+"','"+eliminata+"')";
		  //System.out.println(sql);
		  int query =getSession().createSQLQuery(sql).executeUpdate();
		  
	}	
		
		//modifica ENTRATA in visualizzaDettaglioPerAnno
		public void modificaEntr(int idSpesa, Spesa spesa){		
			
			//System.out.println("in DAO "+idSpesa);		
			Date data=spesa.getDat();			
			double importo=spesa.getImporto();			
			String tipologia=spesa.getTipologia();
			String descrizione=spesa.getDescrizione();
			int positiva=spesa.getPositiva();
			int eliminata=spesa.getEliminato();	
			
			try{					
		
				//String sql= "update Spesa set dat= "+data+", importo= "+importo+", tipologia= "+tipologia+", descrizione= "+descrizione+" where id.idSpesa= "+idSpesa+" and idPersona= "+1+"";
				//System.out.println(sql);
				
				// int query=getSession().createQuery(sql).executeUpdate();		  		  
				 
			    Criteria criteria = getSession().createCriteria(Spesa.class);
				criteria.add(Restrictions.eq("id.idSpesa",idSpesa));
				
				List e=criteria.list();
				
				if(e.size() > 0){
					//System.out.println("ciooooooooooooooooooooooooooo");	
					spesa=(Spesa) e.get(0);
					spesa.setDat(data);
					spesa.setImporto(importo);
					spesa.setDescrizione(descrizione);
					spesa.setTipologia(tipologia);
					//this.update(spesa,false);
					getHibernateTemplate().update(spesa);

				} 
				
		}catch(HibernateException e){
				System.err.println(e.getMessage());			 
			}catch(Exception ex){
				System.err.println(ex.getMessage());				
			}		  
	}
//serve per recuperare le entrate dell'anno corrente e mese relativo				
		/*public List restituisciEntrate(int id){
			    
			
				System.out.println("Sono dentro restituisciEntrate del DAO");
				//List list = getSession().createQuery("from Spesa as s where id=:id and s.eliminato='0' and s.positiva='1' and s.data='anno' order by dataA desc").setParameter("id", id).list();		
				System.out.println("dao id "+id);
				
				Calendar calendar = GregorianCalendar.getInstance();
				int anno=calendar.get(Calendar.YEAR);
								
				String query ="Select s.idSpesa "+"from Spesa s "+"Where s.eliminato = 0 And s.positiva = 1 AND s.idPersona="+id+" and s.dat like '"+anno+"%'";	
												
				Query q = getSession().createSQLQuery(query);
				System.out.println(q);	
				List ris = q.list();	
				System.out.println("SIZE DAO "+ris.size());	
			   	return ris;

			  }*/
		
		public List restituisciEntrate(int id, int anno, int mese) throws ParseException{
		    
			Spesa spesa=null;
			System.out.println("Sono dentro restituisciEntrate del DAO");			
			System.out.println("dao id "+id);
			mese=mese+1;
			int monthString=0;
			switch (mese) {
			    case 1:  monthString = 31;
			             break;
			    case 2:  monthString = 29;
			             break;
			    case 3:  monthString = 31;
			             break;
			    case 4:  monthString = 30;
			             break;
			    case 5:  monthString = 31;
			             break;
			    case 6:  monthString = 30;
			             break;
			    case 7:  monthString = 31;
			             break;
			    case 8:  monthString = 31;
			             break;
			    case 9:  monthString = 30;
			             break;
			    case 10: monthString = 31;
			             break;
			    case 11: monthString = 30;
			             break;
			    case 12: monthString = 31;
			             break;
			    default: monthString = 0;
			             break;
			}
			
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");			
			Date startDate=(Date)sdf.parse(+anno+"-"+mese+"-01");
			Date endDate=(Date)sdf.parse(+anno+"-"+mese+"-"+monthString);
			System.out.println("dao date start "+startDate);
			System.out.println("dao date fine "+endDate);
			
			Criteria criteria = getSession().createCriteria(Spesa.class);
			criteria.add(Restrictions.eq("id.idPersona",id));
			criteria.add(Restrictions.eq("eliminato",0));
			criteria.add(Restrictions.eq("positiva",1));
			criteria.add(Restrictions.between("dat", startDate, endDate));
			
			List e=criteria.list();
			//System.out.println("dao e "+e.size());		
		
			return  e;						
			

		  }
		
		public List restituisciUscite(int id, int anno, int mese) throws ParseException{
		    
			Spesa spesa=null;
			System.out.println("Sono dentro restituisciEntrate del DAO");			
			System.out.println("dao id "+id);
			mese=mese+1;
			int monthString=0;
			switch (mese) {
			    case 1:  monthString = 31;
			             break;
			    case 2:  monthString = 29;
			             break;
			    case 3:  monthString = 31;
			             break;
			    case 4:  monthString = 30;
			             break;
			    case 5:  monthString = 31;
			             break;
			    case 6:  monthString = 30;
			             break;
			    case 7:  monthString = 31;
			             break;
			    case 8:  monthString = 31;
			             break;
			    case 9:  monthString = 30;
			             break;
			    case 10: monthString = 31;
			             break;
			    case 11: monthString = 30;
			             break;
			    case 12: monthString = 31;
			             break;
			    default: monthString = 0;
			             break;
			}
			
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");			
			Date startDate=(Date)sdf.parse(+anno+"-"+mese+"-01");
			Date endDate=(Date)sdf.parse(+anno+"-"+mese+"-"+monthString);
			//System.out.println("dao date start "+startDate);
			//System.out.println("dao date fine "+endDate);
			
			Criteria criteria = getSession().createCriteria(Spesa.class);
			criteria.add(Restrictions.eq("id.idPersona",id));
			criteria.add(Restrictions.eq("eliminato",0));
			criteria.add(Restrictions.eq("positiva",0));
			criteria.add(Restrictions.between("dat", startDate, endDate));
			
			List e=criteria.list();
			//System.out.println("dao e "+e.size());		
		
			return  e;						
			

		  }
		public Spesa restituisciOggettoSpesa(int idS){
			
			 System.out.println("Sono dentro restituisci oggetto spesa del DAO");	
				
				Spesa spesa=null;
				
				Criteria criteria = getSession().createCriteria(Spesa.class);
				criteria.add(Restrictions.eq("id.idSpesa",idS));
				List e=criteria.list();
					
				if(e.size() > 0)
				//System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssssssssss");	
				
				spesa = (Spesa) e.get(0);
							 
				return  spesa;


			
		}
		
		
}
