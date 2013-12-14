package spring.web;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import spring.domain.*;
import spring.service.*;



public class PersonaController extends BaseController{
		
	private UtilService service;
	@SuppressWarnings("unused")
	private Persona persona;
	private Spesa spesa;
	//private Utente utente;
	
	private static final String PARAM_UTENTE_GIORNO = "giorno";
	private static final String PARAM_UTENTE_MESE = "mese";
	private static final String PARAM_UTENTE_ANNO = "anno";
	
	private static final String PARAM_UTENTE_TIPOLOGIA = "tipologia";
	private static final String PARAM_UTENTE_DESCRIZIONE = "descrizione";
	private static final String PARAM_UTENTE_IMPORTO = "importo";
	private static final String PARAM_UTENTE_IDPERSONA= "idPersona";
	private static final String PARAM_UTENTE_ID="id";

	

	
	public void setService(UtilService service){
		this.service=service;		
	}
	public void setPersona(Persona persona){
		this.persona=persona;		
	}	
	public UtilService getService(){		
		return service;
	}
	
//----------------------------------------------   INSERIMENTO ENTRATE E USCITE   ------------------------------------------
	
	public ModelAndView vaiInserisciSpesa(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
		System.out.println("sono dentro vaiInserisciSpesa");	
	
		@SuppressWarnings("unused")
		Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
		ModelAndView m =new ModelAndView("aggiungiSpesa");	
			
		return m;		
		}
	
	public ModelAndView inserisciSpesa(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
		
		String giorno=request.getParameter(PARAM_UTENTE_GIORNO);
		String mese=request.getParameter(PARAM_UTENTE_MESE);
		String anno=request.getParameter(PARAM_UTENTE_ANNO);
		
		//trasformazione da Stringa a data
		SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
		
		String data=giorno.concat("-").concat(mese).concat("-").concat(anno);
			
		
		java.sql.Date dataConvertitaInizio = null;{
			
			try {
				dataConvertitaInizio =new java.sql.Date(dateParser.parse(data).getTime());
				
				System.out.println("data convertita inizio " + dataConvertitaInizio);
			}
			catch (ParseException e) {
				System.out.println(" <<<<<<<<<<<<<<<<<<< ERRORE stringToDate >>>>>>>>>>>>>>>>>>>>");
			}
		}
		
		String tipologia=request.getParameter(PARAM_UTENTE_TIPOLOGIA);
		String descrizione=request.getParameter(PARAM_UTENTE_DESCRIZIONE);
		String importo=request.getParameter(PARAM_UTENTE_IMPORTO);
		String id=request.getParameter(PARAM_UTENTE_IDPERSONA);
		
		int idP=0;
		idP=Integer.parseInt(id);
		
		Persona p=service.restituisciPersonaById(idP);			
		
		double imp=0;
		
		try{
			
		imp=Double.valueOf(importo).doubleValue();

		System.out.println(imp);
		
		spesa=new Spesa(p,dataConvertitaInizio,imp,tipologia,descrizione,0,0);
		
		service.inserisciSpesa(idP,spesa);
		
		return new ModelAndView("redirect:aggiungiSpesa.htm");
		
		} catch(Exception e){
			System.out.println("qui");
			request.setAttribute("erroreFormato", "Errore Formato Importo");
			return this.restituisciErrore(request, response);				
		}
		
	}
	
	public ModelAndView modificaSpesaInDettaglioPerAnno(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
				       
        Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");   
        
        
		String giorno=request.getParameter(PARAM_UTENTE_GIORNO);
		String mes=request.getParameter(PARAM_UTENTE_MESE);
		String ann=request.getParameter(PARAM_UTENTE_ANNO);
		int gi=Integer.parseInt(giorno);
		int m=Integer.parseInt(mes);
		int a=Integer.parseInt(ann);
		
		//trasformazione da Stringa a data
		SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
		
		String data=giorno.concat("-").concat(mes).concat("-").concat(ann);
			
		
		java.sql.Date dataConvertitaInizio = null;{
			
			try {
				dataConvertitaInizio =new java.sql.Date(dateParser.parse(data).getTime());
				
				System.out.println("data convertita inizio " + dataConvertitaInizio);
			}
			catch (ParseException e) {
				System.out.println(" <<<<<<<<<<<<<<<<<<< ERRORE stringToDate >>>>>>>>>>>>>>>>>>>>");
			}
		}
		
		String tipologia=request.getParameter(PARAM_UTENTE_TIPOLOGIA);
		String descrizione=request.getParameter(PARAM_UTENTE_DESCRIZIONE);
		String importo=request.getParameter(PARAM_UTENTE_IMPORTO);
		
		String idPers=request.getParameter(PARAM_UTENTE_IDPERSONA);
		String id=request.getParameter("idSpesa");
		
		System.out.println("id in controller "+id);
		int idP=0;
		idP=Integer.parseInt(idPers);
		
		Persona p=service.restituisciPersonaById(idP);			
		
		double imp=0;
		
		try{
			
		imp=Double.valueOf(importo).doubleValue();

		System.out.println(imp);
		
		spesa=new Spesa(p,dataConvertitaInizio,imp,tipologia,descrizione,1,0);
		
		service.modificaEntrata(Integer.parseInt(id),spesa); 		
        
		//questa lista in un secondo momento deve essere smistata per mese formando una lista per ciascun mese fino ad allora								
        // deve recuperare	le entrate dell'anno corrente	
		
		 return this.recuperoEntrate(request, response); 
		
		} catch(Exception e){
			System.out.println("qui");
			request.setAttribute("erroreFormato", "Errore Formato Importo");
			return this.restituisciErroreInModifica(request, response);				
		}
		
	}
		public ModelAndView restituisciErrore(HttpServletRequest request, HttpServletResponse response)throws Exception{
			System.out.println("sono dentro log");
			ModelAndView m = new ModelAndView("redirect:aggiungiSpesa.htm?erroreFormato=Attenzione formato importo errato!");		
			return m;	
			}	
		
		public ModelAndView restituisciErroreInModifica(HttpServletRequest request, HttpServletResponse response)throws Exception{
			System.out.println("sono dentro log");
			ModelAndView m = new ModelAndView("redirect:aggiungiEntrata.htm?erroreFormato=Attenzione formato importo errato!");		
			return m;	
			}	
				
		
		public ModelAndView vaiInserisciEntrata(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
			System.out.println("sono dentro vaiInserisciEntrata");	
		
			@SuppressWarnings("unused")
			Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
			ModelAndView m =new ModelAndView("aggiungiEntrata");	
				
			return m;		
			}
		
		public ModelAndView inserisciEntrata(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
			
			String giorno=request.getParameter(PARAM_UTENTE_GIORNO);
			String mese=request.getParameter(PARAM_UTENTE_MESE);
			String anno=request.getParameter(PARAM_UTENTE_ANNO);
			
			//trasformazione da Stringa a data
			SimpleDateFormat dateParser = new SimpleDateFormat("dd-MM-yyyy");
			
			String data=giorno.concat("-").concat(mese).concat("-").concat(anno);
				
			
			java.sql.Date dataConvertitaInizio = null;{
				
				try {
					dataConvertitaInizio =new java.sql.Date(dateParser.parse(data).getTime());
					
					System.out.println("data convertita inizio " + dataConvertitaInizio);
				}
				catch (ParseException e) {
					System.out.println(" <<<<<<<<<<<<<<<<<<< ERRORE stringToDate >>>>>>>>>>>>>>>>>>>>");
				}
			}
			
			String tipologia=request.getParameter(PARAM_UTENTE_TIPOLOGIA);
			String descrizione=request.getParameter(PARAM_UTENTE_DESCRIZIONE);
			String importo=request.getParameter(PARAM_UTENTE_IMPORTO);
			String id=request.getParameter(PARAM_UTENTE_IDPERSONA);
			
			int idP=0;
			idP=Integer.parseInt(id);
			
			Persona p=service.restituisciPersonaById(idP);			
			
			double imp=0;
			
			try{
				
			imp=Double.valueOf(importo).doubleValue();

			System.out.println(imp);
			
			spesa=new Spesa(p,dataConvertitaInizio,imp,tipologia,descrizione,1,0);
			
			service.inserisciEntrata(idP,spesa);
			
			return new ModelAndView("redirect:aggiungiEntrata.htm");
			
			} catch(Exception e){
				System.out.println("qui");
				request.setAttribute("erroreFormato", "Errore Formato Importo");
				return this.restituisciErrore(request, response);				
			}
			
		}
//---------------------------------------------------------------------------------------------------------------------------	
		
		
	public ModelAndView restituisciPaginaDettaglio(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
			System.out.println("restituisciPaginaDettaglio");	
		
			@SuppressWarnings("unused")
			Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
			ModelAndView m =new ModelAndView("visualizzaDettaglioPerAnno");	
				
			return m;		
			}	
// lo stesso metodo deve essere replicato con il mese che arriva dal bottone dell'anno scelto per essere visualizzato
// il bottone sar� presente in testata della pagina visualizzaDettaglioPerAnno, per i mesi non ancora giunti i relativi bottoni
// non saranno visibili! il metodo del dao utilizzato: restituisci Entrate sar� sempre lo stesso	
// SI DOVRA' poi pensare alle uscite	
	//recupero entrate dell'anno corrente
	
	    @SuppressWarnings("unchecked")
		public ModelAndView recuperoEntrate(HttpServletRequest request, HttpServletResponse response)throws Exception{
	    	System.out.println("RECUPERO ENTRATA in personaController");
            HashMap<Integer, List<Spesa>> entrate=new  HashMap<Integer, List<Spesa>>();
            HashMap<Integer, List<Spesa>> uscite=new  HashMap<Integer, List<Spesa>>();
            List<Spesa> spe=null;
            List<Spesa> usc=null;
            Calendar calendar = GregorianCalendar.getInstance();
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxx ");
            //anno corrente
			int anno=calendar.get(Calendar.YEAR);
			int mese= calendar.get(Calendar.MONTH)+1; 
		       
            Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
            int idP= utenteLoggato.getIdPersona();
            
			//questa lista in un secondo momento deve essere smistata per mese formando una lista per ciascun mese fino ad allora								
            // deve recuperare	le entrate dell'anno corrente	        		
			
            for(int i=0; i<mese; i++){
            	
            spe=service.recuperaEntrate(idP, anno, i);   
           // System.out.println("lista di spese recuperata la "+i+" spesa size "+spe.size());
            entrate.put(i, spe);
            }	
            
            for(int k=0; k<mese; k++){
            	
                usc=service.recuperaUscite(idP, anno, k);   
               // System.out.println("lista di spese recuperata la "+i+" spesa size "+spe.size());
                uscite.put(k, usc);
                }	
		    request.setAttribute("hashEntrate", entrate);
		    request.setAttribute("hashUscite", uscite);		
			ModelAndView m =new ModelAndView("visualizzaDettaglioPerAnno");	
			
			return m;		
			
		}
	    
	    @SuppressWarnings("unchecked")
		public ModelAndView modificaEntr(HttpServletRequest request, HttpServletResponse response)throws Exception{
		
	    	System.out.println("MODIFICA ENTRATA in personaController");
            Spesa entrata=null;
          
            Calendar calendar = GregorianCalendar.getInstance();
           
            //anno corrente
			int anno=calendar.get(Calendar.YEAR);
			int mese= calendar.get(Calendar.MONTH)+1; 
		       
            Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
            //int idP= utenteLoggato.getIdPersona();
            
            int idS=Integer.parseInt(request.getParameter(PARAM_UTENTE_ID));	
			//questa lista in un secondo momento deve essere smistata per mese formando una lista per ciascun mese fino ad allora								
            // deve recuperare	le entrate dell'anno corrente	        		
			
            for(int i=0; i<mese; i++){            	
            entrata=service.recuperaEntr(idS);   
           // System.out.println("lista di spese recuperata la "+i+" spesa size "+spe.size());           
            }	
            request.setAttribute("SpesaEntrata", entrata);
			ModelAndView m =new ModelAndView("modificaEntrata");	
			
			return m;		
			
		}
	    
	    
		public ModelAndView recuperaStorico(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
			System.out.println("sono dentro recupera storico");	
		
			@SuppressWarnings("unused")
			Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
			ModelAndView m =new ModelAndView("storico");	
				
			return m;		
			}
	    
	    


}