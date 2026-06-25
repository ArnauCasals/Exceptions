# Exceptions
**Descripció**: Aquest projecte recull diferents exercicis de Java centrats en la gestió d’excepcions, la validació d’entrada per consola i l’organització d’aplicacions en múltiples classes. Inclou tres blocs principals: una utilitat per llegir dades des del teclat de forma segura, un exercici de control d’errors amb excepcions checked i unchecked, i una aplicació de reserva de butaques per a un cinema.

## 📌 Enunciat del exercici

Aquest repositori inclou tres exercicis diferents relacionats amb les excepcions en Java:

### 1. ControlErrors
Crear una aplicació amb una classe `Sale` i una excepció personalitzada `EmptySaleException` per controlar el cas en què s’intenta calcular el total d’una venda sense productes.

També s’ha afegit una prova per generar i capturar una `IndexOutOfBoundsException`, per practicar errors habituals en col·leccions.

### 2. UtilsConsole
Crear una classe utilitària anomenada `ConsoleReader` que permeti llegir diferents tipus de dades des del teclat de manera segura.  
La classe ha de gestionar errors de format i tornar a demanar el valor fins que sigui correcte.

Mètodes implementats:
- `readByte(String message)`
- `readInt(String message)`
- `readFloat(String message)`
- `readDouble(String message)`
- `readChar(String message)`
- `readString(String message)`
- `readYesNo(String message)`

### 3. Cinema
Desenvolupar una aplicació per gestionar la reserva de butaques d’un cinema.

L’aplicació permet:
- mostrar totes les butaques reservades
- mostrar les butaques reservades per una persona
- reservar una butaca
- anul·lar la reserva d’una butaca
- anul·lar totes les reserves d’una persona

El projecte està organitzat en diverses classes (`Main`, `ConsoleUI`, `ReservationService`, `Seat`) i utilitza excepcions personalitzades per gestionar situacions com files fora de rang, seients ocupats o noms no vàlids.

---

## ✨ Funcionalitats

### ControlErrors
- Gestió d’una excepció checked (`EmptySaleException`) i la seva versió posterior com unchecked (`RuntimeException`).
- Càlcul del total d’una venda a partir d’una llista de productes.
- Captura d’errors habituals com `IndexOutOfBoundsException`.

### UtilsConsole
- Lectura segura de dades per consola.
- Control d’errors amb `InputMismatchException`.
- Validació de caràcters i respostes sí/no amb excepcions personalitzades.
- Repetició automàtica fins que l’usuari introdueix un valor vàlid.

### Cinema
- Reserva de butaques amb validació de fila i seient.
- Consulta de totes les reserves o de les reserves d’una persona.
- Cancel·lació d’una reserva concreta.
- Cancel·lació de totes les reserves d’una persona.
- Gestió d’errors amb excepcions personalitzades:
    - `SeatAlreadyTakenException`
    - `SeatAlreadyEmptyException`
    - `InvalidSeatException`
    - `InvalidPersonNameException`

---

## 🛠 Tecnologies
- **Llenguatge**: Java
- **Entorn de desenvolupament**: IntelliJ IDEA
- **Paradigma**: Programació orientada a objectes
- **Estructures utilitzades**:
    - `ArrayList`
    - `List`
    - `Scanner`
- **Gestió d’errors**:
    - `try-catch`
    - excepcions checked
    - excepcions unchecked
    - excepcions personalitzades

---

## 🚀 Instal·lació i Execució

1. Clonar el repositori:
```text
git clone https://github.com/ArnauCasals/Exceptions.git
```
2. Obrir el projecte amb IntelliJ IDEA o qualsevol IDE compatible amb Java.
3. Comprovar que el JDK estigui configurat correctament. 
4. Executar la classe principal de l’exercici que vulguis provar:
* Main de ControlErrors
* Main de UtilsConsole
* Main de Cinema
5. Seguir les instruccions que apareixen per consola.

## Proves
Les proves s’han realitzat manualment executant els diferents `main()` de cada exercici i comprovant el comportament esperat tant en casos correctes com en situacions d’error.

### ControlErrors
En aquest exercici s’han realitzat proves per validar la gestió d’excepcions checked i unchecked:
- càlcul del total d’una venda amb productes vàlids
- prova d’una venda buida per comprovar el llançament de `EmptySaleException`
- prova d’una `IndexOutOfBoundsException` intentant accedir a una posició inexistent d’una llista

Aquestes proves han permès verificar tant la detecció dels errors com la seva captura i tractament.

### UtilsConsole
S’han provat els diferents mètodes de lectura segura de dades per consola:
- lectura correcta de valors `byte`, `int`, `float` i `double`
- lectura d’un únic caràcter amb `readChar()`
- lectura de cadenes amb `readString()`
- validació de respostes sí/no amb `readYesNo()`

També s’han verificat casos incorrectes per comprovar la gestió d’errors:
- introducció de text quan s’esperava un número
- introducció de més d’un caràcter a `readChar()`
- introducció d’un valor diferent de `s` o `n` a `readYesNo()`

En tots els casos, el programa mostra el missatge d’error corresponent i torna a demanar la dada fins que és vàlida.

### Cinema
En l’exercici de reserves del cinema s’han provat diferents escenaris de funcionament:
- reserva d’una butaca disponible
- intent de reservar una butaca ja ocupada
- anul·lació d’una reserva existent
- intent d’anul·lar una butaca no reservada
- consulta de totes les reserves
- consulta de les reserves d’una persona concreta
- anul·lació de totes les reserves d’una persona
- validació de files i seients fora de rang
- validació de noms incorrectes

Amb aquestes proves s’ha comprovat que l’aplicació es manté estable i que les excepcions personalitzades es llancen quan correspon.

---

## 📸 Demo
Com que es tracta d’aplicacions de consola, la demostració consisteix en l’execució per terminal dels diferents exercicis i en la visualització dels missatges, menús i errors controlats.

### Exemple d’error controlat a ControlErrors
- Error: Empty sale error
- Error de llista: Index 5 out of bounds for lenght 2
- 
### Exemple d’error controlat a UtilsConsole
- Enter an integer: hola
- Format error. Please try again.
- Enter an integer: 25

### Exemple d’execució de Cinema
```text
--- CINEMA MENU ---
1.- Show all reserved seats
2.- Show seats by person
3.- Reserve a seat
4.- Cancel a seat
5.- Cancel all seats by person
0.- Exit
Choose an option: 3

Row: 2
Seat: 5
Name: Arnau
Seat reserved successfully.
```
## 🧩 Diagrames i justificació de decisions tècniques

### Estructura general del projecte

El projecte s’ha dividit en tres exercicis independents, però tots comparteixen l’objectiu de practicar la gestió d’excepcions, la validació d’entrada i l’organització del codi en classes amb responsabilitats separades.

```text
Exceptions/
├── Main.java
│   ├── Sale.java
│   ├── Product.java
│   ├── SaleTest.java
│   └── EmptySaleException.java
├── utilsconsole/
│   ├── Main.java
│   ├── ConsoleReader.java
│   └── InvalidInputException.java
├── cinema/
│   ├── Main.java
│   ├── ConsoleUI.java
│   ├── ReservationService.java
│   ├── Seat.java
│   └── exceptions/
└── README.md
```

## 🧩 Diagrames i justificació de decisions tècniques

### 🔷 Separació de responsabilitats

S’ha intentat aplicar una estructura clara on cada classe tingui una responsabilitat concreta:

- **Main**: punt d’entrada de cada exercici.
- **ConsoleUI**: gestiona la interacció amb l’usuari en el cas del cinema.
- **ReservationService**: conté la lògica de negoci de les reserves.
- **Seat**: representa una reserva individual.
- **ConsoleReader**: encapsula la lectura segura de dades per consola.
- **Excepcions personalitzades**: permeten expressar errors específics del domini.

Aquesta separació fa que el codi sigui més net, més fàcil de mantenir i més fàcil de provar.

---

### 🔷 Ús d’excepcions personalitzades

En lloc de dependre únicament d’excepcions genèriques, s’han creat excepcions específiques per representar errors concrets del programa:

- `EmptySaleException`
- `SeatAlreadyTakenException`
- `SeatAlreadyEmptyException`
- `InvalidSeatException`
- `InvalidPersonNameException`

Això millora la llegibilitat i facilita entendre què ha passat en cada cas.

---

### 🔷 Validació d’entrada per consola

En l’exercici **UtilsConsole** s’ha creat una classe utilitària per centralitzar la lectura de dades i evitar duplicar codi de validació a cada `main`.

Aquesta decisió permet:

- reutilitzar la mateixa lògica en diferents exercicis
- controlar millor els errors d’entrada
- fer el codi principal més net

---

### 🔷 Ús de col·leccions dinàmiques

En els exercicis **ControlErrors** i **Cinema** s’ha utilitzat `ArrayList` a través de la interfície `List`, ja que permet gestionar col·leccions de mida variable de manera senzilla.

**Exemples:**
- llista de productes d’una venda
- llista de butaques reservades al cinema

---

### 🔷 Disseny del mòdul Cinema

En l’exercici del cinema s’ha separat la part visual (`ConsoleUI`) de la lògica (`ReservationService`) per evitar barrejar menús amb regles de negoci.

Això permet que la classe de servei sigui reutilitzable i que la interfície es pugui modificar sense afectar la lògica interna.

També s’ha implementat:

- validació de fila i seient amb `validateSeatPosition()`
- validació del nom de la persona
- cerca i filtratge de reserves per persona
- anul·lació de reserves individuals o massives

---

### 🔷 Mètodes `equals()`, `hashCode()` i `toString()`

A la classe `Seat` s’han sobreescrit aquests mètodes per millorar el comportament dels objectes:

- **`equals()` i `hashCode()`**: dues butaques es consideren iguals si tenen la mateixa fila i el mateix seient.
- **`toString()`**: permet mostrar la informació de la reserva de manera llegible per consola.