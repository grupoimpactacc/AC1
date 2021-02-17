package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import func.Arranjo;

class ArranjoTest {

	@Test
	void test() {
		Arranjo arr = new Arranjo();
		Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 940};
		assertEquals(940, arr.buscarMaior(a), "Erro indentificado!");
		assertEquals(510, arr.buscarMenor(a), "Erro indentificado!");
		assertEquals(7540,arr.soma(a),"Erro indentificado!");
	}

}
