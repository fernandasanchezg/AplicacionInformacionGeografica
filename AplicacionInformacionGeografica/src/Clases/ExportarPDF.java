package Clases;

public class ExportarPDF implements Exportar{
	
	Grafo grafo;

	public ExportarPDF(Grafo grafo) {
		this.grafo = grafo;
	}

	public static String exportar() {
		return "Se ha exportado por PDF";
	}

}


	
	


