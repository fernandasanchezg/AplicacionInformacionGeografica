package Clases;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String exportacionXML = ExportarXML.exportar();
		String exportacionPDF = ExportarPDF.exportar();
		
		List<String> listaExportar = new ArrayList<String>();
		listaExportar.add(exportacionXML);
		listaExportar.add(exportacionPDF);
		
		System.out.println(listaExportar);
	
	}

}
