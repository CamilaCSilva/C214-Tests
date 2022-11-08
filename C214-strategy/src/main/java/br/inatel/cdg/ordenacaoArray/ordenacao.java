package br.inatel.cdg.ordenacaoArray;

public class ordenacao {
    public static void main(String[] args){
        int vetor[] = new int[8];
        int arr[] = new int[8];
        vetor[0] = 1;
        vetor[1] = 2;
        vetor[2] = 4;
        vetor[3] = 3;
        vetor[4] = 6;
        vetor[5] = 5;
        vetor[6] = 7;
        vetor[7] = 0;

        ordenacaoBubbleSort ordBS = new ordenacaoBubbleSort();
        // arr = ordBS.Ordena(vetor);

        ordenacaoMergeSort ordMS = new ordenacaoMergeSort();
        // arr = ordMS.Ordena(vetor);

        ordenacaoHeapSort ordHS = new ordenacaoHeapSort();
        arr = ordHS.Ordena(vetor);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
