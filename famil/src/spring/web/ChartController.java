package spring.web;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import spring.domain.*;
import spring.service.*;
import spring.utility.PieChart;

import javax.swing.JFrame;

import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class ChartController extends BaseController{
		
	private UtilService service;
	private Persona persona;
	private Spesa spesa;
	private Utente utente;
	
	private static final String PARAM_UTENTE_GIORNO = "giorno";
	private static final String PARAM_UTENTE_MESE = "mese";
	private static final String PARAM_UTENTE_ANNO = "anno";
	
	private static final String PARAM_UTENTE_TIPOLOGIA = "tipologia";
	private static final String PARAM_UTENTE_DESCRIZIONE = "descrizione";
	private static final String PARAM_UTENTE_IMPORTO = "importo";
	private static final String PARAM_UTENTE_IDPERSONA= "idPersona";
	
	public void setService(UtilService service){
		this.service=service;		
	}
	public void setPersona(Persona persona){
		this.persona=persona;		
	}	
	public UtilService getService(){		
		return service;
	}
		
	public ModelAndView vaiInserisciGrafico(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
		System.out.println("sono dentro vaiInserisciGrafico");			
		@SuppressWarnings("unused")
		Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
		ModelAndView m =new ModelAndView("visualizzaGrafico");	
			
		return m;		
		}
	
	public ModelAndView restituisciGrafico(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("sono dentro restituisciGrafico");
				
		ModelAndView m =new ModelAndView("vediGrafico");		
		return m;
		
	}
	public ModelAndView viewDati(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("sono dentro viewDati");	
	     
		//recupera importi
	    /*   HashMap<Integer, List<Spesa>> entrate=new  HashMap<Integer, List<Spesa>>();
           HashMap<Integer, List<Spesa>> uscite=new  HashMap<Integer, List<Spesa>>();
           List<Spesa> spe=null;
           List<Spesa> usc=null;
           List<Spesa> ss=null;
           Calendar calendar = GregorianCalendar.getInstance();
          
			int anno=calendar.get(Calendar.YEAR);
			int mese= calendar.get(Calendar.MONTH)+1; 
			System.out.println(mese);   
           Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
           int idP= utenteLoggato.getIdPersona();           
			//questa lista in un secondo momento deve essere smistata per mese formando una lista per ciascun mese fino ad allora								
           // deve recuperare	le entrate dell'anno corrente			
           for(int i=1; i<=mese; i++){           	
           spe=service.recuperaEntrate(idP, anno, i);                  
           System.out.println("lista di spese recuperata la "+i+" spesa size "+spe.size());
           entrate.put(i, spe);                 
           }
           
           Collection<List<Spesa>> collection = entrate.values();           
           Iterator<List<Spesa>> it = collection.iterator();
           while (it.hasNext()){
        	 List<Spesa> p = it.next();
        	 Iterator<Spesa> is=p.iterator();
        	 while(is.hasNext()){
             Spesa sp=is.next();
             System.out.println(sp.getImporto()+" tipologia : "+sp.getTipologia()+" data : "+sp.getDat()); 
             int v=(int)sp.getImporto();
             spring.utility.PieChart.createDemoPanel(v);
       		
            PieChart demo = new PieChart("Uscite 2012", v);
            demo.pack();
            RefineryUtilities.centerFrameOnScreen(demo);
            demo.setVisible(true);  
        	 }  
           for(int k=0; k<mese; k++){           	
               usc=service.recuperaUscite(idP, anno, k);   
               //System.out.println("lista di spese recuperata la "+k+" spesa size "+spe.size());
               uscite.put(k, usc);
               }
           	System.out.println(entrate.size());
           	System.out.println(uscite.size());
	        
		ModelAndView m =new ModelAndView("vediGrafico");
				
		return m;
		*/
		
        Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
        int idP= utenteLoggato.getIdPersona(); 
		Calendar calendar = GregorianCalendar.getInstance();
		int anno=calendar.get(Calendar.YEAR);
		int mese= calendar.get(Calendar.MONTH)+1;
		
        HashMap<Integer, List<Spesa>> uscite=new  HashMap<Integer, List<Spesa>>(); 
       
        List<Spesa> usc=null;
        
        for(int k=0; k<mese; k++){           	
            usc=service.recuperaUscite(idP, anno, k);
            uscite.put(k, usc);
            }
        
        
          //int v=(int)sp.getImporto();
         // spring.utility.PieChart.createDemoPanel(v);
          
         spring.utility.PieChart.createDemoPanel(uscite);	
         PieChart demo = new PieChart("Uscite 2013", uscite);
         demo.pack();
         RefineryUtilities.centerFrameOnScreen(demo);
         demo.setVisible(true);        
     	 
         System.out.println("AAAAAAAAAAAAAAAAAAAAAAA ");
		ModelAndView m =new ModelAndView("redirect:vaiAVisualizzaDettaglio.htm");
		
		return m;
		
	}
}
		

		
		


