package de.brightstraining.trainee.week2.day3.computershop;

import de.brightstraining.trainee.week2.day3.computershop.exceptions.UngueltigerPreisException;

public class Kasse {

    private int gesamtPreis;

    public static int gesamtPreis(Artikel[] artikelArray)
    throws /*KassiervorgangAbgebrochenException, */UngueltigerPreisException {
            int gesamtPreis = 0;
            for(Artikel artikel : artikelArray) {
                int preis = artikel.getPreis( );
                if(preis <= 0) {
                    throw new UngueltigerPreisException("Preis darf nicht null oder negativ sein",
                                                        preis,artikel.getName( ));
                }
                gesamtPreis += preis;
            }
            return gesamtPreis;
    }

    /*public static void druckeKassenzettel (Artikel[] artikel)
        throws KassiervorgangAbgebrochenException {
        try {
            for(Artikel art : artikel) {
                String produktName = art.getName();
                if(produktName == null || produktName.equals("")) {
                    throw new KeinArtikelNameException("Produkt ohne Name", art);
                }
                int produktPreis = art.getPreis();
                if(produktPreis <= 0) {
                    throw new UngueltigerPreisException("Artikelpreis ungültig", art);
                }
                System.out.println(produktName + " : " + produktPreis);
            } int gesamtPreis = berechneGesamtpreis(artikel);
            System.out.println("-----\nGesamtpreis: " + gesamtPreis);
        } catch(KeinArtikelNameException | UngueltigerPreisException e) {
            throw new KassiervorgangAbgebrochenException("Kassiervorgang abgebrochen", e);
        }
    }*/
}