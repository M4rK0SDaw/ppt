import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PiedrapapaeltijeraParametrizada {

	
	
	public static Iterable<Object[]>getData() {
		
		return Arrays.asList(new Object [][]{
			
				//resultado de papel
				{"PAPEL","TIJERAS",2},
				{"PAPEL","PAPEL",0},
				{"PAPEL","PIEDRA",1},
				{"PAPEL","LAGARTO",2},
				{"PAPEL","SPOCK",1},
				//resultado de tijeras
				{"TIJERAS","TIJERAS",0},
				{"TIJERAS","PAPEL",1},
				{"TIJERAS","PIEDRA",2},
				{"TIJERAS","LAGARTO",1},
				{"TIJERAS","SPOCK",2},
				//resultado de lagarto
				{"LAGARTO","TIJERAS",2},
				{"LAGARTO","PAPEL",1},
				{"LAGARTO","PIEDRA",2},
				{"LAGARTO","LAGARTO",0},
				{"LAGARTO","SPOCK",1},
				//resultado de piedra
				{"PIEDRA","TIJERAS",1},
				{"PIEDRA","PAPEL",2},
				{"PIEDRA","PIEDRA",0},
				{"PIEDRA","LAGARTO",1},
				{"PIEDRA","SPOCK",2},
				//resultado de spock
				{"SPOCK","TIJERAS",1},
				{"SPOCK","PAPEL",2},
				{"SPOCK","PIEDRA",1},
				{"SPOCK","LAGARTO",2},
				{"SPOCK","SPOCK",0},
			
				});
		}
		private String MovValido;
		private String MovValidoPc;
		private int rest;
		
		public PiedrapapaeltijeraParametrizada(String MovValido,String MovValidoPc,int rest) {
			this.MovValido= MovValido;
			this.MovValidoPc= MovValidoPc;
			this.rest= rest;
		}
		 @Test
		public void testCheckWinner() {
			MoveWords partida = new MoveWords();
			int restPart= partida.checkWinner(MovValido, MovValidoPc);
			assertEquals(rest,  restPart);	
		
		 }	
	}	