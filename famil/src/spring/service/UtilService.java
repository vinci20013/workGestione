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

public interface UtilService {
	
	public void setDataAccess(HibernateDao dataAccess);	
	public Utente restituisciUtente(String u, String p) throws Exception;
	public Persona restituisciPersonaById(int rs);
	public void inserisciSpesa(int id,Spesa s);
	public void inserisciEntrata(int id,Spesa s);
	public List recuperaEntrate(int id, int a, int b) throws ParseException;
	public List recuperaUscite(int id, int a, int b) throws ParseException;
	public Spesa recuperaEntr(int idS) throws ParseException;
	public void modificaEntrata(int id,Spesa s);
	
	
}



