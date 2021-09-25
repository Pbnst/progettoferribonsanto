# *Progetto  Python.java*

Progetto per il corso "Programmazione ad Oggetti" del corso di laurea in Ingegneria Informatica e dell'Automazione, per l'A.A. 2020/2021

## **Introduzione**

Obiettivo del progetto era crear un'interfaccia che permettesse la ricerca e il filtro di occupazioni lavorative basate su differenti linguaggi di programmazione,per permettere ad un generico studente neolaureato in ingegneria informatica di orientarsi tra le varie proposte.Oggetto principale della ricerca sono i lavori basati sull'utilizzo di python, con la possibilità di filtrare le opzioni secondo tipologia di lavoro (part-time o full-time,da remoto o in sede).E' possibile scegliere tra 5 diverse città, tutto a partire dall'ottenimento di informazioni da un file di testo.
Più nello specifico, le operazioni ammissibili sono:

 1. *Scelta del linguaggio impiegato*
 2. *Scelta della città dove effettuare la ricerca*
 3. *Filtraggio informazioni:*
     * *Calcolo statistiche (a livello software)*
     * *Stampa delle statistiche per la città e il linguaggio richiesto*

# *Struttura del Progetto*
## **Diagrammi delle classi:**
In questa sezione è riportata a livello generale la struttura del progetto, quindi le classi che lo compongono:una prima classe denominata [Python] che è l'ossatura dello stesso, contiene i metodi e gli attributi per costituire il menù di scelta e porre un primo filtro riguardante i lunguaggi di programmazione possibili, inoltre richiama la seconda classe:la classe [specs] che si occupa di scorrere il file di testo cercando l'occorrenza di lavori part e full time e infine ne calcola le statistiche.

<img width="785" alt="Classi" src="https://user-images.githubusercontent.com/89023405/134761998-339334d6-810d-46cd-b589-3064d36ae650.png">




<img width="925" alt="classi ok " src="https://user-images.githubusercontent.com/89023405/134768941-b58c9f70-19ea-4091-8bc7-fee605e05d57.png">






## **Diagramma delle sequenze:**

Analizziamo in questo punto la sequenza di operazioni da un punto di vista sequenziale, osservando come viene gestita a livello software la richiesta da parte dell'utente dall'inizio alla fine.


<img width="707" alt="Diagramma delle sequenza " src="https://user-images.githubusercontent.com/89023405/134762007-97b0dbf6-79f7-479c-9748-c836b35534da.png">


## **Diagramma dei casi d'uso:**
 
In figura sono riportate le operazioni possibili sia a livello utente che a livello software durante l'esecuzione del programma


<img width="573" alt="Casi d'uso" src="https://user-images.githubusercontent.com/89023405/134762850-ea49aaf9-e540-43ec-9586-9eb8378c4778.png">





## **Software utilizzati**
* [Eclipse](https://www.eclipse.org/downloads/) - ambiente di sviluppo 
* [Uml Designer](https://www.umldesigner.org) - strumento per la creazione di diagrammi 


## **Autori**
* [Filippo Ferri](https://github.com/Pbnst/progettoferribonsanto): Sviluppo progetto orientato sul codice 
* [Pietro Bonsanto](https://github.com/Pbnst/progettoferribonsanto): Sviluppo progetto orientato sui diagrammi UML e Readme
