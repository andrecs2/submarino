package com.andrecs2.submarino.model;

public class Posicao {
	private int x;
	private int y;
	private int z;

	private Direcao direcao;

	public Posicao() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.direcao = Direcao.NORTE;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public Direcao getDirecao() {
		return direcao;
	}

	public void setDirecao(Direcao direcao) {
		this.direcao = direcao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(x);
		builder.append(" ");
		builder.append(y);
		builder.append(" ");
		builder.append(z);
		builder.append(" ");
		builder.append(direcao);
		return builder.toString();
	}

	public void sobe() {
		this.z++;
	}
	
	public void desce() {
		this.z--;
	}

	public void avancaX() {
		this.x++;
	}
	
	public void recuaX() {
		this.x--;
	}

	public void avancaY() {
		this.y++;
	}
	
	public void recuaY() {
		this.y--;
	}

}
