//Los arrays bidimensionales tienen filas y columnas, los unidimensionales, no.
//ARRAYS UNIDIMENSIONALES
tipo[] nombreArray; //Declaración de array
nombreArray = new tipo[tamaño]; //Para crear un array y asignarle espacio en memoria
tipo[] nombreArray = new tipo[tamaño]; //Combinación de los dos
Índices: Los elementos de un array se acceden mediante su índice. 
Va desde 0 hasta tamaño - 1, donde tamaño es el número de elementos en el array.
tipo elemento = nombreArray[indice]; //Acceso a elementos
nombreArray[indice] = valor; //Asignación de valores
int longitud = nombreArray.length; //Para obtener la longitud de un array
for (int i = 0; i < nombreArray.length; i++) {
    // Acceder al elemento nombreArray[i]
}

for (tipo elemento : nombreArray) {
    // Acceder al elemento
}

//ARRAYS BIDIMENSIONALES
tipo[][] nombreArray; //Declaración
int[][] matriz; //Matriz de enteros
nombreArray = new tipo[filas][columnas];
int[][] matriz = new int[3][3]; // Crea una matriz de 3x3
tipo elemento = nombreArray[fila][columna]; //Acceso a los elementos
int valor = matriz[0][1]; // Accede al elemento en la primera fila y segunda columna
int filas = nombreArray.length; // Longitud de las filas
int columnas = nombreArray[0].length; // Longitud de las columnas
// Recorrido 
for (int i = 0; i < nombreArray.length; i++) {
    for (int j = 0; j < nombreArray[i].length; j++) {
        // Accede a nombreArray[i][j]
    }
}



// MANERAS DE CREAR ARRAYS UNIDIMENSIONALES
int[] array1 = {1, 2, 3, 4, 5}; // Asignarle los valores que quiera
int[] array2 = new int[5]; // Crea un array de enteros con espacio para 5 elementos
int[] array3 = new int[5]; // Crea un array de enteros con espacio para 5 elementos, inicializados a 0
int array4[] = {1, 2, 3, 4, 5}; // También es válido, aunque menos común

int arrayNumeros[] = new int[numIntroducidos]; // Primer array unidimensional, donde numIntroducidos es la longitud del array

// MANERAS DE CREAR ARRAYS BIDIMENSIONALES
int[][] matrizBidimensional = new int[filas][columnas]; // Crea una matriz bidimensional con filas y columnas definidas
int[][] matriz2 = new int[3][3]; // Crea una matriz de 3x3
int[][] matriz3 = new int[3][3]; // Crea una matriz de 3x3, inicializados a 0
int matriz4[][] = {{1, 2}, {3, 4}}; // También es válido, aunque menos común
