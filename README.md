# *Progetto JobOOP*

Progetto per il corso "Programmazione ad Oggetti" del corso di laurea in Ingegneria Informatica e dell'Automazione, per l'A.A. 2020/2021

## **Introduzione**

Obiettivo del progetto era crear un'interfaccia che permettesse la ricerca e il filtro di occupazioni lavorative basate su differenti linguaggi di programmazione,per permettere ad un generico studente neolaureato in ingegneria informatica di orientarsi tra le varie proposte.Oggetto principale della ricerca sono i lavori, con la possibilità di filtrare le opzioni secondo tipologia di lavoro (part-time o full-time,da remoto o in sede).E' possibile scegliere tra 5 diverse città.
Il tutto avviene attraverso la comunicazione con un apposito protocollo mettendosi al servizio di un Client.
L'applicazione permette le seguenti rotte distinte mediante API REST (GET e POST):
* Suggerimento di 5 città su cui operare le ricerche;
* Restituzione dei metadati in formato JSON, ossia l'elenco degli attributi per ciascun job;
* Restituzione della lista filtrata mediante parametri quali occupazioni full time, da remoto, a contratto e da una particolare location;
* Restituzione delle statistiche riguardo le tipologie di occupazioni pocanzi menzionate.


# *Dati*
I dati forniti dal programma risultano in formato JSON composto da un array di jobs che formano la lista dei lavori.
Il formato del singolo job è il seguente:


<img width="766" alt="Schermata 2021-09-30 alle 15 25 22" src="https://user-images.githubusercontent.com/89023405/135463728-63273315-14f1-42ac-8893-c617a82a559c.png">

dove:
* *id* rappresenta il numero identificativo del lavoro;
* *role* rappresenta l'occupazione lavorativa prevista;
*  *company_name* rappresenta il nome dell'azienda;
*  *company_num_employees* rappresenta il numero di impiegati;
*  *employment_type* indica se il lavoro è full time o a contratto;
*  *location* indica se il lavoro è in presenza e in tal caso in che città;
*  *remote* indica che il lavoro è svolto a distanza;
*  *logo* fornisce il logo aziendale;
*  *url* riporta il collegamento all'offerta lavorativa;
*  *text* presenta una descrizione dell'ambiente lavorativo;
*  *date posted* presenta la data di inserimento di tale offerta nel database.


# *Rotte Possibili*

Tipo |  Chiamata | Risposta
--------|-----------|------------
GET | /cities|  Fornisce le 5 città su cui fare le ricerche
GET | /metadata| Fornisce i metadati relativi ad ogni job
POST | /jobs | Fornisce i lavori filtrati 
GET | /stats | Calcola le statistiche per i lavori 


Le statistiche riguardano il numero di lavori full time, il numero di lavori a contratto, il numero di lavori in remoto e il numero di lavori in una particolare città.

## Esempi di chiamate:

* GET localhost:8080/cities;
* GET localhost:8080/metadata;
* POST localhost:8080/jobs;
* GET localhost:8080/stats

#### Per la chiamata POST il filtro va scritto nel body

# Filtri

Operatore | Descrizione
----------|------------
In| Mostra i Job con il valore precisato
Nin|Mostra i job senza il valore precisato
FullIn | Mostra i job con il valore precisato
Part | Mostra i job con il valore precisato





# *Struttura del Progetto*

## **Packages:**
Il progetto è suddiviso nei seguenti pacchetti:




<img width="374" alt="Schermata 2021-09-30 alle 16 51 01" src="https://user-images.githubusercontent.com/89023405/135478860-c208db9e-104f-4743-a49e-56adaa166d61.png">







## **Diagrammi delle classi:**
In questa sezione è riportata a livello generale la struttura del progetto, quindi le classi che lo compongono:una prima classe denominata [Python] che è l'ossatura dello stesso, contiene i metodi e gli attributi per costituire il menù di scelta e porre un primo filtro riguardante i lunguaggi di programmazione possibili, inoltre richiama la seconda classe:la classe [specs] che si occupa di scorrere il file di testo cercando l'occorrenza di lavori part e full time e infine ne calcola le statistiche.





## **Diagramma delle sequenze:**

In questa sezione esaminiamo nello specifico le chiamate che l'utente può effettuare utilizzando i diagrammi delle sequenze, che mostrano le interazioni tra le classi.

* ### Chiamata GET/cities



<img width="337" alt="Schermata 2021-09-30 alle 16 57 50" src="https://user-images.githubusercontent.com/89023405/135480540-f89e5208-347f-4b1c-ba1f-9788357a21fe.png">


* ### Chiamata GET/metadata




<img width="380" alt="Schermata 2021-09-30 alle 17 02 34" src="https://user-images.githubusercontent.com/89023405/135480866-aa106d03-e7a8-4031-9848-a83c616808b4.png">




* ### Chiamata POST/jobs




<img width="772" alt="Schermata 2021-09-30 alle 17 16 17" src="https://user-images.githubusercontent.com/89023405/135483304-360d2f58-eaaa-452a-8730-84c608b779d2.png">




* ### Chiamata GET/stats




<img width="833" alt="Schermata 2021-09-30 alle 17 34 36" src="https://user-images.githubusercontent.com/89023405/135486354-dee62bbb-d6af-4f1d-9501-2e193c42cca1.png">






## **Diagramma dei casi d'uso:**
 
In figura sono riportate le richieste possibili da effettuare tramite API REST




<img width="559" alt="Schermata 2021-09-30 alle 16 39 30" src="https://user-images.githubusercontent.com/89023405/135476735-f9e0bc10-4bee-4223-84f4-93bcb4f9ffda.png">




## **Software utilizzati**
* [Eclipse](https://www.eclipse.org/downloads/) - ambiente di sviluppo 
* [Uml Designer](https://www.umldesigner.org) - strumento per la creazione di diagrammi 
* [Postman](https://www.postman.com) - strumento per il test di API call
* [SpringBoot](https://spring.io/projects/spring-boot) - framework per sviluppo di applicazioni in Java



## **Autori**
* [Filippo Ferri](https://github.com/Pbnst/progettoferribonsanto): Sviluppo progetto orientato sul codice 
* [Pietro Bonsanto](https://github.com/Pbnst/progettoferribonsanto): Sviluppo progetto orientato sui diagrammi UML e Readme
