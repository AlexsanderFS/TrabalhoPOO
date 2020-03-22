class Display{

  private double polegadas;
  private String resolucao;
  private String tipoDisplay;
  private String cores;

  public Display(double polegadas, String resolucao, String tipoDisplay, String cores){

    this.polegadas = polegadas;
    this.resolucao = resolucao;
    this.tipoDisplay = tipoDisplay;
    this.cores = cores;

  }

  public double getPolegadas(){
		return polegadas;
	}

  public String getResolucao(){
		return resolucao;
	}

  public String getTipoDisplay(){
		return tipoDisplay;
	}

  public String getCores(){
		return cores;
	}

}
