# Practica-01-3

Inicializamos FileWriter, PrintWriter y ProcessBuilder 
con el comando que queremos ejecutar.

Abrimos una cláusula try-catch para controlar errores posibles
en la ejecución del programa.

Creamos un directorio (data) y dentro de este creamos el archivo
(in.txt) al que posteriormente escribirá lo que escribamos por teclado.

En otra cláusula try-catch antes de iniciar el proceso
creo el fichero out.txt que es donde aparecerá el resultado del 
comando wc.

processBuilder.command(gitBashPath, "-c", "cat in.txt | wc > out.txt");

Esta línea de código ejecuta el gitbash, donde sirven los comandos dados en la práctica.
Después de abrir gitbash dentro de él ejecutamos "cat in.txt | wc > out.txt" 
con cat abre el fichero especificado, en este caso (in.txt) y esto hará y wc que 
lo escribirá en el archivo (out.txt) indicando el número de líneas, palabras 
y bytes del archivo.