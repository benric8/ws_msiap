package pe.gob.pj.rnc.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import pe.gob.pj.rnc.log.MyLogger;
import uif.JobInacUsuDataProvider;

/**
 * @version 1.0 18 Dec 2002
 * @author JCR
 * @web.listener
 */
public class ContextListener implements ServletContextListener {
	/*
	 * protected static final EJBLocator ejbLocator; static { ejbLocator = EJBLocator.getInstance(); }
	 */
	static MyLogger	logger	= new MyLogger(ContextListener.class.getName());
	Scheduler sched = null;
	
	public void contextInitialized(ServletContextEvent sce) {
		
		logger.info("****************Scheduling Job ..Creación del triggers ***");
		JobDetail jd = new JobDetail("PJJob1", "PJJobGroup", JobInacUsuDataProvider.class);
		// jd.getJobDataMap().put("ejb", "java:comp/env/ejb/CargaTablaTempArchivoCLI");
		jd.getJobDataMap().put("method", "execute");
		// Object[] jdArgs = new Object[0];
		// jd.getJobDataMap().put("args", jdArgs);
		CronTrigger cronTrigger = new CronTrigger("PJTrigger1", "PJJobGroup");
		try {
			/*
			 * javax.ejb.EJBLocalObject local =ejbLocator.getEJBObject("ejb/sicom/ParametroCLI"); parametroCLI =
			 * (ParametroCLILocal) local;
			 */
			String cronExpr = null;
			// Get the cron Expression as an Init parameter
			 cronExpr = sce.getServletContext().getInitParameter("CRON_EXPR1");
//			cronExpr = sce.getServletContext().getInitParameter("CRON_EXPR4");
			if (cronExpr != null) {
				cronTrigger.setCronExpression(cronExpr);
				// Scheduler sched = StdSchedulerFactory.getDefaultScheduler();
				sched = StdSchedulerFactory.getDefaultScheduler();
				sched.start();
				sched.scheduleJob(jd, cronTrigger);
				logger.info("**********Job scheduled now ..pruebaaaa magistrado");
			}
		} catch (Exception e) {
			logger.error("", e);
			e.printStackTrace();
		}
	}
	/*
	private static String cronExpression(Integer frecuencia, Integer horaInicio) {
		String expresion = null;
		String a = null;
		String b = null;
		if (frecuencia != null) {
			if (frecuencia.intValue() == 0) {
				a = "0";
			} else {
				a = "0/" + frecuencia;
			}
		} else {
			a = "0";
		}
		if (horaInicio != null) {
			if (horaInicio.intValue() == 0) {
				b = "0-23";
			} else {
				b = horaInicio + "-23";
			}
		} else {
			b = "0";
		}
		expresion = "0 " + a + " " + b + " * * ?";
		// expresion ="0 "+a+" * * * ?";
		logger.info("expresion:" + expresion);
		return expresion;
	}
	*/
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Context Destroyed..");
		try {
			sched.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}
}