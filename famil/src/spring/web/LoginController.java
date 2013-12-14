package spring.web;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import spring.domain.*;
import spring.service.*;


public class LoginController extends BaseController{
	
	private Utente utente;
	private UtilService service;
	private Persona persona;		
	
	public void setService(UtilService service){
		this.service=service;		
	}
	public void setPersona(Persona persona){
		this.persona=persona;		
	}	
	public UtilService getService(){		
		return service;
	}
	
	public ModelAndView effettuaLogin(HttpServletRequest request, HttpServletResponse response)throws Exception{
				
		System.out.println("sono dentro loginsssssssssssss");
		
		String p=(String) request.getParameter("password");
		String u=(String) request.getParameter("username");
		
		StringBuffer hexString = null;
		byte[] defaultBytes = p.getBytes();
		try{
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(defaultBytes);
			byte messageDigest[] = algorithm.digest();
		            
			hexString = new StringBuffer();
			for (int i=0;i<messageDigest.length;i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			String foo = messageDigest.toString();
			System.out.println(" md5 version is "+p + " ---> " + hexString);
			p=hexString+"";
		}catch(NoSuchAlgorithmException nsae){
		}
		System.out.println("username: "+u);
		//mi faccio restituire tutto oggetto utente
		//e da quello l'oggetto risorsa
		utente=service.restituisciUtente(u, hexString.toString());
		//System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx: "+utente.getIdUtente());
		if(utente!=null){
		//idRisorsa
		int ut=utente.getIdUtente();
		
		persona=service.restituisciPersonaById(ut);
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx: "+persona.getNome());
			//System.out.println(risorsa.getCognome());
		//System.out.println(risorsa.getEmail());		
					
		request.getSession(true);
		//mettere in sessione permanente tutto oggetto risorsa            
        request.getSession().setAttribute("utenteLoggatoSession", persona);           
  
		return this.ridirigi(request, response);
		}
		else{
			System.out.println("qui");
			request.setAttribute("erroreLogin", "Username e Password errati");
			return this.restituiscilogin(request, response);				
		}
	}
	
	public ModelAndView restituiscilogin(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("sono dentro log");
		ModelAndView m = new ModelAndView("redirect:index.jsp?erroreLogin=Attenzione login errato!");		
		return m;	
		}	
	public ModelAndView ridirigi(HttpServletRequest request, HttpServletResponse response)throws Exception{
			
		System.out.println("sono dentro ridirigi");			
		Persona utenteLoggato = (Persona) request.getSession().getAttribute("utenteLoggatoSession");
		ModelAndView m =null;		
		//sono DT o COM
		if(utenteLoggato.getGruppopermessi().getIdGruppo()== 1 || utenteLoggato.getGruppopermessi().getIdGruppo()== 2)
			{	
			m = new ModelAndView("menu");	
			}
			
		return m;		
		}

	//con il redirect la richiesta esce fuori la cartella jsp e ridirige al login
	public ModelAndView ridirigiLogin(HttpServletRequest request, HttpServletResponse response)throws Exception{
		System.out.println("sono ridirgi login per l'exit");
		//flush sessione
		Persona utenteLoggato=(Persona)request.getSession().getAttribute("utenteLoggatoSession");
		System.out.println("xxx "+utenteLoggato.getCognome());
		
		//flush sessione		
		request.getSession().removeAttribute("utenteLoggatoSession");	
		
		System.out.println("fffffffffffffffffffff: "+request.getAttribute("utenteLoggatoSession"));
		
		ModelAndView m = new ModelAndView("redirect:index.jsp");		
		return m;	
		}
}


