class Lista<T> {
    Nodo<T> testa;

    public Lista() {
        this.testa = null;
    }

    public void inserisciInTesta(T info) {
        Nodo<T> nuovoNodo = new Nodo<>(info);
        nuovoNodo.next = testa;
        testa = nuovoNodo;
    }
    public void inserisciInCoda(T info) {
        Nodo<T> nuovoNodo = new Nodo<>(info);
        if (testa == null) {
            testa = nuovoNodo;
        } else {
            Nodo<T> attuale = testa;
            while (attuale.next != null) {
                attuale = attuale.next;
            }
            attuale.next = nuovoNodo;
        }
    }

    public void inserisciInPosizione(int posizione, T info) {
        if (posizione < 0) {
            throw new IllegalArgumentException("la posizione non può essere negativa");
        }
        Nodo<T> nuovoNodo = new Nodo<>(info);
        if (posizione == 0) {
            nuovoNodo.next = testa;
            testa = nuovoNodo;
            return;
        }
        Nodo<T> attuale = testa;
        for (int i = 0; i < posizione - 1; i++) {
            if (attuale == null) {
                throw new IndexOutOfBoundsException("posizione fuori dai limiti");
            }
            attuale = attuale.next;
        }
        nuovoNodo.next = attuale.next;
        attuale.next = nuovoNodo;
    }


    @Override
    public String toString() {
        String risultato = "";
        Nodo<T> attuale = testa;
        while (attuale != null) {
            risultato += attuale.info;
            if (attuale.next != null) {
                risultato += " -> ";
            }
            attuale = attuale.next;
        }
        return risultato;
    }
}

