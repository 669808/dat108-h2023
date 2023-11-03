package no.hvl.lph.dat108;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Person {
	
	@Id
    @NotNull
    @Size(min=2, max=10, message="Navn må være mellom 2 og 10 tegn")
	private String navn;
	
    @NotNull
    @Min(value=1900, message="Fødselsår kan ikke være før år 1900")
    @Max(value=2022, message="Fødselsår kan ikke være etter år 2022")
	private int fodselsaar;

	public Person(String navn, int fodselsaar) {
		this.navn = navn;
		this.fodselsaar = fodselsaar;
	}

	public String getNavn() {
		return navn;
	}

	public int getFodselsaar() {
		return fodselsaar;
	}
	
	
}
