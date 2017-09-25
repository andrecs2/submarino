package com.andrecs2.submarino.model;

public class Submarino {
	
	private Posicao posicao = new Posicao();
	
	public String mover(String entrada){
		if(entrada ==null || "".equals( entrada.trim())) {
			throw new IllegalArgumentException("A entrada de comandos é obrigatória!!");
		}
		char[] movimentos = entrada.toCharArray();
		for (char movimento : movimentos) {
			switch (movimento) {
			case 'L':
				switch (posicao.getDirecao()) {
				case NORTE:
					posicao.setDirecao(Direcao.OESTE);
					break;
				case SUL:
					posicao.setDirecao(Direcao.LESTE);
					break;
				case LESTE:
					posicao.setDirecao(Direcao.NORTE);
					break;
				case OESTE:
					posicao.setDirecao(Direcao.SUL);
					break;
				}
				break;
			case 'R':
				switch (posicao.getDirecao()) {
				case NORTE:
					posicao.setDirecao(Direcao.LESTE);
					break;
				case SUL:
					posicao.setDirecao(Direcao.OESTE);
					break;
				case LESTE:
					posicao.setDirecao(Direcao.SUL);
					break;
				case OESTE:
					posicao.setDirecao(Direcao.NORTE);
					break;
				}
				break;
			case 'M':
				switch (posicao.getDirecao()) {
				case NORTE:
					posicao.avancaY();
					break;
				case SUL:
					posicao.recuaY();
					break;
				case LESTE:
					posicao.recuaX();
					break;
				case OESTE:
					posicao.avancaX();
					break;

				}
				break;
			case 'U':
				posicao.sobe();
				break;
			case 'D':
				posicao.desce();
				break;
			default:
				throw new IllegalArgumentException("Comando inválido!");
			}
		}
		return posicao.toString();
	}

}