package pe.gob.pj.rnc.msiap.util;


import java.io.Serializable;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaUtil implements Serializable {

    private static final long serialVersionUID = 3355114755241105106L;


    public static String currentYear(){
        Calendar fecha = Calendar.getInstance();
        int anio = fecha.get(Calendar.YEAR);
        return String.valueOf(anio);
    }

    public static String currentMonth(){
        Calendar fecha = Calendar.getInstance();
        int mes = fecha.get(Calendar.MONTH);
        mes = mes + 1;
        String mesFormato = StringUtil.completarCerosIzquierda(2, mes);
        return mesFormato;
    }


    public static String currentDay(){
        Calendar fecha = Calendar.getInstance();
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String diaFormato = StringUtil.completarCerosIzquierda(2, dia);
        return diaFormato;
    }

    public static String getYear(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int anio = fecha.get(Calendar.YEAR);
        return String.valueOf(anio);
    }

    public static String getMonth(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int mes = fecha.get(Calendar.MONTH);
        mes = mes + 1;
        String mesFormato = StringUtil.completarCerosIzquierda(2, mes);
        return mesFormato;
    }

    public static String getDay(Date date){
        Calendar fecha = Calendar.getInstance();
        fecha.setTime(date);

        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        String diaFormato = StringUtil.completarCerosIzquierda(2,dia);
        return diaFormato;
    }

    public static String currentHourOfDay(){
        Calendar fecha = Calendar.getInstance();
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        String horaFormato = StringUtil.completarCerosIzquierda(2, hora);
        return horaFormato;
    }

    public static String currentMinute(){
        Calendar fecha = Calendar.getInstance();
        int minutos = fecha.get(Calendar.MINUTE);
        String minutoFormato = StringUtil.completarCerosIzquierda(2,minutos);
        return minutoFormato;
    }

    public static String currentSecond(){
        Calendar fecha = Calendar.getInstance();
        int segundos = fecha.get(Calendar.SECOND);
        String segundoFormato = StringUtil.completarCerosIzquierda(2,segundos);
        return segundoFormato;
    }


	public static Timestamp getHoySinHora_Timestamp(){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0,0,0);

		Timestamp fecha = new Timestamp( cal.getTime().getTime() );
		return fecha;
	}

	public static Timestamp getSumaHoySinHora_Timestamp(int dias){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0,0,0);
		cal.add(Calendar.DATE, dias);

		Timestamp fecha = new Timestamp( cal.getTime().getTime() );
		return fecha;
	}


	public static Date getHoySinHora(){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0,0,0);

		return cal.getTime();
	}

	public static Date getPrimerDiaMes(){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1,0,0,0);

		return cal.getTime();
	}

	public static Date getSumaHoySinHora(int dias){
		Calendar cal = Calendar.getInstance();
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),0,0,0);
		cal.add(Calendar.DATE, dias);

		return cal.getTime();
	}

	public static Timestamp getHoyTimestamp(){
		return new Timestamp( Calendar.getInstance().getTime().getTime() );
	}

	public static Date irFinalDia(Date fecha){
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),23,59,0);

		return cal.getTime();
	}

	public static Date irInicioDia(Date fecha){
		Calendar cal = Calendar.getInstance();
		cal.setTime(fecha);
		cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH),00,00,0);

		return cal.getTime();
	}

    public static int getNroDiasMesActual(){
    	Calendar c = Calendar.getInstance();
		Calendar cal = new GregorianCalendar(c.get(Calendar.YEAR), c.get(Calendar.MONTH), 1);
		int dias = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		return dias;
    }

    public static Timestamp convertStringToTimestamp(String fecha) {
            return Timestamp.valueOf(fecha);
    }

    public static boolean between(Date date, Date dateStart, Date dateEnd) {
        if (date != null && dateStart != null && dateEnd != null) {
            if ( ( date.after(dateStart) || date.equals(dateStart) )
            	 &&
            	 ( date.before(dateEnd) || date.equals(dateEnd) )
            	) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static String getStringFormat(String dateFormat, Timestamp timestamp){
    	SimpleDateFormat formatter = new SimpleDateFormat(dateFormat);
    	return formatter.format(timestamp);
    }


    /**
     * Devuelve diferencia de fechas en horas.
     *
     * @param  fecha uno
     * @param  Fecha dos
     * @return diferencia en horas.
     */
    public static long getDiferenciaFecha(Timestamp fActual, Timestamp fOperacion){
    	 Calendar fechaActual = Calendar.getInstance();
		 Calendar fechaOPeracion = Calendar.getInstance();
		 fechaActual.setTime(fActual) ;
		 fechaOPeracion.setTime(fOperacion);
		 long valor1 = fechaActual.getTimeInMillis();
		 long valor2 = fechaOPeracion.getTimeInMillis();
		 long dife   = valor1 - valor2;
		 long hora = dife / (60 * 60 * 1000);
    	return hora;
    }


    /**
     * Devuelve diferencia de fechas en segundo.
     *
     * @param  fecha uno
     * @param  Fecha dos
     * @return diferencia en segundo.
     */
    public static long getDiferenciaFechaSegundo(Timestamp fActual, Timestamp fOperacion){
    	 Calendar fechaActual = Calendar.getInstance();
		 Calendar fechaOPeracion = Calendar.getInstance();
		 fechaActual.setTime(fActual) ;
		 fechaOPeracion.setTime(fOperacion);
		 long valor1 = fechaActual.getTimeInMillis();
		 long valor2 = fechaOPeracion.getTimeInMillis();
		 long dife   = valor1 - valor2;
		 long segu = dife / (1000);
    	return segu;
    }
    
    public static String getNombreMes(int mes){
        String nombre = null;

        switch ( mes ) {
	        case 1: nombre = "Enero";break;
	        case 2: nombre = "Febrero";break;
	        case 3: nombre = "Marzo";break;
	        case 4: nombre = "Abril";break;
	        case 5: nombre = "Mayo";break;
	        case 6: nombre = "Junio";break;
	        case 7: nombre = "Julio";break;
	        case 8: nombre = "Agosto";break;
	        case 9: nombre = "Setiembre";break;
	        case 10: nombre = "Octubre";break;
	        case 11: nombre = "Noviembre";break;
	        case 12: nombre = "Diciembre";break;
		}

        return nombre;
    }
}
