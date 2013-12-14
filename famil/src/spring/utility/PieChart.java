package spring.utility;
import java.awt.Font;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.JPanel;

import org.jfree.ui.ApplicationFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import spring.domain.Spesa;


@SuppressWarnings("serial")
public class PieChart extends ApplicationFrame {

    /**
     * Default constructor.
     *
     * @param title  the frame title.
     */
   public PieChart(String title, HashMap<Integer, List<Spesa>> a) {
      super(title);
      setContentPane(createDemoPanel(a));
      }


/*private static PieDataset createDataset(int spe) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Luce", new Double(spe));
        dataset.setValue("Gas", new Double(10.0));
        dataset.setValue("Condominio", new Double(5.0));
        dataset.setValue("Prelievi", new Double(20.0));
        dataset.setValue("Telepass", new Double(5.0));
        dataset.setValue("Varie", new Double(10.0));
        dataset.setValue("Mutuo", new Double(40.0));
        return dataset;        
    }*/
    
    private static PieDataset createDataset(HashMap<Integer, List<Spesa>> uscite) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        int luc=0;
        int gas=0;
        int var=0;
        
        Collection<List<Spesa>> collection = uscite.values();           
        Iterator<List<Spesa>> it = collection.iterator();
        while (it.hasNext()){
     	 List<Spesa> p = it.next();
     	 Iterator<Spesa> is=p.iterator();
     	 while(is.hasNext()){
          Spesa sp=is.next();
          //System.out.println(((Spesa) sp).getImporto()+" tipologia : "+sp.getTipologia()+" data : "+((Spesa) sp).getDat()); 
        if(sp.getTipologia().equalsIgnoreCase("luce")){
        	
        	luc=(int) (luc+sp.getImporto());
        	
        	
        }
        
        if(sp.getTipologia().equalsIgnoreCase("gas")){
        	
        	gas=(int) (gas+sp.getImporto());
        	
        }
        if(sp.getTipologia().equalsIgnoreCase("varie")){
        	
        	var=(int) (var+sp.getImporto());
        	
        }
          
     	 }
        }
        System.out.println(" LUCE "+luc);
        System.out.println(" GAS "+gas);
        dataset.setValue("Luce", new Double(luc));
        dataset.setValue("Gas", new Double(gas));
        dataset.setValue("Varie", new Double(var));
       /* dataset.setValue("Condominio", new Double(5.0));
        dataset.setValue("Prelievi", new Double(20.0));
        dataset.setValue("Telepass", new Double(5.0));
        dataset.setValue("Varie", new Double(10.0));
        dataset.setValue("Mutuo", new Double(40.0));*/
        return dataset;    
    }
    
    /**
     * Creates a chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return A chart.
     */
    private static JFreeChart createChart(PieDataset dataset) {
        
        JFreeChart chart = ChartFactory.createPieChart(
            "Uscite 2013",  // chart title
            dataset,             // data
            true,               // include legend
            true,
            false
        );

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.PLAIN, 13));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        return chart;
        
    }
    
    /**
     * Creates a panel for the demo (used by SuperDemo.java).
     * 
     * @return A panel.
     */
    public static JPanel createDemoPanel(HashMap<Integer, List<Spesa>> b) {
        JFreeChart chart = createChart(createDataset(b));
        return new ChartPanel(chart);
    }

}


