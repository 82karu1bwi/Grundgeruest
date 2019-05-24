
public abstract class Auftrag {
	int auftragsnr;
	String status;
//	 Privatkunde kunde;
//	 Geschäftskunde kunde;
	boolean zugewiesen;
	Rechner rechner;
	double arbeitsaufwand;
	int lieferzeit;

	public static void kundeBenachrichtigen() {
	}

	public static void berechneArbeitsaufwand() {
	}

	public static void berechneLieferzeit() {
	}

	public static void generiereAuftragsnr() {
	}

	public static void setUnvollstaendig() {
	}

	public static void setAngelegt() {
	}

	public static void disponieren() {
	}

	public static void inBearbeitung() {
	}

	public static void erledigt() {
	}

	public static void imLager() {
	}

}
