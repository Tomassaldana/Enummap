import java.util.EnumMap; 

enum Dias { 
	LUNES, MARTES, MIERCOLES, JUEVES, VIERNES,
} 

public class EnumMapEjemplo { 
	public static void main(String[] args) { 
		EnumMap<Dias, Integer> horario = new EnumMap<>(Dias.class); 
		
		// Añadir elementos al EnumMap 
		horario.put(Dias.LUNES, 1); 
		horario.put(Dias.MARTES, 2);
		horario.put(Dias.MIERCOLES, 3); 
		horario.put(Dias.JUEVES, 4); 
		horario.put(Dias.VIERNES, 5); 
                
                //int value = horario.remove(Dias.LUNES);
                
                
                //horario.replace(Dias.JUEVES, 11); 
                //horario.replace(Dias.MARTES, 2, 12);
                
                horario.replaceAll((key, oldValue) -> oldValue + 3);
		
		// Imprimiendo el enummap
		System.out.println(horario.get(Dias.LUNES)); // Output: 1 
		System.out.println(horario.get(Dias.VIERNES)); // Output: 5
                
                System.out.println("EnumMap horario: " + horario); //Output Enummap creado
                
                System.out.println("Llave/Valor asignaciones " //Output mapa con llave/valor
                           + horario.entrySet()); 
                
                System.out.println("Llave: " + horario.keySet()); //Output llaves del enummap
                
                System.out.println("Valores: " + horario.values()); //Output valores del enummap
                
                System.out.println("Valor del miercoles : "//Output llave especifica del objeto requerido
                           + horario.get(Dias.MIERCOLES)); 
                
             
                 
	} 
} 

