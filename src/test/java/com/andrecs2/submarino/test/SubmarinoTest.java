package com.andrecs2.submarino.test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.andrecs2.submarino.model.Submarino;

public class SubmarinoTest {

	@Test
	public void teste1() {

		Submarino submarino = new Submarino();

		String movimento = submarino.mover("LMRDDMMUU");

		assertThat(movimento, equalTo("1 2 -1 NORTE"));

	}

	@Test
	public void teste2() {

		Submarino submarino = new Submarino();

		String movimento = submarino.mover("RMMLMMMDDLL");

		assertThat(movimento, equalTo("2 3 -2 SUL"));

	}

	@Test(expected = IllegalArgumentException.class)
	public void testeExecaoSemComando() {
		
		Submarino submarino = new Submarino();
		
		String movimento = submarino.mover("");
		
		assertThat(movimento, equalTo("2 3 -2 SUL"));
		
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void testeExecaoComando() {
		
		Submarino submarino = new Submarino();
		
		String movimento = submarino.mover("RMMLMMMDXLL");
		
		assertThat(movimento, equalTo("2 3 -2 SUL"));
		
	}

}