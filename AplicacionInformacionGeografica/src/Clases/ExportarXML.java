package Clases;

public class ExportarXML implements Exportar {

	Grafo grafo;

	public ExportarXML(Grafo grafo) {
		this.grafo = grafo;
	}
	
	

	public static String exportar() {
		return "Se ha exportado por XML";
	}

}
