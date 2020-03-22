class Camera{

  private int megapixelTraseira;
  private int megapixelFrontal;
  private String resolucaoFoto;
  private String resolucaoGravacao;
  private int fpsDeGravacao;

  public Camera(int megapixelTraseira, int megapixelFrontal, String resolucaoFoto, String resolucaoGravacao, int fpsDeGravacao){

    this.megapixelTraseira = megapixelTraseira;
    this.megapixelFrontal = megapixelFrontal;
    this.resolucaoFoto = resolucaoFoto;
    this.resolucaoGravacao = resolucaoGravacao;
    this.fpsDeGravacao = fpsDeGravacao;

  }

  public int getMegapixelTraseira(){
		return megapixelTraseira;
	}

  public int getMegapixelFrontal(){
		return megapixelFrontal;
	}

  public String getResolucaoFoto(){
		return resolucaoFoto;
	}

  public String getResolucaoGravacao(){
		return resolucaoGravacao;
	}

  public int getFpsDeGravacao(){
		return fpsDeGravacao;
	}
}
