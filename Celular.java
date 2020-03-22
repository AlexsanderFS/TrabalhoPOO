class Celular{

  private String marca;
  private String modelo;
  private String cor;
  private double preco;
  private String processador;
  private int memoriaHd;
  private int memoriaRam;
  private String versaoAndroid;
  private Display display;
  private Camera camera;
  private Bateria bateria;

  public Celular(String marca, String modelo, String cor, double preco, String processador, int memoriaHd,
                 int memoriaRam, String versaoAndroid, Display display, Camera camera, Bateria bateria){

    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.preco = preco;
    this.processador = processador;
    this.memoriaHd = memoriaHd;
    this.memoriaRam = memoriaRam;
    this.versaoAndroid = versaoAndroid;
    this.display = display;
    this.camera = camera;
    this.bateria = bateria;

  }

  //GET
  public String getMarca(){
		return marca;
	}

  public String getModelo(){
		return modelo;
	}

  public String getCor(){
		return cor;
	}

  public double getPreco(){
		return preco;
	}

  public String getProcessador(){
		return processador;
	}

  public int getMemoriaHd(){
		return memoriaHd;
	}

  public int getMemoriaRam(){
		return memoriaRam;
	}

  public String getVersaoAndroid(){
    return versaoAndroid;
  }

  //SET
  public void setMarca(String marca){
		this.marca = marca;
	}

  public void setModelo(String modelo){
		this.modelo = modelo;
	}

  public void setCor(String cor){
		this.cor = cor;
	}

  public void setPreco(double preco){
		this.preco = preco;
	}

  public void setProcessador(String processador){
		this.processador = processador;
	}

  public void setMemoriaHD(int memoriaHd){
		this.memoriaHd = memoriaHd;
	}

  public void setMemoriaRam(int memoriaRam){
		this.memoriaRam = memoriaRam;
	}

  public void setVersaoAndroid(String versaoAndroid){
		this.versaoAndroid = versaoAndroid;
	}

  public void setDisplay(Display display){
		this.display = display;
	}

  public void setCamera(Camera camera){
		this.camera = camera;
	}

  public void setBateria(Bateria bateria){
		this.bateria = bateria;
	}

  //METHOD
  public String dadosTecnicos(){

    String dados = "";

    System.out.println("\n\t\t\t\t"+"MAESTRO CELULAR");
    System.out.println("\n"+"Características do Smartphone: "+"\n");
    dados += "Modelo: "+getModelo()+"\n";
    dados += "Marca: "+getMarca()+"\n";
    dados += "Cor: "+getCor()+"\n";
    dados += "Valor: "+getPreco()+"\n";
    dados += "Processador: "+getProcessador()+"\n";
    dados += "HD: "+getMemoriaHd()+" GB"+"\n";
    dados += "RAM: "+getMemoriaRam()+" GB"+"\n";
    dados += "Android: "+getVersaoAndroid()+"\n";
    dados += "\n"+"DISPLAY"+"\n"+"Polegadas: "+display.getPolegadas()+"\n";
    dados += "Resolução: "+display.getResolucao()+"\n";
    dados += "Tipo: "+display.getTipoDisplay()+"\n";
    dados += "Cores: "+display.getCores()+"\n";
    dados += "\n"+"CAMERA"+"\n"+"Traseira: "+camera.getMegapixelTraseira()+"\n";
    dados += "Frontal: "+camera.getMegapixelFrontal()+"\n";
    dados += "Resolução Foto: "+camera.getResolucaoFoto()+"\n";
    dados += "Resolução Vídeo: "+camera.getResolucaoGravacao()+"\n";
    dados += "FPS de Gravação: "+camera.getFpsDeGravacao()+"\n";
    dados += "\n"+"BATERIA"+"\n"+"Tipo: "+bateria.getTipoDaBateria()+"\n";
    dados += "Ampere: "+bateria.getAmpere()+"\n";

    return dados;
  }

  public double celularMaisCaro(){
    double maisCaro = 0;
        maisCaro = getPreco();
    return maisCaro;
  }

  public String modeloCelular(){
    String modeloCelular = "";
      modeloCelular = getModelo();
    return modeloCelular;
  }

  public int melhorCamera(){
    int megapixel = 0;
      megapixel = camera.getMegapixelTraseira();
    return megapixel;
  }

  public int maiorArmazenamento(){
    int armazenamento = 0;
      armazenamento = getMemoriaHd();
    return armazenamento;
  }

  public double maiorTela(){
    double tela = 0;
      tela = display.getPolegadas();
    return tela;
  }
}
