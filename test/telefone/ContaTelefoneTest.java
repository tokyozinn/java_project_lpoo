package telefone;


import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ContaTelefoneTest {
	
	@Test
	public void testMudarCodigo() {
		
		ContaTelefone t1 = new ContaTelefone("1231546789", 1, 100.0);
		
		t1.setCodigo(2);
		
		assertThat(t1.getCodigo(), is(2));		
		
	}

}
