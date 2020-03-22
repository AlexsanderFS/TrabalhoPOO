class Bateria{
  
  private String tipoDaBateria;
  private int ampere;

  public Bateria(String tipoDaBateria, int ampere){

    this.tipoDaBateria = tipoDaBateria;
    this.ampere = ampere;

  }

  public String getTipoDaBateria(){
		return tipoDaBateria;
	}

  public int getAmpere(){
		return ampere;
	}
}
