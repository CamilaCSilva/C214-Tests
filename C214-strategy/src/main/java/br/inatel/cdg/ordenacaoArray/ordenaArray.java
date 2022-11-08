package br.inatel.cdg.ordenacaoArray;

public abstract class ordenaArray {
    protected iOrdena iOrd;

    public int[] Ordena(int vetor[]){
        return iOrd.Ordena(vetor);
    }

    public iOrdena getiOrd() {
        return iOrd;
    }

    public void setiOrd(iOrdena iOrd) {
        this.iOrd = iOrd;
    }
}
