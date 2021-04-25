package database.cat;

import android.database.Cursor;

import java.net.URI;


public class Store {
    public final int store_ID;
    public String storeName;
    public Kategorie kategorie;
    public SubKategorie subkategorie;
    public String adresse;
    public String offnungszeitAnfang;
    public String offnungszeitEnde;
    public URI website;
    public String email;
    public String phone;
    public String besitzer;

    public short rating;

  public StringURL  image;

    public Store (int store_ID,String storeName,Kategorie kategorie,String adresse,String email,String besitzer){
        this.store_ID= store_ID;
        this.storeName= storeName;
        this.kategorie= kategorie;
        this.adresse= adresse;
        this.email= email;
        this.besitzer=besitzer;
    }
    public Store (Cursor cursor) {
        this.store_ID= store_ID;
        this.storeName= storeName;
        this.kategorie= kategorie;
        this.subkategorie=;
        this.adresse= adresse;
        this.offnungszeitAnfang=;
        this.offnungszeitEnde=;
        this.website=;
        this.email= email;
        this.phone = ;
        this.besitzer=besitzer;
    }

    // Setter


    public void setSubkategorie(SubKategorie subkategorie) {
        this.subkategorie = subkategorie;
    }

    public void setOffnungszeitAnfang(String offnungszeitAnfang) {
        this.offnungszeitAnfang = offnungszeitAnfang;
    }

    public void setOffnungszeitEnde(String offnungszeitEnde) {
        this.offnungszeitEnde = offnungszeitEnde;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setWebsite(URI website) {
        this.website = website;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }
    //getter

    public short getRating() {
        return rating;
    }
}

