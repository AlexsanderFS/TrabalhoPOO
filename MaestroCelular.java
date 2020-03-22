class MaestroCelular{

  public static void main(String args[]){

    //Celulares da Samsung
    Display amoledSamsung = new Display(6.4,"1080 x 2340 pixel","Super Amoled","16 milhões");
    Camera fullHdSamsung = new Camera(48,20,"8000 x 6000 pixel","4K (2160p)",30);
    Bateria lipoSamsung = new Bateria("LiPo", 6000);
    Celular galaxyM21 = new Celular("Samsung", "Galaxy M21", "Preto", 1300f, "4x 2.3 GHz Cortex-A73 + 4x 1.7 GHz Cortex-A53",
                                    64, 4, "Android 10 Samsung One UI",amoledSamsung, fullHdSamsung, lipoSamsung);
    //Celulares da Apple
    Display oledApple = new Display(6.5,"1242 x 2688 pixel","OLED","16 milhões");
    Camera fullHdApple = new Camera(12,12,"4000 x 3000 pixel","4K (2160p)",60);
    Bateria litioApple = new Bateria("Litio", 3969);
    Celular iPhone11 = new Celular("Apple", "iPhone 11 Pro Max", "Prata", 5779f, "2x 2.65 GHz Lightning + 4x 1.8 GHz Thunder",
                                    512, 4, "iOS 13",oledApple, fullHdApple, litioApple);

    //Celulares da Xiaomi
    Display amoledXiaomi = new Display(7.1,"1440 x 3120 pixel","AMOLED","16 milhões");
    Camera fullHdXiaomi = new Camera(64,20,"9238 x 6928 pixel","4K (2160p)",30);
    Bateria litioXiaomi = new Bateria("Litio", 5000);
    Celular blackShark3 = new Celular("Xiaomi", "Black Shark 3 Pro", "Preto Fosco", 3150f, "1x 2.84 GHz Kryo 585 + 3x 2.42 GHz Kryo 585 + 4x 1.80 GHz Kryo 585",
                                    258, 8, "iOS 13",amoledXiaomi, fullHdXiaomi, litioXiaomi);

    //Celulares da Motorola
    Display ipsMoto = new Display(6.4,"1080 x 2300 pixel","IPS LCD","16 milhões");
    Camera fullHdMoto = new Camera(16,16,"4619 x 3464 pixel","4K (2160p)",30);
    Bateria lipoMoto = new Bateria("LiPo", 5000);
    Celular motoG8 = new Celular("Motorola", "Moto G8 Power", "Dourado", 1259f, "4x 2.0 GHz Kyro 260 + 4x 1.8 GHz Kyro 260",
                                    64, 4, "Android 10",ipsMoto, fullHdMoto, lipoMoto);

    //Celulares da Asus
    Display amoledAsus = new Display(6.59,"1080 x 2340 pixel","AMOLED","16 milhões");
    Camera fullHdAsus = new Camera(48,24,"8000 x 6000 pixel","4K (2160p)",60);
    Bateria lipoAsus = new Bateria("LiPo", 6000);
    Celular rogPhone2 = new Celular("Asus", "ROG Phone 2", "Preto e Vermelho", 4000f, "1x 2.96 GHz Kryo 485 + 3x 2.42 GHz Kryo 485 + 4x 1.8 GHz Kryo 485",
                                    512, 12, "Android 9 ROG UI Pie",amoledAsus, fullHdAsus, lipoAsus);

    //Utilize o método dadosTecnicos() para retornar as especificações de cada Smartphone
    System.out.println(galaxyM21.dadosTecnicos());

    //Retornando o valor do celular mais caro
    String modeloGalaxyM21 = galaxyM21.modeloCelular();
    String modeloIphone11 = iPhone11.modeloCelular();
    String modeloBlackShark3 = blackShark3.modeloCelular();
    String modeloMotoG8 = motoG8.modeloCelular();
    String modeloRogPhone2 = rogPhone2.modeloCelular();

    double precoGalaxyM21 = galaxyM21.celularMaisCaro();
    double precoIphone11 = iPhone11.celularMaisCaro();
    double precoBlackShark3 = blackShark3.celularMaisCaro();
    double precoMotoG8 = motoG8.celularMaisCaro();
    double precoRogPhone2 = rogPhone2.celularMaisCaro();

    double maisCaro = 0;
    String modeloMaisCaro = "";

      if((precoGalaxyM21 >= precoIphone11) && (precoGalaxyM21 >= precoBlackShark3) && (precoGalaxyM21 >= precoMotoG8) && (precoGalaxyM21 >= precoRogPhone2)){
        maisCaro = precoGalaxyM21;
        modeloMaisCaro = modeloGalaxyM21;
      }
      if((precoGalaxyM21 <= precoIphone11) && (precoIphone11 >= precoBlackShark3) && (precoIphone11 >= precoMotoG8) && (precoIphone11 >= precoRogPhone2)){
        maisCaro = precoIphone11;
        modeloMaisCaro = modeloIphone11;
      }
      if((precoGalaxyM21 <= precoBlackShark3) && (precoIphone11 <= precoBlackShark3) && (precoBlackShark3 >= precoMotoG8) && (precoBlackShark3 >= precoRogPhone2)){
        maisCaro = precoBlackShark3;
        modeloMaisCaro = modeloBlackShark3;
      }
      if((precoGalaxyM21 <= precoMotoG8) && (precoIphone11 <= precoMotoG8) && (precoBlackShark3 <= precoMotoG8) && (precoMotoG8 >= precoRogPhone2)){
        maisCaro = precoMotoG8;
        modeloMaisCaro = modeloMotoG8;
      }
      else if((precoGalaxyM21 <= precoRogPhone2) && (precoIphone11 <= precoRogPhone2) && (precoBlackShark3 <= precoRogPhone2) && (precoMotoG8 <= precoRogPhone2)){
        maisCaro = precoRogPhone2;
        modeloMaisCaro = modeloRogPhone2;
      }

      System.out.println("O Smartphone mais caro é o: "+modeloMaisCaro+"\t"+"Preço:"+maisCaro);

      //Retornando o celular com melhor camera
      int cameraGalaxyM21 = galaxyM21.melhorCamera();
      int cameraIphone11 = iPhone11.melhorCamera();
      int cameraBlackShark3 = blackShark3.melhorCamera();
      int cameraMotoG8 = motoG8.melhorCamera();
      int cameraRogPhone2 = rogPhone2.melhorCamera();

      int melhorCamera = 0;
      String modeloMelhorCamera = "";

      if((cameraGalaxyM21 >= cameraIphone11) && (cameraGalaxyM21 >= cameraBlackShark3) && (cameraGalaxyM21 >= cameraMotoG8) && (cameraGalaxyM21 >= cameraRogPhone2)){
        melhorCamera = cameraGalaxyM21;
        modeloMelhorCamera = modeloGalaxyM21;
      }
      if((cameraGalaxyM21 <= cameraIphone11) && (cameraIphone11 >= cameraBlackShark3) && (cameraIphone11 >= cameraMotoG8) && (cameraIphone11 >= cameraRogPhone2)){
        melhorCamera = cameraIphone11;
        modeloMelhorCamera = modeloIphone11;
      }
      if((cameraGalaxyM21 <= cameraBlackShark3) && (cameraIphone11 <= cameraBlackShark3) && (cameraBlackShark3 >= cameraMotoG8) && (cameraBlackShark3 >= cameraRogPhone2)){
        melhorCamera = cameraBlackShark3;
        modeloMelhorCamera = modeloBlackShark3;
      }
      if((cameraGalaxyM21 <= cameraMotoG8) && (cameraIphone11 <= cameraMotoG8) && (cameraBlackShark3 <= cameraMotoG8) && (cameraMotoG8 >= cameraRogPhone2)){
        melhorCamera = cameraMotoG8;
        modeloMelhorCamera = modeloMotoG8;
      }
      else if((cameraGalaxyM21 <= cameraRogPhone2) && (cameraIphone11 <= cameraRogPhone2) && (cameraBlackShark3 <= cameraRogPhone2) && (cameraMotoG8 <= cameraRogPhone2)){
        melhorCamera = cameraRogPhone2;
        modeloMelhorCamera = modeloRogPhone2;
      }

      System.out.println("O Smartphone com melhor camera é o: "+modeloMelhorCamera+"\t"+"Com:"+melhorCamera+" px");


      //Retornando o celular com maior HD
      int armazenamentoGalaxyM21 = galaxyM21.maiorArmazenamento();
      int armazenamentoIphone11 = iPhone11.maiorArmazenamento();
      int armazenamentoBlackShark3 = blackShark3.maiorArmazenamento();
      int armazenamentoMotoG8 = motoG8.maiorArmazenamento();
      int armazenamentoRogPhone2 = rogPhone2.maiorArmazenamento();

      int maiorArmazenamento = 0;
      String modeloMaiorHd = "";

      if((armazenamentoGalaxyM21 >= armazenamentoIphone11) && (armazenamentoGalaxyM21 >= armazenamentoBlackShark3) && (armazenamentoGalaxyM21 >= armazenamentoMotoG8) && (armazenamentoGalaxyM21 >= armazenamentoRogPhone2)){
        maiorArmazenamento = armazenamentoGalaxyM21;
        modeloMaiorHd = modeloGalaxyM21;
      }
      if((armazenamentoGalaxyM21 <= armazenamentoIphone11) && (armazenamentoIphone11 >= armazenamentoBlackShark3) && (armazenamentoIphone11 >= armazenamentoMotoG8) && (armazenamentoIphone11 >= armazenamentoRogPhone2)){
        maiorArmazenamento = armazenamentoIphone11;
        modeloMaiorHd = modeloIphone11;
      }
      if((armazenamentoGalaxyM21 <= armazenamentoBlackShark3) && (armazenamentoIphone11 <= armazenamentoBlackShark3) && (armazenamentoBlackShark3 >= armazenamentoMotoG8) && (armazenamentoBlackShark3 >= armazenamentoRogPhone2)){
        maiorArmazenamento = armazenamentoBlackShark3;
        modeloMaiorHd = modeloBlackShark3;
      }
      if((armazenamentoGalaxyM21 <= armazenamentoMotoG8) && (armazenamentoIphone11 <= armazenamentoMotoG8) && (armazenamentoBlackShark3 <= armazenamentoMotoG8) && (armazenamentoMotoG8 >= armazenamentoRogPhone2)){
        maiorArmazenamento = armazenamentoMotoG8;
        modeloMaiorHd = modeloMotoG8;
      }
      else if((armazenamentoGalaxyM21 <= armazenamentoRogPhone2) && (armazenamentoIphone11 <= armazenamentoRogPhone2) && (armazenamentoBlackShark3 <= armazenamentoRogPhone2) && (armazenamentoMotoG8 <= armazenamentoRogPhone2)){
        maiorArmazenamento = armazenamentoRogPhone2;
        modeloMaiorHd = modeloRogPhone2;
      }

      System.out.println("O Smartphone com maior HD é o : "+modeloMaiorHd+"\t"+"Com:"+maiorArmazenamento+" GB");


      //Retornando o celular com maior tela
      double telaGalaxyM21 = galaxyM21.maiorTela();
      double telaIphone11 = iPhone11.maiorTela();
      double telaBlackShark3 = blackShark3.maiorTela();
      double telaMotoG8 = motoG8.maiorTela();
      double telaRogPhone2 = rogPhone2.maiorTela();

      double maiorTela = 0;
      String modeloMaiorTela = "";

      if((telaGalaxyM21 >= telaIphone11) && (telaGalaxyM21 >= telaBlackShark3) && (telaGalaxyM21 >= telaMotoG8) && (telaGalaxyM21 >= telaRogPhone2)){
        maiorTela = telaGalaxyM21;
        modeloMaiorTela = modeloGalaxyM21;
      }
      if((telaGalaxyM21 <= telaIphone11) && (telaIphone11 >= telaBlackShark3) && (telaIphone11 >= telaMotoG8) && (telaIphone11 >= telaRogPhone2)){
        maiorTela = telaIphone11;
        modeloMaiorTela = modeloIphone11;
      }
      if((telaGalaxyM21 <= telaBlackShark3) && (telaIphone11 <= telaBlackShark3) && (telaBlackShark3 >= telaMotoG8) && (telaBlackShark3 >= telaRogPhone2)){
        maiorTela = telaBlackShark3;
        modeloMaiorTela = modeloBlackShark3;
      }
      if((telaGalaxyM21 <= telaMotoG8) && (telaIphone11 <= telaMotoG8) && (telaBlackShark3 <= telaMotoG8) && (telaMotoG8 >= telaRogPhone2)){
        maiorTela = telaMotoG8;
        modeloMaiorTela = modeloMotoG8;
      }
      else if((telaGalaxyM21 <= telaRogPhone2) && (telaIphone11 <= telaRogPhone2) && (telaBlackShark3 <= telaRogPhone2) && (telaMotoG8 <= telaRogPhone2)){
        maiorTela = telaRogPhone2;
        modeloMaiorTela = modeloRogPhone2;
      }

      System.out.println("O Smartphone com maior tela é o : "+modeloMaiorTela+"\t"+"Com:"+maiorTela+" polegadas");
  }
}
