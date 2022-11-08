package br.inatel.cdg.teste.ordenaArray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import br.inatel.cdg.ordenacaoArray.ordenacaoBubbleSort;
import br.inatel.cdg.ordenacaoArray.ordenacaoHeapSort;
import br.inatel.cdg.ordenacaoArray.ordenacaoMergeSort;
import br.inatel.cdg.ordenacaoArray.ordena.impl.ordenaBubbleSort;
import br.inatel.cdg.ordenacaoArray.ordena.impl.ordenaHeapSort;
import br.inatel.cdg.ordenacaoArray.ordena.impl.ordenaMergeSort;

public class TestOrdenaArray {

    int[] vetorMock = new int[4];

    @Before
    public void setup(){
        vetorMock[0] = 1;
        vetorMock[1] = 3;
        vetorMock[2] = 4;
        vetorMock[3] = 2;
    }

	@Test
	public void testeOrdenaBubbleSort() {
		ordenacaoBubbleSort ordenaBS = new ordenacaoBubbleSort();
		assertTrue(ordenaBS.getiOrd() instanceof ordenaBubbleSort);
	}

	@Test
	public void testeOrdenaMergeSort() {
		ordenacaoMergeSort ordenaMS = new ordenacaoMergeSort();
		assertTrue(ordenaMS.getiOrd() instanceof ordenaMergeSort);
	}


    @Test
	public void testeOrdenaHeapSort() {
		ordenacaoHeapSort ordenaHS = new ordenacaoHeapSort();
		assertTrue(ordenaHS.getiOrd() instanceof ordenaHeapSort);
	}

    @Test
	public void testeOrdenacaoBubbleSort() {
		ordenacaoBubbleSort ordenaBS = new ordenacaoBubbleSort();
		int arr[] = new int[4];
        arr = ordenaBS.Ordena(vetorMock);
		assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 3);
        assertEquals(arr[3], 4);
	}

    @Test
	public void testeOrdenacaoMergeSort() {
		ordenacaoMergeSort ordenaMS = new ordenacaoMergeSort();
		int arr[] = new int[4];
        arr = ordenaMS.Ordena(vetorMock);
		assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 3);
        assertEquals(arr[3], 4);
	}

    @Test
	public void testeOrdenacaoHeapSort() {
		ordenacaoHeapSort ordenaHS = new ordenacaoHeapSort();
		int arr[] = new int[4];
        arr = ordenaHS.Ordena(vetorMock);
		assertEquals(arr[0], 1);
        assertEquals(arr[1], 2);
        assertEquals(arr[2], 3);
        assertEquals(arr[3], 4);
	}

}
