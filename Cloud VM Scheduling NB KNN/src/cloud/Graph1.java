/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cloud;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class Graph1 
{
    Details dt=new Details();
    Graph1()
    {
        
    }
    
    public void display1(double val)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(1981, "Existing" ,"Execution Time");
            dataset.setValue(val, "Proposed" ,"Execution Time");
            
            
            
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("Execution Time","", "Time in ms", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.red);
            renderer.setSeriesPaint(1, Color.green);
            
           // renderer.setSeriesPaint(3, Color.yellow);
            
  
  
            ChartFrame frame1=new ChartFrame("Execution Time",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void display2()
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(0.3377, "Existing" ,"MAE");
            dataset.setValue(dt.mae, "Proposed" ,"MAE");
            
            
            
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("Mean absolute error","", "Value", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.BLUE);
            renderer.setSeriesPaint(1, Color.pink);
            
           // renderer.setSeriesPaint(3, Color.yellow);
            
  
  
            ChartFrame frame1=new ChartFrame("Mean absolute error",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public void display3()
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(55, "Existing" ,"RAE");
            dataset.setValue(dt.rae, "Proposed" ,"RAE");
            
            
            
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("Relative absolute error","", "Value", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.magenta);
            renderer.setSeriesPaint(1, Color.CYAN);
            
           // renderer.setSeriesPaint(3, Color.yellow);
            
  
  
            ChartFrame frame1=new ChartFrame("Relative absolute error",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
